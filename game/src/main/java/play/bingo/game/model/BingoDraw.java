package play.bingo.game.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;

@Entity
public class BingoDraw {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToMany()
    @JoinColumn(name = "player_id", referencedColumnName ="id")
    private List<Player> players;
    @ManyToMany
    @JoinColumn(name = "bingocard_id", referencedColumnName ="id")
    private List<BingoCard> cards;

    private List<Integer> drawNumbers;
    
    private String winner;

    public BingoDraw() {
        this.players = new ArrayList<Player>();
        this.cards = new ArrayList<BingoCard>();
        this.drawNumbers = new ArrayList<Integer>();
        this.winner = "";
    }

    public void addNewPlayer(String name){
        if(this.players.size()< 4){
            
        }
    }
    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }
    public void setCards(ArrayList<BingoCard> cards) {
        this.cards = cards;
    }
    public void setDrawNumbers(ArrayList<Integer> drawNumbers) {
        this.drawNumbers = drawNumbers;
    }
    public void setWinner(String winner) {
        this.winner = winner;
    }
    public List<Player> getPlayers() {
        return this.players;
    }
    public List<BingoCard> getCards() {
        return cards;
    }
    public List<Integer> getDrawNumbers() {
        return drawNumbers;
    }
    public String getWinner() {
        return winner;
    }
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        BingoDraw bingoDraw = (BingoDraw) object;
        return java.util.Objects.equals(id, bingoDraw.id);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


}
