package app.web.student.web;

import app.web.ajax.BOCreateStudentAJAXRequest;
import app.web.ajax.BOCreateStudentAJAXResponse;
import app.web.ajax.BOGetStudentAJAXResponse;
import app.web.ajax.BOStudentAJAXWebService;
import app.web.student.service.BOStudentService;
import core.framework.inject.Inject;

/**
 * @author Danson
 */
public class BOStudentAJAXWebServiceImpl implements BOStudentAJAXWebService {
    @Inject
    BOStudentService boStudentService;

    @Override
    public BOGetStudentAJAXResponse get(Long id) {
        return boStudentService.get(id);
    }

    @Override
    public BOCreateStudentAJAXResponse create(BOCreateStudentAJAXRequest request) {
        return boStudentService.create(request);
    }
}
