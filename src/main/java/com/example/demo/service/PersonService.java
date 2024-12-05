package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Person;

public interface PersonService {

	List<Person> getAllPersons();
    Person getPersonById(int id);
    Person addPerson(Person person);
	
}
