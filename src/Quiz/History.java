package Quiz;

import java.util.Scanner;

public class History extends QuestionInterface {

    @Override
    void Q1() {
        System.out.println("Q1 - When was Queen Elizabeth born?\n" +
                "\n" +
                "a) 1926\n" +
                "b) 1920\n" +
                "c) 1914");
    }

    @Override
    void Q2() {
        System.out.println("Q2 - What year did the first world war start?\n" +
                "\n" +
                "a) 1911\n" +
                "b) 1918\n" +
                "c) 1929");
    }

    @Override
    void Q3() {
        System.out.println("Q3 - What country was Adolf Hitler born in?\n" +
                "\n" +
                "a) Germany\n" +
                "b) Netherlands\n" +
                "c) Austria");
    }

    @Override
    void Q4() {
        System.out.println("Q4 - The Battle of Hastings in 1066 was fought in which country?\n" +
                "\n" +
                "a) England\n" +
                "b) Germany\n" +
                "c) France");
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
                    correct();
                    break;

                } else if (input.equalsIgnoreCase("b")) {
                    incorrect();
                    break;
                } else if (input.equalsIgnoreCase("c")) {
                    incorrect();
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
                    break;
                }
                else if (input.equalsIgnoreCase("b")) {
                    correct();
                    break;
                }
                else if (input.equalsIgnoreCase("c")) {
                    incorrect();
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
                    correct();
                    break;

                } else if (input.equalsIgnoreCase("b")) {
                    incorrect();
                    break;
                } else if (input.equalsIgnoreCase("c")) {
                    incorrect();
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
                    break;
                }
                else if (input.equalsIgnoreCase("b")) {
                    correct();
                    break;
                }
                else if (input.equalsIgnoreCase("c")) {
                    incorrect();
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
                    incorrect();
                    break;
                }
                else if (input.equalsIgnoreCase("b")) {
                    incorrect();
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
    public void Hard() {

        boolean validation = true;

        String input;

        do {
            try {
                Scanner in = new Scanner(System.in);

                Q1();

                input = in.next();

                if (input.equalsIgnoreCase("a")) {
                    correct();
                    break;

                } else if (input.equalsIgnoreCase("b")) {
                    incorrect();
                    break;
                } else if (input.equalsIgnoreCase("c")) {
                    incorrect();
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
                    break;
                }
                else if (input.equalsIgnoreCase("b")) {
                    correct();
                    break;
                }
                else if (input.equalsIgnoreCase("c")) {
                    incorrect();
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
                    incorrect();
                    break;
                }
                else if (input.equalsIgnoreCase("b")) {
                    incorrect();
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

                Q4();

                input = in2.next();

                if (input.equalsIgnoreCase("a")) {
                    correct();
                    break;
                }
                else if (input.equalsIgnoreCase("b")) {
                    incorrect();
                    break;
                }
                else if (input.equalsIgnoreCase("c")) {
                    incorrect();
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


}
