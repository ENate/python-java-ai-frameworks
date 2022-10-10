package com.minejava.mysqlr2dbcapp.service;

import org.springframework.transaction.annotation.Transactional;

import com.minejava.mysqlr2dbcapp.model.Person;
import com.minejava.mysqlr2dbcapp.repository.PersonRepository;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;


@RequiredArgsConstructor
public class PersonService {

    private final @NonNull PersonRepository personRepository;

    /**
	 * Saves the given {@link Perosn} unless its firstname is "Dave".
	 *
	 * @param person must not be {@literal null}.
	 * @return
	 */
	@Transactional
	public Mono<Person> save(Person person) {

		return personRepository.save(person).map(it -> {

			if (it.getFirstname().equals("Dave")) {
				throw new IllegalStateException();
			} else {
				return it;
			}
		});
	}
}
