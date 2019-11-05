package app.web.student.service;

import app.demo.api.StudentWebService;
import app.demo.api.student.CreateStudentRequest;
import app.demo.api.student.CreateStudentResponse;
import app.demo.api.student.GetStudentResponse;
import app.web.ajax.CreateStudentAJAXRequest;
import app.web.ajax.CreateStudentAJAXResponse;
import app.web.ajax.GetStudentAJAXResponse;
import core.framework.inject.Inject;

/**
 * @author Danson
 */
public class StudentService {
    @Inject
    StudentWebService studentWebService;

    public GetStudentAJAXResponse get(Long id) {
        GetStudentResponse response = studentWebService.get(id);
        return new GetStudentAJAXResponse();
    }

    public CreateStudentAJAXResponse create(CreateStudentAJAXRequest request) {
        CreateStudentRequest createStudentRequest = new CreateStudentRequest();
        CreateStudentResponse response = studentWebService.create(createStudentRequest);
        return new CreateStudentAJAXResponse();
    }

}
