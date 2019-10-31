package app.demo.student.web;

import app.demo.api.StudentWebService;
import app.demo.api.student.CreateStudentRequest;
import app.demo.api.student.CreateStudentResponse;
import app.demo.api.student.GetStudentResponse;
import app.demo.api.student.SearchStudentRequest;
import app.demo.api.student.SearchStudentResponse;
import app.demo.api.student.UpdateStudentRequest;
import app.demo.api.student.UpdateStudentResponse;
import app.demo.student.service.StudentService;
import core.framework.inject.Inject;

/**
 * @author Danson
 */
public class StudentWebServiceImpl implements StudentWebService {
    @Inject
    StudentService studentService;

    @Override
    public GetStudentResponse get(Long number) {
        return studentService.get(number);
    }

    @Override
    public CreateStudentResponse create(CreateStudentRequest request) {
        return studentService.create(request);
    }

    @Override
    public UpdateStudentResponse update(Long number, UpdateStudentRequest request) {
        return studentService.update(number, request);
    }

    @Override
    public SearchStudentResponse search(SearchStudentRequest request) {
        return studentService.search(request);
    }
}
