package com.marlonb.simple_person_api.controller;

import com.marlonb.simple_person_api.model.Person;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class PersonController {

    @RequestMapping("/person-information")
    public List<Person> retrieveAllPersonData () {
        return Arrays.asList(new Person(1, "FirstName1 LastName1", "user1@gmail.com", "09123456789"),
                             new Person(2, "FirstName2 LastName2", "user2@gmail.com", "09987654321"));
    }
}
