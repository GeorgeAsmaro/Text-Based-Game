
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;
import java.lang.Exception;
import java.util.Arrays;

public class Main {

    static Scanner input = new Scanner(System.in);
    static Random rand = new Random();
    static ExceptionHandling  exceptionHandling = new ExceptionHandling();
    public static void main(String[] args) {

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

    public static void newGame() {
        System.out.println("New game Started!");
        System.out.println("");

        System.out.println("What is your character's name?");
        String playerName = input.nextLine();

        System.out.println("What country is your character from?");

        System.out.println("1. Canada");
        System.out.println("2. Australia");
        System.out.println("3. United States of America");
        System.out.println("4. Custom Country (Unoptimized)");

        String playerCountry = "";

        while(!playerCountry.equals("1") && !playerCountry.equals("2") && !playerCountry.equals("3") && !playerCountry.equals("4")) {
            playerCountry  = input.nextLine();

            switch (playerCountry) {

                case "1" -> playerCountry = "Canada";

                case "2" -> playerCountry = "Australia";

                case "3" -> playerCountry = "United States of America";

                case "4" -> {
                    System.out.println("What country is your character from?");
                    playerCountry = input.nextLine();
                }

            }
        }
        

    }

    public static void continueGame() {

    }

    public static void instructions() {
        System.out.println("Instructions:");
    }

    public static void exitGame() {

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
