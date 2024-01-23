package com.vishank.sakila.entities;

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
    private Collection<AddressEntity> addressesByCityId;
    @ManyToOne
    @JoinColumn(name = "country_id", columnDefinition = "SMALLINT UNSIGNED", referencedColumnName = "country_id",
            foreignKey = @ForeignKey(name = "fk_city_country", value = ConstraintMode.CONSTRAINT,
                    foreignKeyDefinition = "FOREIGN KEY (`country_id`) REFERENCES `country` (`country_id`) ON DELETE RESTRICT ON UPDATE CASCADE"), nullable = false)
    private CountryEntity countryByCountryId;

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
