package com.vishank.sakila.dtos;

import java.sql.Timestamp;
import java.util.Collection;

public class CityDto {
    private long cityId;
    private String city;
    private Timestamp lastUpdate;
    private Collection<AddressDto> addressesByCityId;
    private CountryDto countryByCountryId;

    public long getCityId() {
        return cityId;
    }

    public void setCityId(long cityId) {
        this.cityId = cityId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Timestamp getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Collection<AddressDto> getAddressesByCityId() {
        return addressesByCityId;
    }

    public void setAddressesByCityId(Collection<AddressDto> addressesByCityId) {
        this.addressesByCityId = addressesByCityId;
    }

    public CountryDto getCountryByCountryId() {
        return countryByCountryId;
    }

    public void setCountryByCountryId(CountryDto countryByCountryId) {
        this.countryByCountryId = countryByCountryId;
    }

    @Override
    public String toString() {
        return "CityDto{" +
                "cityId=" + cityId +
                ", city='" + city + '\'' +
                ", lastUpdate=" + lastUpdate +
                ", addressesByCityId=" + addressesByCityId +
                '}';
    }
}
