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

            if (!file.exists()) {
                PrintWriter pw = new PrintWriter(file);


                pw.println("------------------------------------------------------------------------------------");
                pw.println("\nName: " + Input.getName());
                pw.println("\nAge: " + Input.getAge());
                pw.println("\nPassword: " + Input.getPassword());
                pw.println("\nYear group: " + Input.getYearGroup());
                pw.println("\nUsername: " + Input.getUsername());
                pw.println("\nSubject: " + Input.getSubject());
                pw.println("\nDifficulty: " + Input.getDifficultry());
                pw.println("\nScore: " + MainQuiz.getScore());
                pw.println("\nPercentage: " + PercentageGenerator.getPercentage());
                pw.println("\nGrade: " + GradeGenerator.getGrade());
                pw.println("\n------------------------------------------------------------------------------------");
                pw.println("\n");
                pw.println("\n");
                pw.println("\n");
                pw.println("\n");

                pw.close();

                JOptionPane.showMessageDialog(null, "File has been saved as " + filename());
            }
            else if (file.exists()) {
                PrintWriter pw = new PrintWriter(new FileOutputStream(new File(filepath()), true));

                pw.println("------------------------------------------------------------------------------------");
                pw.println("\nName: " + Input.getName());
                pw.println("\nAge: " + Input.getAge());
                pw.println("\nPassword: " + Input.getPassword());
                pw.println("\nYear group: " + Input.getYearGroup());
                pw.println("\nUsername: " + Input.getUsername());
                pw.println("\nSubject: " + Input.getSubject());
                pw.println("\nDifficulty: " + Input.getDifficultry());
                pw.println("\nScore: " + MainQuiz.getScore());
                pw.println("\nPercentage: " + PercentageGenerator.getPercentage());
                pw.println("\nGrade: " + GradeGenerator.getGrade());
                pw.println("\n------------------------------------------------------------------------------------");
                pw.println("\n");
                pw.println("\n");
                pw.println("\n");
                pw.println("\n");

                pw.close();

                JOptionPane.showMessageDialog(null, "Data has been saved");
            }
    }


    private static String filename() {

        return username + ".txt";
    }

    public static String filepath() {

        return "Users/" + username+".txt";
    }




}


