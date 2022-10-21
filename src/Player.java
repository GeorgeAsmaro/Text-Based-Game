import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Player {

    static Scanner input = new Scanner(System.in);
    static Random rand = new Random();
    static ExceptionHandling  exceptionHandling = new ExceptionHandling();

    String name;
    int health;
    int age;

    int money;

    int happiness;
    String country;

    String city;

    public Player(int yourAge) {
        health = 100;
        age = yourAge;
        happiness = 100;
        this.money = money;

    }

    public static void main(String[] args) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getHappiness() {
        return happiness;
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }

    public void playerCity() {
        if(getCountry().equals("Canada")) {
            int randomCity = rand.nextInt(10);

            if(randomCity == 0) {
                city = "Toronto";
            }

            if(randomCity == 1) {
                city = "Montreal";
            }

            if(randomCity == 2) {
                city = "Vancouver";
            }

            if(randomCity == 3) {
                city = "Calgary";
            }

            if(randomCity == 4) {
                city = "Edmonton";
            }

            if(randomCity == 5) {
                city = "Ottawa";
            }

            if(randomCity == 6) {
                city = "Winnipeg";
            }

            if(randomCity == 7) {
                city = "Quebec City";
            }

            if(randomCity == 8) {
                city = "Halifax";
            }

            if(randomCity == 9) {
                city = "Victoria";
            }
        }
    }

    public String getCity() {
        playerCity();
        return city;
    }
}
