package com.vishank.sakila.dtos;

import com.vishank.sakila.constants.RatingsEnum;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Date;

public class FilmDto {
    private long filmId;
    private String title;
    private String description;
    private Date releaseYear;
    private int rentalDuration;
    private BigDecimal rentalRate;
    private int length;
    private BigDecimal replacementCost;
    private RatingsEnum.Rating rating;
    private String specialFeatures;
    private Timestamp lastUpdate;
    private LanguageDto languageByLanguageId;
    private LanguageDto languageByOriginalLanguageId;
    private Collection<FilmActorDto> filmActorsByFilmId;
    private Collection<FilmCategoryDto> filmCategoriesByFilmId;
    private Collection<InventoryDto> inventoriesByFilmId;

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

    public LanguageDto getLanguageByLanguageId() {
        return languageByLanguageId;
    }

    public void setLanguageByLanguageId(LanguageDto languageByLanguageId) {
        this.languageByLanguageId = languageByLanguageId;
    }

    public LanguageDto getLanguageByOriginalLanguageId() {
        return languageByOriginalLanguageId;
    }

    public void setLanguageByOriginalLanguageId(LanguageDto languageByOriginalLanguageId) {
        this.languageByOriginalLanguageId = languageByOriginalLanguageId;
    }

    public Collection<FilmActorDto> getFilmActorsByFilmId() {
        return filmActorsByFilmId;
    }

    public void setFilmActorsByFilmId(Collection<FilmActorDto> filmActorsByFilmId) {
        this.filmActorsByFilmId = filmActorsByFilmId;
    }

    public Collection<FilmCategoryDto> getFilmCategoriesByFilmId() {
        return filmCategoriesByFilmId;
    }

    public void setFilmCategoriesByFilmId(Collection<FilmCategoryDto> filmCategoriesByFilmId) {
        this.filmCategoriesByFilmId = filmCategoriesByFilmId;
    }

    public Collection<InventoryDto> getInventoriesByFilmId() {
        return inventoriesByFilmId;
    }

    public void setInventoriesByFilmId(Collection<InventoryDto> inventoriesByFilmId) {
        this.inventoriesByFilmId = inventoriesByFilmId;
    }

    @Override
    public String toString() {
        return "FilmDto{" +
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
