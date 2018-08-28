package com.example.dbmongodb.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/crud")
public class CrudController {

    @PostMapping("/insert")
    public String insert(){
        return "insert";
    }

    @PutMapping("/update")
    public String update(){
        return "update";
    }
}
