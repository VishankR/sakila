package com.vishank.sakila.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "film_actor", indexes = {
        @Index(name = "idx_fk_film_id", columnList = "film_id")
}, schema = "sakilaspringboot")
@IdClass(FilmActorEntityPK.class)
public class FilmActorEntity {
    @Basic
    @Column(name = "last_update", columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP", nullable = false)
    private Timestamp lastUpdate;
    @ManyToOne
    @Id
    @JoinColumn(name = "actor_id", columnDefinition = "SMALLINT UNSIGNED", referencedColumnName = "actor_id",
            foreignKey = @ForeignKey(name = "fk_film_actor_actor", value = ConstraintMode.CONSTRAINT,
                    foreignKeyDefinition = "FOREIGN KEY (`actor_id`) REFERENCES `actor` (`actor_id`) ON DELETE RESTRICT ON UPDATE CASCADE"), nullable = false)
    @JsonBackReference
    private ActorEntity actorByActorId;
    @ManyToOne
    @Id
    @JoinColumn(name = "film_id", columnDefinition = "SMALLINT UNSIGNED", referencedColumnName = "film_id",
            foreignKey = @ForeignKey(name = "fk_film_actor_film", value = ConstraintMode.CONSTRAINT,
                    foreignKeyDefinition = "FOREIGN KEY (`film_id`) REFERENCES `film` (`film_id`) ON DELETE RESTRICT ON UPDATE CASCADE"), nullable = false)
    @JsonBackReference
    private FilmEntity filmByFilmId;

    public Timestamp getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public ActorEntity getActorByActorId() {
        return actorByActorId;
    }

    public void setActorByActorId(ActorEntity actorByActorId) {
        this.actorByActorId = actorByActorId;
    }

    public FilmEntity getFilmByFilmId() {
        return filmByFilmId;
    }

    public void setFilmByFilmId(FilmEntity filmByFilmId) {
        this.filmByFilmId = filmByFilmId;
    }

    @Override
    public String toString() {
        return "FilmActorEntity{" +
                "lastUpdate=" + lastUpdate +
                '}';
    }
}
