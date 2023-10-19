package rpsgroupe.rpsgame.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexController {
    @RequestMapping("/")
    String index(){
        return "index";
    }
    @RequestMapping("/draw")
    String draw(){
        return "draw";
    }
    @RequestMapping("/winner")
    String winner(){
        return "winner";
    }
    @RequestMapping("/startGame")
    String startGame(){
        return "startGame";
    }
}