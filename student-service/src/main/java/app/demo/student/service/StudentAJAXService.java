package app.demo.student.service;

import app.web.ajax.AJAXCreateStudentRequest;
import app.web.ajax.AJAXCreateStudentResponse;
import app.web.ajax.AJAXGetStudentResponse;

/**
 * @author Danson
 */
public class StudentAJAXService {
    public AJAXGetStudentResponse get(Long number) {
        return new AJAXGetStudentResponse();
    }

    public AJAXCreateStudentResponse create(AJAXCreateStudentRequest request) {
        return new AJAXCreateStudentResponse();
    }
}
