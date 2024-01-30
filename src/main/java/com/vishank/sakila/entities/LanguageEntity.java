package com.vishank.sakila.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Collection;

@Entity
@Table(name = "language", schema = "sakilaspringboot")
public class LanguageEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "language_id", columnDefinition = "TINYINT UNSIGNED", nullable = false)
    private long languageId;
    @Basic
    @Column(name = "name", nullable = false, length = 20)
    private String name;
    @Basic
    @Column(name = "last_update", columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP", nullable = false)
    private Timestamp lastUpdate;
    @OneToMany(mappedBy = "languageByLanguageId")
    @JsonManagedReference
    private Collection<FilmEntity> filmsByLanguageId;
    @OneToMany(mappedBy = "languageByOriginalLanguageId")
    @JsonManagedReference
    private Collection<FilmEntity> filmsByLanguageId_0;

    public long getLanguageId() {
        return languageId;
    }

    public void setLanguageId(long languageId) {
        this.languageId = languageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Timestamp getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @JsonManagedReference
    public Collection<FilmEntity> getFilmsByLanguageId() {
        return filmsByLanguageId;
    }

    public void setFilmsByLanguageId(Collection<FilmEntity> filmsByLanguageId) {
        this.filmsByLanguageId = filmsByLanguageId;
    }

    @JsonManagedReference
    public Collection<FilmEntity> getFilmsByLanguageId_0() {
        return filmsByLanguageId_0;
    }

    public void setFilmsByLanguageId_0(Collection<FilmEntity> filmsByLanguageId_0) {
        this.filmsByLanguageId_0 = filmsByLanguageId_0;
    }

    @Override
    public String toString() {
        return "LanguageEntity{" +
                "languageId=" + languageId +
                ", name='" + name + '\'' +
                ", lastUpdate=" + lastUpdate +
                ", filmsByLanguageId=" + filmsByLanguageId +
                ", filmsByLanguageId_0=" + filmsByLanguageId_0 +
                '}';
    }
}
