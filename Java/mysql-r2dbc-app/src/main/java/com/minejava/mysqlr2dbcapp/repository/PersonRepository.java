package com.minejava.mysqlr2dbcapp.repository;

import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.minejava.mysqlr2dbcapp.model.Person;

import reactor.core.publisher.Flux;

public interface PersonRepository extends ReactiveCrudRepository<Person, Integer> {
    @Query("select id, firstname, lastname from customer c where c.lastname = :lastname")
	Flux<Person> findByLastname(String lastname);
}
