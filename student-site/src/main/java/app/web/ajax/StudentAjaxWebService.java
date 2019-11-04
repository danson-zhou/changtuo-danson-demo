package app.web.ajax;

import app.demo.api.student.CreateStudentRequest;
import app.demo.api.student.CreateStudentResponse;
import app.demo.api.student.GetStudentResponse;
import core.framework.api.web.service.GET;
import core.framework.api.web.service.POST;
import core.framework.api.web.service.Path;
import core.framework.api.web.service.PathParam;

/**
 * @author Danson
 */
public interface StudentAjaxWebService {
    @GET
    @Path("/ajax/student/:id")
    GetStudentResponse get(@PathParam("id") Long id);

    @POST
    @Path("/ajax/student")
    CreateStudentResponse create(CreateStudentRequest request);
}
