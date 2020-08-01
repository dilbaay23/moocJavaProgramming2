
public class OneItemBox extends Box {

    private int capacity;
    private Item item;

    public OneItemBox() {

    }

    public void add(Item item) {
        if (this.item==(null)) {
            this.item = item;
        }
    }

    public boolean isInBox(Item item) {
        if (this.item==(null)) {
            return false;
        }
        if (this.item.equals(item)) {
            return true;

        }
        return false;
    }
    
}
