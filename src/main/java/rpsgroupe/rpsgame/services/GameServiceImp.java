package rpsgroupe.rpsgame.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rpsgroupe.rpsgame.domain.*;
import rpsgroupe.rpsgame.repositories.*;

@Service
public class GameServiceImp implements GameService{
    private GameRepository gameRepository;

    @Autowired
    public void setGameRepository(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }
    @Override
    public Game saveGameResult(Game game) {
        return gameRepository.save(game);
    }

    @Override
    public Iterable<Game> listAllGames() {
        return gameRepository.findAll();
    }

    @Override
    public GameResultEnum compareMoves(Game game) {
        MovesEnum playerMove = game.getPlayerMove();
        MovesEnum computerMove = game.getComputerMove();
        if (playerMove == computerMove){
            game.setDraws(1);
            saveGameResult(game);
            return GameResultEnum.DRAW;
        }
        switch (playerMove) {
            case ROCK:{
                if (computerMove == MovesEnum.SCISSORS ){
                    game.setPlayerWins(1);
                    saveGameResult(game);
                    return GameResultEnum.PLAYERWIN;
                }else{
                    game.setComputerWins(1);
                    saveGameResult(game);
                    return GameResultEnum.COMPUTERWIN;
                }
            }
            case PAPER:{
                if (computerMove == MovesEnum.ROCK ){
                    game.setPlayerWins(1);
                    saveGameResult(game);
                    return GameResultEnum.PLAYERWIN;
                }else{
                    game.setComputerWins(1);
                    saveGameResult(game);
                    return GameResultEnum.COMPUTERWIN;
                }
            }
            case SCISSORS:{
                if (computerMove == MovesEnum.PAPER ){
                    game.setPlayerWins(1);
                    saveGameResult(game);
                    return GameResultEnum.PLAYERWIN;
                }else{
                    game.setComputerWins(1);
                    saveGameResult(game);
                    return GameResultEnum.COMPUTERWIN;
                }
            }
            default:
            return GameResultEnum.DRAW;
        }
    }
}
