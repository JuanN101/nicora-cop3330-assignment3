package ex41;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Juan Nicora
 */

/*
Exercise 41 - Name Sorter
Alphabetizing the contents of a file, or sorting its contents, is a great way to get comfortable manipulating a file in your program.

Create a program that reads in the following list of names from a file called `exercise41_input.txt` and sorts the list alphabetically:

Ling, Mai
Johnson, Jim
Zarnecki, Sabrina
Jones, Chris
Jones, Aaron
Swift, Geoffrey
Xiong, Fong
Then print the sorted list to a file called `exercise41_output.txt` that looks like the following example output.

Example Output
Total of 7 names
-----------------
Johnson, Jim
Jones, Aaron
Jones, Chris
Ling, Mai
Swift, Geoffrey
Xiong, Fong
Zarnecki, Sabrina

Constraint
Don't hard-code the number of names.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class App {
    /*Pseudo code:
    Scan for the inputs on the input file given
    Pass the information to a function that will sort the last names appropriately by alphabetical order
        If the same last name is given, check for first names
    Lastly, print out the names in the correct order on the output file
    */

    public static void main(String[] args) throws IOException {
        Scanner inputFile = new Scanner(new File("D:\\Felipe\\English\\UCF\\COP3330\\nicora-cop3330-assignment3\\src\\main\\java\\ex41\\exercise41_input.txt"));
        ArrayList<String> names = new ArrayList<String>();

        NameScanner nameSorter = new NameScanner();
        nameSorter.readNames(inputFile, names);

        Collections.sort(names, String.CASE_INSENSITIVE_ORDER);
        inputFile.close();

        PrintNames.outputNames(names);

    }

}
