
/**
 * Write a description of class Glasses here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Glasses extends Accessories
{
    // instance variables - replace the example below with your own
    private String type;

    /**
     * Constructor for objects of class Glasses
     */
    public Glasses(String type, int price, String description)
    {
        // initialise instance variables
        super(type, price, description);
    }
    
    @Override
    public String returnType() {
        return type;
    }
    
    public void printDetails() {
        super.printDetails();
    }
}
