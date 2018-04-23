package Main;

import Quiz.ComputerScience;
import Quiz.History;
import Quiz.MainQuiz;
import java.util.*;

/*
- As of now (writing the code), I don't have a lot of experience with file writing and reading, which is why my folder
 organization method is a mess.

- I actually took the time to write all the questions and answers (computer science questions fully written by me (as in
I didn't use Google to clarify anything..

- If this coursework didn't get leaked and actually counted, I would've made this program a lot more better by building
a graphical user interface, and actually cleaning up the code..*/



public class Main {

    public static String choice;

    public static void main(String[] args) throws Exception {

        boolean validation = true;

        do {
            try {
                int t;
                Scanner in = new Scanner(System.in);
                System.out.println("1) Start\n\n2) Exit");
                t = in.nextInt();

                if (t == 1) {
                    Input.Registration1();
                    Input.Registration2();
                    Input.Subject();
                    Input.Difficulty();

                    MainQuiz.Quiz();

                } else if (t == 2) {
                    System.out.println("Exiting..");
                    System.exit(0);
                } else {
                    System.out.println("Please enter 1 or 2");
                    validation = true;
                }


            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        while (validation == true);


    }


}

