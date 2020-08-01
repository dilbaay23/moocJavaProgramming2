
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import java.util.Scanner;

public class MainProgram  {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> list = new ArrayList<>();

        while (true) {
            System.out.print("Input the name of the book, empty stops: ");
            String nameBook = scanner.nextLine();
            if (nameBook.equals("")) {
                break;
            }
            System.out.print("Input the age recommendation: ");
            int age = Integer.valueOf(scanner.nextLine());
            System.out.println("");

            Book book = new Book(nameBook, age);

            list.add(book);

        }
       
        Comparator<Book> comparator = Comparator
                .comparing(Book::getAge)
                .thenComparing(Book::getName);

        Collections.sort(list, comparator);
        System.out.println("\n"+list.size() + " books in total.\n\nBooks:");
        
        for (Book book : list) {
            System.out.println(book);
        }
        }  
    

}
