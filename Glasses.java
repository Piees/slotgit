
/**
 * subclass Glasses of Accessories
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
     * @param type of Glasses, example: sunglasses
     * @param price of Glasses
     * @param description of Glasses
     */
    public Glasses(String type, int price, String description)
    {
        super(type, price, description);
    }
    
    @Override
    public String returnType() {
        return type;
    }
    
    /**
     * prints glasses details
     */
    public void printDetails() {
        super.printDetails();
    }
}
