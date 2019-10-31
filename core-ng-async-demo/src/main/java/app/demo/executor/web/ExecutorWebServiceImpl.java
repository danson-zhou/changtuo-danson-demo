package app.demo.executor.web;

import app.demo.api.ExecutorWebService;
import app.demo.executor.service.ExecutorDemoService;
import core.framework.inject.Inject;

/**
 * @author Danson
 */
public class ExecutorWebServiceImpl implements ExecutorWebService {
    @Inject
    ExecutorDemoService executorDemoService;

    @Override
    public void normal() {
        executorDemoService.normalTask();
    }

    @Override
    public void delayed() {
        executorDemoService.delayedTask();
    }
}
