
/*
- As of now (writing the code), I don't have a lot of experience with file writing and reading, which is why my folder
 organization method is a mess.

- I actually took the time to write all the questions and answers (computer science questions fully written by me (as in
I didn't use Google to clarify anything..

- If this coursework didn't get leaked and actually counted, I would've made this program a lot more better by building
a graphical user interface, and actually cleaning up the code..*/

/* MESSAGE TO THE EXAMINER:
 *
 I made my own version of the coursework and I know it wasn't the actual requirement.
 The coursework isn't going to count at the end of the day as it got leaked, which is probably why I made my
 own version.

 Also, there's more than 1000 lines of code which is probably the most in the entire country.

 Good luck, and have a nice day!!
 */

package Main;

import Files.FileWriter;
import Quiz.*;
import java.io.File;
import java.util.*;

public class Main {

    // Main execution..

    public static void main(String[] args) throws Exception {

        boolean validation = true;
        boolean validation1 = true;

        do {
            try {
                int t;
                Scanner in = new Scanner(System.in);
                System.out.println("\n1) Start\n\n2) Data\n\n3) Exit");
                t = in.nextInt();

                if (t == 1) {
                    Input.Registration1();
                    Input.Registration2();
                    Input.Subject();
                    Input.Difficulty();

                    System.out.println(FileWriter.filepath());

                    MainQuiz.Quiz();
                    MainQuiz.Results();
                    FileWriter.filewriter();

                } else if (t == 2) {


                    do {
                        String username = null;
                        System.out.println("Please enter your username: ");
                        Scanner input = new Scanner(System.in);
                        username = input.next();
                        String filepath = getFilePath(username);

                        File file = new File(filepath);

                        if (file.exists()) {

                            Runtime rt = Runtime.getRuntime();
                            Process p = rt.exec("Notepad " + filepath);
                            System.out.println("Data file executed!");
                            break;
                        } else {
                            // This selection seriously confused the hell out of me..

                            System.out.println("That user does not exist..");

                            boolean tempval = true;
                            do {
                                try {
                                    String aa;
                                    Scanner a = new Scanner(System.in);
                                    System.out.println("Would you like to retry?\n[y/n]");
                                    aa = a.nextLine();
                                    if (aa.equalsIgnoreCase("y") || aa.equalsIgnoreCase("yes")) {
                                        System.out.println("Okay..");
                                        validation1 = true;
                                        break;
                                    } else if (aa.equalsIgnoreCase("n") || aa.equalsIgnoreCase("no")) {
                                        System.out.println("Okay..");
                                        validation1 = false; // I kept putting this line below the break command. This kept causing the "can't reach statement" error.. DON'T REPEAT THIS MISTAKE!!!
                                        validation = true;
                                        tempval = false;
                                        // break - the break was here..

                                    } else {
                                        System.out.println("Please enter y/n:");
                                        tempval = true;
                                    }
                                } catch (Exception e) {
                                    System.out.println("Please enter y/n: ");
                                    tempval = true;
                                }

                            } while (tempval == true);
                        }
                    }
                    while (validation1 == true);

                } else if (t == 3) {
                    System.out.println("Exiting..");
                    System.exit(0);
                } else {
                    System.out.println("Please enter 1, 2 or 3");
                    validation = true;
                }


            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        while (validation == true);

    }

    private static String getFilePath(String usr) {

        return "Users/" + usr + ".txt";

    }


}

