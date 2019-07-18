package com.wzy.ljfl.controller;

import com.wzy.ljfl.entity.LajiEntity;
import com.wzy.ljfl.jpa.LajiJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping(value = "/laji")
public class LajiManagerController {

    @Autowired
    private LajiJPA lajiJPA;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<LajiEntity> list() {
        return lajiJPA.findAll();
    }

    @RequestMapping(value = "/getOne")
    public List<LajiEntity> find(String name) {
        LajiEntity lajiEntity = new LajiEntity();
        lajiEntity.setName(name);
        Example<LajiEntity> entityExample = new Example<LajiEntity>() {
            @Override
            public LajiEntity getProbe() {
                return lajiEntity;
            }

            @Override
            public ExampleMatcher getMatcher() {
//                ExampleMatcher exampleMatcher =
                return ExampleMatcher.matching()
                        .withMatcher("name", ExampleMatcher.GenericPropertyMatchers.contains())
                        // 忽略 id 和 createTime 字段。
                        .withIgnorePaths("id", "value")
                        // 忽略大小写。
                        .withIgnoreCase()
                        // 忽略为空字段。
                        .withIgnoreNullValues();
            }
        };
        return lajiJPA.findAll(entityExample);
    }


}
