package lesson2;

public class Coins {

    private int quarters;
    private int dimes;
    private int nickels;
    private int pennies;

    public Coins(int numQuarters, int numDimes, int numNickels, int numPennies){
        quarters = numQuarters;
        dimes = numDimes;
        nickels = numNickels;
        pennies = numPennies;
    }

    public void addQuarter(){
        System.out.println("Adding a quarter ...");
        quarters ++;
    }

    public void addDime(){
        System.out.println("Adding a dime ...");
        dimes ++;
    }

    public void addNickel(){
        System.out.println("Adding a nickel ...");
        nickels ++;
    }

    public void addPenny(){
        System.out.println("Adding a penny ...");
        pennies ++;
    }

    public void quartersCount(){
        System.out.println(quarters);
    }

    public void quartersTotal(){
        System.out.println(quarters * 0.25);
    }

    public void dimesCount(){
        System.out.println(dimes);
    }

    public void dimesTotal(){
        System.out.println(dimes * 0.10);
    }

    public void nickelsCount(){
        System.out.println(nickels);
    }

    public void nickelsTotal(){
        System.out.println(nickels * 0.05);
    }

    public void penniesCount(){
        System.out.println(pennies);
    }

    public void penniesTotal(){
        System.out.println(pennies * 0.01);
    }

    public void bankValue(){
        double value = quarters * 0.25 + dimes * 0.10
                + nickels * 0.05 + pennies * 0.01;
                System.out.printf("%.2f", value);
                
    }

    public void bankCount(){
        System.out.println(quarters + dimes + nickels + pennies);
    }
}



