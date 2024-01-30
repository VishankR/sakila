package com.vishank.sakila.dtos;

import java.math.BigDecimal;

public class SalesByFilmCategoryDto {
    private long id;
    private String category;
    private BigDecimal totalSales;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public BigDecimal getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(BigDecimal totalSales) {
        this.totalSales = totalSales;
    }

    @Override
    public String toString() {
        return "SalesByFilmCategoryDto{" +
                "category='" + category + '\'' +
                ", totalSales=" + totalSales +
                '}';
    }
}
