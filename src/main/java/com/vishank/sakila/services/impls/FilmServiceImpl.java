package com.vishank.sakila.services.impls;

import com.vishank.sakila.entities.FilmEntity;
import com.vishank.sakila.repositories.FilmDao;
import com.vishank.sakila.services.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmServiceImpl implements FilmService {

    @Autowired
    FilmDao filmDao;

    /**
     * @return
     */
    @Override
    public List<FilmEntity> getFilmEntities() {
        return filmDao.getFilmEntities();
    }

    /**
     * @return
     */
    @Override
    public FilmEntity getFilmEntityById(long id) {
        return filmDao.getFilmEntityById(id);
    }
}
