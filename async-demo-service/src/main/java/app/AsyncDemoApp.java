package app;

import core.framework.module.App;
import core.framework.module.SystemModule;

/**
 * @author Danson
 */
public class AsyncDemoApp extends App {
    @Override
    protected void initialize() {
        load(new SystemModule("sys.properties"));
//        load(new ExecutorModule());
//        load(new SchedulerModule());
        load(new SubjectModule());
    }
}
