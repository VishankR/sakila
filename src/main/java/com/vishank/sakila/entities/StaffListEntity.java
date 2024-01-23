package com.vishank.sakila.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;
import org.hibernate.annotations.Subselect;

@Entity
@Immutable
@Table(name = "staff_list")
@Subselect("select uuid() as id, sl.* from staff_list sl")
public class StaffListEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Basic
    @Column(name = "staff_id", nullable = false)
    private long staffId;
    @Basic
    @Column(name = "name", nullable = true, length = 91)
    private String name;
    @Basic
    @Column(name = "address", nullable = false, length = 50)
    private String address;
    @Basic
    @Column(name = "zip code", nullable = true, length = 10)
    private String zipCode;
    @Basic
    @Column(name = "phone", nullable = false, length = 20)
    private String phone;
    @Basic
    @Column(name = "city", nullable = false, length = 50)
    private String city;
    @Basic
    @Column(name = "country", nullable = false, length = 50)
    private String country;
    @Basic
    @Column(name = "store_id", nullable = false)
    private long storeId;

    @Override
    public String toString() {
        return "StaffListEntity{" +
                "staffId=" + staffId +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", phone='" + phone + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", storeId=" + storeId +
                '}';
    }
}
