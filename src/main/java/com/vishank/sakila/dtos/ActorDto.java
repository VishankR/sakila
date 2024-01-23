package com.vishank.sakila.dtos;

import com.vishank.sakila.entities.FilmActorEntity;

import java.sql.Timestamp;
import java.util.Collection;

public class ActorDto {
    private Long actorId;
    private String firstName;
    private String lastName;
    private Timestamp lastUpdate;

    public Long getActorId() {
        return actorId;
    }

    public void setActorId(Long actorId) {
        this.actorId = actorId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Timestamp getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}
