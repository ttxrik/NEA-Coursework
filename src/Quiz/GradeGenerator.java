package Quiz;


public class GradeGenerator extends MainQuiz{

    int score = MainQuiz.getScore();

    public static String grade;

    private void GenerateGrade() {

        if (score <= 2 || score <= 2 || score <= 2) {
            grade = "C";
        }
        else if (score == 3 || score == 3 || score == 3) {
            grade = "B";
        }
        else if (score == 4 || score == 4 || score == 4) {
            grade = "A";
        }
        else {
            grade = "U";
        }

    }

    public static String getGrade() {
        return grade;
    }
}
