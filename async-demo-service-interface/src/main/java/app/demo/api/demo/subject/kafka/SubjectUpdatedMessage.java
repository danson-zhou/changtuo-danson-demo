package app.demo.api.demo.subject.kafka;

import core.framework.api.json.Property;
import core.framework.api.validate.NotBlank;
import core.framework.api.validate.NotNull;

/**
 * @author Danson
 */
public class SubjectUpdatedMessage {
    @NotNull
    @NotBlank
    @Property(name = "id")
    public String id;

    @NotNull
    @NotBlank
    @Property(name = "content")
    public String content;
}
