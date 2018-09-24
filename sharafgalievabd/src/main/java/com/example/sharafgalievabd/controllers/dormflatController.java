package com.example.sharafgalievabd.controllers;

import com.example.sharafgalievabd.entities.Dormflat;
import com.example.sharafgalievabd.interfaces.dormflatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class dormflatController {

    @Autowired
    private dormflatRepository dormflatRepository;

    @GetMapping("/flat")
    public List<Dormflat> retrieveAllFlats () { return  dormflatRepository.findAll(); }

}
