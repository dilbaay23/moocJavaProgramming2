
import java.util.ArrayList;


public class TodoList {
private ArrayList<String> toDoList =new ArrayList<>();

    public TodoList() {
    }
    public void add(String task){
        toDoList.add(task);
    }
    
    public void print(){
      for (int i = 1; i <= toDoList.size(); i++) {
            System.out.println(i+": "+ toDoList.get(i-1));
        }  
    }
    public void remove(int number){
        toDoList.remove(number-1);
        
    }
}
