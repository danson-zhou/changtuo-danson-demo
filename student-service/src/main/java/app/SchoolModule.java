package app;

import app.demo.api.SchoolWebService;
import app.demo.school.domain.School;
import app.demo.school.service.SchoolService;
import app.demo.school.web.SchoolWebServiceImpl;
import core.framework.module.Module;
import core.framework.mongo.module.MongoConfig;

/**
 * @author Danson
 */
public class SchoolModule extends Module {
    @Override
    protected void initialize() {
        MongoConfig mongo = config(MongoConfig.class);
        mongo.uri("mongodb://localhost:27017/test");
        mongo.collection(School.class);
        bind(SchoolService.class);
        api().service(SchoolWebService.class, bind(SchoolWebServiceImpl.class));
    }
}
