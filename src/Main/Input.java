package Main;

import java.util.Scanner;
import java.util.regex.*;

public class Input {

    static String name;
    static int age;
    static int yearGroup;
    static String difficulty;
    static String username;
    static String password;
    static String passwordConfirmation;
    static String subject;

    static String numCheck = ".*\\d+.*"; // For checking if a string contains any numbers using regex (regular expression).

    static UsernameGenerator ug = new UsernameGenerator();

    public static void Registration1() {

        boolean validation = true;
        boolean validation2 = true;
        boolean validation3 = true;

        System.out.print("-------------------------------------------------------------------");

        do {
            try {
                Scanner in = new Scanner(System.in);
                msg1("name");
                name = in.nextLine();
                if (name.matches(numCheck)) {
                    System.out.println("Who's name contains a number? Try again..");
                    validation = true;
                }
                else {
                    msg4("Name");
                    break;
                }

            }catch (Exception e) {
                System.out.println("Try again..");
                validation = true;
            }
        }while (validation == true);

        do {
            try {
                Scanner in2 = new Scanner(System.in);
                msg1("age");
                age = in2.nextInt();
                validation2 = false;
                msg4("Age");

            }catch (Exception e) {
                System.out.println("Try again..");
                validation2 = true;
            }
        }while (validation2 == true);

        do {
            try {
                Scanner in3 = new Scanner(System.in);
                msg1("year group");
                yearGroup = in3.nextInt();
                break;
            }
            catch (Exception e) {
                System.out.println("Try again..");
                validation = true;
            }
        }while (validation == true);

    }

    public static void Registration2() {

        boolean validation = true;
        int choice;

        System.out.println("-------------------------------------------------------------------"); // Just making it look nicer

        do {
            try {
                Scanner in = new Scanner(System.in);
                System.out.println("\nWould you like to manually input or generate a username?:\n\n1) Input\n2) Generate\n\n\nPlease select either 1 or 2:\n ");
                                                                                               /* The instructions weren't clear on if the user should input a username or if the program should
                                                                                               generate a username. Therefore, I decided to give the user an option to choose between one! */
                choice = in.nextInt();
                if (choice == 1) {
                    inputUsername();
                    break;
                }else if (choice == 2) {
                    System.out.println("Generating username..");
                    ug.generateusername();
                    username = ug.getGeneratedUsername();
                    System.out.println("Username set to " + username);
                    break;
                } else {
                    System.out.println("Please enter 1 or 2..");
                    validation = true;
                }
            } catch (Exception e) {
                System.out.println("Please enter 1 or 2..");
                validation = true;
            }

        }while (validation == true);



        do{
            Scanner in2 = new Scanner(System.in);
            msg1("password");
            password = in2.next();

            Scanner in2confirm = new Scanner(System.in);
            System.out.println("Please confirm your password: ");
            passwordConfirmation = in2confirm.next();

            if (passwordConfirmation.equals(password)) {

                if (password.length() < 4) {
                    System.out.println("Your password is too short..");
                    validation = true;

                }else if (password.length() > 20) {
                    System.out.println("Your password is too long..");
                    validation = true;

                }else if (password.equals(username)){
                    System.out.println("Your password must be different from your username..");
                    validation = true;

                }else {
                    msg4("Password");
                    break;
                }
            }
            else {
                System.out.println("Incorrect\n");
                validation = true;
            }

        }while (validation == true);

    }

    public static void Subject() {

        boolean validation = true;

        do {
            try {
                Scanner in = new Scanner(System.in);
                msg3();
                subject = in.nextLine();

                if (subject.equalsIgnoreCase("history")) {
                    System.out.println("Subject set to history..");
                    break;

                }
                else if (subject.equalsIgnoreCase("music")) {
                    System.out.println("Subject set to music..");
                    break;

                }
                else if (subject.equalsIgnoreCase("computer science")) {
                    System.out.println("Subject set to computer science..");
                    break;
                }
                else {
                    System.out.println("Make sure you spelled the subject name correctly, please try again..");
                    validation = true;
                }

            }catch (Exception e) {
                System.out.println("Something went wrong, please try again..");
                validation = true;

            }
        }while (validation == true);

    }

    public static void Difficulty() {
        boolean validation = true;

        do {
            try {
                Scanner in = new Scanner(System.in);
                msg2();
                difficulty = in.nextLine();

                if (difficulty.equalsIgnoreCase("easy")) {
                    System.out.println("Difficulty set to easy..");
                    break;
                }
                else if (difficulty.equalsIgnoreCase("medium")) {
                    System.out.println("Difficulty set to medium..");
                    break;
                }
                else if (difficulty.equalsIgnoreCase("hard")) {
                    System.out.println("Difficulty set to hard..");
                    break;
                }else {
                    System.out.println("Please enter a valid difficulty..");
                    validation = true;
                }

            }catch (Exception e) {
                System.out.println("Something went wrong, please try again..");
            }
        }while (validation == true);
    }


    private static void msg1(String x) {
        System.out.println("\nPlease enter your " + x + ": ");
    }

    private static void msg2() {
        String dMsg = "Please choose a difficulty:\n-------------------------------------------------------------------" +
                "\n\n\n1) Easy\n\n2) Medium\n\n3) Hard ";
        System.out.println(dMsg);
    }

    private static void msg3() {
        String tMsg = "Please choose a subject:\n-------------------------------------------------------------------" +
                "\n\n\n1) History\n\n2) Music\n\n3) Computer Science";

        System.out.println(tMsg);
    }

    private static void msg4(String x) {
        System.out.println(x + " has been registered successfully..");
    }

    private static void inputUsername() {

        boolean validation = true;

        do {
            Scanner in = new Scanner(System.in);
            msg1("username");
            username = in.next();

            if (username.length() < 3) {
                System.out.println("Please enter a longer username..");
                validation = true;

            }else if (username.length() > 15) {
                System.out.println("Your user name is too long..");
                validation = true;

            }else {
                msg4("Username");
                break;
            }

        }while (validation == true);
    }


    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getDifficultry() {
        return difficulty;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getYearGroup() {
        return yearGroup;
    }

    public String getSubject() {
        return subject;
    }
}

