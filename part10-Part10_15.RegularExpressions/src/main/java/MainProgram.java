
import java.util.Scanner;



public class MainProgram {

    public static void main(String[] args) {
       Scanner scanner =new Scanner(System.in);
        System.out.print("Enter a string: ");
        String day=scanner.nextLine();
        Checker check=new Checker();
        if(check.isDayOfWeek(day)){
            System.out.println("The form is correct.");
        }else{
            System.out.println("The form is incorrect.");
        }
       if(check.allVowels(day)){
            System.out.println("The form is correct.");
        }else{
            System.out.println("The form is incorrect.");
       }
       if(check.timeOfDay(day)){
            System.out.println("The form is correct.");
        }else{
            System.out.println("The form is incorrect.");
       }
       
    }
}
