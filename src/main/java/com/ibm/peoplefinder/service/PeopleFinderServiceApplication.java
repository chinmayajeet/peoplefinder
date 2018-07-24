package com.ibm.peoplefinder.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.ibm.peoplefinder.controller.PeopleFinderMainController;

@SpringBootApplication
@ComponentScan(basePackageClasses = PeopleFinderMainController.class)
public class PeopleFinderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PeopleFinderServiceApplication.class, args);
	}
}
