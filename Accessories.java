
/**
 * Superclass for different accessories sold in AccessoriesStore
 * 
 * @author Yngve Olsen Ranestad
 * @version 20.05.15
 */
public class Accessories
{
    /**
     * price of product
     */
    public int price;
    /**
     * type of accessory
     * example: fedora or sunglasses
     */
    public String type;
    /**
     * description of accessory
     */
    public String description;

    /**
     * @param type of accessory, example: fedora or sunglasses
     * @param price price of product
     * @param description describe the product
     * Constructor for objects of class Accessories
     */
    public Accessories(String type, int price, String description)
    {
        // initialise instance variables
        this.type = type;
        this.price = price;
        this.description = description;
    }
    
    /**
     * @return price of product
     */
    public int returnPrice() {
        return price;
    }
    
    /**
     * prints basic info about products
     */
    public void printDetails() {
        System.out.println("################");
        System.out.println("Type: " + type);
        System.out.println("Price: " + price);
        System.out.println("Description: " + description);
    }
    
    /**
     * @return type of product, example: fedora or sunglasses
     */
    public String returnType() {
        return type;
    }
}
