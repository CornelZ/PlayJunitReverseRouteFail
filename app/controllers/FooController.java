package controllers;

import play.mvc.Controller;
import play.mvc.Http.Request;
import play.mvc.Result;

public class FooController extends Controller {

  public Result index(Request request) {
    return ok("hello world");
  }
}
