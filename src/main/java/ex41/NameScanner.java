package ex41;

import java.util.ArrayList;
import java.util.Scanner;

public class NameScanner {
    //function used to read the data from Scanner object to the ArrayList
    public static void readNames(Scanner input, ArrayList<String> names) {
        while (input.hasNextLine()) {
            names.add(input.nextLine());
        }
    }
}
