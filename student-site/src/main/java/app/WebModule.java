package app;

import app.web.HomeController;
import app.web.IndexModel;
import core.framework.http.HTTPMethod;
import core.framework.module.Module;

/**
 * @author Danson
 */
public class WebModule extends Module {
    @Override
    protected void initialize() {
        site().template("/template/index.html", IndexModel.class);
        http().route(HTTPMethod.GET, "/", bind(HomeController.class)::home);
    }
}
