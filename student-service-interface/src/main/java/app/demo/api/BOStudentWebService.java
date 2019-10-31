package app.demo.api;

import app.demo.api.student.BOCreateStudentRequest;
import app.demo.api.student.BOCreateStudentResponse;
import app.demo.api.student.BODeleteStudentResponse;
import app.demo.api.student.BOGetStudentResponse;
import core.framework.api.http.HTTPStatus;
import core.framework.api.web.service.DELETE;
import core.framework.api.web.service.GET;
import core.framework.api.web.service.POST;
import core.framework.api.web.service.Path;
import core.framework.api.web.service.PathParam;
import core.framework.api.web.service.ResponseStatus;

/**
 * @author Danson
 */
public interface BOStudentWebService {
    @GET
    @Path("/bo/student/:number")
    BOGetStudentResponse get(@PathParam("number") Long number);

    @POST
    @Path("/bo/student")
    @ResponseStatus(HTTPStatus.CREATED)
    BOCreateStudentResponse create(BOCreateStudentRequest request);

    @DELETE
    @Path("/bo/student/:number")
    BODeleteStudentResponse delete(@PathParam("number") Long number);
}

