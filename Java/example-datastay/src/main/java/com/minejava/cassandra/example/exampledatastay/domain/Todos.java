package com.minejava.cassandra.example.exampledatastay.domain;

import java.util.UUID;

import org.springframework.data.cassandra.core.mapping.CassandraType;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;
import org.springframework.data.cassandra.core.mapping.CassandraType.Name;

import lombok.Getter;
import lombok.Setter;

@Table
@Getter
@Setter
public class Todos {

    @PrimaryKey
    @CassandraType(type = Name.UUID)
    private UUID uuid = UUID.randomUUID();

    private String title;

    private boolean completed = false;

    public Todos() {

    }

    public Todos(String title) {
        this.title = title;
    }
}
