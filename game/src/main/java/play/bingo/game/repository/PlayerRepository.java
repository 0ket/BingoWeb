package play.bingo.game.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import play.bingo.game.model.Player;

public interface PlayerRepository extends JpaRepository<Player,Long> {
    
}
