package com.vishank.sakila.dtos;

import com.vishank.sakila.entities.CategoryEntity;
import com.vishank.sakila.entities.FilmEntity;

import java.sql.Timestamp;

public class FilmCategoryDto {
    private Timestamp lastUpdate;
    private FilmDto filmByFilmId;
    private CategoryDto categoryByCategoryId;

    public Timestamp getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public FilmDto getFilmByFilmId() {
        return filmByFilmId;
    }

    public void setFilmByFilmId(FilmDto filmByFilmId) {
        this.filmByFilmId = filmByFilmId;
    }

    public CategoryDto getCategoryByCategoryId() {
        return categoryByCategoryId;
    }

    public void setCategoryByCategoryId(CategoryDto categoryByCategoryId) {
        this.categoryByCategoryId = categoryByCategoryId;
    }

    @Override
    public String toString() {
        return "FilmCategoryDto{" +
                "lastUpdate=" + lastUpdate +
                '}';
    }
}
