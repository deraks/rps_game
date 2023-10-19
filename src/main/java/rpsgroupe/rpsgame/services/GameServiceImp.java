package rpsgroupe.rpsgame.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rpsgroupe.rpsgame.domain.*;
import rpsgroupe.rpsgame.repositories.*;

@Service
public class GameServiceImp implements GameService{
    private GameRepository gameRepository;
    private ComputerService computerService;

    @Autowired
    public void setComputerService(ComputerService computerService) {
        this.computerService = computerService;
    }
    

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

    // @Override
    // public GameResult compareMoves(Moves player, Moves computer) {
    //     if (player == computer){
    //         return GameResult.DRAW;
    //     }
    //     switch (player) {
    //     case ROCK:
    //         return (computer == Moves.SCISSORS ? GameResult.COMPUTERWIN :GameResult.PLAYERWIN );
    //     case PAPER:
    //         return (computer == Moves.ROCK ?  GameResult.COMPUTERWIN :GameResult.PLAYERWIN);
    //     case SCISSORS:
    //         return (computer == Moves.PAPER ? GameResult.COMPUTERWIN :GameResult.PLAYERWIN);
    //     }
    //     return GameResult.DRAW;
    // }
    @Override
    public GameResult compareMoves(Game game) {
        Moves playerMove = game.getPlayerMove();
        Moves computerMove = computerService.getMove();
        if (playerMove == computerMove){
            game.setDraws(1);
            saveGameResult(game);
            return GameResult.DRAW;
        }
        switch (playerMove) {
            case ROCK:{
                if (computerMove == Moves.SCISSORS ){
                    game.setPlayerWins(1);
                    saveGameResult(game);
                    return GameResult.PLAYERWIN;
                }else{
                    game.setComputerWins(1);
                    saveGameResult(game);
                    return GameResult.COMPUTERWIN;
                }
            }
            case PAPER:{
                if (computerMove == Moves.ROCK ){
                    game.setPlayerWins(1);
                    saveGameResult(game);
                    return GameResult.PLAYERWIN;
                }else{
                    game.setComputerWins(1);
                    saveGameResult(game);
                    return GameResult.COMPUTERWIN;
                }
            }
            case SCISSORS:{
                if (computerMove == Moves.PAPER ){
                    game.setPlayerWins(1);
                    saveGameResult(game);
                    return GameResult.PLAYERWIN;
                }else{
                    game.setComputerWins(1);
                    saveGameResult(game);
                    return GameResult.COMPUTERWIN;
                }
            }
            default:
            return GameResult.DRAW;
        }
    }
    // @Override
    // public Game increaseWins(GameResult gameResult, Game game) {
    //     switch (gameResult) {
    //         case DRAW:{
    //         }
    //             return "draw";
    //         case COMPUTERWIN:{
    //             game.setComputerWins(1);
    //             return "redirect:/winner/computer";
    //         }
    //         case PLAYERWIN:
    //             return "redirect:/winner/player";
    //         default:
    //         return "startGame";
    //     }
    // }
    // @Override
    // public GameResult getGameResultById(Integer id){

    // }
}
