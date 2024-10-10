package lesson2;


/**
 * Write a description of class Salutations here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Salutations
{
    // Put your code here
    String name;
    public Salutations(String userName){
        name = userName;
    }
    
    public void addressLetter(){
        System.out.printf("\nDear %s", name);
    }
    
    public void signLetter(){
        System.out.printf("\nSincerely \n%s", name);
    }
    
    public void addressMemo(){
        System.out.printf("\nTo whom it may concern");
    }
    
    public void signMemo(){
        System.out.printf("\nBest, \n%s", name);
    }
}
