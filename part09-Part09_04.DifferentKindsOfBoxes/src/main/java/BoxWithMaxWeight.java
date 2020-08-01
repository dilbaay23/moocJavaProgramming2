
import java.util.ArrayList;


public class BoxWithMaxWeight extends Box{
    private int capacity;
    private ArrayList<Item> list;

    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.list=new ArrayList<>();
    }
    
    @Override
     public void add(Item item){
         int sumWeight=0;
         for (Item item1 : list) {
             sumWeight += item1.getWeight();
            
        }
         if(item.getWeight()<=this.capacity-sumWeight){
             list.add(item);
             
         }
     }
     
     public boolean isInBox(Item item){
         for (Item item1 : list) {
             if(item1.equals(item)){
                 return true;
             }
            
        }
         return false;
     }
}
