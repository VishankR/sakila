package com.vishank.sakila.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;

import java.sql.Timestamp;
import java.util.Collection;

@Entity
@Table(name = "customer", indexes = {
        @Index(name = "idx_fk_store_id", columnList = "store_id"),
        @Index(name = "idx_fk_address_id", columnList = "address_id"),
        @Index(name = "idx_first_name", columnList = "first_name")
}, schema = "sakilaspringboot")
public class CustomerEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "customer_id", columnDefinition = "SMALLINT UNSIGNED", nullable = false)
    private long customerId;
    @Basic
    @Column(name = "first_name", nullable = false, length = 45)
    private String firstName;
    @Basic
    @Column(name = "last_name", nullable = false, length = 45)
    private String lastName;
    @Basic
    @Column(name = "email", nullable = true, length = 50)
    private String email;
    @Basic
    @Column(name = "active", columnDefinition = "TINYINT DEFAULT '1'", length = 1, nullable = false)
    private byte active;
    @Basic
    @Column(name = "create_date", columnDefinition = "DATETIME", nullable = false)
    @CreatedDate
    private Timestamp createDate;
    @Basic
    @Column(name = "last_update", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP", nullable = true)
    private Timestamp lastUpdate;
    @ManyToOne
    @JoinColumn(name = "store_id", columnDefinition = "TINYINT UNSIGNED", referencedColumnName = "store_id",
            foreignKey = @ForeignKey(name = "fk_customer_store", value = ConstraintMode.CONSTRAINT,
                    foreignKeyDefinition = "FOREIGN KEY (`store_id`) REFERENCES `store` (`store_id`) ON DELETE RESTRICT ON UPDATE CASCADE"), nullable = false)
    @JsonBackReference
    private StoreEntity storeByStoreId;
    @ManyToOne
    @JoinColumn(name = "address_id", columnDefinition = "SMALLINT UNSIGNED", referencedColumnName = "address_id",
            foreignKey = @ForeignKey(name = "fk_customer_address", value = ConstraintMode.CONSTRAINT,
                    foreignKeyDefinition = "FOREIGN KEY (`address_id`) REFERENCES `address` (`address_id`) ON DELETE RESTRICT ON UPDATE CASCADE"), nullable = false)
    @JsonBackReference
    private AddressEntity addressByAddressId;
    @OneToMany(mappedBy = "customerByCustomerId")
    @JsonManagedReference
    private Collection<PaymentEntity> paymentsByCustomerId;
    @OneToMany(mappedBy = "customerByCustomerId")
    @JsonManagedReference
    private Collection<RentalEntity> rentalsByCustomerId;

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
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

    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    public Timestamp getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public StoreEntity getStoreByStoreId() {
        return storeByStoreId;
    }

    public void setStoreByStoreId(StoreEntity storeByStoreId) {
        this.storeByStoreId = storeByStoreId;
    }

    public AddressEntity getAddressByAddressId() {
        return addressByAddressId;
    }

    public void setAddressByAddressId(AddressEntity addressByAddressId) {
        this.addressByAddressId = addressByAddressId;
    }

    public Collection<PaymentEntity> getPaymentsByCustomerId() {
        return paymentsByCustomerId;
    }

    public void setPaymentsByCustomerId(Collection<PaymentEntity> paymentsByCustomerId) {
        this.paymentsByCustomerId = paymentsByCustomerId;
    }

    @JsonManagedReference
    public Collection<RentalEntity> getRentalsByCustomerId() {
        return rentalsByCustomerId;
    }

    public void setRentalsByCustomerId(Collection<RentalEntity> rentalsByCustomerId) {
        this.rentalsByCustomerId = rentalsByCustomerId;
    }

    @Override
    public String toString() {
        return "CustomerEntity{" +
                "customerId=" + customerId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", active=" + active +
                ", createDate=" + createDate +
                ", lastUpdate=" + lastUpdate +
                ", paymentsByCustomerId=" + paymentsByCustomerId +
                ", rentalsByCustomerId=" + rentalsByCustomerId +
                '}';
    }
}
