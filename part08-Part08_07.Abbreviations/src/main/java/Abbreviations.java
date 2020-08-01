
import java.util.HashMap;


public class Abbreviations {
    
public HashMap<String,String> list;

    public Abbreviations() {
        this.list=new HashMap<>();
    }
    public void addAbbreviation(String abbreviation, String explanation){
        list.put(abbreviation, explanation);
       
    }
    public boolean hasAbbreviation(String abbreviation){
        if(list.containsKey(abbreviation)){
            return true;
        }
        return false;
    }
    public String findExplanationFor(String abbreviation){
       
        if(hasAbbreviation(abbreviation)){
             return  list.get(abbreviation);
        }else
        return null;
        
    }
    public HashMap<String,String> getList(){
        return list;
    }
}
