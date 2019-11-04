package app.web.student.service;

import app.demo.api.StudentWebService;
import app.demo.api.student.CreateStudentRequest;
import app.demo.api.student.CreateStudentResponse;
import app.demo.api.student.GetStudentResponse;
import core.framework.inject.Inject;

/**
 * @author Danson
 */
public class StudentService {
    @Inject
    StudentWebService studentWebService;

    public GetStudentResponse get(Long id) {
        return studentWebService.get(id);
    }

    public CreateStudentResponse create(CreateStudentRequest request) {
        return studentWebService.create(request);
    }

}
