package rpsgroupe.rpsgame.controllers;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Controller;

import rpsgroupe.rpsgame.domain.Game;
import rpsgroupe.rpsgame.services.GameService;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class StatisticsController {
    private GameService gameService;
    
    @Autowired
    public StatisticsController(GameService gameService) {
        this.gameService = gameService;
    }
    @RequestMapping(value = "/statistics", method = RequestMethod.GET)
    public String show(Model model){
        Iterable<Game> game = gameService.listAllGames();
        model.addAttribute("games", game);
        return "statistics";
    }  
}
