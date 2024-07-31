package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Person;
import com.example.demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
public class HelloController {


    @Autowired
    private PersonRepository personRepository;

    @GetMapping("/persons")
    public List<Person> getPersons() {
        System.out.println("test1");
        System.out.println("test2");
        System.out.println("test3");
        return personRepository.findAll();

    }
}
