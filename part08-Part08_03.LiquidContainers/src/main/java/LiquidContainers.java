
import java.util.Scanner;


  

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();

        while (true) {
            System.out.println("First: " + first.toString());
            System.out.println("Second: " + second.toString());

            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");

            String part1 = parts[0];
            int part2 = Integer.valueOf(parts[1]);

            if (part1.equals("add")) {

                first.add(part2);
            }
            if (part1.equals("move")) {

                if (part2 <= first.contains()) {
                    second.add(part2);
                } else {
                    second.add(first.contains());
                }
                first.move(part2);
            }
            if (part1.equals("remove")) {

               
                second.remove(part2);
            }

        }

    }

}
