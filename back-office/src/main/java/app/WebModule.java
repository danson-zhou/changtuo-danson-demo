package app;

import app.demo.api.StudentWebService;
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
        bind(BOStudentService.class);
        api().client(StudentWebService.class, "http://localhost:8081");
        api().service(BOStudentAjaxWebService.class, bind(BOStudentAjaxWebServiceImpl.class));
    }
}
