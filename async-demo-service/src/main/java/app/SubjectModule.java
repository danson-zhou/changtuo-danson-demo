package app;

import app.demo.api.demo.subject.kafka.SubjectUpdatedMessage;
import app.demo.api.student.kafka.StudentStateUpdatedMessage;
import app.demo.subject.service.StudentStateUpdatedMessageHandler;
import app.demo.subject.web.SubjectUpdatedController;
import core.framework.http.HTTPMethod;
import core.framework.module.Module;

/**
 * @author Danson
 */
public class SubjectModule extends Module {
    @Override
    protected void initialize() {
        kafka().publish("subject-updated", SubjectUpdatedMessage.class);
        kafka().subscribe("student-state-updated", StudentStateUpdatedMessage.class, bind(StudentStateUpdatedMessageHandler.class));
        //        POST  /topic/:topic/message/:key
        http().route(HTTPMethod.GET, "/kafka", bind(SubjectUpdatedController.class));
    }
}
