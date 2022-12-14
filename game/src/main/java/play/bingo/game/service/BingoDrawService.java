package play.bingo.game.service;

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
