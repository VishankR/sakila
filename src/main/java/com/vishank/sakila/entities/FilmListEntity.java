package com.vishank.sakila.entities;

import com.vishank.sakila.constants.RatingsEnum;
import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;
import org.hibernate.annotations.Subselect;

import java.math.BigDecimal;

@Entity
@Immutable
@Table(name = "film_list")
@Subselect("select uuid() as id, fl.* from film_list fl")
public class FilmListEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Basic
    @Column(name = "film_id", nullable = false)
    private long filmId;
    @Basic
    @Column(name = "title", nullable = false, length = 128)
    private String title;
    @Basic
    @Column(name = "description", nullable = true, length = -1)
    private String description;
    @Basic
    @Column(name = "category", nullable = true, length = 25)
    private String category;
    @Basic
    @Column(name = "price", length = 6, nullable = false, precision = 2)
    private BigDecimal price;
    @Basic
    @Column(name = "length", nullable = true)
    private int length;
    @Basic
    @Column(name = "rating", nullable = true)
    @Enumerated(EnumType.STRING)
    private RatingsEnum.Rating rating;
    @Basic
    @Column(name = "actors", nullable = true, length = -1)
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
        return "FilmListEntity{" +
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
