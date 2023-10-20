package rpsgroupe.rpsgame.services;
import rpsgroupe.rpsgame.domain.*;

public interface GameService {
    Game saveGameResult(Game game);
    Iterable<Game> listAllGames();
    GameResultEnum compareMoves(Game game);
}
