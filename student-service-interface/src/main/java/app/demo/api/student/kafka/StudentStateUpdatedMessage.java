package app.demo.api.student.kafka;

import core.framework.api.json.Property;
import core.framework.api.validate.NotBlank;
import core.framework.api.validate.NotNull;

/**
 * @author Danson
 */
public class StudentStateUpdatedMessage {
    @NotNull
    @NotBlank
    @Property(name = "id")
    public String id;

    @NotBlank
    @Property(name = "desc")
    public String desc;
}
