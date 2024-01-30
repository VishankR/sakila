package com.vishank.sakila.repositories.impls;

import com.vishank.sakila.entities.ActorEntity;
import com.vishank.sakila.repositories.ActorDao;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ActorDaoImpl implements ActorDao {

    @PersistenceContext
    EntityManager entityManager;

    private static final StringBuilder QUERY_FETCH_ALL_ACTOR_ENTITIES= new StringBuilder("select ae from ActorEntity ae");
    private static final StringBuilder QUERY_FETCH_ACTOR_ENTITY_BY_ID= new StringBuilder("select ae from ActorEntity ae where ae.id = :id");

    /**
     * @return @{@link List<ActorEntity>}
     */
    @Override
    public List<ActorEntity> getAllActorEntities() {
        TypedQuery<ActorEntity> actorEntityTypedQuery = entityManager.createQuery(QUERY_FETCH_ALL_ACTOR_ENTITIES.toString(), ActorEntity.class);
        return actorEntityTypedQuery.getResultList();
    }

    /**
     * @return
     */
    @Override
    public ActorEntity getActorEntity(long id) {
        TypedQuery<ActorEntity> actorEntityTypedQuery = entityManager.createQuery(QUERY_FETCH_ACTOR_ENTITY_BY_ID.toString(), ActorEntity.class);
        actorEntityTypedQuery.setParameter("id", id);
        return actorEntityTypedQuery.getSingleResult();
    }
}
