package com.vishank.sakila.controller;

import com.vishank.sakila.entities.ActorEntity;
import com.vishank.sakila.services.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/actor/")
public class ActorController {

    @Autowired
    ActorService actorService;

    @GetMapping("/all")
    public List<ActorEntity> getAllActors(){
//        List<ActorDto> actorDtoList = actorService.getAllActorEntities().stream().map(actorEntity -> ACTOR_MAPPER.getDtoFromEntity(actorEntity)).collect(Collectors.toList());
        return actorService.getAllActorEntities();
    }
    @GetMapping("/id")
    public ActorEntity getAllActors(@RequestParam long id){
        ActorEntity actorEntity = actorService.getActorEntity(id);
        return actorEntity;
    }
}
