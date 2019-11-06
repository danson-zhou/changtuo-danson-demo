package app.demo.api;

import core.framework.api.web.service.GET;
import core.framework.api.web.service.Path;

/**
 * @author Danson
 */
public interface ExecutorWebService {
    @GET
    @Path("/async/normal")
    void normal();

    @GET
    @Path("/async/delayed")
    void delayed();
}
