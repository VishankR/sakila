package com.vishank.sakila.dtos;

import com.vishank.sakila.entities.FilmEntity;
import com.vishank.sakila.entities.RentalEntity;
import com.vishank.sakila.entities.StoreEntity;

import java.sql.Timestamp;
import java.util.Collection;

public class InventoryDto {
    private long inventoryId;
    private Timestamp lastUpdate;
    private FilmEntity filmByFilmId;
    private StoreEntity storeByStoreId;
    private Collection<RentalDto> rentalsByInventoryId;

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

    public Collection<RentalDto> getRentalsByInventoryId() {
        return rentalsByInventoryId;
    }

    public void setRentalsByInventoryId(Collection<RentalDto> rentalsByInventoryId) {
        this.rentalsByInventoryId = rentalsByInventoryId;
    }

    @Override
    public String toString() {
        return "InventoryDto{" +
                "inventoryId=" + inventoryId +
                ", lastUpdate=" + lastUpdate +
                ", rentalsByInventoryId=" + rentalsByInventoryId +
                '}';
    }
}
