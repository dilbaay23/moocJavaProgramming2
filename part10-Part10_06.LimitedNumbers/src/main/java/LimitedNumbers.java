
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        
        while(true){
            int num=scanner.nextInt();
            if(num<0){
                break;
            }
            list.add(num);
            list.stream()
                    .filter(value-> value>0 && value<6)
                    .forEach(value -> System.out.println(value) );

    }
    }
}
