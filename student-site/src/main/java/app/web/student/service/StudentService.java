package app.web.student.service;

import app.web.ajax.CreateStudentAJAXRequest;
import app.web.ajax.CreateStudentAJAXResponse;
import app.web.ajax.GetStudentAJAXResponse;

/**
 * @author Danson
 */
public class StudentService {

    public GetStudentAJAXResponse get(Long id) {
        return new GetStudentAJAXResponse();
    }

    public CreateStudentAJAXResponse create(CreateStudentAJAXRequest request) {
        return new CreateStudentAJAXResponse();
    }

}
