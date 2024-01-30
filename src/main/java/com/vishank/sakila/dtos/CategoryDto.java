package com.vishank.sakila.dtos;

import java.sql.Timestamp;
import java.util.Collection;

public class CategoryDto {
    private long categoryId;
    private String name;
    private Timestamp lastUpdate;
    private Collection<FilmCategoryDto> filmCategoriesByCategoryId;

    public long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(long categoryId) {
        this.categoryId = categoryId;
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

    public Collection<FilmCategoryDto> getFilmCategoriesByCategoryId() {
        return filmCategoriesByCategoryId;
    }

    public void setFilmCategoriesByCategoryId(Collection<FilmCategoryDto> filmCategoriesByCategoryId) {
        this.filmCategoriesByCategoryId = filmCategoriesByCategoryId;
    }

    @Override
    public String toString() {
        return "CategoryDto{" +
                "categoryId=" + categoryId +
                ", name='" + name + '\'' +
                ", lastUpdate=" + lastUpdate +
                ", filmCategoriesByCategoryId=" + filmCategoriesByCategoryId +
                '}';
    }
}
