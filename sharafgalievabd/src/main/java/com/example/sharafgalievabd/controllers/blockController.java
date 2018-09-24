package com.example.sharafgalievabd.controllers;

import com.example.sharafgalievabd.entities.Block;
import com.example.sharafgalievabd.interfaces.blockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class blockController {

    @Autowired
    private blockRepository blockRepository;

    @GetMapping("/block")
    public List<Block> retrieveAllBlocks () { return blockRepository.findAll(); }

}
