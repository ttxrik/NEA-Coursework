package Generators;

import Main.Main;
import Quiz.MainQuiz;

public class PercentageGenerator {

    public static int percentage;

    /*
     I made a separate method for the selection in the method below and never called that method. Therefore, the percentage
      was returned as 0 / null. DON'T REPEAT THIS MISTAKE AGAIN!!!!

      public void GeneratePercentage() {

        if (MainQuiz.getScore() == 4) {
            percentage = 100;
        }
        else if (MainQuiz.getScore() == 3) {
            percentage = 75;
        }
        else if (MainQuiz.getScore() == 2) {
            percentage = 50;
        }
        else if (MainQuiz.getScore() == 1) {
            percentage = 25;
        }
        else if (MainQuiz.getScore() == 0) {
            percentage = 0;
        }
      }
      */


    public static int getPercentage() {

        if (MainQuiz.getScore() == 4) {
            percentage = 100;
        } else if (MainQuiz.getScore() == 3) {
            percentage = 75;
        } else if (MainQuiz.getScore() == 2) {
            percentage = 50;
        } else if (MainQuiz.getScore() == 1) {
            percentage = 25;
        } else if (MainQuiz.getScore() == 0) {
            percentage = 0;
        }

        return percentage;
    }

}
