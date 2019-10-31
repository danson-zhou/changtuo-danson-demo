package app;

import app.demo.api.StudentWebService;
import app.demo.api.demo.subject.kafka.SubjectUpdatedMessage;
import app.demo.api.student.kafka.StudentStateUpdatedMessage;
import app.demo.student.domain.Student;
import app.demo.student.service.SubjectUpdatedMessageHandler;
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
        kafka().groupId("test");
        kafka().publish("student-state-updated", StudentStateUpdatedMessage.class);
        kafka().subscribe("subject-updated", SubjectUpdatedMessage.class, bind(SubjectUpdatedMessageHandler.class));
        // BO接口一致
//        bind(BOStudentService.class);
//        api().service(BOStudentWebService.class, bind(BOStudentWebServiceImpl.class));
    }
}
