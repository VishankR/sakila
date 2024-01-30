package com.vishank.sakila.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Collection;

@Entity
@Table(name = "store", indexes = {
        @Index(name = "idx_fk_address_id", columnList = "address_id")
}, uniqueConstraints = {
        @UniqueConstraint(name = "idx_unique_manager", columnNames = {"manager_staff_id"})
}, schema = "sakilaspringboot")
public class StoreEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "store_id", columnDefinition = "TINYINT UNSIGNED", nullable = false)
    private long storeId;
    @Basic
    @Column(name = "last_update", columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP", nullable = false)
    private Timestamp lastUpdate;
    @OneToMany(mappedBy = "storeByStoreId")
    @JsonManagedReference
    private Collection<CustomerEntity> customersByStoreId;
    @OneToMany(mappedBy = "storeByStoreId")
    @JsonManagedReference
    private Collection<InventoryEntity> inventoriesByStoreId;
    @OneToMany(mappedBy = "storeByStoreId")
    @JsonManagedReference
    private Collection<StaffEntity> staffByStoreId;
    @ManyToOne
    @JoinColumn(name = "manager_staff_id", columnDefinition = "TINYINT UNSIGNED", referencedColumnName = "staff_id",
            foreignKey = @ForeignKey(name = "fk_store_staff", value = ConstraintMode.CONSTRAINT,
                    foreignKeyDefinition = "FOREIGN KEY (`manager_staff_id`) REFERENCES `staff` (`staff_id`) ON DELETE RESTRICT ON UPDATE CASCADE"), nullable = false)
    @JsonBackReference
    private StaffEntity staffByManagerStaffId;
    @ManyToOne
    @JoinColumn(name = "address_id", columnDefinition = "SMALLINT UNSIGNED", referencedColumnName = "address_id",
            foreignKey = @ForeignKey(name = "fk_store_address", value = ConstraintMode.CONSTRAINT,
                    foreignKeyDefinition = "FOREIGN KEY (`address_id`) REFERENCES `address` (`address_id`) ON DELETE RESTRICT ON UPDATE CASCADE"), nullable = false)
    @JsonBackReference
    private AddressEntity addressByAddressId;

    public long getStoreId() {
        return storeId;
    }

    public void setStoreId(long storeId) {
        this.storeId = storeId;
    }

    public Timestamp getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Collection<CustomerEntity> getCustomersByStoreId() {
        return customersByStoreId;
    }

    public void setCustomersByStoreId(Collection<CustomerEntity> customersByStoreId) {
        this.customersByStoreId = customersByStoreId;
    }

    public Collection<InventoryEntity> getInventoriesByStoreId() {
        return inventoriesByStoreId;
    }

    public void setInventoriesByStoreId(Collection<InventoryEntity> inventoriesByStoreId) {
        this.inventoriesByStoreId = inventoriesByStoreId;
    }

    public Collection<StaffEntity> getStaffByStoreId() {
        return staffByStoreId;
    }

    public void setStaffByStoreId(Collection<StaffEntity> staffByStoreId) {
        this.staffByStoreId = staffByStoreId;
    }

    public StaffEntity getStaffByManagerStaffId() {
        return staffByManagerStaffId;
    }

    public void setStaffByManagerStaffId(StaffEntity staffByManagerStaffId) {
        this.staffByManagerStaffId = staffByManagerStaffId;
    }

    public AddressEntity getAddressByAddressId() {
        return addressByAddressId;
    }

    public void setAddressByAddressId(AddressEntity addressByAddressId) {
        this.addressByAddressId = addressByAddressId;
    }

    @Override
    public String toString() {
        return "StoreEntity{" +
                "storeId=" + storeId +
                ", lastUpdate=" + lastUpdate +
                ", customersByStoreId=" + customersByStoreId +
                ", inventoriesByStoreId=" + inventoriesByStoreId +
                ", staffByStoreId=" + staffByStoreId +
                '}';
    }
}
