package com.vishank.sakila.entities;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Collection;

@Entity
@Table(name = "actor", indexes = {@Index(name = "idx_actor_first_name", columnList = "first_name")}, schema = "sakilaspringboot")
public class ActorEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "actor_id", columnDefinition = "SMALLINT UNSIGNED", nullable = false)
    private long actorId;
    @Basic
    @Column(name = "first_name", nullable = false, length = 45)
    private String firstName;
    @Basic
    @Column(name = "last_name", nullable = false, length = 45)
    private String lastName;
    @Basic
    @Column(name = "last_update", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP", nullable = false)
    private Timestamp lastUpdate;
    @OneToMany(mappedBy = "actorByActorId")
    private Collection<FilmActorEntity> filmActorsByActorId;

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

    public Collection<FilmActorEntity> getFilmActorsByActorId() {
        return filmActorsByActorId;
    }

    public void setFilmActorsByActorId(Collection<FilmActorEntity> filmActorsByActorId) {
        this.filmActorsByActorId = filmActorsByActorId;
    }

    @Override
    public String toString() {
        return "ActorEntity{" +
                "actorId=" + actorId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", lastUpdate=" + lastUpdate +
                ", filmActorsByActorId=" + filmActorsByActorId +
                '}';
    }
}
