package Generators;

import Main.Input;

public class UsernameGenerator {

    String finalUsername;


    public void generateusername() {

        Input input = new Input();

        String name = input.getName();

        String firstpart = name.substring(0, 3);
        int lastpart = input.getAge();

        finalUsername = firstpart + lastpart;

    }

    public String getGeneratedUsername() {
        return finalUsername;
    }
}
