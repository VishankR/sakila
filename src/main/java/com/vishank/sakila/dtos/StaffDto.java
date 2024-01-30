package com.vishank.sakila.dtos;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Collection;

public class StaffDto {
    private long staffId;
    private String firstName;
    private String lastName;
    private byte[] picture;
    private String email;
    private byte active;
    private String username;
    private String password;
    private Timestamp lastUpdate;
    private Collection<PaymentDto> paymentsByStaffId;
    private Collection<RentalDto> rentalsByStaffId;
    private AddressDto addressByAddressId;
    private StoreDto storeByStoreId;
    private Collection<StoreDto> storesByStaffId;

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

    public Collection<PaymentDto> getPaymentsByStaffId() {
        return paymentsByStaffId;
    }

    public void setPaymentsByStaffId(Collection<PaymentDto> paymentsByStaffId) {
        this.paymentsByStaffId = paymentsByStaffId;
    }

    public Collection<RentalDto> getRentalsByStaffId() {
        return rentalsByStaffId;
    }

    public void setRentalsByStaffId(Collection<RentalDto> rentalsByStaffId) {
        this.rentalsByStaffId = rentalsByStaffId;
    }

    public AddressDto getAddressByAddressId() {
        return addressByAddressId;
    }

    public void setAddressByAddressId(AddressDto addressByAddressId) {
        this.addressByAddressId = addressByAddressId;
    }

    public StoreDto getStoreByStoreId() {
        return storeByStoreId;
    }

    public void setStoreByStoreId(StoreDto storeByStoreId) {
        this.storeByStoreId = storeByStoreId;
    }

    public Collection<StoreDto> getStoresByStaffId() {
        return storesByStaffId;
    }

    public void setStoresByStaffId(Collection<StoreDto> storesByStaffId) {
        this.storesByStaffId = storesByStaffId;
    }

    @Override
    public String toString() {
        return "StaffDto{" +
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
