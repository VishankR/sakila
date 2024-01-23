package com.vishank.sakila.mappers;

import com.vishank.sakila.dtos.ActorDto;
import com.vishank.sakila.entities.ActorEntity;
import org.springframework.stereotype.Component;

@Component
public class ActorMapper {

    public ActorDto actorEntityToActorDto(ActorEntity actorEntity){
        ActorDto actorDto = new ActorDto();
        actorDto.setActorId(actorEntity.getActorId());
        actorDto.setFirstName(actorEntity.getFirstName());
        actorDto.setLastName(actorEntity.getLastName());
        actorDto.setLastUpdate(actorEntity.getLastUpdate());
        return actorDto;
    }
}
