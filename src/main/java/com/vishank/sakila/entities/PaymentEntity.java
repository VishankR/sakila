package com.vishank.sakila.entities;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "payment", indexes = {
        @Index(name = "idx_fk_customer_id", columnList = "customer_id"),
        @Index(name = "idx_fk_staff_id", columnList = "staff_id"),
        @Index(name = "fk_payment_rental", columnList = "rental_id")
}, schema = "sakilaspringboot")
public class PaymentEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "payment_id", columnDefinition = "SMALLINT UNSIGNED", nullable = false)
    private long paymentId;
    @Basic
    @Column(name = "amount", nullable = false, length = 6, precision = 2)
    private BigDecimal amount;
    @Basic
    @Column(name = "payment_date", columnDefinition="DATETIME", nullable = false)
    private Timestamp paymentDate;
    @Basic
    @Column(name = "last_update", columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP", nullable = true)
    private Timestamp lastUpdate;
    @ManyToOne
    @JoinColumn(name = "customer_id", columnDefinition = "SMALLINT UNSIGNED", referencedColumnName = "customer_id",
            foreignKey = @ForeignKey(name = "fk_payment_customer", value = ConstraintMode.CONSTRAINT,
                    foreignKeyDefinition = "FOREIGN KEY (`customer_id`) REFERENCES `customer` (`customer_id`) ON DELETE RESTRICT ON UPDATE CASCADE"), nullable = false)
    private CustomerEntity customerByCustomerId;
    @ManyToOne
    @JoinColumn(name = "staff_id", columnDefinition = "TINYINT UNSIGNED", referencedColumnName = "staff_id",
            foreignKey = @ForeignKey(name = "fk_payment_staff", value = ConstraintMode.CONSTRAINT,
                    foreignKeyDefinition = "FOREIGN KEY (`staff_id`) REFERENCES `staff` (`staff_id`) ON DELETE RESTRICT ON UPDATE CASCADE"), nullable = false)
    private StaffEntity staffByStaffId;
    @ManyToOne
    @JoinColumn(name = "rental_id", columnDefinition = "INT", referencedColumnName = "rental_id",
            foreignKey = @ForeignKey(name = "fk_payment_rental", value = ConstraintMode.CONSTRAINT,
                    foreignKeyDefinition = "FOREIGN KEY (`rental_id`) REFERENCES `rental` (`rental_id`) ON DELETE SET NULL ON UPDATE CASCADE    "))
    private RentalEntity rentalByRentalId;

    @Override
    public String toString() {
        return "PaymentEntity{" +
                "paymentId=" + paymentId +
                ", amount=" + amount +
                ", paymentDate=" + paymentDate +
                ", lastUpdate=" + lastUpdate +
                '}';
    }
}
