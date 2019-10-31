package app.demo.student.web;

import app.demo.api.BOStudentWebService;
import app.demo.api.student.BOCreateStudentRequest;
import app.demo.api.student.BOCreateStudentResponse;
import app.demo.api.student.BODeleteStudentResponse;
import app.demo.api.student.BOGetStudentResponse;
import app.demo.student.service.BOStudentService;
import core.framework.inject.Inject;

/**
 * @author Danson
 */
public class BOStudentWebServiceImpl implements BOStudentWebService {

    @Inject
    BOStudentService boStudentService;

    @Override
    public BOGetStudentResponse get(Long number) {
        return boStudentService.get(number);
    }

    @Override
    public BOCreateStudentResponse create(BOCreateStudentRequest request) {
        return boStudentService.create(request);
    }

    @Override
    public BODeleteStudentResponse delete(Long number) {
        return boStudentService.delete(number);
    }
}
