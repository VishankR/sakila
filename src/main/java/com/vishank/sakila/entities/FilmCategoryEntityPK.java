package com.vishank.sakila.entities;

import java.io.Serializable;

public class FilmCategoryEntityPK implements Serializable {
    private long filmByFilmId;
    private long categoryByCategoryId;

    @Override
    public String toString() {
        return "FilmCategoryEntityPK{" +
                "filmByFilmId=" + filmByFilmId +
                ", categoryByCategoryId=" + categoryByCategoryId +
                '}';
    }
}
