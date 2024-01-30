package com.vishank.sakila.dtos;

import java.sql.Timestamp;
import java.util.Collection;

public class StoreDto {
    private long storeId;
    private Timestamp lastUpdate;
    private Collection<CustomerDto> customersByStoreId;
    private Collection<InventoryDto> inventoriesByStoreId;
    private Collection<StaffDto> staffByStoreId;
    private StaffDto staffByManagerStaffId;
    private AddressDto addressByAddressId;

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

    public Collection<CustomerDto> getCustomersByStoreId() {
        return customersByStoreId;
    }

    public void setCustomersByStoreId(Collection<CustomerDto> customersByStoreId) {
        this.customersByStoreId = customersByStoreId;
    }

    public Collection<InventoryDto> getInventoriesByStoreId() {
        return inventoriesByStoreId;
    }

    public void setInventoriesByStoreId(Collection<InventoryDto> inventoriesByStoreId) {
        this.inventoriesByStoreId = inventoriesByStoreId;
    }

    public Collection<StaffDto> getStaffByStoreId() {
        return staffByStoreId;
    }

    public void setStaffByStoreId(Collection<StaffDto> staffByStoreId) {
        this.staffByStoreId = staffByStoreId;
    }

    public StaffDto getStaffByManagerStaffId() {
        return staffByManagerStaffId;
    }

    public void setStaffByManagerStaffId(StaffDto staffByManagerStaffId) {
        this.staffByManagerStaffId = staffByManagerStaffId;
    }

    public AddressDto getAddressByAddressId() {
        return addressByAddressId;
    }

    public void setAddressByAddressId(AddressDto addressByAddressId) {
        this.addressByAddressId = addressByAddressId;
    }

    @Override
    public String toString() {
        return "StoreDto{" +
                "storeId=" + storeId +
                ", lastUpdate=" + lastUpdate +
                ", customersByStoreId=" + customersByStoreId +
                ", inventoriesByStoreId=" + inventoriesByStoreId +
                ", staffByStoreId=" + staffByStoreId +
                '}';
    }
}
