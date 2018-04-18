package Quiz;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class ComputerScience extends MainQuiz {

    /* public static Scanner ReadFile() throws IOException {

        File temp = new File("src/Quiz/Questions/Computer Science.txt");
        Scanner file = new Scanner(temp);
        
        return file;


    } // Tried, doesn't work */

    static File temp = new File("src/Quiz/Questions/Computer Science.txt");


    public static void Easy() throws IOException {

        Scanner file = new Scanner(temp);

        for (int x = 0; x < 6; x++) {
            System.out.println(file.nextLine());
        }

    }

    public static void Medium() {



    }

    public static void Hard() {

    }



}

