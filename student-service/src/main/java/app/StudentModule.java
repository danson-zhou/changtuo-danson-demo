package app;

import app.demo.api.StudentWebService;
import app.demo.student.domain.Student;
import app.demo.student.service.StudentService;
import app.demo.student.web.StudentWebServiceImpl;
import core.framework.module.Module;

/**
 * @author Danson
 */
public class StudentModule extends Module {
    @Override
    protected void initialize() {
        db().repository(Student.class);
        bind(StudentService.class);
        api().service(StudentWebService.class, bind(StudentWebServiceImpl.class));

//        bind(BOStudentService.class);
//        api().service(BOStudentWebService.class, bind(BOStudentWebServiceImpl.class));
//
//        kafka().groupId("test");
//        kafka().publish("student-state-updated", StudentStateUpdatedMessage.class);
//        kafka().subscribe("subject-updated", SubjectUpdatedMessage.class, bind(SubjectUpdatedMessageHandler.class));
    }
}
