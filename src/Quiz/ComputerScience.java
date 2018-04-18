package Quiz;

import java.io.BufferedReader;
import java.io.FileReader;

public class ComputerScience extends MainQuiz {


    public static void Easy() {

    }

    public static void Medium() {

    }

    public static void Hard() {

    }

    public static void loadComputerScienceQuestions() throws Exception{

        FileReader file = new FileReader("src/Quiz/Questions/Computer Science.txt");
        BufferedReader reader = new BufferedReader(file);

        String text = "";
        String line = reader.readLine();

        while (line != null) {
            text += line;
            line = reader.readLine();

            System.out.println(text);
        }

    }


}

