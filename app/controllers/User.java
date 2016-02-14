package controllers;

import play.mvc.Controller;
import play.mvc.Result;

import views.html.*;

public class User extends Controller{
	public Result login() {
        return ok(login.render());
    }
	public Result logout() {
		return TODO;
	}
	public Result showProfile() {
		return TODO;
	}
}
