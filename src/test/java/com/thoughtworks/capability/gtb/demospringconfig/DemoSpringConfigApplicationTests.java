package com.thoughtworks.capability.gtb.demospringconfig;

import javafx.application.Application;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@ContextConfiguration(
		initializers = PropertyOverrideContextInitializer.class,
		classes = Application.class)
@SpringBootTest
class DemoSpringConfigApplicationTests {

	@Autowired
	private LevelController levelController;

	@Test
	public void shouldReturnBasic(){
		assertEquals("basic",levelController.getLevel());
	}
}
