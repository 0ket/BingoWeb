package play.bingo.game.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity 
public class BingoCard {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private List<Integer> numbers;

    public BingoCard() {

        this.numbers = new ArrayList<Integer>();
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

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        BingoCard bingoCard = (BingoCard) object;
        return java.util.Objects.equals(id, bingoCard.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id);
    }
}
