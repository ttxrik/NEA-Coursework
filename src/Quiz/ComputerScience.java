package Quiz;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class ComputerScience extends MainQuiz {

    /* public static Scanner ReadFile() throws IOException {

        File temp = new File("src/Quiz/Questions/Computer Science.txt");
        Scanner file = new Scanner(temp);
        
        return file;


    } // Tried, doesn't work */

    public static int score;


    public static void Easy() throws IOException {

        boolean validation = true;

        File q1txt = new File("src/Quiz/Questions/Easy/Computer Science/Q1.txt");
        File q2txt = new File("src/Quiz/Questions/Easy/Computer Science/Q2.txt");

        Scanner q1 = new Scanner(q1txt);
        String input;

        do {
            Scanner in = new Scanner(System.in);

            while (q1.hasNext()) {
                System.out.println(q1);
            }

            input = in.next();

            if (input.equalsIgnoreCase("a")) {

            }

        } while (validation == true);
    }

    public static void Medium() {



    }

    public static void Hard() {

    }



}

