package app.web.student.service;

import app.demo.api.student.BOCreateStudentRequest;
import app.demo.api.student.BOCreateStudentResponse;
import app.demo.api.student.BOGetStudentResponse;

/**
 * @author Danson
 */
public class BOStudentService {

    public BOGetStudentResponse get(Long id) {
        return new BOGetStudentResponse();
    }

    public BOCreateStudentResponse create(BOCreateStudentRequest request) {
        return new BOCreateStudentResponse();
    }
}
