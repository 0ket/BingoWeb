package play.bingo.game.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import play.bingo.game.model.BingoDraw;
import play.bingo.game.repository.BingoDrawRepository;
@Service
public class BingoDrawService {

    @Autowired
    private BingoDrawRepository BingoDrawRepository;

    

    public BingoDraw saveBingoDraw(BingoDraw bingoDraw){
        return BingoDrawRepository.save(bingoDraw);
    }

    public void deleteBingoDraw(BingoDraw bingoDraw){
        BingoDrawRepository.delete(bingoDraw);
    }

    public List<BingoDraw> findAllBingoDraw(){
        return BingoDrawRepository.findAll();
    }

    public BingoDraw findByBingoDraw(Long idBingoDraw) {
        return BingoDrawRepository.findById(idBingoDraw).get();
    }
   
}
