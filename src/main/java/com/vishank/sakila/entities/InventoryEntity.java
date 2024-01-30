package com.vishank.sakila.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Collection;

@Entity
@Table(name = "inventory", indexes = {
        @Index(name = "idx_fk_film_id", columnList = "film_id"),
        @Index(name = "idx_store_id_film_id", columnList = "store_id, film_id")
}, schema = "sakilaspringboot")
public class InventoryEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "inventory_id", columnDefinition = "MEDIUMINT UNSIGNED", nullable = false)
    private long inventoryId;
    @Basic
    @Column(name = "last_update", columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP", nullable = false)
    private Timestamp lastUpdate;
    @ManyToOne
    @JoinColumn(name = "film_id", columnDefinition = "SMALLINT UNSIGNED", referencedColumnName = "film_id",
            foreignKey = @ForeignKey(name = "fk_inventory_film", value = ConstraintMode.CONSTRAINT,
                    foreignKeyDefinition = "FOREIGN KEY (`film_id`) REFERENCES `film` (`film_id`) ON DELETE RESTRICT ON UPDATE CASCADE"), nullable = false)
    @JsonBackReference
    private FilmEntity filmByFilmId;
    @ManyToOne
    @JoinColumn(name = "store_id", columnDefinition = "TINYINT UNSIGNED", referencedColumnName = "store_id",
            foreignKey = @ForeignKey(name = "fk_inventory_store", value = ConstraintMode.CONSTRAINT,
                    foreignKeyDefinition = "FOREIGN KEY (`store_id`) REFERENCES `store` (`store_id`) ON DELETE RESTRICT ON UPDATE CASCADE"), nullable = false)
    @JsonBackReference
    private StoreEntity storeByStoreId;
    @OneToMany(mappedBy = "inventoryByInventoryId")
    @JsonManagedReference
    private Collection<RentalEntity> rentalsByInventoryId;

    public long getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(long inventoryId) {
        this.inventoryId = inventoryId;
    }

    public Timestamp getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public FilmEntity getFilmByFilmId() {
        return filmByFilmId;
    }

    public void setFilmByFilmId(FilmEntity filmByFilmId) {
        this.filmByFilmId = filmByFilmId;
    }

    public StoreEntity getStoreByStoreId() {
        return storeByStoreId;
    }

    public void setStoreByStoreId(StoreEntity storeByStoreId) {
        this.storeByStoreId = storeByStoreId;
    }

    public Collection<RentalEntity> getRentalsByInventoryId() {
        return rentalsByInventoryId;
    }

    public void setRentalsByInventoryId(Collection<RentalEntity> rentalsByInventoryId) {
        this.rentalsByInventoryId = rentalsByInventoryId;
    }

    @Override
    public String toString() {
        return "InventoryEntity{" +
                "inventoryId=" + inventoryId +
                ", lastUpdate=" + lastUpdate +
                ", rentalsByInventoryId=" + rentalsByInventoryId +
                '}';
    }
}
