package com.vishank.sakila.services;

import com.vishank.sakila.entities.FilmEntity;
import org.springframework.stereotype.Service;

import java.util.List;

public interface FilmService {

    List<FilmEntity> getFilmEntities();

    FilmEntity getFilmEntityById(long id);

}
