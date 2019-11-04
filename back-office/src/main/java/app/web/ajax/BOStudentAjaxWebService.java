package app.web.ajax;

import app.demo.api.student.BOCreateStudentRequest;
import app.demo.api.student.BOCreateStudentResponse;
import app.demo.api.student.BOGetStudentResponse;
import core.framework.api.web.service.GET;
import core.framework.api.web.service.POST;
import core.framework.api.web.service.PUT;
import core.framework.api.web.service.Path;
import core.framework.api.web.service.PathParam;

/**
 * @author Danson
 */
public interface BOStudentAjaxWebService {
    @GET
    @Path("/student/:id")
    BOGetStudentResponse get(@PathParam("id") Long id);

    @POST
    @Path("/student")
    BOCreateStudentResponse create(BOCreateStudentRequest request);

}
