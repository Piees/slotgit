
/**
 * Write a description of class Accessories here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Accessories
{
    // instance variables - replace the example below with your own
    public int price;
    public String type;
    public String description;

    /**
     * Constructor for objects of class Accessories
     */
    public Accessories(String type, int price, String description)
    {
        // initialise instance variables
        this.type = type;
        this.price = price;
        this.description = description;
    }
    
    public int returnPrice() {
        return price;
    }
    
    public void printDetails() {
        System.out.println("################");
        System.out.println("Type: " + type);
        System.out.println("Price: " + price);
        System.out.println("Description: " + description);
    }
    
    public String returnType() {
        return type;
    }
}
