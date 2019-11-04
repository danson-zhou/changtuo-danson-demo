package app;

import app.demo.api.StudentWebService;
import app.web.HomeController;
import app.web.IndexModel;
import app.web.ajax.StudentAjaxWebService;
import app.web.student.service.StudentService;
import app.web.student.web.StudentAjaxWebServiceImpl;
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
        loadProperties("app.properties");
        api().client(StudentWebService.class, requiredProperty("app.studentWebServiceUri"));
//        api().client(StudentWebService.class, "http://localhost:8081");
        bind(StudentService.class);
        api().service(StudentAjaxWebService.class, bind(StudentAjaxWebServiceImpl.class));
    }
}
