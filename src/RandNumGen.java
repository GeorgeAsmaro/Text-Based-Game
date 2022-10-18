
import java.util.Scanner;
import java.util.Random;
public class RandNumGen {

    static Scanner input = new Scanner(System.in);
    static Random rand = new Random();

    public static void main(String[] args) {
        System.out.println("Pick a number from 1-10");
        int oneToTen = 0;
        int random = rand.nextInt(10) + 1;
        oneToTen = input.nextInt();

        if (oneToTen == random) {
            System.out.println("You have guessed the correct number! The number was: " + random);
        }

        while(oneToTen != random) {
            oneToTen = input.nextInt();

            if (oneToTen == random) {
                System.out.println("You have guessed the correct number! The number was: " + random);
                break;
            }
        }


    }

}