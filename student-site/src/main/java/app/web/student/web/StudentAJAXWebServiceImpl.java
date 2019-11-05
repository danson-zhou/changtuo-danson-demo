package app.web.student.web;

import app.web.ajax.CreateStudentAJAXRequest;
import app.web.ajax.CreateStudentAJAXResponse;
import app.web.ajax.GetStudentAJAXResponse;
import app.web.ajax.StudentAJAXWebService;
import app.web.student.service.StudentService;
import core.framework.inject.Inject;

/**
 * @author Danson
 */
public class StudentAJAXWebServiceImpl implements StudentAJAXWebService {
    @Inject
    StudentService studentService;

    @Override
    public GetStudentAJAXResponse get(Long id) {
        return studentService.get(id);
    }

    @Override
    public CreateStudentAJAXResponse create(CreateStudentAJAXRequest request) {
        return studentService.create(request);
    }
}
