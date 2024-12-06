package com.db.crud_pessoa_app.service;

import com.db.crud_pessoa_app.model.Person;
import com.db.crud_pessoa_app.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public List<Person> getAllPersons() {
        return this.personRepository.findAll();
    }

    public Person createPerson(Person person) {
        return this.personRepository.save(person);
    }
}
