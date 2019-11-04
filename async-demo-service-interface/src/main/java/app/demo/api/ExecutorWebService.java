package app.demo.api;

import core.framework.api.web.service.GET;
import core.framework.api.web.service.Path;

/**
 * @author Danson
 */
public interface ExecutorWebService {
    @GET
    @Path("/async/normal")
    public void normal();

    @GET
    @Path("/async/delayed")
    public void delayed();
}
