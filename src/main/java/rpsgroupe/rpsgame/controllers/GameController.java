package rpsgroupe.rpsgame.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;
import rpsgroupe.rpsgame.domain.*;
import rpsgroupe.rpsgame.services.*;

@Controller
public class GameController {
    private ComputerService computerService;
    private GameService gameService;
    
    @Autowired
    public GameController(ComputerService computerService, GameService gameService) {
        this.computerService = computerService;
        this.gameService = gameService;
    }
    @RequestMapping(value = "/startGame", method = RequestMethod.GET)
    public String startGame(Model model){
        Game game = new Game();
        model.addAttribute("game",game);
        model.addAttribute("moves", Moves.values());
        return "startGame";
    }
    // @RequestMapping(value = "/startGame", method = RequestMethod.POST)
    // public String compareMoves(Game game,Model model) {
        
    //     GameResult gameResult = gameService.compareMoves(game.getPlayerMove(),computerService.getMove());
       
    //     switch (gameResult) {
    //     case DRAW:{
    //         game.setDraws(1);
    //         gameService.saveGameResult(game);
    //         return "draw";
    //         }
    //     case COMPUTERWIN:{
    //         game.setComputerWins(1);
    //         gameService.saveGameResult(game);
    //         return "redirect:/winner/computer";
    //     }
    //     case PLAYERWIN:{
    //         game.setPlayerWins(1);
    //         gameService.saveGameResult(game);
    //         return "redirect:/winner/player";
    //         }
    //     }
        
    //     return "startGame";
    // }
    @RequestMapping(value = "/startGame", method = RequestMethod.POST)
    public String compareMoves(Game game,Model model) {
        GameResult gameResult = gameService.compareMoves(game);

        switch (gameResult) {
        case DRAW:
            return "draw";
        case COMPUTERWIN:
            return "redirect:/winner/computer";
        case PLAYERWIN:
           return "redirect:/winner/player";
        default:
            return "startGame";
        }
    }
}
