import java.lang.*;
import java.util.*;
/**
 * Write a description of class User here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class User
{
    // instance variables - replace the example below with your own
    public UserVallet vallet = new UserVallet();
    public Bandit bandit = new Bandit(vallet);
    private static boolean run = true;
    private Accessories hat;
    private Accessories glasses;
    private AccessoriesStore store = new AccessoriesStore();
    
    /**
     * Constructor for objects of class User
     */
    public User()
    {
        // initialise instance variables
    }
    
    public void addBalance(int amount)
    {
        vallet.addBalance(amount);
    }
   
    public void buyHat(/**AccessoriesStore store**/)
    {
        if (hat == null) {
            if (vallet.returnBalance() >= 10)
            {
                hat = store.returnHat();
                vallet.removeBalance(10);
                System.out.println("You bought a " +store.returnHat().type + ".");
            } else {
                System.out.println("You cant afford a hat, it costs 10 credits.");
            }
        } else {
            System.out.println("You already have a hat!");
        }
    }
    
    public int returnBalance()
    {
        return vallet.returnBalance();
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  amount
     */
    public void play(int amount)
    {
        bandit.play(amount);
    }
    
}