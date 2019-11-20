/**
 * Program that prompts the user to enter a file name,
 * reads the lines from the file, and replaces the line
 * numbers in the file with appropriate number of spaces
 *
 * @course CS203
 * @author Stephanie Irish Paladin
 * 200413341
 * Assignment 3
 * last modified: 11/19 11pm
 */
package Question1;

import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;


public class RemoveLineNumber {

    public static void main(String[] args) throws Exception {
        // read the file input
        Scanner inputFile = new Scanner(System.in);
        boolean file_exist = false;
        File file;

        do {
            //prompts the user to input the file path
            System.out.println("Remove Line Number Program");
            System.out.print("  Enter file path: ");
            String filename = inputFile.nextLine();

            // create file object
            file = new File(filename);
            if (file.exists()) {
                file_exist = true;
            } else {
                System.out.println("\n  Error: File not found.\n");
            }
        } while (!file_exist);

        // read the file
        // stores the string that will be written
        StringBuilder output_str = new StringBuilder("");
        try ( Scanner read = new Scanner(file);) {
            while (read.hasNext()) {
                String str = read.nextLine();
                StringBuilder str_builder = new StringBuilder(str);

                // true if line has linenumber
                if (str.matches("\\s*\\d+.*")) {
                    for (int i = 0; i < str.length(); i++) {
                        // stops the loop at the first instance of character
                        if (Character.isAlphabetic(str.charAt(i))) {
                            break;
                        }
                        // replaces the line number to space
                        if (Character.isDigit(str.charAt(i))) {
                            str_builder.setCharAt(i, ' ');
                        }
                    }
                }// end of if
                //adds endline after every concatanation of lines
                output_str.append(str_builder.append("\n"));
            }// end of while
            // removes the extra endline at the end of the stringbuilder
            output_str.deleteCharAt(output_str.length() - 1);
        }

        // write the file
        try ( PrintWriter write = new PrintWriter(file);) {
            write.print(output_str);
            System.out.println("\n  Removed line number successfully.");
        }

    }

}
