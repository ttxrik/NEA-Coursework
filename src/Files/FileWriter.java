package Files;

import Generators.GradeGenerator;
import Generators.PercentageGenerator;
import Main.Input;
import Quiz.MainQuiz;

import javax.swing.*;
import java.io.*;
import java.util.Formatter;
import java.util.Scanner;

public class FileWriter {

    static String username = Input.getUsername();

    public static void filewriter() throws Exception{

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

    private static void fileWriteOperation() throws Exception{

        boolean validation = true;

        File file = new File(filepath());
        PrintWriter pw = new PrintWriter(file);

            if (!file.exists() || !file.isFile()) {

                pw.println("------------------------------------------------------------------------------------");
                pw.println("Name: " + Input.getName());
                pw.println("Age: " + Input.getAge());
                pw.println("Password: " + Input.getPassword());
                pw.println("Year group: " + Input.getYearGroup());
                pw.println("Username: " + Input.getUsername());
                pw.println("Subject: " + Input.getSubject());
                pw.println("Difficulty: " + Input.getDifficultry());
                pw.println("Score: " + MainQuiz.getScore());
                pw.println("Percentage: " + PercentageGenerator.getPercentage());
                pw.println("Grade: " + GradeGenerator.getGrade());
                pw.println("------------------------------------------------------------------------------------");
                pw.println("\n");
                pw.println("\n");
                pw.println("\n");
                pw.println("\n");

                pw.close();

                JOptionPane.showMessageDialog(null, "File has been saved as " + filename());
            }
            else if (file.exists()) {
                System.out.println("Works!");

                // append operation..

                JOptionPane.showMessageDialog(null, "Data appended!");
            }




    }


    private static String filename() {

        return username + ".txt";
    }

    public static String filepath() {

        return "Users/" + username+".txt";
    }




}


