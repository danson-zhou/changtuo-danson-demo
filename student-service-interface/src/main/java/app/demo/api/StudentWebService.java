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

import java.time.LocalDate;

/**
 * @author Danson
 */
public interface StudentWebService {

    @GET
    @Path("/student/:number")
    GetStudentResponse get(@PathParam("number") Long number);

    @POST
    @Path("/student")
    @ResponseStatus(HTTPStatus.CREATED)
    CreateStudentResponse create(CreateStudentRequest request);

    @PUT
    @Path("/student/:number")
    UpdateStudentResponse update(@PathParam("number") Long number, UpdateStudentRequest request);

    @PUT
    @Path("/student")
    SearchStudentResponse search(SearchStudentRequest request);
}
