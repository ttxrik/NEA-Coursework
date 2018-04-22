package Quiz;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import Main.Input;
import Main.Main;

public class MainQuiz {

    static Input input = new Input();
    static String difficulty = input.getDifficultry();
    static String subject = input.getSubject();


    public static void Quiz() throws IOException {

        History history = new History();
        ComputerScience computerscience = new ComputerScience();
        Music music = new Music();


        if (difficulty.equalsIgnoreCase("easy")) {

            if (subject.equalsIgnoreCase("history")) {
                history.Easy();
            }
            else if (subject.equalsIgnoreCase("music")) {
                music.Easy();
            }
            else if (subject.equalsIgnoreCase("computer science")) {
                //computerscience.Easy();
            }

        }
        else if (difficulty.equalsIgnoreCase("medium")) {

            if (subject.equalsIgnoreCase("history")) {
                history.Medium();
            }
            else if (subject.equalsIgnoreCase("music")) {
                music.Medium();
            }
            else if (subject.equalsIgnoreCase("computer science")) {
                computerscience.Medium();
            }

        }
        else if (difficulty.equalsIgnoreCase("hard")) {

            if (subject.equalsIgnoreCase("history")) {
                history.Hard();
            }
            else if (subject.equalsIgnoreCase("music")) {
                music.Hard();
            }
            else if (subject.equalsIgnoreCase("computer science")) {
                computerscience.Hard();
            }
        }
    }

    public static int getScore() {

        int score = 0; // Initializing.

        if (Main.choice.equalsIgnoreCase("cs")) {
            score = ComputerScience.getScore();
        }
        else if (Main.choice.equalsIgnoreCase("music")) {
            score = Music.getScore();
        }
        else if (Main.choice.equalsIgnoreCase("history")) {
            score = History.getScore();
        }

        return score;

    }

    protected static void incorrect() {
        System.out.println("Incorrect!");
    }

    protected static void elsedo() {
        System.out.println("Please enter a, b or c");
    }

    public static void finalOutput() {

        int score = getScore();
        String grade = GradeGenerator.getGrade();
        int percentage = PercentageGenerator.getPercentage();

        System.out.printf("Your score is %s, your percentage is %s and your grade is %s", score, percentage, grade);
    }


}
