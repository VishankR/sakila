package com.vishank.sakila.controller;

import com.vishank.sakila.dtos.ActorDto;
import com.vishank.sakila.mappers.ActorMapper;
import com.vishank.sakila.services.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/v1/actor/")
public class ActorController {

    @Autowired
    ActorService actorService;
    @Autowired
    ActorMapper actorMapper;

    @GetMapping("/all")
    public List<ActorDto> getAllActors(){
        return actorService.getAllActorEntities().stream().map(actorEntity -> actorMapper.actorEntityToActorDto(actorEntity)).collect(Collectors.toList());
    }
}
