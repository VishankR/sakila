package com.vishank.sakila.dtos;

import com.vishank.sakila.entities.FilmEntity;

import java.sql.Timestamp;
import java.util.Collection;

public class LanguageDto {
    private long languageId;
    private String name;
    private Timestamp lastUpdate;
    private Collection<FilmDto> filmsByLanguageId;
    private Collection<FilmDto> filmsByLanguageId_0;

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

    public Collection<FilmDto> getFilmsByLanguageId() {
        return filmsByLanguageId;
    }

    public void setFilmsByLanguageId(Collection<FilmDto> filmsByLanguageId) {
        this.filmsByLanguageId = filmsByLanguageId;
    }

    public Collection<FilmDto> getFilmsByLanguageId_0() {
        return filmsByLanguageId_0;
    }

    public void setFilmsByLanguageId_0(Collection<FilmDto> filmsByLanguageId_0) {
        this.filmsByLanguageId_0 = filmsByLanguageId_0;
    }

    @Override
    public String toString() {
        return "LanguageDto{" +
                "languageId=" + languageId +
                ", name='" + name + '\'' +
                ", lastUpdate=" + lastUpdate +
                ", filmsByLanguageId=" + filmsByLanguageId +
                ", filmsByLanguageId_0=" + filmsByLanguageId_0 +
                '}';
    }
}
