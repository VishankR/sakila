package com.vishank.sakila.dtos;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class PaymentDto {
    private long paymentId;
    private BigDecimal amount;
    private Timestamp paymentDate;
    private Timestamp lastUpdate;
    private CustomerDto customerByCustomerId;
    private StaffDto staffByStaffId;
    private RentalDto rentalByRentalId;

    public long getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(long paymentId) {
        this.paymentId = paymentId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Timestamp getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Timestamp paymentDate) {
        this.paymentDate = paymentDate;
    }

    public Timestamp getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
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

    public RentalDto getRentalByRentalId() {
        return rentalByRentalId;
    }

    public void setRentalByRentalId(RentalDto rentalByRentalId) {
        this.rentalByRentalId = rentalByRentalId;
    }

    @Override
    public String toString() {
        return "PaymentDto{" +
                "paymentId=" + paymentId +
                ", amount=" + amount +
                ", paymentDate=" + paymentDate +
                ", lastUpdate=" + lastUpdate +
                '}';
    }
}
