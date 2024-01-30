package com.vishank.sakila.dtos;

import java.sql.Timestamp;
import java.util.Collection;

public class RentalDto {
    private long rentalId;
    private Timestamp rentalDate;
    private Timestamp returnDate;
    private Timestamp lastUpdate;
    private Collection<PaymentDto> paymentsByRentalId;
    private InventoryDto inventoryByInventoryId;
    private CustomerDto customerByCustomerId;
    private StaffDto staffByStaffId;

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

    public Collection<PaymentDto> getPaymentsByRentalId() {
        return paymentsByRentalId;
    }

    public void setPaymentsByRentalId(Collection<PaymentDto> paymentsByRentalId) {
        this.paymentsByRentalId = paymentsByRentalId;
    }

    public InventoryDto getInventoryByInventoryId() {
        return inventoryByInventoryId;
    }

    public void setInventoryByInventoryId(InventoryDto inventoryByInventoryId) {
        this.inventoryByInventoryId = inventoryByInventoryId;
    }

    public CustomerDto getCustomerByCustomerId() {
        return customerByCustomerId;
    }

    public void setCustomerByCustomerId(CustomerDto customerByCustomerId) {
        this.customerByCustomerId = customerByCustomerId;
    }

    public StaffDto getStaffByStaffId() {
        return staffByStaffId;
    }

    public void setStaffByStaffId(StaffDto staffByStaffId) {
        this.staffByStaffId = staffByStaffId;
    }

    @Override
    public String toString() {
        return "RentalDto{" +
                "rentalId=" + rentalId +
                ", rentalDate=" + rentalDate +
                ", returnDate=" + returnDate +
                ", lastUpdate=" + lastUpdate +
                ", paymentsByRentalId=" + paymentsByRentalId +
                '}';
    }
}
