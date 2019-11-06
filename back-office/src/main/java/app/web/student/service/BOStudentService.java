package app.web.student.service;

import app.demo.api.BOStudentWebService;
import app.web.ajax.BOCreateStudentAJAXRequest;
import app.web.ajax.BOCreateStudentAJAXResponse;
import app.web.ajax.BOGetStudentAJAXResponse;
import core.framework.inject.Inject;

/**
 * @author Danson
 */
public class BOStudentService {
    @Inject
    BOStudentWebService boStudentWebService;

    public BOGetStudentAJAXResponse get(Long id) {
        return new BOGetStudentAJAXResponse();
    }

    public BOCreateStudentAJAXResponse create(BOCreateStudentAJAXRequest request) {
        return new BOCreateStudentAJAXResponse();
    }
}
