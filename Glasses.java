
/**
 * subclass Glasses of Accessories
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Glasses extends Accessories
{  
    private int id;

    /**
     * Constructor for objects of class Glasses
     * @param type of Glasses, example: sunglasses
     * @param price of Glasses
     * @param description of Glasses
     * @param id of Glasses
     */
    public Glasses(String type, int price, 
        String description, int id)
    {
        super(type, price, description);
        this.id = id;
    }
    
    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Id of glasses: " + id);
    }
}
