package app.demo.student.web;

import app.demo.student.service.StudentAJAXService;
import app.web.ajax.AJAXCreateStudentRequest;
import app.web.ajax.AJAXCreateStudentResponse;
import app.web.ajax.AJAXGetStudentResponse;
import app.web.ajax.StudentAJAXWebService;
import core.framework.inject.Inject;

/**
 * @author Danson
 */
public class StudentAJAXWebServiceImpl implements StudentAJAXWebService {
    @Inject
    StudentAJAXService studentAJAXService;

    @Override
    public AJAXGetStudentResponse get(Long number) {
        return studentAJAXService.get(number);
    }

    @Override
    public AJAXCreateStudentResponse create(AJAXCreateStudentRequest request) {
        return studentAJAXService.create(request);
    }
}
