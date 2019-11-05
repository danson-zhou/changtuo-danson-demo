package app.web.student.service;

import app.demo.api.BOStudentWebService;
import app.demo.api.student.BOCreateStudentRequest;
import app.demo.api.student.BOCreateStudentResponse;
import app.demo.api.student.BOGetStudentResponse;
import app.web.ajax.BOCreateStudentAJAXRequest;
import app.web.ajax.BOCreateStudentAJAXResponse;
import app.web.ajax.BOGetStudentAJAXResponse;
import core.framework.inject.Inject;

/**
 * @author Danson
 */
public class BOStudentService {
    @Inject
    BOStudentWebService boStudentWebService;

    public BOGetStudentAJAXResponse get(Long id) {
        BOGetStudentResponse response = boStudentWebService.get(id);
        return new BOGetStudentAJAXResponse();
    }

    public BOCreateStudentAJAXResponse create(BOCreateStudentAJAXRequest request) {
        BOCreateStudentRequest boCreateStudentRequest = new BOCreateStudentRequest();
        BOCreateStudentResponse response = boStudentWebService.create(boCreateStudentRequest);
        return new BOCreateStudentAJAXResponse();
    }
}
