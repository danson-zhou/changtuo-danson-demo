package app.web.student.web;

import app.demo.api.student.CreateStudentRequest;
import app.demo.api.student.CreateStudentResponse;
import app.demo.api.student.GetStudentResponse;
import app.web.ajax.StudentAjaxWebService;
import app.web.student.service.StudentService;
import core.framework.inject.Inject;

/**
 * @author Danson
 */
public class StudentAjaxWebServiceImpl implements StudentAjaxWebService {
    @Inject
    StudentService studentService;

    @Override
    public GetStudentResponse get(Long id) {
        return studentService.get(id);
    }

    @Override
    public CreateStudentResponse create(CreateStudentRequest request) {
        return studentService.create(request);
    }
}
