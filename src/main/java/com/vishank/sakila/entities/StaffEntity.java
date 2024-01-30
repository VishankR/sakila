package com.vishank.sakila.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Collection;

@Entity
@Table(name = "staff", indexes = {
        @Index(name = "idx_fk_store_id", columnList = "store_id"),
        @Index(name = "idx_fk_address_id", columnList = "address_id")
}, schema = "sakilaspringboot")
public class StaffEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "staff_id", columnDefinition = "TINYINT UNSIGNED", nullable = false)
    private long staffId;
    @Basic
    @Column(name = "first_name", nullable = false, length = 45)
    private String firstName;
    @Basic
    @Column(name = "last_name", nullable = false, length = 45)
    private String lastName;
    @Basic
    @Column(name = "picture", columnDefinition = "BLOB", nullable = true)
    private byte[] picture;
    @Basic
    @Column(name = "email", nullable = true, length = 50)
    private String email;
    @Basic
    @Column(name = "active", columnDefinition = "TINYINT DEFAULT '1'", length = 1, nullable = false)
    private byte active;
    @Basic
    @Column(name = "username", nullable = false, length = 16)
    private String username;
    @Basic
    @Column(name = "password", nullable = true, length = 40)
    private String password;
    @Basic
    @Column(name = "last_update", columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP", nullable = false)
    private Timestamp lastUpdate;
    @OneToMany(mappedBy = "staffByStaffId")
    @JsonManagedReference
    private Collection<PaymentEntity> paymentsByStaffId;
    @OneToMany(mappedBy = "staffByStaffId")
    @JsonManagedReference
    private Collection<RentalEntity> rentalsByStaffId;
    @ManyToOne
    @JoinColumn(name = "address_id", columnDefinition = "SMALLINT UNSIGNED", referencedColumnName = "address_id",
            foreignKey = @ForeignKey(name = "fk_staff_address", value = ConstraintMode.CONSTRAINT,
                    foreignKeyDefinition = "FOREIGN KEY (`address_id`) REFERENCES `address` (`address_id`) ON DELETE RESTRICT ON UPDATE CASCADE"), nullable = false)
    @JsonBackReference
    private AddressEntity addressByAddressId;
    @ManyToOne
    @JoinColumn(name = "store_id", columnDefinition = "TINYINT UNSIGNED", referencedColumnName = "store_id",
            foreignKey = @ForeignKey(name = "fk_staff_store", value = ConstraintMode.CONSTRAINT,
                    foreignKeyDefinition = "FOREIGN KEY (`store_id`) REFERENCES `store` (`store_id`) ON DELETE RESTRICT ON UPDATE CASCADE"), nullable = false)
    @JsonBackReference
    private StoreEntity storeByStoreId;
    @OneToMany(mappedBy = "staffByManagerStaffId")
    @JsonManagedReference
    private Collection<StoreEntity> storesByStaffId;

    public long getStaffId() {
        return staffId;
    }

    public void setStaffId(long staffId) {
        this.staffId = staffId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public byte[] getPicture() {
        return picture;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public byte getActive() {
        return active;
    }

    public void setActive(byte active) {
        this.active = active;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Timestamp getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Collection<PaymentEntity> getPaymentsByStaffId() {
        return paymentsByStaffId;
    }

    public void setPaymentsByStaffId(Collection<PaymentEntity> paymentsByStaffId) {
        this.paymentsByStaffId = paymentsByStaffId;
    }

    public Collection<RentalEntity> getRentalsByStaffId() {
        return rentalsByStaffId;
    }

    public void setRentalsByStaffId(Collection<RentalEntity> rentalsByStaffId) {
        this.rentalsByStaffId = rentalsByStaffId;
    }

    public AddressEntity getAddressByAddressId() {
        return addressByAddressId;
    }

    public void setAddressByAddressId(AddressEntity addressByAddressId) {
        this.addressByAddressId = addressByAddressId;
    }

    public StoreEntity getStoreByStoreId() {
        return storeByStoreId;
    }

    public void setStoreByStoreId(StoreEntity storeByStoreId) {
        this.storeByStoreId = storeByStoreId;
    }

    public Collection<StoreEntity> getStoresByStaffId() {
        return storesByStaffId;
    }

    public void setStoresByStaffId(Collection<StoreEntity> storesByStaffId) {
        this.storesByStaffId = storesByStaffId;
    }

    @Override
    public String toString() {
        return "StaffEntity{" +
                "staffId=" + staffId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", picture=" + Arrays.toString(picture) +
                ", email='" + email + '\'' +
                ", active=" + active +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", lastUpdate=" + lastUpdate +
                ", paymentsByStaffId=" + paymentsByStaffId +
                ", rentalsByStaffId=" + rentalsByStaffId +
                ", storesByStaffId=" + storesByStaffId +
                '}';
    }
}
