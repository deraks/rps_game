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
        model.addAttribute("moves", MovesEnum.values());
        return "startGame";
    }
    
    @RequestMapping(value = "/startGame", method = RequestMethod.POST)
    public String compareMoves(Game game,Model model) {
        if (game.getPlayerMove()!=null) {
            MovesEnum playerMove = game.getPlayerMove();
            MovesEnum computerMove = computerService.getMove();
            game.setComputerMove(computerMove);
            GameResultEnum gameResult = gameService.compareMoves(game);
           
            switch (gameResult) {
            case DRAW:
            return "redirect:/draw?comp="+computerMove+"&player="+playerMove;
            case COMPUTERWIN:
                return "redirect:/winner?win=computer&comp="+computerMove+"&player="+playerMove;
            case PLAYERWIN:
            // return "redirect:/winner/player";
            return "redirect:/winner?win=player&comp="+computerMove+"&player="+playerMove;
            default:
                return "startGame";
            }
        } else {
            return "redirect:/startGame";
        }
    }
}
