package com.vishank.sakila.dtos;

import java.sql.Timestamp;
import java.util.Collection;

public class CustomerDto {
    private long customerId;
    private String firstName;
    private String lastName;
    private String email;
    private byte active;
    private Timestamp createDate;
    private Timestamp lastUpdate;
    private StoreDto storeByStoreId;
    private AddressDto addressByAddressId;
    private Collection<PaymentDto> paymentsByCustomerId;
    private Collection<RentalDto> rentalsByCustomerId;

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

    public StoreDto getStoreByStoreId() {
        return storeByStoreId;
    }

    public void setStoreByStoreId(StoreDto storeByStoreId) {
        this.storeByStoreId = storeByStoreId;
    }

    public AddressDto getAddressByAddressId() {
        return addressByAddressId;
    }

    public void setAddressByAddressId(AddressDto addressByAddressId) {
        this.addressByAddressId = addressByAddressId;
    }

    public Collection<PaymentDto> getPaymentsByCustomerId() {
        return paymentsByCustomerId;
    }

    public void setPaymentsByCustomerId(Collection<PaymentDto> paymentsByCustomerId) {
        this.paymentsByCustomerId = paymentsByCustomerId;
    }

    public Collection<RentalDto> getRentalsByCustomerId() {
        return rentalsByCustomerId;
    }

    public void setRentalsByCustomerId(Collection<RentalDto> rentalsByCustomerId) {
        this.rentalsByCustomerId = rentalsByCustomerId;
    }

    @Override
    public String toString() {
        return "CustomerDto{" +
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
