package app.demo.student.service;

import app.demo.api.demo.subject.kafka.SubjectUpdatedMessage;
import app.demo.api.student.kafka.StudentStateUpdatedMessage;
import core.framework.inject.Inject;
import core.framework.kafka.MessageHandler;
import core.framework.kafka.MessagePublisher;
import core.framework.util.Randoms;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Danson
 */
public class SubjectUpdatedMessageHandler implements MessageHandler<SubjectUpdatedMessage> {
    private final Logger logger = LoggerFactory.getLogger(SubjectUpdatedMessageHandler.class);
    @Inject
    MessagePublisher<StudentStateUpdatedMessage> publisher;

    @Override
    public void handle(String key, SubjectUpdatedMessage value) throws Exception {
        logger.warn("key={}, content={}", key, value.content);
        String messageKey = String.valueOf(Randoms.nextInt(-3, 2));
        StudentStateUpdatedMessage message = new StudentStateUpdatedMessage();
        message.id = messageKey;
        message.desc = "student received message...";
        publisher.publish(messageKey, message);
    }
}
