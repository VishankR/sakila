package com.vishank.sakila.services.impls;

import com.vishank.sakila.entities.ActorEntity;
import com.vishank.sakila.repositories.ActorDao;
import com.vishank.sakila.services.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActorServiceImpl implements ActorService {
    @Autowired
    ActorDao actorDao;

    /**
     * @return @{@link List<ActorEntity>}
     */
    @Override
    public List<ActorEntity> getAllActorEntities() {
        return actorDao.getAllActorEntities();
    }
}
