package controllers;

import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import utils.HttpResponse;
import utils.HttpUtil;

/**
 * Software Service Market Place
 */
public class HomeController extends Controller {

    /**
     * handle querySelection
     */
    public Result querySelectionHandler() {
        return ok(views.html.querySelection.render());
    }

    /**
     * handle query
     */
    public Result queryOneHandler() {

        String title = request().getQueryString("title");
        if (title != "") {
            return ok(views.html.response.render(title));
        }
        return ok("failed");
    }

    /**
     * Query page
     */
    public Result query1() {
        return ok(views.html.query1.render());
    }
    public Result query2() {
        return ok(views.html.query2.render());
    }
    public Result query3() {
        return ok(views.html.query3.render());
    }
    public Result query4() {
        return ok(views.html.query4.render());
    }


}