import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Player {

    static Scanner input = new Scanner(System.in);
    static Random rand = new Random();
    static ExceptionHandling  exceptionHandling = new ExceptionHandling();

    String name;
    int health;
    int age;

    boolean wealthChosen = false;

    int money;

    int happiness;

    int intelligence = 0;

    int kindness = 0;

    int socialization = 0;

    int athleticism = 0;

    int artistic = 0;

    String country;

    String city;

    String wealthiness;

    String state = "Alive";

    public Player() {
        health = 100;
        age = 0;
        happiness = 100;
        //wealth();
        this.wealthiness = getWealth();
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

    public int setAge(int age) {
        this.age = age;
        return age;
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

    private void wealth() {
        int wealthy = rand.nextInt(3);

        if (!wealthChosen) {
            if(wealthy == 0) {
                wealthiness = "poor";
                wealthChosen = true;
            }
            else if(wealthy == 1) {
                wealthiness = "middle-class";
                wealthChosen = true;
            }
            else {
                wealthiness = "wealthy";
                wealthChosen = true;
            }
        }

    }

    public void setTrue(boolean trueOrFalse) {
        wealthChosen = trueOrFalse;
    }

    public boolean getTrue() {
        return wealthChosen;
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
            this.setMoney(0);
        }

        else if(getWealth().equals("wealthy")) {
            this.setMoney(1000);
        }

        else {
            this.setMoney(200);
        }
    }

    public String getState() {
        return state;
    }

    public String setState(String playerState) {
        state = playerState;
        return state;
    }

    public void getStatus() {

        //Age: age (updates each time you age)
        //Health: health (updates based on events that occur)
        //Happiness: happiness (updates based on events that occur)
        // (Gap to look nicer)

        System.out.println("Age: " + this.getAge());
        System.out.println("Health: " + this.getHealth());
        System.out.println("Happiness: " + this.getHappiness());
        startMoney();

        System.out.println("Money: $" + this.getMoney());
        System.out.println("");
    }

    public String getWealthiness() {
        return wealthiness;
    }

    public void activityPool() {
        int pool = rand.nextInt(1)+1;
        boolean activityComplete = false;
        switch (pool) {
            case 1 -> {
                while(!activityComplete) {
                    System.out.println("1. Create a twitter profile");
                    System.out.println("2. Donate money to the homeless");
                    System.out.println("3. Go to the library and read a book");
                    System.out.println("4. Go on a walk at the park");
                    System.out.println("5. Find a club to join");

                    int nextActivity = input.nextInt();

                    if(nextActivity == 1) {
                        System.out.println("You go online and register for a twitter account. You set up your account and make a basic profile.");
                        socialization++;
                        activityComplete = true;

                    }

                    if(nextActivity == 2) {
                        if(getMoney() > 0) {
                            System.out.println("You donate $1 to a homeless man on the side of the road.");
                            kindness++;
                            activityComplete = true;
                        }
                        else if(getMoney()<= 0) {
                            System.out.println("You don't have money to donate! You gave the homeless man on the side of the road counterfeit money.");
                            kindness--;
                            activityComplete = true;
                        }
                    }

                    if(nextActivity == 3) {
                        int whatBook = rand.nextInt(10);
                        String book = "book";
                        String author = "author";

                        if(whatBook == 0) {
                            book = "Don Quixote";
                            author = "Miguel de Cervantes";
                        }

                        if(whatBook == 1) {
                            book = "Moby Dick";
                            author = "Herman Melville";
                        }

                        if(whatBook == 2) {
                            book = "1984";
                            author = "George Orwell";
                        }

                        if(whatBook == 3) {
                            book = "The Odyssey";
                            author = "Homer";
                        }

                        if(whatBook == 4) {
                            book = "The Catcher in the Rye";
                            author = "J. D. Salinger";
                        }

                        if(whatBook == 5) {
                            book = "To Kill a Mockingbird";
                            author = "Harper Lee";
                        }

                        if(whatBook == 6) {
                            book = "The Hunger Games";
                            author = "Suzanne Collins";
                        }

                        if(whatBook == 7) {
                            book = "James and the Giant Peach";
                            author = "Roald Dahl";
                        }

                        if(whatBook == 8) {
                            book = "Animal Farm";
                            author = "George Orwell";
                        }

                        if(whatBook == 9) {
                            book = "The Godfather";
                            author = "Mario Puzo";
                        }
                        System.out.println("You walked to the nearest library and found a book to read. The book you read was " + book + " by " + author);
                        intelligence++;
                        activityComplete = true;
                    }

                    if(nextActivity == 4) {
                        System.out.println("You went to the nearest park and took a long walk along the path.");
                        athleticism++;
                        activityComplete = true;
                    }

                    if(nextActivity == 5) {
                        boolean clubChosen = false;

                        while(!clubChosen) {
                            try {
                                System.out.println("What club would you like to join?");
                                System.out.println("");
                                System.out.println("1. Basketball Club");
                                System.out.println("2. Robotics Club");
                                System.out.println("3. Book Club");
                                System.out.println("4. Creative Writing Club");
                                System.out.println("5. Animation Club");

                                int club = input.nextInt();

                                if(club == 1) {
                                    System.out.println("You have joined the basketball club.");
                                    athleticism++;
                                    clubChosen = true;
                                    activityComplete = true;
                                }

                                else if(club == 2) {
                                    System.out.println("You have joined the robotics club.");
                                    intelligence++;
                                    clubChosen = true;
                                    activityComplete = true;
                                }

                                else if(club == 3) {
                                    System.out.println("You have joined the book club.");
                                    intelligence++;
                                    clubChosen = true;
                                    activityComplete = true;
                                }

                                else if(club == 4) {
                                    System.out.println("You have joined the creative writing club.");
                                    artistic++;
                                    clubChosen = true;
                                    activityComplete = true;
                                }

                                else if(club == 5) {
                                    System.out.println("You have joined the animation club.");
                                    artistic++;
                                    clubChosen = true;
                                    activityComplete = true;
                                }

                                else {
                                    System.out.println("Invalid Input. Try again.");
                                }
                            }
                            catch(InputMismatchException exception) {
                                System.out.println("Invalid Input. Try Again.");
                            }
                        }

                    }
                }
            }
            case 2 -> {


            }
            case 3 -> {


            }
            case 4 -> {


            }
            case 5 -> {


            }
            case 6 -> {


            }
            case 7 -> {

            }
            case 8 -> {


            }
            case 9 -> {

            }
            case 10 -> {


            }
            default -> {

            }
        }

    }
}
