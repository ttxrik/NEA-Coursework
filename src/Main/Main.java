package Main;

public class Main {

    public static void main(String[] args) {

        UsernameGenerator ug = new UsernameGenerator();

        Input input = new Input();
        input.Registration1();
        ug.generateusername();
        input.Registration2();


        System.out.println(input.getUsername());


    }
}

