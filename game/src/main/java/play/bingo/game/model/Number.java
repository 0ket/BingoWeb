package play.bingo.game.model;

public class Number {

    int value;
    
    //sorteado?True:False
    boolean drawn;

    public Number() {
    }
    
    public Number(int value, boolean drawn) {
        this.value = value;
        this.drawn = drawn;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean isDrawn() {
        return drawn;
    }

    public void setDrawn(boolean drawn) {
        this.drawn = drawn;
    }
    

}
