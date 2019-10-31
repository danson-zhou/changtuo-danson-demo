package app.demo.school.web;

import app.demo.api.SchoolWebService;
import app.demo.api.school.CreateSchoolRequest;
import app.demo.api.school.CreateSchoolResponse;
import app.demo.api.school.DeleteSchoolResponse;
import app.demo.api.school.GetSchoolResponse;
import app.demo.api.school.ReplaceSchoolResponse;
import app.demo.api.school.UpdateSchoolResponse;
import app.demo.school.service.SchoolService;
import core.framework.inject.Inject;

/**
 * @author Danson
 */
public class SchoolWebServiceImpl implements SchoolWebService {
    @Inject
    SchoolService schoolService;

    @Override
    public UpdateSchoolResponse update() {
        return schoolService.update();
    }

    @Override
    public ReplaceSchoolResponse replace() {
        return schoolService.replace();
    }

    @Override
    public GetSchoolResponse get() {
        return schoolService.get();
    }

    @Override
    public CreateSchoolResponse create(CreateSchoolRequest request) {
        return schoolService.create(request);
    }
}
