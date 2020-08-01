
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        double count = 0;
        while (true) {

            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                break;
            } else if (number > 0) {
                sum += number;
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(sum / count);
        }

    }
}
