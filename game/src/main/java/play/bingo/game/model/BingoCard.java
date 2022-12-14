package play.bingo.game.model;

import java.util.*;

import jakarta.persistence.*;

@Entity
public class BingoCard {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private List<Integer> numbers;

    @OneToOne
    @JoinColumn(name = "player_id", referencedColumnName = "id")
    private Player player;

    public BingoCard(Player player) {

        this.numbers = new ArrayList<Integer>();
        this.player = player;
        startCard();
    }


    //inicia cartela
    public void startCard(){

        Random random = new Random();
        int n;
        while(numbers.size() < 24)
        {    
            n = random.nextInt((75 - 1) + 1) + 1;
            if(!numbers.contains(n)){
                numbers.add(n);
            }
        }
        
    }

    //verify victory
    public boolean victory(){
        for(int i = 0; i <numbers.size(); i++)
        {
            if(numbers.get(i) < 0){
                return false;
            }
        }
        return true;
    }
    //se foi sorteado marca como negativo
    public void drawNumber(int n){
        if(numbers.contains(n)){
            int index = numbers.indexOf(n);
            numbers.set(index, numbers.get(index) * -1); 
        }
    }


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public List<Integer> getNumbers() {
        return numbers;
    }


    public void setNumbers(List<Integer> numbers) {
        this.numbers = numbers;
    }
}
