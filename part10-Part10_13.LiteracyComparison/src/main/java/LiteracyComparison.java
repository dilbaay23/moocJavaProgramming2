
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LiteracyComparison {

    public static void main(String[] args) {
       try {
            Files.lines(Paths.get("literacy.csv"))
                    .map(s -> s.replace(" (%)", ""))
                   
                    
                    .map(row -> row.split(","))                  
                    .filter(parts -> parts.length == 6)                
                    .sorted( (i1, i2) -> i1[5].compareTo(i2[5]) )
                 //   .limit(5)
                   
                    .forEach(list -> System.out.println(list[3].trim()+" ("+list[4].trim()+"), "+list[2].trim()+", "+list[5].trim()));

            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

}
