package lesson1;

public class Counter
{
    
    private int value;

    /**
     * Constructor for objects of class Counter
     */
    public Counter()
    {
        // initialise instance variables
        value = 0;
    }
    
    public int getValue(){
        return value;
    }
    
    public void click(){
        value += 1;
    }
    
    public void reset(){
        value = 0;
    }

    
}
