
/**
 * Write a description of class Hat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hat extends Accessories
{
    // instance variables - replace the example below with your own
    private String type;

    /**
     * Constructor for objects of class Hat
     */
    public Hat(String type, int price, String description)
    {
        // initialise instance variables
        super(type, price, description);
        this.type = type;
    }
   
    @Override
    public String returnType() {
        return type;
    }
    
    public void printDetails() {
        super.printDetails();
    }

}
