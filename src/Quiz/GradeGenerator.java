package Quiz;


public class GradeGenerator extends MainQuiz{

    static int score = MainQuiz.getScore();

    public static String grade;


    public static String getGrade() {

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

        return grade;
    }
}
