package com.minejava.mysqlr2dbcapp;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.ClassRule;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

@SpringBootTest
@Testcontainers
class MysqlR2dbcAppApplicationTests {

	@ClassRule
	@Container
	private static final PostgreSQLContainer<?> POSTGRE_SQL_CONTAINER = new PostgreSQLContainer<>("postgres:latest");

	@Test
	void contextLoads() {
		assertTrue(POSTGRE_SQL_CONTAINER.isRunning());
	}

}
