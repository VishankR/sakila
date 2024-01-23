package com.vishank.sakila.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "film_text", indexes = {
        @Index(name = "idx_title_description", columnList = "title, description")
}, schema = "sakilaspringboot")
public class FilmTextEntity {
    @Id
    @Column(name = "film_id", columnDefinition = "SMALLINT UNSIGNED", nullable = false)
    private long filmId;
    @Basic
    @Column(name = "title", nullable = false, length = 255)
    private String title;
    @Basic
    @Column(name = "description", nullable = false, length = 255)
    private String description;

    @Override
    public String toString() {
        return "FilmTextEntity{" +
                "filmId=" + filmId +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
