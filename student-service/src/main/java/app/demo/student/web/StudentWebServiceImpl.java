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
    public GetStudentResponse get(Long id) {
        return studentService.get(id);
    }

    @Override
    public CreateStudentResponse create(CreateStudentRequest request) {
        return studentService.create(request);
    }

    @Override
    public UpdateStudentResponse update(Long id, UpdateStudentRequest request) {
        return studentService.update(id, request);
    }

    @Override
    public SearchStudentResponse search(SearchStudentRequest request) {
        return studentService.search(request);
    }
}
