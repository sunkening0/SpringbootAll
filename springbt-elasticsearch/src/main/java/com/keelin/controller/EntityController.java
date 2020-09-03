package com.keelin.controller;

import java.util.ArrayList;
import java.util.List;
import com.keelin.entity.Entity;
import com.keelin.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/entityController")
public class EntityController {


    @Autowired
    TestService cityESService;

    @RequestMapping(value="/save", method= RequestMethod.GET)
    public String save(long id, String name) {
        System.out.println("save 接口");
        if(id>0 && !StringUtils.isEmpty(name)) {
            Entity newEntity = new Entity(id,name);
            List<Entity> addList = new ArrayList<Entity>();
            addList.add(newEntity);
            cityESService.saveEntity(addList);
            return "OK";
        }else {
            return "Bad input value";
        }
    }

    @RequestMapping(value="/search", method=RequestMethod.GET)
    public List<Entity> save(String name) {
        List<Entity> entityList = null;
        if(!StringUtils.isEmpty(name)) {
            entityList = cityESService.searchEntity(name);
        }
        return entityList;
    }
}