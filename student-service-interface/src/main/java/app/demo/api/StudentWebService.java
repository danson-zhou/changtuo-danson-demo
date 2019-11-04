package app.demo.api;

import app.demo.api.student.CreateStudentRequest;
import app.demo.api.student.CreateStudentResponse;
import app.demo.api.student.GetStudentResponse;
import app.demo.api.student.SearchStudentRequest;
import app.demo.api.student.SearchStudentResponse;
import app.demo.api.student.UpdateStudentRequest;
import app.demo.api.student.UpdateStudentResponse;
import core.framework.api.http.HTTPStatus;
import core.framework.api.web.service.GET;
import core.framework.api.web.service.POST;
import core.framework.api.web.service.PUT;
import core.framework.api.web.service.Path;
import core.framework.api.web.service.PathParam;
import core.framework.api.web.service.ResponseStatus;

/**
 * @author Danson
 */
public interface StudentWebService {

    @GET
    @Path("/student/:id")
    GetStudentResponse get(@PathParam("id") Long id);

    @POST
    @Path("/student")
    @ResponseStatus(HTTPStatus.CREATED)
    CreateStudentResponse create(CreateStudentRequest request);

    @PUT
    @Path("/student/:id")
    UpdateStudentResponse update(@PathParam("id") Long id, UpdateStudentRequest request);

    @PUT
    @Path("/student")
    SearchStudentResponse search(SearchStudentRequest request);
}
