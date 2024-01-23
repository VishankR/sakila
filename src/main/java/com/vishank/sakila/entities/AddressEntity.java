package com.vishank.sakila.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.sql.Timestamp;
import java.util.Collection;

@Entity
@Table(name = "address", indexes = {
        @Index(name = "idx_fk_city_id", columnList = "city_id", unique = false),
        @Index(name = "idx_location", columnList = "location")
    }, schema = "sakilaspringboot")
public class AddressEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "address_id", columnDefinition = "SMALLINT UNSIGNED", nullable = false)
    private long addressId;
    @Basic
    @Column(name = "address", nullable = false, length = 50)
    private String address;
    @Basic
    @Column(name = "address2", nullable = true, length = 50)
    private String address2;
    @Basic
    @Column(name = "district", nullable = false, length = 20)
    private String district;
    @Basic
    @Column(name = "postal_code", nullable = true, length = 10)
    private String postalCode;
    @Basic
    @Column(name = "phone", nullable = false, length = 20)
    private String phone;
    @Basic
    @Column(name = "location", columnDefinition = "GEOMETRY", nullable = false)
    private byte[] location;
    @Basic
    @Column(name = "last_update", columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP", nullable = false)
    private Timestamp lastUpdate;
    @ManyToOne
    @JoinColumn(name = "city_id", referencedColumnName = "city_id", nullable = false,
            foreignKey = @ForeignKey(name = "fk_address_city", value = ConstraintMode.CONSTRAINT, foreignKeyDefinition = "FOREIGN KEY (`city_id`) REFERENCES `city` (`city_id`) ON DELETE RESTRICT ON UPDATE CASCADE"))
//    @OnDelete(action = OnDeleteAction.RESTRICT)
    private CityEntity cityByCityId;
    @OneToMany(mappedBy = "addressByAddressId")
    private Collection<CustomerEntity> customersByAddressId;
    @OneToMany(mappedBy = "addressByAddressId")
    private Collection<StaffEntity> staffByAddressId;
    @OneToMany(mappedBy = "addressByAddressId")
    private Collection<StoreEntity> storesByAddressId;


    @Override
    public String toString() {
        return "AddressEntity{" +
                "addressId=" + addressId +
                ", address='" + address + '\'' +
                ", address2='" + address2 + '\'' +
                ", district='" + district + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", phone='" + phone + '\'' +
                ", location=" + location +
                ", lastUpdate=" + lastUpdate +
                ", customersByAddressId=" + customersByAddressId +
                ", staffByAddressId=" + staffByAddressId +
                ", storesByAddressId=" + storesByAddressId +
                '}';
    }
}
