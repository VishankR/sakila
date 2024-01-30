package com.vishank.sakila.dtos;

import java.sql.Timestamp;
import java.util.Collection;

public class CountryDto {
    private long countryId;
    private String country;
    private Timestamp lastUpdate;
    private Collection<CityDto> citiesByCountryId;

    public long getCountryId() {
        return countryId;
    }

    public void setCountryId(long countryId) {
        this.countryId = countryId;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Timestamp getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Collection<CityDto> getCitiesByCountryId() {
        return citiesByCountryId;
    }

    public void setCitiesByCountryId(Collection<CityDto> citiesByCountryId) {
        this.citiesByCountryId = citiesByCountryId;
    }

    @Override
    public String toString() {
        return "CountryDto{" +
                "countryId=" + countryId +
                ", country='" + country + '\'' +
                ", lastUpdate=" + lastUpdate +
                ", citiesByCountryId=" + citiesByCountryId +
                '}';
    }
}
