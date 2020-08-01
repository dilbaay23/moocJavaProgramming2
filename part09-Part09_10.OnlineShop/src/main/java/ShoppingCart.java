
import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {

    private Map<String, Item> list;

    public ShoppingCart() {
        this.list = new HashMap< String, Item>();;
    }

    public void add(String product, int price) {
      
        if (!list.containsKey(product)){
            Item item = new Item(product, 1, price);
            list.put(product, item);
                 
        }else{
           list.get(product).increaseQuantity();
        }
            
       
    }

    public int price() {
        int totalSum = 0;
        for (Item item : list.values()) {
            totalSum += item.price();

        }
        return totalSum;

    }
    public void print(){
       for (Item item : list.values()) {
            //System.out.println(item.getProduct() + ": " + item.getQty());
            System.out.println(item.toString());
       } 
    }

}
