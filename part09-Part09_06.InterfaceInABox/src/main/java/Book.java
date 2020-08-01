
public class Book implements Packable {

    private String author;
    private String name;
    private double weight;

    public Book(String author, String name, double weight) {
        this.author = author;
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return this.author+": "+this.name; //To change body of generated methods, choose Tools | Templates.
    }

    public double weight() {
        return weight;
    }
    
    
    

   
    

}
