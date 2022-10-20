
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;
import java.lang.Exception;
import java.util.Arrays;

public class Main {

    static Scanner input = new Scanner(System.in);
    static Random rand = new Random();
    static ExceptionHandling  exceptionHandling = new ExceptionHandling();

    static boolean countryChosen = false;
    public static void main(String[] args) {
        mainMenu();
    }

    public static void newGame() {
        System.out.println("New game Started!");
        System.out.println("");

        System.out.println("What is your character's name?");
        input.nextLine();
        String playerName = input.nextLine();

        System.out.println("");
        System.out.println("Your character's name is now set to: " + playerName);
        System.out.println("");

        chooseCountry();


        

    }

    public static void continueGame() {
        System.out.println("No current save, what would you like to do?");

        System.out.println("1. Back to main menu");
        System.out.println("2. New Game");
        System.out.println("3. Exit");

        int whatNext = input.nextInt();

        if(whatNext == 1) {
            mainMenu();
        }
        else if(whatNext == 2) {
            newGame();
        }
        else if (whatNext == 3) {
            exitGame();
        }

    }

    public static void instructions() {
        System.out.println("Instructions:");
    }

    public static void exitGame() {

    }

    public static void mainMenu() {
        System.out.println("");
        System.out.println("Start Menu");
        System.out.println("");
        System.out.println("1. New Game");
        System.out.println("2. Continue Game");
        System.out.println("3. Instructions");
        System.out.println("4. Exit");
        System.out.println("");
        System.out.println("Please input a number:");

        boolean correctInput = false;

        while(!correctInput) {

            try {
                int num = input.nextInt();

                if(num != 4 && num != 3 && num != 2 && num != 1) {
                    System.out.println("Incorrect input! Please input a number from 1-4.");
                }

                switch(num) {

                    case 1: {
                        correctInput = true;
                        newGame();
                        break;
                    }

                    case 2: {
                        correctInput = true;
                        continueGame();
                        break;
                    }

                    case 3: {
                        correctInput = true;
                        instructions();
                        break;
                    }

                    case 4: {
                        correctInput = true;
                        exitGame();
                        break;
                    }
                }
            }

            catch(InputMismatchException exception) {
                input.nextLine();
                System.out.println("Incorrect input! Please input a number from 1-4.");
            }

            catch(ArithmeticException exception) {

                System.out.println("Incorrect input! Please input a number from 1-4.");
            }
        }

    }

    public static void chooseCountry() {
        System.out.println("What country is your character from?");

        System.out.println("1. Canada");
        System.out.println("2. Australia");
        System.out.println("3. United States of America");
        System.out.println("4. Custom Country (Unoptimized)");

        String playerCountry = "";


        while(!countryChosen) {
            playerCountry  = input.nextLine();

            switch (playerCountry) {

                case "1" -> {
                    playerCountry = "Canada";
                    Player player = new Player(0,playerCountry);

                    System.out.println("Country is set to " + playerCountry + ". Are you sure?");

                    System.out.println("1. Yes");

                    System.out.println("2. No, change it");

                    int changeCountry = input.nextInt();

                    if(changeCountry == 2) {
                        countryChosen = false;
                        chooseCountry();
                    }
                    else {
                        countryChosen = true;

                        System.out.println("Your character's country is now set to: " + playerCountry);
                    }


                }

                case "2" -> {
                    playerCountry = "Australia";
                    Player player = new Player(0,playerCountry);

                    System.out.println("Country is set to " + playerCountry + ". Are you sure?");

                    System.out.println("1. Yes");

                    System.out.println("2. No, change it");

                    int changeCountry = input.nextInt();

                    if(changeCountry == 2) {
                        countryChosen = false;
                        chooseCountry();
                    }
                    else {
                        countryChosen = true;

                        System.out.println("Your character's country is now set to: " + playerCountry);
                    }
                }

                case "3" -> {
                    playerCountry = "United States of America";
                    Player player = new Player(0,playerCountry);

                    System.out.println("Country is set to " + playerCountry + ". Are you sure?");

                    System.out.println("1. Yes");

                    System.out.println("2. No, change it");

                    int changeCountry = input.nextInt();

                    if(changeCountry == 2) {
                        countryChosen = false;
                        chooseCountry();
                    }
                    else {
                        countryChosen = true;

                        System.out.println("Your character's country is now set to: " + playerCountry);
                    }
                }

                case "4" -> {
                    System.out.println("What country is your character from?");
                    playerCountry = input.nextLine();
                    Player player = new Player(0,playerCountry);

                    System.out.println("Country is set to " + playerCountry + ". Are you sure?");

                    System.out.println("1. Yes");

                    System.out.println("2. No, change it");

                    int changeCountry = input.nextInt();

                    if(changeCountry == 2) {
                        countryChosen = false;
                        chooseCountry();
                    }
                    else {
                        countryChosen = true;

                        System.out.println("Your character's country is now set to: " + playerCountry);
                    }
                }

            }
        }


    }

}

class ExceptionHandling {
    Scanner input = new Scanner(System.in);

    public ExceptionHandling() {
        startProgram();
    }

    public static void startProgram() {
        System.out.println("End");
    }


}
