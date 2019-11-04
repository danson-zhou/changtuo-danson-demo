package app.demo.executor.domain;

import core.framework.async.Task;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Danson
 */
public class PrintTask implements Task {

    private final Logger logger = LoggerFactory.getLogger(PrintTask.class);
    private String message;

    public PrintTask(String message) {
        this.message = message;
    }

    @Override
    public void execute() throws Exception {
        logger.warn("print task start");
        logger.warn("message:-----" + message);
        logger.warn("print task stop");
        throw new Exception("exception test");
    }
}
