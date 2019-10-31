package app.demo.school.domain;

import core.framework.api.validate.NotBlank;
import core.framework.api.validate.NotNull;
import core.framework.mongo.Collection;
import core.framework.mongo.Field;
import core.framework.mongo.Id;
import org.bson.types.ObjectId;

/**
 * @author Danson
 */
@Collection(name = "schools")
public class School {
    @Id
    public ObjectId id;

    @NotNull
    @NotBlank
    @Field(name = "name")
    public String name;

    @NotNull
    @Field(name = "address")
    public String address;

    @Field(name = "teacher")
    public Teacher teacher;

}
