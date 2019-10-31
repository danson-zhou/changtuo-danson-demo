package app.demo.student.domain;

import core.framework.api.validate.NotBlank;
import core.framework.api.validate.NotNull;
import core.framework.db.Column;
import core.framework.db.PrimaryKey;
import core.framework.db.Table;

import java.time.LocalDate;
import java.time.ZonedDateTime;

/**
 * @author Danson
 */
@Table(name = "students")
public class Student {
    @PrimaryKey(autoIncrement = true)
    @Column(name = "id")
    public Long id;

    @NotNull
    @NotBlank
    @Column(name = "name")
    public String name;

    @NotNull
    @Column(name = "birthday")
    public LocalDate birthday;

    @NotNull
    @Column(name = "created_time")
    public ZonedDateTime createdTime;
}
