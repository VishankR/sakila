package com.vishank.sakila.entities;

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
    private StoreEntity storeByStoreId;
    @ManyToOne
    @JoinColumn(name = "address_id", columnDefinition = "SMALLINT UNSIGNED", referencedColumnName = "address_id",
            foreignKey = @ForeignKey(name = "fk_customer_address", value = ConstraintMode.CONSTRAINT,
                    foreignKeyDefinition = "FOREIGN KEY (`address_id`) REFERENCES `address` (`address_id`) ON DELETE RESTRICT ON UPDATE CASCADE"), nullable = false)
    private AddressEntity addressByAddressId;
    @OneToMany(mappedBy = "customerByCustomerId")
    private Collection<PaymentEntity> paymentsByCustomerId;
    @OneToMany(mappedBy = "customerByCustomerId")
    private Collection<RentalEntity> rentalsByCustomerId;

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
