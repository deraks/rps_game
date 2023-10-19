package rpsgroupe.rpsgame.repositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import rpsgroupe.rpsgame.domain.UserPlayer;

@Repository
public interface UserPlayerRepository extends CrudRepository<UserPlayer, Integer> {
   
}