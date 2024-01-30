package com.vishank.sakila.services;

import com.vishank.sakila.dtos.ActorDto;
import com.vishank.sakila.entities.ActorEntity;

import java.util.List;

public interface ActorService {
    List<ActorEntity> getAllActorEntities();
    ActorEntity getActorEntity(long id);
}
