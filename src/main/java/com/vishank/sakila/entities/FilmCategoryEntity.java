package com.vishank.sakila.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "film_category", indexes = {
        @Index(name = "fk_film_category_category", columnList = "category_id")
}, schema = "sakilaspringboot")
@IdClass(FilmCategoryEntityPK.class)
public class FilmCategoryEntity {
    @Basic
    @Column(name = "last_update", columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP", nullable = false)
    private Timestamp lastUpdate;
    @ManyToOne
    @Id
    @JoinColumn(name = "film_id", columnDefinition = "SMALLINT UNSIGNED", referencedColumnName = "film_id",
            foreignKey = @ForeignKey(name = "fk_film_category_film", value = ConstraintMode.CONSTRAINT,
                    foreignKeyDefinition = "FOREIGN KEY (`film_id`) REFERENCES `film` (`film_id`) ON DELETE RESTRICT ON UPDATE CASCADE"), nullable = false)
    @JsonBackReference
    private FilmEntity filmByFilmId;
    @ManyToOne
    @Id
    @JoinColumn(name = "category_id", columnDefinition = "SMALLINT UNSIGNED", referencedColumnName = "category_id",
            foreignKey = @ForeignKey(name = "fk_film_category_category", value = ConstraintMode.CONSTRAINT,
                    foreignKeyDefinition = "FOREIGN KEY (`category_id`) REFERENCES `category` (`category_id`) ON DELETE RESTRICT ON UPDATE CASCADE"), nullable = false)
    @JsonBackReference
    private CategoryEntity categoryByCategoryId;

    public Timestamp getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public FilmEntity getFilmByFilmId() {
        return filmByFilmId;
    }

    public void setFilmByFilmId(FilmEntity filmByFilmId) {
        this.filmByFilmId = filmByFilmId;
    }

    public CategoryEntity getCategoryByCategoryId() {
        return categoryByCategoryId;
    }

    public void setCategoryByCategoryId(CategoryEntity categoryByCategoryId) {
        this.categoryByCategoryId = categoryByCategoryId;
    }

    @Override
    public String toString() {
        return "FilmCategoryEntity{" +
                "lastUpdate=" + lastUpdate +
                '}';
    }
}
