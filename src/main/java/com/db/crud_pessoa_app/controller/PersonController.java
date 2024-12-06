package com.db.crud_pessoa_app.controller;

import com.db.crud_pessoa_app.model.Person;
import com.db.crud_pessoa_app.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping
    public List<Person> getAllPersons() {
        return personService.getAllPersons();
    }

    @PostMapping
    public Person savePerson(@RequestBody Person person) {
        return personService.createPerson(person);
    }
}
