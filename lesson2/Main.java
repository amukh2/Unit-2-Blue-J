package lesson2;


/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args){
        // Note: These classes have been written so that you can
        // print the object using System.out.println(objectName)
        
        // make a custom cup of coffee
        Coffee myCup = new Coffee(4,true,"Oat");
        System.out.println(myCup);
        // make a default cup of coffee
        Coffee basicCup = new Coffee();
        System.out.println(basicCup);
        // make a default pinata
        Pinata pinata1 = new Pinata("skittles", "blue", "pizza");
        System.out.println(pinata1);
        // make more pinatas to test all of the constructors you made
        Pinata pinata2 = new Pinata("blue", "pizza");
        System.out.println(pinata2);
        
        Pinata pinata3 = new Pinata("gummy candy");
        System.out.println(pinata3);
        
        
        

        // test each of the website constructors    
        Website website1 = new Website();
        System.out.println(website1);

        Website website2 = new Website("Youtube", "org");
        System.out.println(website2);
        
        Website website3 = new Website("WestLinnHighSchool", "edu", 4);
        System.out.println(website3);

        
        

        
        
        //complete LooseChange here
        Coins myChange = new Coins(4, 3, 2, 1);
        myChange.bankCount();
        myChange.bankValue();
        myChange.addQuarter();
        myChange.addQuarter();
        myChange.addDime();
        myChange.addDime();
        myChange.addPenny();
        myChange.bankCount();
        myChange.bankValue();
        
        // test Saluations here
        Salutations salutation = new Salutations("Kevin");
        salutation.addressLetter();
        salutation.signLetter();
        salutation.addressMemo();
        salutation.signMemo();
        
        
        
        
        
        
        
    }
}
