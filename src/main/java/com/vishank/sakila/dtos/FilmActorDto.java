package com.vishank.sakila.dtos;

import com.vishank.sakila.entities.ActorEntity;
import com.vishank.sakila.entities.FilmEntity;
import jakarta.persistence.*;

import java.sql.Timestamp;

public class FilmActorDto {
    private Timestamp lastUpdate;
    private ActorDto actorByActorId;
    private FilmDto filmByFilmId;

    public Timestamp getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public ActorDto getActorByActorId() {
        return actorByActorId;
    }

    public void setActorByActorId(ActorDto actorByActorId) {
        this.actorByActorId = actorByActorId;
    }

    public FilmDto getFilmByFilmId() {
        return filmByFilmId;
    }

    public void setFilmByFilmId(FilmDto filmByFilmId) {
        this.filmByFilmId = filmByFilmId;
    }

    @Override
    public String toString() {
        return "FilmActorDto{" +
                "lastUpdate=" + lastUpdate +
                '}';
    }
}
