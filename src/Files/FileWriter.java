package Files;

import Main.Input;
import Quiz.MainQuiz;

import javax.swing.*;
import java.io.*;
import java.util.Formatter;
import java.util.Scanner;

public class FileWriter {

    static String username = Input.getUsername();

    public static void filewriter() {

            boolean validation = true;

            System.out.println("Would you like to store your data in the /Users folder?\n[Y/N]");

            do {
                String choice;
                Scanner in = new Scanner(System.in);
                choice = in.nextLine();

                if (choice.equalsIgnoreCase("y") || choice.equalsIgnoreCase("yes")) {
                    fileWriteOperation();
                    validation = false;
                }
                else if (choice.equalsIgnoreCase("n") || choice.equalsIgnoreCase("no")) {
                    System.out.println("Okay..");
                    break;
                }
                else {
                    System.out.println("Enter y or n");
                }


            }while(validation == true);

    }

    private static void fileWriteOperation() {

        boolean validation = true;

        try {
            if (fileVerification() == false) {
                Formatter f = new Formatter(filepath());
                JOptionPane.showMessageDialog(null, "File has been saved as " + filename());
            }
            else {
                // append method..
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    private static String filename() {

        return username + ".txt";
    }

    private static String filepath() {

        return "Users/" + username;
    }

    static boolean fileVerification() {

        File file = new File(filename());

        if (file.exists() || file.isFile()) {
            return true;
        }

        else {
            return false;
        }
    }





}


