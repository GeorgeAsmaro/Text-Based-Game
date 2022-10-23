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

    String wealthiness;

    String state = "Alive";

    public Player(int yourAge) {
        health = 100;
        age = yourAge;
        happiness = 100;

    }

    public void main(String[] args) {

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

        else if(getCountry().equals("Australia")) {
            int randomCity = rand.nextInt(10);

            if(randomCity == 0) {
                city = "Sydney";
            }

            if(randomCity == 1) {
                city = "Melbourne";
            }

            if(randomCity == 2) {
                city = "Brisbane";
            }

            if(randomCity == 3) {
                city = "Perth";
            }

            if(randomCity == 4) {
                city = "Adelaide";
            }

            if(randomCity == 5) {
                city = "Hobart";
            }

            if(randomCity == 6) {
                city = "Darwin";
            }

            if(randomCity == 7) {
                city = "Ballarat";
            }

            if(randomCity == 8) {
                city = "Bendigo";
            }

            if(randomCity == 9) {
                city = "Bunbury";
            }
        }

        else if(getCountry().equals("the United States of America")) {
            int randomCity = rand.nextInt(10);

            if(randomCity == 0) {
                city = "New York";
            }

            if(randomCity == 1) {
                city = "Los Angeles";
            }

            if(randomCity == 2) {
                city = "Chicago";
            }

            if(randomCity == 3) {
                city = "Houston";
            }

            if(randomCity == 4) {
                city = "Phoenix";
            }

            if(randomCity == 5) {
                city = "Dallas";
            }

            if(randomCity == 6) {
                city = "Miami";
            }

            if(randomCity == 7) {
                city = "Las Vegas";
            }

            if(randomCity == 8) {
                city = "Seattle";
            }

            if(randomCity == 9) {
                city = "Atlanta";
            }
        }

        else {
            int randomCity = rand.nextInt(10);

            if(randomCity == 0) {
                city = "Bilbao";
            }

            if(randomCity == 1) {
                city = "Paris";
            }

            if(randomCity == 2) {
                city = "Vaduz";
            }

            if(randomCity == 3) {
                city = "Dublin";
            }

            if(randomCity == 4) {
                city = "Warsaw";
            }

            if(randomCity == 5) {
                city = "Berlin";
            }

            if(randomCity == 6) {
                city = "Stockholm";
            }

            if(randomCity == 7) {
                city = "Lisbon";
            }

            if(randomCity == 8) {
                city = "Katowice";
            }

            if(randomCity == 9) {
                city = "Frankfurt";
            }
        }
    }

    public void wealth() {
        int wealthy = rand.nextInt(3);

        if(wealthy == 0) {
            wealthiness = "poor";
        }
        else if(wealthy == 1) {
            wealthiness = "middle-class";
        }
        else {
            wealthiness = "wealthy";
        }
    }

    public String getWealth() {
        wealth();
        return wealthiness;
    }

    public String getCity() {
        playerCity();
        return city;
    }

    public void startMoney() {

        if(getWealth().equals("poor")) {
            money = 0;
        }

        else if(getWealth().equals("wealthy")) {
            money = 1000;
        }

        else if(getWealth().equals("middle-class")) {
            money = 200;
        }

        else {
            money = 1;
        }
    }

    public String getState() {
        return state;
    }

    public String setState(String playerState) {
        state = playerState;
        return state;
    }
}
