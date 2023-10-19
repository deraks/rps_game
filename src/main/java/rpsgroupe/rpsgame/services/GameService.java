package rpsgroupe.rpsgame.services;
import rpsgroupe.rpsgame.domain.*;

public interface GameService {
    Game saveGameResult(Game game);
    // GameResult getGameResultById(Integer id);
    Iterable<Game> listAllGames();
    // GameResult compareMoves(Moves player,Moves computer);
    GameResult compareMoves(Game game);
    // int increaseWins(GameResult gameResult, Game game);
}
