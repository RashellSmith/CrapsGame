import javafx.util.Pair;

public class Dice{


    private int d1;
    private int d2;


    public Dice(){
        roll();
    }

    public void roll(){
        d1= (int)(Math.random()*6)+1;
        d2 = (int)(Math.random()*6)+1;

    }

    public int getD1(){
        return d1;
    }

    public int getD2() {
      return d2;
    }
    public int getTotal(){
        return d1 + d2;
    }


   /* public Pair<Integer, Integer> setRoll(Pair<Integer,Integer> num){
        this.getRoll =
        new Pair<Integer,Integer>(d1,d2);
        this.
    }*/


    }


