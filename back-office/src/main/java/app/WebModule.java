package app;

import app.demo.api.BOStudentWebService;
import app.web.ajax.BOStudentAjaxWebService;
import app.web.student.service.BOStudentService;
import app.web.student.web.BOStudentAjaxWebServiceImpl;
import core.framework.module.Module;

/**
 * @author Danson
 */
public class WebModule extends Module {
    @Override
    protected void initialize() {
        http().httpPort(8000);
        bind(BOStudentService.class);
        api().client(BOStudentWebService.class, "http://localhost:8081");
        api().service(BOStudentAjaxWebService.class, bind(BOStudentAjaxWebServiceImpl.class));
    }
}
