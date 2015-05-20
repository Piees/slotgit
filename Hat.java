
/**
 * subclass Hat of Accessories
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hat extends Accessories
{
    private int id;

    /**
     * Constructor for objects of class Hat
     * @param type of Hat, example: fedora
     * @param price of Hat
     * @param description of Hat
     * @param id of Hat
     */
    public Hat(String type, int price, 
        String description, int id)
    {
        super(type, price, description);
        this.id = id;
    }
    
    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Id of hat: " + id);
    }
}
