package com.myjavaai.tutorials.springgrafanacloud.domain;

import java.time.DayOfWeek;
import java.time.LocalTime;

public class Timeslot {

    // Define fields: Use explicitly define Getters
    // Because Timeslots do not change -> problem fact!
    private DayOfWeek dayOfWeek;
    private LocalTime startTime;
    private LocalTime endTime;

    // Dependency Injection for all fields
    public Timeslot(DayOfWeek dayOfWeek, LocalTime starTime, LocalTime endTime) {
        this.dayOfWeek = dayOfWeek;
        this.startTime = starTime;
        this.endTime = endTime;
    }

    // Define getters

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    @Override
    public String toString() {
        return dayOfWeek + " " + startTime;
    }

}
