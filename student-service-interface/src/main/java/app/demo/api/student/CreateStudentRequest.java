package app.demo.api.student;

import core.framework.api.json.Property;
import core.framework.api.validate.NotBlank;
import core.framework.api.validate.NotNull;

import java.time.LocalDate;

/**
 * @author Danson
 */
public class CreateStudentRequest {
    @NotNull
    @NotBlank
    @Property(name = "name")
    public String name;

    @NotNull
    @Property(name = "birthday")
    public LocalDate birthday;
}
