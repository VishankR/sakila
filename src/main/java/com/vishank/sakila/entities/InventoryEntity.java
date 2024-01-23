package com.vishank.sakila.entities;

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
    private FilmEntity filmByFilmId;
    @ManyToOne
    @JoinColumn(name = "store_id", columnDefinition = "TINYINT UNSIGNED", referencedColumnName = "store_id",
            foreignKey = @ForeignKey(name = "fk_inventory_store", value = ConstraintMode.CONSTRAINT,
                    foreignKeyDefinition = "FOREIGN KEY (`store_id`) REFERENCES `store` (`store_id`) ON DELETE RESTRICT ON UPDATE CASCADE"), nullable = false)
    private StoreEntity storeByStoreId;
    @OneToMany(mappedBy = "inventoryByInventoryId")
    private Collection<RentalEntity> rentalsByInventoryId;

    @Override
    public String toString() {
        return "InventoryEntity{" +
                "inventoryId=" + inventoryId +
                ", lastUpdate=" + lastUpdate +
                ", rentalsByInventoryId=" + rentalsByInventoryId +
                '}';
    }
}
