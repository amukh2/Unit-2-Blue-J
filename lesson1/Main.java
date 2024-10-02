package lesson1;


/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args){
        Counter myCounter = new Counter();
        myCounter.click();
        System.out.println(myCounter.getValue());
    }
}
