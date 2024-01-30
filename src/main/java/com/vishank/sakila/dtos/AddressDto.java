package com.vishank.sakila.dtos;

import java.sql.Timestamp;
import java.util.Collection;

public class AddressDto {
    private long addressId;
    private String address;
    private String address2;
    private String district;
    private String postalCode;
    private String phone;
    private byte[] location;
    private Timestamp lastUpdate;
    private CityDto cityByCityId;
    private Collection<CustomerDto> customersByAddressId;
    private Collection<StaffDto> staffByAddressId;
    private Collection<StoreDto> storesByAddressId;

    public long getAddressId() {
        return addressId;
    }

    public void setAddressId(long addressId) {
        this.addressId = addressId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public byte[] getLocation() {
        return location;
    }

    public void setLocation(byte[] location) {
        this.location = location;
    }

    public Timestamp getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public CityDto getCityByCityId() {
        return cityByCityId;
    }

    public void setCityByCityId(CityDto cityByCityId) {
        this.cityByCityId = cityByCityId;
    }

    public Collection<CustomerDto> getCustomersByAddressId() {
        return customersByAddressId;
    }

    public void setCustomersByAddressId(Collection<CustomerDto> customersByAddressId) {
        this.customersByAddressId = customersByAddressId;
    }

    public Collection<StaffDto> getStaffByAddressId() {
        return staffByAddressId;
    }

    public void setStaffByAddressId(Collection<StaffDto> staffByAddressId) {
        this.staffByAddressId = staffByAddressId;
    }

    public Collection<StoreDto> getStoresByAddressId() {
        return storesByAddressId;
    }

    public void setStoresByAddressId(Collection<StoreDto> storesByAddressId) {
        this.storesByAddressId = storesByAddressId;
    }

    @Override
    public String toString() {
        return "AddressDto{" +
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
