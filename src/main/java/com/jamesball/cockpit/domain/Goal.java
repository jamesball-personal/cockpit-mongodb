package com.jamesball.cockpit.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDate;

@Document
public class Goal {

    @Id
    private String id;

    @Field
    private String name;

    @Field
    @Indexed
    private LifeCycleStatus lifeCycleStatus;

    @Transient
    private LocalDate createdAt;

    public Goal() {
        this.createdAt = LocalDate.now();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LifeCycleStatus getLifeCycleStatus() {
        return lifeCycleStatus;
    }

    public void setLifeCycleStatus(LifeCycleStatus lifeCycleStatus) {
        this.lifeCycleStatus = lifeCycleStatus;
    }
}
