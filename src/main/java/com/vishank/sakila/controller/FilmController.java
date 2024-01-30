package com.vishank.sakila.controller;

import com.vishank.sakila.entities.FilmEntity;
import com.vishank.sakila.services.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/film")
public class FilmController {

    @Autowired
    FilmService filmService;

    @GetMapping("/all")
    public List<FilmEntity> getFilmEntities(){
        return filmService.getFilmEntities();
    }

    @GetMapping("/id")
    public FilmEntity getFilmEntity(@RequestParam long id){
        return filmService.getFilmEntityById(id);
    }
}
