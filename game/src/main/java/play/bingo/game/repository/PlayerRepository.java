package play.bingo.game.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import play.bingo.game.model.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player,Long> {
    
}
