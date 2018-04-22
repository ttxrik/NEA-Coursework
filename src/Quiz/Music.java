package Quiz;

import java.util.Scanner;

public class Music extends QuestionInterface {

    public static int score;

    @Override
    void Q1() {
        System.out.println("Q1 - Who invented the piano?\n" +
                "\n" +
                "a) Adolphe Sax.\n" +
                "b) Bartolomeo Cristofori.\n" +
                "c) Federico Faggin.");
    }

    @Override
    void Q2() {
        System.out.println("Q2 - What is Beethoven's full name?\n" +
                "\n" +
                "a) Louis La Beethoveen.\n" +
                "b) Christopher Beethoveen.\n" +
                "c) Ludwig Van Beethoveen.");
    }

    @Override
    void Q3() {
        System.out.println("Q3 - What is a treble cleff?\n" +
                "\n" +
                "a) A clef placing G above middle C.\n" +
                "b) An instrument.\n" +
                "c) A well-known musician.");
    }

    @Override
    void Q4() {
        System.out.println("Q4 - What is a bass cleff?\n" +
                "\n" +
                "a) A clef placing F below middle C.\n" +
                "b) A clef placing C above middle C.\n" +
                "c) A clef that's played by pressing 2 keys simulatenously.");
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
        System.out.println("Answer: A");
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
                    correct();
                    break;
                }
                else if (input.equalsIgnoreCase("b")) {
                    incorrect();
                    A4();
                    break;
                }
                else if (input.equalsIgnoreCase("c")) {
                    incorrect();
                    A4();
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
