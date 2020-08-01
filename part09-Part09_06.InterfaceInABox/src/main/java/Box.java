
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Box implements Packable{
    private ArrayList<Packable> list;
    private double capacity;
    //private double weight;

    public Box(double capacity) {
        this.capacity = capacity;
        list=new ArrayList<>();
    }
    public void add(Packable packable){
        if(this.capacity>=weight()+packable.weight()){
            list.add(packable);
        }
    }
                    
    public double weight() {
        double sumWeight=0;
        for (Packable packable : list) {
            sumWeight+=packable.weight();
            
        }
        return sumWeight;
    }

    @Override
    public String toString() {
        return "Box: "+list.size()+" items, total weight "+weight()+" kg"; //To change body of generated methods, choose Tools | Templates.
    }
    
        
    
}
