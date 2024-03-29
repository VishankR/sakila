package com.vishank.sakila.dtos;

import java.sql.Timestamp;
import java.util.Collection;

public class ActorDto {
    private long actorId;
    private String firstName;
    private String lastName;
    private Timestamp lastUpdate;
    private Collection<FilmActorDto> filmActorsByActorId;

    public long getActorId() {
        return actorId;
    }

    public void setActorId(long actorId) {
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

    public Collection<FilmActorDto> getFilmActorsByActorId() {
        return filmActorsByActorId;
    }

    public void setFilmActorsByActorId(Collection<FilmActorDto> filmActorsByActorId) {
        this.filmActorsByActorId = filmActorsByActorId;
    }

    @Override
    public String toString() {
        return "ActorDto{" +
                "actorId=" + actorId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", lastUpdate=" + lastUpdate +
                ", filmActorsByActorId=" + filmActorsByActorId +
                '}';
    }
}
