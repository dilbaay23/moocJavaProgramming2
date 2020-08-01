
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {

    private Map<String, Integer> listPrice;
    private Map<String, Integer> listStock;

    public Warehouse() {
        listPrice = new HashMap< String, Integer>();
        listStock = new HashMap< String, Integer>();
    }

    public void addProduct(String product, int price, int stock) {

        listPrice.putIfAbsent(product, price);
        listStock.putIfAbsent(product, stock);
    }

    public int price(String product) {

        return listPrice.getOrDefault(product, -99);
    }

    public int stock(String product) {
        return listStock.getOrDefault(product, 0);
    }

    public boolean take(String product) {
        
        if (listStock.containsKey(product)) {
            int stock = listStock.get(product);
            if (stock > 0) {
                stock--;
                listStock.replace(product, stock);

                return true;
            }
            else return false;
        }
        return false;
    }

    public Set<String> products() {
        return listPrice.keySet();
    }

    //, which adds a product to the warehouse with the price and stock balance given as parameters. 
}
