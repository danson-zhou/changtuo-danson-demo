package app.demo.school.service;

import app.demo.api.school.CreateSchoolRequest;
import app.demo.api.school.CreateSchoolResponse;
import app.demo.api.school.GetSchoolResponse;
import app.demo.api.school.ReplaceSchoolResponse;
import app.demo.api.school.UpdateSchoolResponse;
import app.demo.school.domain.School;
import app.demo.school.domain.Teacher;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import core.framework.inject.Inject;
import core.framework.mongo.MongoCollection;
import core.framework.mongo.Query;
import org.bson.conversions.Bson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * @author Danson
 */
public class SchoolService {
    private final Logger logger = LoggerFactory.getLogger(SchoolService.class);
    @Inject
    MongoCollection<School> collection;

    public CreateSchoolResponse create(CreateSchoolRequest request) {
        School school = new School();
        school.id = "1";
        school.name = "changtuo";
        school.address = "xiamen";
        Teacher teacher = new Teacher();
        teacher.teacherName = "ABC";
        school.teacher = teacher;
        collection.insert(school);
        logger.info("insert success!");
        return new CreateSchoolResponse();
    }

    public ReplaceSchoolResponse replace() {
        School school = new School();
        school.id = "1";
        school.address = "xiamenhuli";
        collection.replace(school);
        return new ReplaceSchoolResponse();
    }

    public void find() {
        List<School> schools = collection.find(Filters.eq("name", "changtuo"));
        schools.forEach(school -> logger.info(school.name));
    }

    public void query() {
        Query query = new Query();
        Bson filter = Filters.and(Filters.eq("name", "changtuo"), Filters.eq("address", "huli"));
        query.filter = filter;
        List<School> schools = collection.find(query);
        schools.forEach(school -> logger.info(school.name));
    }

    public UpdateSchoolResponse update() {
        collection.update(Filters.eq("name", "changtuo"), Updates.set("address", "huli"));
        return new UpdateSchoolResponse();
    }

    public void delete(String id) {
        collection.delete(id);
    }

    public GetSchoolResponse get() {
        collection.findOne(Filters.and(Filters.eq("name", "chancetop"), Filters.eq("address", "xiamen")));
//        collection.findOne(Filters.eq("name", "changtuo"));
//        query();
//        find();
        return new GetSchoolResponse();
    }
}

