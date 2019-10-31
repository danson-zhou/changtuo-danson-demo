package app.demo.api.student;

import core.framework.api.json.Property;
import core.framework.api.validate.NotNull;
import core.framework.api.web.service.QueryParam;

/**
 * @author Danson
 */
public class SearchStudentRequest {

    @Property(name = "name")
    public String name;
}
