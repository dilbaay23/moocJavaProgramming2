
package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Moon
 */
public class AverageSensor implements Sensor {

   // private boolean on;
    private ArrayList<Sensor> list;
    private ArrayList<Integer> readingList=new ArrayList<>();
 

    public AverageSensor() {
        this.list = new ArrayList<>();
       
    }
    
    @Override
    public boolean isOn() {
        for (Sensor sensor : list) {
           if(sensor.isOn()==false) {
               return false;
           }
            
        }
       return true;
    }

    @Override
    public void setOn() {
        for (Sensor sensor : list) {
           sensor.setOn();
           }
            
    }
    

    @Override
    public void setOff() {
        for (int i = 0; i < list.size(); i++) {
            list.get(i).setOff();
        }
        //list.get(0).setOff();

    }

    @Override
    public int read() {
        int sum=0;
        int avg=0;
       
       if(list.size()>0 && (isOn()==true)){
           for (Sensor sensor : list) {
               sum+= sensor.read();
           }
           avg=sum/list.size();
           readingList.add(avg);
       }else{
          
         throw new IllegalStateException("error");
        }
       return avg;
    }
    
    public void addSensor(Sensor toAdd){
        list.add(toAdd);
        
    }
    public List<Integer> readings(){
     
        return readingList;
    }

    

}
