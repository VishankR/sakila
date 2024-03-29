package com.vishank.sakila.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;
import org.hibernate.annotations.Subselect;

import java.math.BigDecimal;

@Entity
@Immutable
@Table(name = "sales_by_film_category")
@Subselect("select uuid() as id, sbfc.* from sales_by_film_category sbfc")
public class SalesByFilmCategoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Basic
    @Column(name = "category", nullable = false, length = 25)
    private String category;
    @Basic
    @Column(name = "total_sales", length = 6, nullable = true, precision = 2)
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
        return "SalesByFilmCategoryEntity{" +
                "category='" + category + '\'' +
                ", totalSales=" + totalSales +
                '}';
    }
}
