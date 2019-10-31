package app.demo.school.domain;

import core.framework.api.validate.NotBlank;
import core.framework.api.validate.NotNull;
import core.framework.mongo.Field;

/**
 * @author Danson
 */
public class Teacher {
    @NotNull
    @NotBlank
    @Field(name = "teacher_name")
    public String teacherName;
}
