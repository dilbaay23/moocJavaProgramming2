public class Container {

    private int capacity;
    private final int maxCapacity = 100;

    public Container() {
    }

    public int contains() {
        return capacity;
    }
    

    public void add(int addCapacity) {
        if (addCapacity < 0) {
            this.capacity = this.capacity;
        } else if (this.capacity + addCapacity >= maxCapacity) {
            this.capacity = maxCapacity;
        } else {
            this.capacity += addCapacity;
        }
    }
    public void move(int moveCapacity) {
        if (moveCapacity < 0) {
            this.capacity = this.capacity;
        } else if (this.capacity < moveCapacity ) {
            this.capacity = 0;
        } else {
            this.capacity -= moveCapacity;
        }
    }
    public void remove(int removeCapacity) {
        if (removeCapacity < 0) {
            this.capacity = this.capacity;
        } else if (this.capacity < removeCapacity ) {
            this.capacity = 0;
        } else {
            this.capacity -= removeCapacity;
        }
    }
    public String toString(){
        return this.capacity + "/" + maxCapacity;
    }

}
