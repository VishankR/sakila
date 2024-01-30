package com.vishank.sakila.dtos;

import jakarta.persistence.*;

import java.math.BigDecimal;

public class SalesByStoreDto {
    private long id;
    private String store;
    private String manager;
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
        return "SalesByStoreDto{" +
                "store='" + store + '\'' +
                ", manager='" + manager + '\'' +
                ", totalSales=" + totalSales +
                '}';
    }
}
