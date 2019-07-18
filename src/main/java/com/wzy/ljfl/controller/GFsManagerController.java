package com.wzy.ljfl.controller;

import com.wzy.ljfl.entity.GFsEntity;
import com.wzy.ljfl.jpa.GFsJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/gfs")
public class GFsManagerController {

    @Autowired
    private GFsJPA gFsJPA;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<GFsEntity> list() {
        return gFsJPA.findAll();
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public boolean delete(Long id) {
        gFsJPA.deleteById(id);
        return !gFsJPA.existsById(id);
    }

    @RequestMapping(value = "/save", method = RequestMethod.GET)
    public GFsEntity save(GFsEntity gFsEntity) {
        return gFsJPA.save(gFsEntity);
    }

}
