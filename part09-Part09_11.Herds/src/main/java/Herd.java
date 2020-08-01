
import java.util.ArrayList;

public class Herd implements Movable {

    private ArrayList<Movable> list;

    public Herd() {
        list = new ArrayList<>();
    }

    public void addToHerd(Movable movable) {
        list.add(movable);
    }

    public String toString() {
        /*for (int i = 0; i < list.size(); i++) {
          return  list.get(i).toString(); 
        }*/
        
         String sum="";
        for(Movable sss:list){
            sum=sum+sss+"\n";           
        }
        return sum;
    

    }

    public void move(int dx, int dy) {
        if (!list.isEmpty()) {
            for (Movable movable : list) {
                movable.move(dx, dy);
            }
        }

    }
}
