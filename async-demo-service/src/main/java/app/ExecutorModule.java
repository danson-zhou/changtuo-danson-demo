package app;

import app.demo.api.ExecutorWebService;
import app.demo.executor.service.ExecutorDemoService;
import app.demo.executor.web.ExecutorWebServiceImpl;
import core.framework.module.Module;

/**
 * @author Danson
 */
public class ExecutorModule extends Module {
    @Override
    protected void initialize() {
        executor().add();
        bind(ExecutorDemoService.class);
//        add parentActionLog
//        context.logManager.begin("123");
//        bean(ExecutorDemoService.class).normalTask();

        api().service(ExecutorWebService.class, bind(ExecutorWebServiceImpl.class));
    }
}
