package play.bingo.game.model;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Player{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    
    @OneToOne
    @JoinColumn(name = "BingoCard_id", referencedColumnName = "id")
    private BingoCard bingoCard;
    
    public Player() {
    }
    public Player(String name) {
        this.name = name;
        this.bingoCard = new BingoCard();
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public BingoCard getBingoCard() {
        return bingoCard;
    }
    public void setBingoCard(BingoCard bingoCard) {
        this.bingoCard = bingoCard;
    }
    @Override 
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Player player = (Player) object;
        return java.util.Objects.equals(id, player.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id);
    }
}
