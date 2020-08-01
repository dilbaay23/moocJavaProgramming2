
import java.util.Comparator;


public class BySuitInValueOrder implements Comparator<Card>{

    public BySuitInValueOrder() {
    }
    @Override
     public int compare(Card c1, Card c2) {
        if( c1.getSuit().ordinal() - c2.getSuit().ordinal() ==0){
            return c1.compareTo(c2);
        }
        return c1.getSuit().ordinal() - c2.getSuit().ordinal() ;
    }
    
    
}

