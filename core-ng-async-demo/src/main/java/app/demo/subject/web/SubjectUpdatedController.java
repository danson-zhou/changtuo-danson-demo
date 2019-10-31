package app.demo.subject.web;

import app.demo.api.demo.subject.kafka.SubjectUpdatedMessage;
import core.framework.inject.Inject;
import core.framework.kafka.MessagePublisher;
import core.framework.web.Controller;
import core.framework.web.Request;
import core.framework.web.Response;

/**
 * @author Danson
 */
public class SubjectUpdatedController implements Controller {
    @Inject
    MessagePublisher<SubjectUpdatedMessage> publisher;

    @Override
    public Response execute(Request request) throws Exception {
        SubjectUpdatedMessage value = new SubjectUpdatedMessage();
        value.id = "1";
        value.content = "publish a message";
        publisher.publish(value.id, value);
        return Response.empty();
    }
}
