package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.*;

public class WebPage extends Controller{
	public static Result getIndex(String url) {
		switch (url) {
		case "csmanagement":
			return ok(login.render());
		case "officenetwork":
			return ok(login.render());

		default:
			return ok(index.render());
		}
		
	}
}
