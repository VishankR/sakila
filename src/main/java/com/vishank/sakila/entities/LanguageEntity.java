package com.vishank.sakila.entities;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Collection;

@Entity
@Table(name = "language", schema = "sakilaspringboot")
public class LanguageEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "language_id", columnDefinition = "TINYINT UNSIGNED", nullable = false)
    private long languageId;
    @Basic
    @Column(name = "name", nullable = false, length = 20)
    private String name;
    @Basic
    @Column(name = "last_update", columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP", nullable = false)
    private Timestamp lastUpdate;
    @OneToMany(mappedBy = "languageByLanguageId")
    private Collection<FilmEntity> filmsByLanguageId;
    @OneToMany(mappedBy = "languageByOriginalLanguageId")
    private Collection<FilmEntity> filmsByLanguageId_0;

    @Override
    public String toString() {
        return "LanguageEntity{" +
                "languageId=" + languageId +
                ", name='" + name + '\'' +
                ", lastUpdate=" + lastUpdate +
                ", filmsByLanguageId=" + filmsByLanguageId +
                ", filmsByLanguageId_0=" + filmsByLanguageId_0 +
                '}';
    }
}
