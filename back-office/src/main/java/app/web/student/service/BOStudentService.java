package app.web.student.service;

import app.demo.api.BOStudentWebService;
import app.demo.api.student.BOCreateStudentRequest;
import app.demo.api.student.BOCreateStudentResponse;
import app.demo.api.student.BOGetStudentResponse;
import core.framework.inject.Inject;

/**
 * @author Danson
 */
public class BOStudentService {
    @Inject
    BOStudentWebService boStudentWebService;

    public BOGetStudentResponse get(Long id) {
        return boStudentWebService.get(id);
    }

    public BOCreateStudentResponse create(BOCreateStudentRequest request) {
        return boStudentWebService.create(request);
    }
}
