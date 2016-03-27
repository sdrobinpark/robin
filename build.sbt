name := """robin"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  "com.typesafe.play.modules" %% "play-modules-redis" % "2.4.1",
  "commons-io" % "commons-io" % "2.3",
  "org.glassfish" % "javax.json" % "1.0.4",
  "com.amazonaws" % "aws-java-sdk" % "1.9.23",
  "mysql" % "mysql-connector-java" % "5.1.8",
  javaJdbc,
  cache,
  javaWs
)

// The Typesafe repository
resolvers ++= Seq(
	"Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/",
	"google-sedis-fix" at "http://pk11-scratch.googlecode.com/svn/trunk"
)

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator
