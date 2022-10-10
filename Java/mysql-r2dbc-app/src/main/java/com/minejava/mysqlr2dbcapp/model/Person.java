package com.minejava.mysqlr2dbcapp.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table("person")
public class Person {
    @Id
    private Integer id;
    private String firstname;
    private String lastname;

    boolean hasId() {
		return id != null;
    }


}
