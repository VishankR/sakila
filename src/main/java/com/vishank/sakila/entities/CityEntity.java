package com.vishank.sakila.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import org.hibernate.annotations.Cascade;

import java.sql.Timestamp;
import java.util.Collection;

@Entity
@Table(name = "city", indexes = {@Index(name = "idx_fk_country_id", columnList = "country_id")}, schema = "sakilaspringboot")
public class CityEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "city_id", columnDefinition = "SMALLINT UNSIGNED" , nullable = false)
    private long cityId;
    @Basic
    @Column(name = "city", nullable = false, length = 50)
    private String city;
    @Basic
    @Column(name = "last_update", columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP", nullable = false)
    private Timestamp lastUpdate;
    @OneToMany(mappedBy = "cityByCityId")
    @JsonManagedReference
    private Collection<AddressEntity> addressesByCityId;
    @ManyToOne
    @JoinColumn(name = "country_id", columnDefinition = "SMALLINT UNSIGNED", referencedColumnName = "country_id",
            foreignKey = @ForeignKey(name = "fk_city_country", value = ConstraintMode.CONSTRAINT,
                    foreignKeyDefinition = "FOREIGN KEY (`country_id`) REFERENCES `country` (`country_id`) ON DELETE RESTRICT ON UPDATE CASCADE"), nullable = false)
    @JsonBackReference
    private CountryEntity countryByCountryId;

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

    public Collection<AddressEntity> getAddressesByCityId() {
        return addressesByCityId;
    }

    public void setAddressesByCityId(Collection<AddressEntity> addressesByCityId) {
        this.addressesByCityId = addressesByCityId;
    }

    public CountryEntity getCountryByCountryId() {
        return countryByCountryId;
    }

    public void setCountryByCountryId(CountryEntity countryByCountryId) {
        this.countryByCountryId = countryByCountryId;
    }

    @Override
    public String toString() {
        return "CityEntity{" +
                "cityId=" + cityId +
                ", city='" + city + '\'' +
                ", lastUpdate=" + lastUpdate +
                ", addressesByCityId=" + addressesByCityId +
                '}';
    }
}
