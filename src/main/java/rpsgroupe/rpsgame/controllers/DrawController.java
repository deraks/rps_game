package rpsgroupe.rpsgame.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

@Controller
public class DrawController {
    @RequestMapping(value = "/draw", method = RequestMethod.GET)
    public String winnerShow(
        @RequestParam(name = "comp", required = false) String comp,
        @RequestParam(name = "player", required = false) String player,Model model) {
        model.addAttribute("comp", comp);
        model.addAttribute("player", player);
        return "draw";
}
}
