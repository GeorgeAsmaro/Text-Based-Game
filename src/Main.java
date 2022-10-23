
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Main {

    static Scanner input = new Scanner(System.in);
    static Random rand = new Random();
    static ExceptionHandling  exceptionHandling = new ExceptionHandling();
    static Player player = new Player(0);

    static boolean countryChosen = false;

    static boolean skip1 = false;
    public static void main(String[] args) {
        mainMenu();
    }

    public static void newGame() throws InterruptedException {
        if(!skip1) {
            System.out.println("New game Started!");
            empty();
            System.out.println("What is your character's name?");
            input.nextLine();
            String playerName = input.nextLine();

            player.setName(playerName);

            empty();
            System.out.println("Your character's name is now set to: " + playerName);
            empty();

        }

        chooseCountry();

        characterDescription();

        TimeUnit.SECONDS.sleep(1);

        System.out.println("1. Continue");
        System.out.println("2. Back");

        try {
            int continueGame = input.nextInt();

            if(continueGame == 1) {
                System.out.println("1. Age");
                System.out.println("2. Activities");
                System.out.println("3. Status");
                System.out.println("4. Inventory");
                System.out.println("1.");
            }
            else if(continueGame == 2) {
                countryChosen = false;
                skip1 = true;
                newGame();
            }
        }
        catch(InputMismatchException exception) {
            System.out.println("Invalid Input! Try Again");
        }


        

    }

    public static void continueGame() {

        boolean correctInput = false;

        while(!correctInput) {
            try {
                System.out.println("No current save, what would you like to do?");

                System.out.println("1. Back to main menu");
                System.out.println("2. New Game");
                System.out.println("3. Exit");

                int whatNext = input.nextInt();

                if(whatNext != 1 && whatNext != 2 && whatNext != 3) {
                    System.out.println("Incorrect input! Please input a number from 1-3");
                }

                if(whatNext == 1) {
                    mainMenu();
                    correctInput = true;
                }
                else if(whatNext == 2) {
                    newGame();
                    correctInput = true;
                }
                else if (whatNext == 3) {
                    exitGame();
                    correctInput = true;
                }

            } catch(InputMismatchException exception) {
                input.nextLine();
                System.out.println("Incorrect input! Please input a number from 1-3");

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


    }

    public static void instructions() {
        System.out.println("Instructions:");
        boolean correctInput = false;

        while(!correctInput) {
            try {

                empty();
                System.out.println("1. Main Menu");

                int next = input.nextInt();

                if(next != 1) {
                    System.out.println("Incorrect input! Please input a correct number");
                }
                else if(next == 1) {
                    mainMenu();
                    correctInput = true;
                }

            }
            catch(InputMismatchException exception) {
                System.out.println("Incorrect input! Please input a correct number");
            }
        }

    }

    public static void exitGame() {

    }

    public static void mainMenu() {
        empty();
        System.out.println("Start Menu");
        empty();
        System.out.println("1. New Game");
        System.out.println("2. Continue Game");
        System.out.println("3. Instructions");
        System.out.println("4. Exit");
        empty();
        System.out.println("Please input a number:");

        boolean correctInput = false;

        while(!correctInput) {

            try {
                int num = input.nextInt();

                if(num != 4 && num != 3 && num != 2 && num != 1) {
                    System.out.println("Incorrect input! Please input a number from 1-4.");
                }

                switch (num) {
                    case 1 -> {
                        correctInput = true;
                        newGame();
                    }
                    case 2 -> {
                        correctInput = true;
                        continueGame();
                    }
                    case 3 -> {
                        correctInput = true;
                        instructions();
                    }
                    case 4 -> {
                        correctInput = true;
                        exitGame();
                    }
                }
            }

            catch(InputMismatchException exception) {
                input.nextLine();
                System.out.println("Incorrect input! Please input a number from 1-4.");
            }

            catch(ArithmeticException exception) {

                System.out.println("Incorrect input! Please input a number from 1-4.");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

    public static void chooseCountry() {
        System.out.println("What country is your character from?");

        System.out.println("1. Canada");
        System.out.println("2. Australia");
        System.out.println("3. United States of America");
        System.out.println("4. Custom Country (Unoptimized)");

        String playerCountry;


        while(!countryChosen) {
            playerCountry  = input.nextLine();

            switch (playerCountry) {

                case "1" -> {
                    playerCountry = "Canada";

                    System.out.println("Country is set to " + playerCountry + ". Are you sure?");

                    System.out.println("1. Yes");

                    System.out.println("2. No, change it");

                    int changeCountry = input.nextInt();

                    if(changeCountry == 2) {
                        countryChosen = false;
                        chooseCountry();
                    }
                    if(changeCountry == 1) {
                        countryChosen = true;

                        player.setCountry(playerCountry);

                        System.out.println("Your character's country is now set to: " + playerCountry);
                    }
                    else {
                        System.out.println("Invalid input");
                        chooseCountry();
                    }


                }

                case "2" -> {
                    playerCountry = "Australia";

                    System.out.println("Country is set to " + playerCountry + ". Are you sure?");

                    System.out.println("1. Yes");

                    System.out.println("2. No, change it");

                    int changeCountry = input.nextInt();

                    if(changeCountry == 2) {
                        countryChosen = false;
                        chooseCountry();
                    }
                    if(changeCountry == 1) {
                        countryChosen = true;

                        player.setCountry(playerCountry);

                        System.out.println("Your character's country is now set to: " + playerCountry);
                    }
                    else {
                        System.out.println("Invalid input");
                        chooseCountry();
                    }
                }

                case "3" -> {
                    playerCountry = "the United States of America";

                    System.out.println("Country is set to " + playerCountry + ". Are you sure?");

                    System.out.println("1. Yes");

                    System.out.println("2. No, change it");

                    int changeCountry = input.nextInt();

                    if(changeCountry == 2) {
                        countryChosen = false;
                        chooseCountry();
                    }
                    if(changeCountry == 1) {
                        countryChosen = true;

                        player.setCountry(playerCountry);

                        System.out.println("Your character's country is now set to: " + playerCountry);
                    }
                    else {
                        System.out.println("Invalid input");
                        chooseCountry();
                    }
                }

                case "4" -> {
                    System.out.println("What country is your character from?");
                    playerCountry = input.nextLine();

                    System.out.println("Country is set to " + playerCountry + ". Are you sure?");

                    System.out.println("1. Yes");

                    System.out.println("2. No, change it");

                    int changeCountry = input.nextInt();

                    if(changeCountry == 2) {
                        countryChosen = false;
                        chooseCountry();
                    }

                    if(changeCountry == 1) {
                        countryChosen = true;

                        player.setCountry(playerCountry);

                        System.out.println("Your character's country is now set to: " + playerCountry);

                    }
                }

            }
        }
    }

    public static void characterDescription() {
        //Character is a age year old born with a poor/wealthy/rich/middle-class family.
        //They were born in a city/village/town called located in countryOrigin.
        // (Gap to look nicer)
        //Age: age (updates each time you age)
        //Health: health (updates based on events that occur)
        //Happiness: happiness (updates based on events that occur)
        // (Gap to look nicer)

        empty();
        System.out.println(player.getName() + " is a " + player.getAge() + " year old born with a " + player.getWealth() + " family");
        System.out.println("They were born in a city called " + player.getCity() +  " located in " + player.getCountry());
        empty();
        System.out.println("Age: " + player.getAge());
        System.out.println("Health: " + player.getHealth());
        System.out.println("Happiness: " + player.getHappiness());
        player.startMoney();
        System.out.println("Money: $" + player.getMoney());
        empty();

    }

    public static void empty() {
        System.out.println("");
    }

    public void mainGame() {
        while(!player.getState().equals("dead")) {

        }
    }

}

class ExceptionHandling {
    Scanner input = new Scanner(System.in);

    public ExceptionHandling() {
        startProgram();
    }

    public static void startProgram() {
    }


}
