
import java.util.ArrayList;

public class ProductWarehouse extends Warehouse {

    private String productName;
   // private ArrayList<Double> list;

    public ProductWarehouse(String productName, double capacity) {
        super(capacity);
        this.productName = productName;
       // this.list=new ArrayList<>();
    }

    public String getName() {
        return productName;
    }

    public void setName(String newName) {
        this.productName = newName;
    }

    public String toString() {
        return productName + ": " + super.toString();
    }
}
