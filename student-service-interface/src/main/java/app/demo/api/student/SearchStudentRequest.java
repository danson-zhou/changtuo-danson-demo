package app.demo.api.student;

import core.framework.api.json.Property;

/**
 * @author Danson
 */
public class SearchStudentRequest {

    @Property(name = "name")
    public String name;
}
