package Files;

import Main.Input;
import Quiz.GradeGenerator;
import Quiz.MainQuiz;
import Quiz.PercentageGenerator;


public class File {


    //Objects
    Input input = new Input();
    MainQuiz quiz = new MainQuiz();
    GradeGenerator gradeGen = new GradeGenerator();
    PercentageGenerator percentageGen = new PercentageGenerator();


    // Data
    String name = input.getName();
    String difficulty = input.getDifficultry();
    String subject = input.getSubject();
    String password = input.getPassword();
    String grade = gradeGen.getGrade();
    int yeargroup = input.getYearGroup();
    int age = input.getAge();
    int score = quiz.getScore();
    int percentage = percentageGen.getPercentage();





}
