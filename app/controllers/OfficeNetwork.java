package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.*;

public class OfficeNetwork extends Controller{
	public static Result getSignup() {
		return ok(signup.render());
	}
}
