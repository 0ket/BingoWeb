package play.bingo.game.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;

@Entity
public class BindoDraw {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private List<Player> players;
    private List<BingoCard> cards;
    private List<Integer> drawNumbers;
    private String winner;

    public BindoDraw() {
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
    public ArrayList<Player> getPlayers() {
        return players;
    }
    public ArrayList<BingoCard> getCards() {
        return cards;
    }
    public ArrayList<Integer> getDrawNumbers() {
        return drawNumbers;
    }
    public String getWinner() {
        return winner;
    }
    

}
