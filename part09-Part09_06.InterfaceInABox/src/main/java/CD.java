
public class CD implements Packable{
    private String artist ;
    private String name;
    private int year; 
    private final double weight=0.1;

    public CD(String artist, String name, int year) {
        this.artist = artist;
        this.name = name;
        this.year = year;
    }
    @Override
    public String toString() {
        return artist+": "+name+" ("+year+")"; //To change body of generated methods, choose Tools | Templates.
    }
     public double weight() {
        return weight;
    }
}
