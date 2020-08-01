
import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {

 private HashMap <String,ArrayList> map ;
    private ArrayList <String> list;

 

    public DictionaryOfManyTranslations() {
        this.map= new HashMap<>();
        this.list= new ArrayList<>();
    }
   
     
    
    public void add(String word, String translation){
        
        if(map.containsKey(word)){
            map.get(word).add(translation);
        }else{
            map.put(word, new ArrayList<>());
            map.get(word).add(translation);
        }
    }
    
    public ArrayList<String> translate(String word){
        
        
       if(map.containsKey(word)){
           return map.get(word);
       }else{
           return new ArrayList<>();
       } 
        
    }
    
    public void remove(String word){
      map.remove(word);
    }
    
    
}
 