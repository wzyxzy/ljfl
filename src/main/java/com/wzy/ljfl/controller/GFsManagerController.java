package com.wzy.ljfl.controller;

import com.wzy.ljfl.entity.GFsEntity;
import com.wzy.ljfl.jpa.GFsJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

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

    @RequestMapping(value = "/findOne", method = RequestMethod.GET)
    public Optional<GFsEntity> find(Long id) {
        return gFsJPA.findById(id);
    }

    @RequestMapping(value = "/pointManage", method = RequestMethod.GET)
    public GFsEntity pointManage(Long id, int point) {
        GFsEntity gFsEntity = gFsJPA.getOne(id);
        gFsEntity.setPoint(gFsEntity.getPoint() + point);
        gFsEntity.setPoint_now(point);
        return save(gFsEntity);
    }

}
