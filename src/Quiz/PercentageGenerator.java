package Quiz;

public class PercentageGenerator  extends MainQuiz{

    public static int percentage;

    int score = MainQuiz.getScore();

    public void GeneratePercentage() {

        if (score == 4) {
            percentage = 100;
        }
        else if (score == 3) {
            percentage = 75;
        }
        else if (score == 2) {
            percentage = 50;
        }
        else if (score == 1) {
            percentage = 25;
        }
        else if (score == 0) {
            percentage = 0;
        }



    }

    public static int getPercentage() {
        return percentage;
    }
}
