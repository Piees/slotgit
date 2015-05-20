import java.util.ArrayList;
/**
 * Stores 4 pre-made products and are imported to
 * buy accessories and browsing inventory
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AccessoriesStore
{
    // instance variables - replace the example below with your own
    private ArrayList<Accessories> accs = new ArrayList<Accessories>();
    private Accessories hat;
    private Accessories glasses;

    /**
     * Constructor for objects of class AccessoriesStore
     */
    public AccessoriesStore()
    {
        // initialise instance variables
        accs.add(new Hat("Fedora", 10, 
            "A regular fedora", 1));
        accs.add(new Hat("Cool Fedora", 10, 
            "This is a cool fedora", 2));
        accs.add(new Glasses("Sunglasses", 10, 
            "Regular sunglasses for use outside", 1));
        accs.add(new Glasses("Cool Sunglasses", 15, 
            "These sunglasses are so cool you could wear them outside", 2));
    }
    
    
    /**
     * Add existing Accessories object to ArrayList
     * @param accy (existing Accessories object)
     */
    public void addAccessory(Accessories accy)
    {
        accs.add(accy);
    }
    
    /**
     * @return hat Accessories
     */
    public Accessories returnHat()
    {
        for (Accessories accessories : accs) {
            if (accessories instanceof Hat) {
                hat = accessories;
            }
        }
        return hat;
    }
    
    /**
     * @return glasses Accessories
     */
    public Accessories returnGlasses()
    {
        for (Accessories accessories : accs) {
            if (accessories instanceof Accessories) {
                glasses = accessories;
            }
        }
        return glasses;
    }
    
    /**
     * prints all hats with details
     */
    public void printHats()
    {
        for (Accessories accessories : accs) {
            if (accessories instanceof Hat) {
                accessories.printDetails();
            }
        }
    }
    
    /**
     * prints all glasses with details
     */
    public void printGlasses()
    {
        for (Accessories accessories : accs) {
            if (accessories instanceof Glasses) {
                accessories.printDetails();
            }
        }
    }
}
