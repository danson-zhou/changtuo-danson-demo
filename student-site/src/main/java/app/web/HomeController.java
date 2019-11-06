package app.web;

import core.framework.web.Request;
import core.framework.web.Response;

/**
 * @author Danson
 */
public class HomeController {

    public Response home(Request request) {
        return Response.html("/template/index.html", new IndexModel());
    }
}
