
import java.util.Scanner;
import java.util.Random;
public class Main {

    static Scanner input = new Scanner(System.in);
    static Random rand = new Random();

    public static void main(String[] args) {
        System.out.println("Pick a number from 0-49");
        int oneToTen = 51;
        int random = rand.nextInt(10);
        oneToTen = input.nextInt();
        while(oneToTen != random) {
            oneToTen = input.nextInt();

            if (oneToTen == random) {
                System.out.println("You have guessed the correct number! The number was: " + random);
                break;
            }
        }


    }

}