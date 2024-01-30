package com.vishank.sakila.repositories;

import com.vishank.sakila.entities.FilmEntity;

import java.util.List;

public interface FilmDao {

    List<FilmEntity> getFilmEntities();

    FilmEntity getFilmEntityById(long id);
}
