package rpsgroupe.rpsgame.services;

import rpsgroupe.rpsgame.domain.*;

public interface PlayerService {
    Moves getMove();
    // void increaseScore();
    // void decreaseScore();
    UserPlayer saveUSerPlayer(UserPlayer userPlayer);
}
