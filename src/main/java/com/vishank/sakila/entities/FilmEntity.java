package com.vishank.sakila.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.vishank.sakila.constants.RatingsEnum;
import com.vishank.sakila.constants.SpecialFeaturesEnum;
import com.vishank.sakila.converters.RatingConverter;
import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Date;

@Entity
@Table(name = "film", indexes = {
        @Index(name = "idx_title", columnList = "title"),
        @Index(name = "idx_fk_language_id", columnList = "language_id"),
        @Index(name = "idx_fk_original_language_id", columnList = "original_language_id")
}, schema = "sakilaspringboot")
public class FilmEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "film_id", columnDefinition = "SMALLINT UNSIGNED", nullable = false)
    private long filmId;
    @Basic
    @Column(name = "title", nullable = false, length = 128)
    private String title;
    @Basic
    @Column(name = "description", nullable = true, length = -1)
    private String description;
    @Basic
    @Column(name = "release_year", columnDefinition = "YEAR", nullable = true)
    private Date releaseYear;
    @Basic
    @Column(name = "rental_duration", nullable = false)
    private int rentalDuration;
    @Basic
    @Column(name = "rental_rate", nullable = false, length = 6, precision = 2)
    private BigDecimal rentalRate;
    @Basic
    @Column(name = "length", nullable = true)
    private int length;
    @Basic
    @Column(name = "replacement_cost", nullable = false, length = 6, precision = 2)
    private BigDecimal replacementCost;
    @Column(name = "rating")
    @Enumerated(EnumType.STRING)
    @ColumnDefault("'G'")
    @Convert(converter = RatingConverter.class)
    private RatingsEnum.Rating rating;

    @Column(name = "special_features", nullable = true)
    private String specialFeatures;
    @Basic
    @Column(name = "last_update", columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP", nullable = false)
    private Timestamp lastUpdate;
    @ManyToOne
    @JoinColumn(name = "language_id", referencedColumnName = "language_id",
            foreignKey = @ForeignKey(name = "fk_film_language", value = ConstraintMode.CONSTRAINT,
                    foreignKeyDefinition = "FOREIGN KEY (`language_id`) REFERENCES `language` (`language_id`) ON DELETE RESTRICT ON UPDATE CASCADE"), nullable = false)
    @JsonBackReference
    private LanguageEntity languageByLanguageId;
    @ManyToOne
    @JoinColumn(name = "original_language_id", referencedColumnName = "language_id",
            foreignKey = @ForeignKey(name = "fk_film_language_original", value = ConstraintMode.CONSTRAINT,
                    foreignKeyDefinition = "FOREIGN KEY (`original_language_id`) REFERENCES `language` (`language_id`) ON DELETE RESTRICT ON UPDATE CASCADE"))
    @JsonBackReference
    private LanguageEntity languageByOriginalLanguageId;
    @OneToMany(mappedBy = "filmByFilmId")
    @JsonManagedReference
    private Collection<FilmActorEntity> filmActorsByFilmId;
    @OneToMany(mappedBy = "filmByFilmId")
    @JsonManagedReference
    private Collection<FilmCategoryEntity> filmCategoriesByFilmId;
    @OneToMany(mappedBy = "filmByFilmId")
    @JsonManagedReference
    private Collection<InventoryEntity> inventoriesByFilmId;

    public long getFilmId() {
        return filmId;
    }

    public void setFilmId(long filmId) {
        this.filmId = filmId;
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

    public Date getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Date releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getRentalDuration() {
        return rentalDuration;
    }

    public void setRentalDuration(int rentalDuration) {
        this.rentalDuration = rentalDuration;
    }

    public BigDecimal getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(BigDecimal rentalRate) {
        this.rentalRate = rentalRate;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public BigDecimal getReplacementCost() {
        return replacementCost;
    }

    public void setReplacementCost(BigDecimal replacementCost) {
        this.replacementCost = replacementCost;
    }

    public RatingsEnum.Rating getRating() {
        return rating;
    }

    public void setRating(RatingsEnum.Rating rating) {
        this.rating = rating;
    }

    public String getSpecialFeatures() {
        return specialFeatures;
    }

    public void setSpecialFeatures(String specialFeatures) {
        this.specialFeatures = specialFeatures;
    }

    public Timestamp getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public LanguageEntity getLanguageByLanguageId() {
        return languageByLanguageId;
    }

    public void setLanguageByLanguageId(LanguageEntity languageByLanguageId) {
        this.languageByLanguageId = languageByLanguageId;
    }

    public LanguageEntity getLanguageByOriginalLanguageId() {
        return languageByOriginalLanguageId;
    }

    public void setLanguageByOriginalLanguageId(LanguageEntity languageByOriginalLanguageId) {
        this.languageByOriginalLanguageId = languageByOriginalLanguageId;
    }

    public Collection<FilmActorEntity> getFilmActorsByFilmId() {
        return filmActorsByFilmId;
    }

    public void setFilmActorsByFilmId(Collection<FilmActorEntity> filmActorsByFilmId) {
        this.filmActorsByFilmId = filmActorsByFilmId;
    }

    public Collection<FilmCategoryEntity> getFilmCategoriesByFilmId() {
        return filmCategoriesByFilmId;
    }

    public void setFilmCategoriesByFilmId(Collection<FilmCategoryEntity> filmCategoriesByFilmId) {
        this.filmCategoriesByFilmId = filmCategoriesByFilmId;
    }

    public Collection<InventoryEntity> getInventoriesByFilmId() {
        return inventoriesByFilmId;
    }

    public void setInventoriesByFilmId(Collection<InventoryEntity> inventoriesByFilmId) {
        this.inventoriesByFilmId = inventoriesByFilmId;
    }

    @Override
    public String toString() {
        return "FilmEntity{" +
                "filmId=" + filmId +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", releaseYear=" + releaseYear +
                ", rentalDuration=" + rentalDuration +
                ", rentalRate=" + rentalRate +
                ", length=" + length +
                ", replacementCost=" + replacementCost +
                ", rating=" + rating +
                ", specialFeatures=" + specialFeatures +
                ", lastUpdate=" + lastUpdate +
                ", filmActorsByFilmId=" + filmActorsByFilmId +
                ", filmCategoriesByFilmId=" + filmCategoriesByFilmId +
                ", inventoriesByFilmId=" + inventoriesByFilmId +
                '}';
    }
}
