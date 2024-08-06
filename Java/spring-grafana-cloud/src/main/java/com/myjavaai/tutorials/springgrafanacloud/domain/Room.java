package com.myjavaai.tutorials.springgrafanacloud.domain;

/**
 * Represents rooms where lessons are taught
 */
public class Room {

    private String name;

    public Room() {

    }

    public Room(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String name() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

}
