package app.web.ajax;

import core.framework.api.web.service.GET;
import core.framework.api.web.service.Path;
import core.framework.api.web.service.PathParam;

/**
 * @author Danson
 */
public interface StudentAJAXWebService {
    @GET
    @Path("/ajax/student/:number")
    AJAXGetStudentResponse get(@PathParam("number") Long number);
}
