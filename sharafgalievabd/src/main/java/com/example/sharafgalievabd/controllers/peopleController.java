package com.example.sharafgalievabd.controllers;

import com.example.sharafgalievabd.entities.People;
import com.example.sharafgalievabd.interfaces.peopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class peopleController {

    @Autowired
    private peopleRepository peopleRepository;

    @GetMapping("/people")
    public List<People> retrieveAllPeoples () { return peopleRepository.findAll(); }
}
