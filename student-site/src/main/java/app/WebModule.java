package app;

import app.demo.api.StudentWebService;
import app.web.HomeController;
import app.web.IndexModel;
import app.web.ajax.StudentAJAXWebService;
import app.web.interceptor.TestInterceptor;
import app.web.student.service.StudentService;
import app.web.student.web.StudentAJAXWebServiceImpl;
import core.framework.http.HTTPMethod;
import core.framework.module.Module;

/**
 * @author Danson
 */
public class WebModule extends Module {
    @Override
    protected void initialize() {
        http().intercept(new TestInterceptor());
        site().template("/template/index.html", IndexModel.class);
        http().route(HTTPMethod.GET, "/", bind(HomeController.class)::home);
        loadProperties("app.properties");
        api().client(StudentWebService.class, requiredProperty("app.studentWebServiceURL"));
//        api().client(StudentWebService.class, "http://localhost:8081");
        bind(StudentService.class);
        api().service(StudentAJAXWebService.class, bind(StudentAJAXWebServiceImpl.class));
    }
}
