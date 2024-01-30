package com.vishank.sakila.dtos;

public class ActorInfoDto {
    private long id;
    private long actorId;
    private String firstName;
    private String lastName;
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
        return "ActorInfoDto{" +
                "actorId=" + actorId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", filmInfo='" + filmInfo + '\'' +
                '}';
    }
}
