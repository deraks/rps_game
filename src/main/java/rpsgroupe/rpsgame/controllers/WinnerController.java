package rpsgroupe.rpsgame.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
public class WinnerController {
    @RequestMapping("/winner/{winner}")
    String winnerShow(@PathVariable String winner, Model model){
        model.addAttribute("winner", winner);
        return "winner";
    }
}
