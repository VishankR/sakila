package com.vishank.sakila.entities;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Collection;

@Entity
@Table(name = "category", schema = "sakilaspringboot")
public class CategoryEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "category_id", columnDefinition = "SMALLINT UNSIGNED", nullable = false)
    private long categoryId;
    @Basic
    @Column(name = "name", nullable = false, length = 25)
    private String name;
    @Basic
    @Column(name = "last_update", columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP", nullable = false)
    private Timestamp lastUpdate;
    @OneToMany(mappedBy = "categoryByCategoryId")
    private Collection<FilmCategoryEntity> filmCategoriesByCategoryId;

    @Override
    public String toString() {
        return "CategoryEntity{" +
                "categoryId=" + categoryId +
                ", name='" + name + '\'' +
                ", lastUpdate=" + lastUpdate +
                ", filmCategoriesByCategoryId=" + filmCategoriesByCategoryId +
                '}';
    }
}
