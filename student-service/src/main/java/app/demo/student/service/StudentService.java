package app.demo.student.service;

import app.demo.api.student.CreateStudentRequest;
import app.demo.api.student.CreateStudentResponse;
import app.demo.api.student.GetStudentResponse;
import app.demo.api.student.SearchStudentRequest;
import app.demo.api.student.SearchStudentResponse;
import app.demo.api.student.UpdateStudentRequest;
import app.demo.api.student.UpdateStudentResponse;
import app.demo.student.domain.Student;
import core.framework.db.Database;
import core.framework.db.Query;
import core.framework.db.Repository;
import core.framework.db.Transaction;
import core.framework.inject.Inject;
import core.framework.util.Strings;
import core.framework.web.exception.NotFoundException;

import java.time.ZonedDateTime;
import java.util.List;

/**
 * @author Danson
 */
public class StudentService {

    @Inject
    Repository<Student> studentRepository;

    @Inject
    Database database;

    public GetStudentResponse get(Long id) {
        Student student = studentRepository.get(id).orElseThrow(() -> new NotFoundException("student not found, id=" + id));
        GetStudentResponse response = new GetStudentResponse();
        response.name = student.name;
        return response;
    }

    public CreateStudentResponse create(CreateStudentRequest request) {
        Student student = new Student();
        student.name = request.name;
        student.birthday = request.birthday;
        student.createdTime = ZonedDateTime.now();
        studentRepository.insert(student);
        return new CreateStudentResponse();
    }

    public UpdateStudentResponse update(Long id, UpdateStudentRequest request) {
        Student student = studentRepository.get(id).orElseThrow(() -> new NotFoundException("student not found, id=" + id));
        student.name = request.name;
//        student.birthday = null;
//        studentRepository.partialUpdate(student);
        // Transaction test
        try (Transaction ts = database.beginTransaction()) {
            studentRepository.update(student);
            // exception
//            int i = 1 / 0;
            ts.commit();
        }
//        studentRepository.update(student);
        return new UpdateStudentResponse();
    }


    public SearchStudentResponse search(SearchStudentRequest request) {
        Query<Student> query = studentRepository.select();
        query.skip(0);
        query.limit(10);
//        query.where("name = ?", request.name);
        query.where("name LIKE ?", Strings.format("{}%", request.name));
        List<Student> students = query.fetch();
        students.forEach(System.out::println);
        return new SearchStudentResponse();
    }

    public void delete(Long number) {
        studentRepository.delete(number);
    }
}
