
import java.util.HashMap;


public class IOU {
private HashMap<String,Double> list ;
    public IOU() {
        this.list=new HashMap<>();
    }
    public void setSum(String toWhom, double amount){
        list.put( toWhom, amount);
    }
    public double howMuchDoIOweTo(String toWhom){
        for (String person : list.keySet()) {
            if(person.equals(toWhom)){
                return list.get(person);
            }
                
           
        }
        return 0.0;
                
    }
    
}
