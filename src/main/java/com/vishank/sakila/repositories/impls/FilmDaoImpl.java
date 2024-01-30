package com.vishank.sakila.repositories.impls;

import com.vishank.sakila.entities.FilmEntity;
import com.vishank.sakila.repositories.FilmDao;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FilmDaoImpl implements FilmDao {

    @PersistenceContext
    EntityManager entityManager;

    private static final StringBuilder QUERY_FETCH_ALL_FILM_ENTITIES= new StringBuilder("select fe from FilmEntity fe");
    private static final StringBuilder QUERY_FETCH_FILM_ENTITY_BY_ID= new StringBuilder("select fe from FilmEntity fe where fe.id = :id");

    /**
     * @return
     */
    @Override
    public List<FilmEntity> getFilmEntities() {
        TypedQuery<FilmEntity> query = entityManager.createQuery(QUERY_FETCH_ALL_FILM_ENTITIES.toString(), FilmEntity.class);
        return query.getResultList();
    }

    /**
     * @param id
     * @return
     */
    @Override
    public FilmEntity getFilmEntityById(long id) {
        TypedQuery<FilmEntity> query = entityManager.createQuery(QUERY_FETCH_FILM_ENTITY_BY_ID.toString(), FilmEntity.class);
        query.setParameter("id", id);
        return query.getSingleResult();
    }
}
