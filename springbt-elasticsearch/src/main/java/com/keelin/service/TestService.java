package com.keelin.service;

import com.keelin.entity.Entity;

import java.util.List;

public interface TestService {
    void saveEntity(Entity entity);

    void saveEntity(List<Entity> entityList);

    List<Entity> searchEntity(String searchContent);
}
