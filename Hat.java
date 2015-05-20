
/**
 * subclass Hat of Accessories
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
     * @param type of Hat, example: fedora
     * @param price of Hat
     * @param description of Hat
     */
    public Hat(String type, int price, String description)
    {
        super(type, price, description);
        this.type = type;
    }
   
    @Override
    public String returnType() {
        return type;
    }
    
    /**
     * prints details of Hat
     */
    public void printDetails() {
        super.printDetails();
    }

}
