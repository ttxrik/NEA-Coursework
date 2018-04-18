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

    // Yes, there's a lot of duplication.. I'm still learning Java btw.. At the end of the day, it works!

    public static int score;


    public static void Easy() throws IOException {

        boolean validation = true;

        File q1txt = new File("src/Quiz/Questions/Easy/Computer Science/Q1.txt");
        File q2txt = new File("src/Quiz/Questions/Easy/Computer Science/Q2.txt");

        Scanner q1 = new Scanner(q1txt);
        Scanner q2 = new Scanner(q2txt);

        String input;

        do {
            try {
                Scanner in = new Scanner(System.in);

                while (q1.hasNextLine()) {
                    System.out.println(q1);
                }

                input = in.next();

                if (input.equalsIgnoreCase("a")) {
                    incorrect();
                    validation = false;

                } else if (input.equalsIgnoreCase("b")) {
                    correct();
                    validation = false;
                } else if (input.equalsIgnoreCase("c")) {
                    incorrect();
                    validation = false;
                } else {
                    System.out.println("Please enter either a, b or c");
                    validation = true;
                }

            } catch (Exception e) {
                elsedo();
                validation = true;
            }

        } while (validation == true);


        do {
            try {
                Scanner in2 = new Scanner(System.in);

                while (q2.hasNextLine()) {
                    System.out.println(q2);
                }

                input = in2.next();

                if (input.equalsIgnoreCase("a")) {
                    incorrect();
                    validation = false;
                }
                else if (input.equalsIgnoreCase("b")) {
                    incorrect();
                    validation = false;
                }
                else if (input.equalsIgnoreCase("c")) {
                    correct();
                    validation = false;
                }
                else {
                    incorrect();
                    validation = true;
                }

            } catch (Exception e) {
                incorrect();
                validation = true;

            }
        } while (validation = true);
    }

    public static void Medium() throws IOException{

        boolean validation = true;

        File q1txt = new File("src/Quiz/Questions/Easy/Computer Science/Q1.txt");
        File q2txt = new File("src/Quiz/Questions/Easy/Computer Science/Q2.txt");
        File q3txt = new File("src/Quiz/Questions/Easy/Computer Science/Q3.txt");

        Scanner q1 = new Scanner(q1txt);
        Scanner q2 = new Scanner(q2txt);
        Scanner q3 = new Scanner(q3txt);

        String input;

        do {
            try {
                Scanner in = new Scanner(System.in);

                while (q1.hasNextLine()) {
                    System.out.println(q1);
                }

                input = in.next();

                if (input.equalsIgnoreCase("a")) {
                    incorrect();
                    validation = false;

                } else if (input.equalsIgnoreCase("b")) {
                    correct();
                    validation = false;
                } else if (input.equalsIgnoreCase("c")) {
                    incorrect();
                    validation = false;
                } else {
                    System.out.println("Please enter either a, b or c");
                    validation = true;
                }

            } catch (Exception e) {
                elsedo();
                validation = true;
            }

        } while (validation == true);


        do {
            try {
                Scanner in2 = new Scanner(System.in);

                while (q2.hasNextLine()) {
                    System.out.println(q2);
                }

                input = in2.next();

                if (input.equalsIgnoreCase("a")) {
                    incorrect();
                    validation = false;
                }
                else if (input.equalsIgnoreCase("b")) {
                    incorrect();
                    validation = false;
                }
                else if (input.equalsIgnoreCase("c")) {
                    correct();
                    validation = false;
                }
                else {
                    incorrect();
                    validation = true;
                }

            } catch (Exception e) {
                incorrect();
                validation = true;

            }
        } while (validation = true);

        do {
            try {
                Scanner in3 = new Scanner(System.in);

                while (q2.hasNextLine()) {
                    System.out.println(q2);
                }

                input = in3.next();

                if (input.equalsIgnoreCase("a")) {
                    correct();
                    validation = false;
                }
                else if (input.equalsIgnoreCase("b")) {
                    incorrect();
                    validation = false;
                }
                else if (input.equalsIgnoreCase("c")) {
                    incorrect();
                    validation = false;
                }
                else {
                    incorrect();
                    validation = true;
                }

            } catch (Exception e) {
                incorrect();
                validation = true;

            }
        } while (validation = true);

    }

    public static void Hard() throws IOException {

        boolean validation = true;

        File q1txt = new File("src/Quiz/Questions/Easy/Computer Science/Q1.txt");
        File q2txt = new File("src/Quiz/Questions/Easy/Computer Science/Q2.txt");
        File q3txt = new File("src/Quiz/Questions/Easy/Computer Science/Q3.txt");
        File q4txt = new File("src/Quiz/Questions/Easy/Computer Science/Q4.txt");

        Scanner q1 = new Scanner(q1txt);
        Scanner q2 = new Scanner(q2txt);
        Scanner q3 = new Scanner(q3txt);
        Scanner q4 = new Scanner(q4txt);

        String input;

        do {
            try {
                Scanner in = new Scanner(System.in);

                while (q1.hasNextLine()) {
                    System.out.println(q1);
                }

                input = in.next();

                if (input.equalsIgnoreCase("a")) {
                    incorrect();
                    validation = false;

                } else if (input.equalsIgnoreCase("b")) {
                    correct();
                    validation = false;
                } else if (input.equalsIgnoreCase("c")) {
                    incorrect();
                    validation = false;
                } else {
                    System.out.println("Please enter either a, b or c");
                    validation = true;
                }

            } catch (Exception e) {
                elsedo();
                validation = true;
            }

        } while (validation == true);


        do {
            try {
                Scanner in2 = new Scanner(System.in);

                while (q2.hasNextLine()) {
                    System.out.println(q2);
                }

                input = in2.next();

                if (input.equalsIgnoreCase("a")) {
                    incorrect();
                    validation = false;
                }
                else if (input.equalsIgnoreCase("b")) {
                    incorrect();
                    validation = false;
                }
                else if (input.equalsIgnoreCase("c")) {
                    correct();
                    validation = false;
                }
                else {
                    incorrect();
                    validation = true;
                }

            } catch (Exception e) {
                incorrect();
                validation = true;

            }
        } while (validation = true);

        do {
            try {
                Scanner in3 = new Scanner(System.in);

                while (q2.hasNextLine()) {
                    System.out.println(q2);
                }

                input = in3.next();

                if (input.equalsIgnoreCase("a")) {
                    correct();
                    validation = false;
                }
                else if (input.equalsIgnoreCase("b")) {
                    incorrect();
                    validation = false;
                }
                else if (input.equalsIgnoreCase("c")) {
                    incorrect();
                    validation = false;
                }
                else {
                    incorrect();
                    validation = true;
                }

            } catch (Exception e) {
                incorrect();
                validation = true;

            }
        } while (validation = true);

        do {
            try {
                Scanner in3 = new Scanner(System.in);

                while (q2.hasNextLine()) {
                    System.out.println(q2);
                }

                input = in3.next();

                if (input.equalsIgnoreCase("a")) {
                    incorrect();
                    validation = false;
                }
                else if (input.equalsIgnoreCase("b")) {
                    incorrect();
                    validation = false;
                }
                else if (input.equalsIgnoreCase("c")) {
                    correct();
                    validation = false;
                }
                else {
                    incorrect();
                    validation = true;
                }

            } catch (Exception e) {
                incorrect();
                validation = true;

            }
        } while (validation = true);



    }

    protected static void correct() {
        System.out.println("Correct!");
        score++;
    }

    protected static void incorrect() {
        System.out.println("Incorrect!");
    }

    protected static void elsedo() {
        System.out.println("Please enter a, b or c");
    }

    public int getScore() {
        return score;
    }



}

