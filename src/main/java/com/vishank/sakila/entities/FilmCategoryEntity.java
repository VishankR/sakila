package com.vishank.sakila.entities;

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
    private FilmEntity filmByFilmId;
    @ManyToOne
    @Id
    @JoinColumn(name = "category_id", columnDefinition = "SMALLINT UNSIGNED", referencedColumnName = "category_id",
            foreignKey = @ForeignKey(name = "fk_film_category_category", value = ConstraintMode.CONSTRAINT,
                    foreignKeyDefinition = "FOREIGN KEY (`category_id`) REFERENCES `category` (`category_id`) ON DELETE RESTRICT ON UPDATE CASCADE"), nullable = false)
    private CategoryEntity categoryByCategoryId;

    @Override
    public String toString() {
        return "FilmCategoryEntity{" +
                "lastUpdate=" + lastUpdate +
                '}';
    }
}
