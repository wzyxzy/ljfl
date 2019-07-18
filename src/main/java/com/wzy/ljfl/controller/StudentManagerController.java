package com.wzy.ljfl.controller;

import com.wzy.ljfl.entity.StudentEntity;
import com.wzy.ljfl.jpa.StudentJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping(value = "/student")
public class StudentManagerController {

    @Autowired
    private StudentJPA studentJPA;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<StudentEntity> list() {
        return studentJPA.findAll();
    }

    @RequestMapping(value = "/getOne", method = RequestMethod.GET)
    public List<StudentEntity> getOne() {
        long a = (long) (Math.random() * 10000) + 1;
        return studentJPA.findAllById(Collections.singleton(a));
    }


}
