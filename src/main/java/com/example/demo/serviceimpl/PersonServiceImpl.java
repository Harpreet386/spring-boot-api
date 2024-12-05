package com.example.demo.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Person;
import com.example.demo.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {
    private final List<Person> personList = new ArrayList<>();

    public PersonServiceImpl() {
        // Adding sample data for initial testing
        personList.add(new Person("John", "Doe", 30));
        personList.add(new Person("Jane", "Doe", 25));
    }

    @Override
    public List<Person> getAllPersons() {
        return personList;
    }

    @Override
    public Person getPersonById(int id) {
        if (id < personList.size()) {
            return personList.get(id);
        }
        return null;
    }

    @Override
    public Person addPerson(Person person) {
        personList.add(person);
        return person;
    }
}
