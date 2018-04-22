package Quiz;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class ComputerScience extends QuestionInterface{

    public static int score;

    @Override
    void Q1() {
        System.out.println("Q1 - What is a compiler? \n" +
                "\n" +
                "a) A programming language.\n" +
                "b) A program that converts high level code into machine code.\n" +
                "c) A piece of hardware.");
    }

    @Override
    void Q2() {
        System.out.println("Q2 - Which of the following is a low-level programming language?\n" +
                "\n" +
                "a) Java.\n" +
                "b) Kotlin.\n" +
                "c) Assembly.");
    }

    @Override
    void Q3() {
        System.out.println("Q3 - What is 10010001 as a decimal?\n" +
                "\n" +
                "a) 145.\n" +
                "b) 98.\n" +
                "c) 146.");
    }

    @Override
    void Q4() {
        System.out.println("Q4 - Which protocol is used for terminals within a network.\n" +
                "\n" +
                "a) TCP.\n" +
                "b) UDP\n" +
                "c) Telnet.");
    }

    @Override
    void A1() {
        System.out.println("Answer: B");
    }

    @Override
    void A2() {
        System.out.println("Answer: C");
    }

    @Override
    void A3() {
        System.out.println("Answer: A");
    }

    @Override
    void A4() {
        System.out.println("Answer: C");
    }


    @Override
    public void Easy() {

        boolean validation = true;

        String input;

        do {
            try {
                Scanner in = new Scanner(System.in);

                Q1();

                input = in.next();

                if (input.equalsIgnoreCase("a")) {
                    incorrect();
                    A1();
                    break;

                } else if (input.equalsIgnoreCase("b")) {
                    correct();
                    break;
                } else if (input.equalsIgnoreCase("c")) {
                    incorrect();
                    A1();
                    break;
                } else {
                    elsedo();
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

                Q2();

                input = in2.next();

                if (input.equalsIgnoreCase("a")) {
                    incorrect();
                    A2();
                    break;
                }
                else if (input.equalsIgnoreCase("b")) {
                    incorrect();
                    A2();
                    break;
                }
                else if (input.equalsIgnoreCase("c")) {
                    correct();
                    break;
                }
                else {
                    elsedo();
                    validation = true;
                }

            } catch (Exception e) {
                elsedo();
                validation = true;

            }
        } while (validation = true);



    }

    @Override
    public void Medium() {

        boolean validation = true;

        String input;

        do {
            try {
                Scanner in = new Scanner(System.in);

                Q1();

                input = in.next();

                if (input.equalsIgnoreCase("a")) {
                    incorrect();
                    A1();
                    break;

                } else if (input.equalsIgnoreCase("b")) {
                    correct();
                    break;
                } else if (input.equalsIgnoreCase("c")) {
                    incorrect();
                    A1();
                    break;
                } else {
                    elsedo();
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

                Q2();

                input = in2.next();

                if (input.equalsIgnoreCase("a")) {
                    incorrect();
                    A2();
                    break;
                }
                else if (input.equalsIgnoreCase("b")) {
                    incorrect();
                    A2();
                    break;
                }
                else if (input.equalsIgnoreCase("c")) {
                    correct();
                    break;
                }
                else {
                    elsedo();
                    validation = true;
                }

            } catch (Exception e) {
                elsedo();
                validation = true;

            }
        } while (validation = true);

        do {
            try {
                Scanner in2 = new Scanner(System.in);

                Q3();

                input = in2.next();

                if (input.equalsIgnoreCase("a")) {
                    correct();
                    break;
                }
                else if (input.equalsIgnoreCase("b")) {
                    incorrect();
                    A3();
                    break;
                }
                else if (input.equalsIgnoreCase("c")) {
                    incorrect();
                    A3();
                    break;
                }
                else {
                    elsedo();
                    validation = true;
                }

            } catch (Exception e) {
                elsedo();
                validation = true;

            }
        } while (validation = true);

    }

    @Override
    public void Hard() {

        boolean validation = true;

        String input;

        do {
            try {
                Scanner in = new Scanner(System.in);

                Q1();

                input = in.next();

                if (input.equalsIgnoreCase("a")) {
                    incorrect();
                    A1();
                    break;

                } else if (input.equalsIgnoreCase("b")) {
                    correct();
                    break;
                } else if (input.equalsIgnoreCase("c")) {
                    incorrect();
                    A1();
                    break;
                } else {
                    elsedo();
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

                Q2();

                input = in2.next();

                if (input.equalsIgnoreCase("a")) {
                    incorrect();
                    A2();
                    break;
                }
                else if (input.equalsIgnoreCase("b")) {
                    incorrect();
                    A2();
                    break;
                }
                else if (input.equalsIgnoreCase("c")) {
                    correct();
                    break;
                }
                else {
                    elsedo();
                    validation = true;
                }

            } catch (Exception e) {
                elsedo();
                validation = true;

            }
        } while (validation = true);

        do {
            try {
                Scanner in2 = new Scanner(System.in);

                Q3();

                input = in2.next();

                if (input.equalsIgnoreCase("a")) {
                    correct();
                    break;
                }
                else if (input.equalsIgnoreCase("b")) {
                    incorrect();
                    A3();
                    break;
                }
                else if (input.equalsIgnoreCase("c")) {
                    incorrect();
                    A3();
                    break;
                }
                else {
                    elsedo();
                    validation = true;
                }

            } catch (Exception e) {
                elsedo();
                validation = true;

            }
        } while (validation = true);

        do {
            try {
                Scanner in3 = new Scanner(System.in);

                Q4();

                input = in3.next();

                if (input.equalsIgnoreCase("a")) {
                    incorrect();
                    A4();
                    break;
                }
                else if (input.equalsIgnoreCase("b")) {
                    incorrect();
                    A4();
                    break;
                }
                else if (input.equalsIgnoreCase("c")) {
                    correct();
                    break;
                }
                else {
                    elsedo();
                    validation = true;
                }

            } catch (Exception e) {
                elsedo();
                validation = true;

            }
        } while (validation = true);
    }

    protected static void correct() {
        System.out.println("Correct!");
        score++;
    }

    public static int getScore() {
        return score;
    }



}

