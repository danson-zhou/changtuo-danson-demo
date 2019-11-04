package app.demo.executor.service;

import app.demo.executor.domain.PrintTask;
import core.framework.async.Executor;
import core.framework.async.Task;
import core.framework.inject.Inject;

import java.time.Duration;

/**
 * @author Danson
 */
public class ExecutorDemoService {
    @Inject
    Executor executor;

    public void normalTask() {
        Task printTask = new PrintTask("normal task");
        executor.submit("print1", printTask);
    }

    public void delayedTask() {
        Task printTask = new PrintTask("delayed task");
        executor.submit("print2", printTask, Duration.ofMillis(500));
    }
}
