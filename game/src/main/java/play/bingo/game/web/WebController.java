package play.bingo.game.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WebController {
    
    public ModelAndView error() {
        return new ModelAndView("error");
    }
    
    @RequestMapping(value ="/", method = RequestMethod.GET)
    @ResponseBody
    public ModelAndView homeBingoGame(){
        return new ModelAndView("home");
    }
    @RequestMapping(value ="/newGame", method = RequestMethod.GET)
    public String newGame(){
        return "Vamos começar";
    }
    @RequestMapping(value ="/players", method = RequestMethod.GET)
    public ModelAndView players(){
        return new ModelAndView("players");
    }
}

