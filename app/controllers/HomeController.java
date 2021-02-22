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
     * Index page
     */
    public Result index() {
        return ok(views.html.login.render());
    }

    /**
     * Index page
     */
    public Result signup() {
        return ok(views.html.response.render());
    }

    /**
     * handle login
     */
    public Result loginHandler() {

        String title = request().getQueryString("title");
        if (title != null) {

            String url = "/login?title=" + title;
            HttpResponse response = HttpUtil.makeRequest(url, "GET", null);
            if (response.getStatusCode() == 200) {
                return ok(views.html.index.render(response.getResponse()));
            }

            return ok(views.html.login.render());

        } else {
            return ok(views.html.login.render());
        }


    }

    /**
     * handle login
     */
    public Result queryOneHandler() {

        String title = request().getQueryString("title");
        if (title != null) {

            return ok(title);
            
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