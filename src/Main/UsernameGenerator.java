package Main;

public class UsernameGenerator {

    String finalUsername;


    public void generateusername() {

        Input input = new Input();

        System.out.println("test");

        String name = input.getName();
        System.out.println(name);

        String firstpart = name.substring(0 ,3);
        int lastpart = input.getAge();

        finalUsername = firstpart+lastpart;

    }

    public String getGeneratedUsername() {
        return finalUsername;
    }
}



