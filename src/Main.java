
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Main {
    static boolean activityChosen = false;

    static Scanner input = new Scanner(System.in);
    static Random rand = new Random();
    static ExceptionHandling  exceptionHandling = new ExceptionHandling();
    static Player player = new Player();

    static boolean countryChosen = false;
    public static void main(String[] args) {
        mainMenu();
    }

    public static void newGame() throws InterruptedException {

        player.setTrue(false);

        System.out.println("New game Started!");
        empty();
        System.out.println("What is your character's name?");
        input.nextLine();
        String playerName = input.nextLine();

        player.setName(playerName);

        empty();
        System.out.println("Your character's name is now set to: " + playerName);
        empty();

        chooseCountry();

        characterDescription();

        TimeUnit.SECONDS.sleep(1);

        System.out.println("1. Continue");
        System.out.println("2. Back to main menu");
        int continueGame = input.nextInt();

        while(!player.getState().equals("dead")) {
            try {

                if(continueGame == 1) {
                    System.out.println("1. Age");

                    if(!activityChosen) {
                        System.out.println("2. Activities");
                    }

                    System.out.println("3. Status");
                    System.out.println("4. Inventory");
                    System.out.println("5. Back to main menu");

                    int next = input.nextInt();

                    if(next == 1) {
                        player.setAge(player.getAge()+1);

                        activityChosen = false;

                        int potentialDeath = rand.nextInt(50)+1;

                        if(potentialDeath == 1) {
                            player.setState("dead");
                            playerDeath();
                        }

                        if(potentialDeath != 1) {
                            //player.getStatus();
                        }

                    }

                    if(next == 2 && !activityChosen) {
                        player.activityPool();
                        activityChosen = true;
                    }

                    if(next == 3) {
                        player.getStatus();
                    }

                    if(next == 5) {
                        countryChosen = false;
                        mainMenu();
                    }
                }
                else if(continueGame == 2) {
                    countryChosen = false;
                    mainMenu();
                }
            }
            catch(InputMismatchException exception) {
                System.out.println("Invalid Input! Try Again");
            }

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
        System.out.println("Main Menu");
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

        empty();
        player.setAge(0);

        System.out.println(player.getName() + " is a " + player.getAge() + " year old born with a " + player.getWealth() + " family");
        System.out.println("They were born in a city called " + player.getCity() +  " located in " + player.getCountry());
        empty();
        player.getStatus();

    }

    public static void empty() {
        System.out.println("");
    }

    public static void playerDeath() throws InterruptedException {
        try {
            System.out.println("At the age of " + player.getAge() + ", " + player.getName() + " has passed away.");
            System.out.println("Born and raised in " + player.getCity() + " in " + player.getCountry() + ", " + player.getName() + " was born into a " + player.getWealthiness() + " family.");
            input.nextLine();


            System.out.println("What would you like to do next?");

            System.out.println("1. Retry");
            System.out.println("2. Main Menu");

            int whatNext = input.nextInt();

            if(whatNext == 1) {
                countryChosen = false;
                player.setState("Alive");
                newGame();
            }
            else if(whatNext == 2) {
                countryChosen = false;
                player.setState("Alive");
                mainMenu();
            }
            else {
                System.out.println("Invalid input! Try again");
                playerDeath();
            }
        }

        catch(InputMismatchException exception) {
            System.out.println("Invalid input! Try again");
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
