package com.myjavaai.tutorials.springgrafanacloud.domain;

import ai.timefold.solver.core.api.domain.entity.PlanningEntity;
import ai.timefold.solver.core.api.domain.lookup.PlanningId;
import ai.timefold.solver.core.api.domain.variable.PlanningVariable;

/**
 * Use of planning annotation to identify planning fields
 * Planning fields contains null as input -> and non-null values
 * as outputs as per timeflot docs.
 * Entire Object: Planning entity, variables: planningVariables
 */
@PlanningEntity
public class Lesson {

    @PlanningId
    private String id;
    private String subject;
    private String teacher;
    private String studentGroup;

    @PlanningVariable
    private Timeslot timeslot;

    @PlanningVariable
    private Room room;

    public Lesson() {
    }

    public Lesson(String id, String subject, String teacher, String studentGroup) {
        this.id = id;
        this.subject = subject;
        this.teacher = teacher;
        this.studentGroup = studentGroup;
    }

    public String getId() {
        return id;
    }

    public String getSubject() {
        return subject;
    }

    public String getTeacher() {
        return teacher;
    }

    public String getStudentGroup() {
        return studentGroup;
    }

    public Timeslot getTimeslot() {
        return timeslot;
    }

    public void setTimeslot(Timeslot timeslot) {
        this.timeslot = timeslot;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    @Override
    public String toString() {
        return subject + "(" + id + ")";
    }
}
