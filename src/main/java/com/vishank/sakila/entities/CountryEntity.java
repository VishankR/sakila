package com.vishank.sakila.entities;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Collection;

@Entity
@Table(name = "country", schema = "sakilaspringboot")
public class CountryEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "country_id", columnDefinition = "SMALLINT UNSIGNED", nullable = false)
    private long countryId;
    @Basic
    @Column(name = "country", nullable = false, length = 50)
    private String country;
    @Basic
    @Column(name = "last_update", columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP", nullable = false)
    private Timestamp lastUpdate;
    @OneToMany(mappedBy = "countryByCountryId")
    private Collection<CityEntity> citiesByCountryId;

    @Override
    public String toString() {
        return "CountryEntity{" +
                "countryId=" + countryId +
                ", country='" + country + '\'' +
                ", lastUpdate=" + lastUpdate +
                ", citiesByCountryId=" + citiesByCountryId +
                '}';
    }
}
