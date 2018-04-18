package Quiz;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import Main.Input;

public class MainQuiz {

    static Input input = new Input();
    static String difficulty = input.getDifficultry();
    static String subject = input.getSubject();

    public static int score;
    public static int grade;
    public static int percentage;

    public static void Quiz() throws IOException {


        if (difficulty.equalsIgnoreCase("easy")) {

            if (subject.equalsIgnoreCase("history")) {
                History.Easy();
            }
            else if (subject.equalsIgnoreCase("music")) {
                Music.Easy();
            }
            else if (subject.equalsIgnoreCase("computer science")) {
                //ComputerScience.Easy();
            }

        }
        else if (difficulty.equalsIgnoreCase("medium")) {

            if (subject.equalsIgnoreCase("history")) {
                History.Medium();
            }
            else if (subject.equalsIgnoreCase("music")) {
                Music.Medium();
            }
            else if (subject.equalsIgnoreCase("computer science")) {
                ComputerScience.Medium();
            }

        }
        else if (difficulty.equalsIgnoreCase("hard")) {

            if (subject.equalsIgnoreCase("history")) {
                History.Hard();
            }
            else if (subject.equalsIgnoreCase("music")) {
                Music.Hard();
            }
            else if (subject.equalsIgnoreCase("computer science")) {
                ComputerScience.Hard();
            }
        }


    }

    public int getScore() {
        return score;
    }




}
