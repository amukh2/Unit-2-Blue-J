package lesson2;


public class Pinata
{
    // Instance variables
    private String candy;    // what kind of candy is inside
    private String color;    
    private String shape;
    
    // Constructor without parameters
    public Pinata()
    {
        candy = "hard candy";
        color = "rainbow";
        shape = "donkey";
    }
    
    // Add an overloaded constructor that allows the user
    // to customize all of the instance variables
    public Pinata(String candy1, String color1, String shape1){
        candy = candy1;
        color = color1;
        shape = shape1;
    
    }
    
    // Add an overloaded constructor that allows the user
    // to customize the color and shape\
    public Pinata(String color1, String shape1){
        candy = "gummy candy";
        color = color1;
        shape = shape1;
    
    }
    
    // Add an overloaded constructor that allows the user
    // to customize the candy
    public Pinata(String candy1){
        candy = candy1;
        color = "blue";
        shape = "donkey";
    
    }
    
    
    public String toString()
    {
        return color + " " + shape + " pinata filled with " + candy;
    }
}
