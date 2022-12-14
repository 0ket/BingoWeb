package play.bingo.game.repository;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface BingoDrawRepository extends JpaRepository<BingoDraw, Long> {
    
}
