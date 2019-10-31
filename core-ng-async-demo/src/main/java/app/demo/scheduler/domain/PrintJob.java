package app.demo.scheduler.domain;

import core.framework.scheduler.Job;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Danson
 */
public class PrintJob implements Job {
    private final Logger logger = LoggerFactory.getLogger(PrintJob.class);
    private String message;

    public PrintJob(String message) {
        this.message = message;
    }

    @Override
    public void execute() throws Exception {
        logger.warn(message);
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
