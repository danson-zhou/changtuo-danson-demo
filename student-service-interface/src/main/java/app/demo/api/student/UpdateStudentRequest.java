package app.demo.api.student;

import core.framework.api.json.Property;
import core.framework.api.validate.NotBlank;
import core.framework.api.validate.NotNull;

/**
 * @author Danson
 */
public class UpdateStudentRequest {
    @NotNull
    @NotBlank
    @Property(name = "name")
    public String name;
}
