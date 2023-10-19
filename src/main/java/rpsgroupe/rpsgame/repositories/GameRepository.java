package rpsgroupe.rpsgame.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import rpsgroupe.rpsgame.domain.*;

@Repository
public interface GameRepository extends CrudRepository<Game, Integer> {
    
}
