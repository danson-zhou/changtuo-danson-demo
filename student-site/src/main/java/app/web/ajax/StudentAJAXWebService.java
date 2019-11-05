package app.web.ajax;

import core.framework.api.web.service.GET;
import core.framework.api.web.service.POST;
import core.framework.api.web.service.Path;
import core.framework.api.web.service.PathParam;

/**
 * @author Danson
 */
public interface StudentAJAXWebService {
    @GET
    @Path("/ajax/student/:id")
    GetStudentAJAXResponse get(@PathParam("id") Long id);

    @POST
    @Path("/ajax/student")
    CreateStudentAJAXResponse create(CreateStudentAJAXRequest request);
}
