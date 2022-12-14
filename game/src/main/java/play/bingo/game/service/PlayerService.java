
package play.bingo.game.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import play.bingo.game.model.Player;
import play.bingo.game.repository.PlayerRepository;

@Service
public class PlayerService {
    
    @Autowired
    private PlayerRepository playerRepository;

    public Player savePlayer(Player player){
        return playerRepository.save(player);
    }

    public void deletePlayer(Player player){
        playerRepository.delete(player);
    }

    public List<Player> findAllPlayers(){
        return playerRepository.findAll();
    }

    public Player findByPlayerId(Long playerId) {
        return playerRepository.findById(playerId).get();
    }
}
