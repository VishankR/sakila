package com.vishank.sakila.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Collection;

@Entity
@Table(name = "rental", indexes = {
        @Index(name = "idx_fk_inventory_id", columnList = "inventory_id"),
        @Index(name = "idx_fk_customer_id", columnList = "customer_id"),
        @Index(name = "idx_fk_staff_id", columnList = "staff_id")
},
        uniqueConstraints = {
        @UniqueConstraint(name = "rental_date", columnNames = {
                "rental_date", "inventory_id", "customer_id"
        })
        }, schema = "sakilaspringboot")
public class RentalEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "rental_id", columnDefinition = "INT", nullable = false)
    private long rentalId;
    @Basic
    @Column(name = "rental_date", columnDefinition="DATETIME", nullable = false)
    private Timestamp rentalDate;
    @Basic
    @Column(name = "return_date", columnDefinition="DATETIME", nullable = true)
    private Timestamp returnDate;
    @Basic
    @Column(name = "last_update", columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP", nullable = false)
    private Timestamp lastUpdate;
    @OneToMany(mappedBy = "rentalByRentalId")
    @JsonManagedReference
    private Collection<PaymentEntity> paymentsByRentalId;
    @ManyToOne
    @JoinColumn(name = "inventory_id", columnDefinition = "MEDIUMINT UNSIGNED", referencedColumnName = "inventory_id",
            foreignKey = @ForeignKey(name = "fk_rental_inventory", value = ConstraintMode.CONSTRAINT,
                    foreignKeyDefinition = "FOREIGN KEY (`inventory_id`) REFERENCES `inventory` (`inventory_id`) ON DELETE RESTRICT ON UPDATE CASCADE"), nullable = false)
    @JsonBackReference
    private InventoryEntity inventoryByInventoryId;
    @ManyToOne
    @JoinColumn(name = "customer_id", columnDefinition = "SMALLINT UNSIGNED", referencedColumnName = "customer_id",
            foreignKey = @ForeignKey(name = "fk_rental_customer", value = ConstraintMode.CONSTRAINT,
                    foreignKeyDefinition = "FOREIGN KEY (`customer_id`) REFERENCES `customer` (`customer_id`) ON DELETE RESTRICT ON UPDATE CASCADE"), nullable = false)
    @JsonBackReference
    private CustomerEntity customerByCustomerId;
    @ManyToOne
    @JoinColumn(name = "staff_id", columnDefinition = "TINYINT UNSIGNED", referencedColumnName = "staff_id",
            foreignKey = @ForeignKey(name = "fk_rental_staff", value = ConstraintMode.CONSTRAINT,
                    foreignKeyDefinition = "FOREIGN KEY (`staff_id`) REFERENCES `staff` (`staff_id`) ON DELETE RESTRICT ON UPDATE CASCADE"), nullable = false)
    @JsonBackReference
    private StaffEntity staffByStaffId;

    public long getRentalId() {
        return rentalId;
    }

    public void setRentalId(long rentalId) {
        this.rentalId = rentalId;
    }

    public Timestamp getRentalDate() {
        return rentalDate;
    }

    public void setRentalDate(Timestamp rentalDate) {
        this.rentalDate = rentalDate;
    }

    public Timestamp getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Timestamp returnDate) {
        this.returnDate = returnDate;
    }

    public Timestamp getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Collection<PaymentEntity> getPaymentsByRentalId() {
        return paymentsByRentalId;
    }

    public void setPaymentsByRentalId(Collection<PaymentEntity> paymentsByRentalId) {
        this.paymentsByRentalId = paymentsByRentalId;
    }

    public InventoryEntity getInventoryByInventoryId() {
        return inventoryByInventoryId;
    }

    public void setInventoryByInventoryId(InventoryEntity inventoryByInventoryId) {
        this.inventoryByInventoryId = inventoryByInventoryId;
    }

    public CustomerEntity getCustomerByCustomerId() {
        return customerByCustomerId;
    }

    public void setCustomerByCustomerId(CustomerEntity customerByCustomerId) {
        this.customerByCustomerId = customerByCustomerId;
    }

    public StaffEntity getStaffByStaffId() {
        return staffByStaffId;
    }

    public void setStaffByStaffId(StaffEntity staffByStaffId) {
        this.staffByStaffId = staffByStaffId;
    }

    @Override
    public String toString() {
        return "RentalEntity{" +
                "rentalId=" + rentalId +
                ", rentalDate=" + rentalDate +
                ", returnDate=" + returnDate +
                ", lastUpdate=" + lastUpdate +
                ", paymentsByRentalId=" + paymentsByRentalId +
                '}';
    }
}
