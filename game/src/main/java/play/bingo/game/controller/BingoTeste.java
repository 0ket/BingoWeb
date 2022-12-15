package play.bingo.game.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import play.bingo.game.service.BingoDrawService;

@Controller
public class BingoTeste {

    @Autowired
    BingoDrawService bingoDrawService;
    
    @GetMapping("/")
    public ModelAndView viewString() {
        ModelAndView home = new ModelAndView("home");
        return home;
    }
}
