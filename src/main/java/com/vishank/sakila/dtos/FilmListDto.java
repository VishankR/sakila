package com.vishank.sakila.dtos;

import com.vishank.sakila.constants.RatingsEnum;

import java.math.BigDecimal;

public class FilmListDto {
    private long id;
    private long filmId;
    private String title;
    private String description;
    private String category;
    private BigDecimal price;
    private int length;
    private RatingsEnum.Rating rating;
    private String actors;

    public long getFilmId() {
        return filmId;
    }

    public void setFilmId(long fid) {
        this.filmId = fid;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public RatingsEnum.Rating getRating() {
        return rating;
    }

    public void setRating(RatingsEnum.Rating rating) {
        this.rating = rating;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    @Override
    public String toString() {
        return "FilmListDto{" +
                "filmId=" + filmId +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", length=" + length +
                ", rating=" + rating +
                ", actors='" + actors + '\'' +
                '}';
    }
}
