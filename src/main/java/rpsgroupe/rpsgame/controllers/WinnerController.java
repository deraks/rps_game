package rpsgroupe.rpsgame.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

@Controller
public class WinnerController {
    @RequestMapping(value = "/winner", method = RequestMethod.GET)
    public String winnerShow(
        @RequestParam(name = "win", required = false) String winner,
        @RequestParam(name = "comp", required = false) String comp,
        @RequestParam(name = "player", required = false) String player,Model model) {
        
        model.addAttribute("win", winner);
        model.addAttribute("comp", comp);
        model.addAttribute("player", player);
        
        return "winner";
    }
}
