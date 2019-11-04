package app.web.student.web;

import app.demo.api.student.BOCreateStudentRequest;
import app.demo.api.student.BOCreateStudentResponse;
import app.demo.api.student.BOGetStudentResponse;
import app.web.ajax.BOStudentAjaxWebService;
import app.web.student.service.BOStudentService;
import core.framework.inject.Inject;

/**
 * @author Danson
 */
public class BOStudentAjaxWebServiceImpl implements BOStudentAjaxWebService {
    @Inject
    BOStudentService boStudentService;

    @Override
    public BOGetStudentResponse get(Long id) {
        return boStudentService.get(id);
    }

    @Override
    public BOCreateStudentResponse create(BOCreateStudentRequest request) {
        return boStudentService.create(request);
    }
}
