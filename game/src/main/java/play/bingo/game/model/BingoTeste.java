package play.bingo.game.model;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class BingoTeste {
    
    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("message", "Welcome to Bingo Teste");
       
        return "home.html";
    }
}
