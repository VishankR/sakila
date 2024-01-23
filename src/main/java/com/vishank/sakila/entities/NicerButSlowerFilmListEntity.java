package com.vishank.sakila.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;
import org.hibernate.annotations.Subselect;

import java.math.BigDecimal;

@Entity
@Immutable
@Table(name = "nicer_but_slower_film_list")
@Subselect("select uuid() as id, nbsfl.* from nicer_but_slower_film_list nbsfl")
public class NicerButSlowerFilmListEntity {
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
    private String rating;
    @Basic
    @Column(name = "actors", nullable = true, length = -1)
    private String actors;

    @Override
    public String toString() {
        return "NicerButSlowerFilmListEntity{" +
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
