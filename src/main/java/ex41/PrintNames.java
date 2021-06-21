package ex41;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class PrintNames {
    //function used to print the names after they are sorted
    public static void outputNames(ArrayList<String> names) throws IOException {
        FileWriter output = new FileWriter("D:\\Felipe\\English\\UCF\\COP3330\\nicora-cop3330-assignment3\\src\\main\\java\\ex41\\exercise41_output.txt");
        output.write("Total of " + names.size() + " names\n");
        output.write("--------------------\n");

        for (String i : names) {
            output.write(i + "\n");
        }
        output.close();
    }
}
