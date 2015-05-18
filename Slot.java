
/**
 * Write a description of class Slot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Slot
{
    // instance variables - replace the example below with your own
    
    SlotAdmin adm = new SlotAdmin();

    /**
     * Constructor for objects of class Slot
     */
    public Slot()
    {
        // initialise instance variables
    }


    /**
     * prints rewards
     */
    public void allRewards() 
    {
       adm.printRewards();
    }
}
