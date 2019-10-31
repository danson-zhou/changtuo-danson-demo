package app.demo.subject.service;

import app.demo.api.student.kafka.StudentStateUpdatedMessage;
import core.framework.kafka.MessageHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Danson
 */
public class StudentStateUpdatedMessageHandler implements MessageHandler<StudentStateUpdatedMessage> {
    private final Logger logger = LoggerFactory.getLogger(StudentStateUpdatedMessageHandler.class);
    

    @Override
    public void handle(String key, StudentStateUpdatedMessage value) throws Exception {
        logger.warn("core-ng-async-demo received {}-{}", key, value.desc);
    }
}
