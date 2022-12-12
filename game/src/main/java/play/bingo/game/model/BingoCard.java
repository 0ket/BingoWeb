package play.bingo.game.model;

import java.util.*;

import jakarta.persistence.*;

@Entity
public class BingoCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    List<Number> numbers = new ArrayList<Number>();

    private int scoredNumbers;

    void scoreNumber(int number){

    }

    //inicia cartela
    public void startCard(){

    }

    //verify victory
    public boolean victory(){
        return false;
    }
}
