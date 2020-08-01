
public class ProductWarehouseWithHistory extends ProductWarehouse {

    private ChangeHistory ch=new ChangeHistory();
    //private double initialBalance;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        ch.add(initialBalance);
        setBalance(initialBalance);

    }

    public String history() {
        return ch.toString();
    }

    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        ch.add(super.getBalance());
    }

    public double takeFromWarehouse(double amount) {
        double x = super.takeFromWarehouse(amount);
        ch.add(super.getBalance());
        return x;
    }

    public void printAnalysis() {
        System.out.println("Product: " + getName() + "\n"
                + "History: " + ch.toString() + "\n"
                + "Largest amount of product: " + ch.maxValue() + "\n"
                + "Smallest amount of product: " + ch.minValue() + "\n"
                + "Average: " + ch.average() + ")");
    }

}
