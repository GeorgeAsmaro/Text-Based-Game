
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
                            System.exit(0);
                        }

                        case 2: {

                        }

                        case 3: {

                        }

                        case 4: {

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
