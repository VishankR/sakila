package com.vishank.sakila.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;
import org.hibernate.annotations.Subselect;

import java.math.BigDecimal;

@Entity
@Immutable
@Table(name = "sales_by_store")
@Subselect("select uuid() as id, sbs.* from sales_by_store sbs")
public class SalesByStoreEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Basic
    @Column(name = "store", nullable = true, length = 101)
    private String store;
    @Basic
    @Column(name = "manager", nullable = true, length = 91)
    private String manager;
    @Basic
    @Column(name = "total_sales", length = 6, nullable = true, precision = 2)
    private BigDecimal totalSales;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public BigDecimal getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(BigDecimal totalSales) {
        this.totalSales = totalSales;
    }

    @Override
    public String toString() {
        return "SalesByStoreEntity{" +
                "store='" + store + '\'' +
                ", manager='" + manager + '\'' +
                ", totalSales=" + totalSales +
                '}';
    }
}
