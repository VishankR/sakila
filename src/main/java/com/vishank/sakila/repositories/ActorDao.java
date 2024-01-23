package com.vishank.sakila.repositories;

import com.vishank.sakila.entities.ActorEntity;

import java.util.List;

public interface ActorDao {
    public List<ActorEntity> getAllActorEntities();
}
