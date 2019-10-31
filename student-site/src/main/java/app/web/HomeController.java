package app.web;

import core.framework.web.Request;
import core.framework.web.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Danson
 */
public class HomeController {
    private final Logger logger = LoggerFactory.getLogger(HomeController.class);

    public Response home(Request request) {
        Response response = Response.html("/template/index.html", new IndexModel());
        return response;
    }
}
