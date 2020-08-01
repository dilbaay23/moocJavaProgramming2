
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Hand implements Comparable<Hand>{
    private List<Card> cards;

    public Hand() {
        this.cards = new ArrayList<>();
    }

    public void add(Card card) {
        this.cards.add(card);
    }

    public void print() {
        this.cards.stream().forEach(card -> {
            System.out.println(card);
        });
    }
    public void sort(){
        this.cards.stream()
                .sorted()
                .forEach(card -> {
            System.out.println(card);
        });
      // Collections.sort(cards);
    }

    @Override
    public int compareTo(Hand o) {
        
        int sum=this.cards.stream().map(s-> s.getValue()).reduce(0, (previousSum,value) -> previousSum + value);
        int sum2=o.cards.stream().map(s-> s.getValue()).reduce(0, (previousSum,value) -> previousSum + value);
        
       return sum-sum2;
    }
    public void sortBySuit(){
      Collections.sort(this.cards, new BySuitInValueOrder());
     
  }
}