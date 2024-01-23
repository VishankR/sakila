package com.vishank.sakila.entities;

import java.io.Serializable;

public class FilmActorEntityPK implements Serializable {
    private long actorByActorId;
    private long filmByFilmId;

    @Override
    public String toString() {
        return "FilmActorEntityPK{" +
                "actorByActorId=" + actorByActorId +
                ", filmByFilmId=" + filmByFilmId +
                '}';
    }
}
