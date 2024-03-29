package com.vishank.sakila.dtos;

public class FilmTextDto {
    private long filmId;
    private String title;
    private String description;

    public long getFilmId() {
        return filmId;
    }

    public void setFilmId(long filmId) {
        this.filmId = filmId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "FilmTextDto{" +
                "filmId=" + filmId +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
