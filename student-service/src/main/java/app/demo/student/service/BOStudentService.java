package app.demo.student.service;

import app.demo.api.student.BOCreateStudentRequest;
import app.demo.api.student.BOCreateStudentResponse;
import app.demo.api.student.BODeleteStudentResponse;
import app.demo.api.student.BOGetStudentResponse;

/**
 * @author Danson
 */
public class BOStudentService {

    public BOGetStudentResponse get(Long number) {
        return new BOGetStudentResponse();
    }

    public BOCreateStudentResponse create(BOCreateStudentRequest request) {
        return new BOCreateStudentResponse();
    }

    public BODeleteStudentResponse delete(Long number) {
        return new BODeleteStudentResponse();
    }
}
