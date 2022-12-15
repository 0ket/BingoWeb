package play.bingo.game.model;

import jakarta.persistence.*;

@Entity
public class Player {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    @OneToOne
    @JoinColumn(name = "BingoCard_id", referencedColumnName = "id")
    private BingoCard bingoCard;
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
    
}
