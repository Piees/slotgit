import java.util.ArrayList;
/**
 * Write a description of class AccessoriesStore here.
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
        accs.add(new Hat("Fedora", 10, "A regular fedora"));
        accs.add(new Hat("Cool Fedora", 10, "This is a cool fedora"));
        accs.add(new Glasses("Sunglasses", 10, "Regular sunglasses for use outside"));
        accs.add(new Glasses("Cool Sunglasses", 15, "These sunglasses are so cool you could wear them outside"));
    }
    
    
    /**
     * Add existing Accessories object to ArrayList
     * @param accy (existing Accessories object)
     */
    public void addAccessory(Accessories accy)
    {
        accs.add(accy);
    }
    
    public Accessories returnHat()
    {
        for (Accessories accessories : accs) {
            if (accessories instanceof Hat) {
                hat = accessories;
            }
        }
        return hat;
    }
    
    public Accessories returnGlasses()
    {
        for (Accessories accessories : accs) {
            if (accessories instanceof Accessories) {
                glasses = accessories;
            }
        }
        return glasses;
    }
    
    public void printHats()
    {
        for (Accessories accessories : accs) {
            if (accessories instanceof Hat) {
                accessories.printDetails();
            }
        }
    }
    
    public void printGlasses()
    {
        for (Accessories accessories : accs) {
            if (accessories instanceof Glasses) {
                accessories.printDetails();
            }
        }
    }
}
