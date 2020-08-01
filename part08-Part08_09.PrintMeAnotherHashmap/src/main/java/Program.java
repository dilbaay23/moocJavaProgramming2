
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
    }
    public static void printValues(HashMap<String,Book> hashmap){
        for (String keyBook : hashmap.keySet()) {
            System.out.println(hashmap.get(keyBook));
        }
    }
    public static void printValueIfNameContains(HashMap<String,Book> hashmap, String text){
        for (String keyBook : hashmap.keySet()) {
            if((hashmap.get(keyBook).getName()).contains(text)){
                System.out.println(hashmap.get(keyBook));
            }
        }
    }

}
