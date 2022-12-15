package play.bingo.game.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import play.bingo.game.model.BingoDraw;

public interface BingoDrawRepository extends JpaRepository<BingoDraw, Long> {
    
}
