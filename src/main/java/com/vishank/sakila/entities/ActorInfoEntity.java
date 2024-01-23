package com.vishank.sakila.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;
import org.hibernate.annotations.Subselect;

@Entity
@Immutable
@Table(name = "actor_info")
@Subselect("select uuid() as id, ai.* from actor_info ai")
public class ActorInfoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Basic
    @Column(name = "actor_id", nullable = false)
    private long actorId;
    @Basic
    @Column(name = "first_name", nullable = false, length = 45)
    private String firstName;
    @Basic
    @Column(name = "last_name", nullable = false, length = 45)
    private String lastName;
    @Basic
    @Column(name = "film_info", nullable = true, length = -1)
    private String filmInfo;

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

    public String getFilmInfo() {
        return filmInfo;
    }

    public void setFilmInfo(String filmInfo) {
        this.filmInfo = filmInfo;
    }

    @Override
    public String toString() {
        return "ActorInfoEntity{" +
                "actorId=" + actorId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", filmInfo='" + filmInfo + '\'' +
                '}';
    }
}
