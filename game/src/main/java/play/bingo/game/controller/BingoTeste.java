package play.bingo.game.controller;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.springframework.*;
import org.springframework.beans.factory.annotation.Autowired;



@Controller
public class BingoTeste {

    @Autowired
    BingoDrawService bingoDrawService;
    
    @RequestMapping("/")
    public String viewString(Model model) {
    
        return "home";
    }
}
