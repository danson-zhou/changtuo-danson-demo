package app.demo.api;

import app.demo.api.school.CreateSchoolRequest;
import app.demo.api.school.CreateSchoolResponse;
import app.demo.api.school.GetSchoolResponse;
import app.demo.api.school.ReplaceSchoolResponse;
import app.demo.api.school.UpdateSchoolResponse;
import core.framework.api.http.HTTPStatus;
import core.framework.api.web.service.GET;
import core.framework.api.web.service.POST;
import core.framework.api.web.service.PUT;
import core.framework.api.web.service.Path;
import core.framework.api.web.service.ResponseStatus;

/**
 * @author Danson
 */
public interface SchoolWebService {
    @GET
    @Path("/school")
    GetSchoolResponse get();

    @POST
    @Path("/school")
    @ResponseStatus(HTTPStatus.CREATED)
    CreateSchoolResponse create(CreateSchoolRequest request);

    @PUT
    @Path("/school")
    UpdateSchoolResponse update();

    @PUT
    @Path("/school/replace")
    ReplaceSchoolResponse replace();

}
