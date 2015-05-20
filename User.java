import java.lang.*;
import java.util.*;
/**
 * Class to run game methods to interact with uservallet
 * 
 * @author Yngve Olsen Ranestad
 * @version 20.05.15
 */
public class User
{
    /**
     * publicly create a UserVallet for use in both bandit and user
     */
    public UserVallet vallet = new UserVallet();
    /**
     * creates new bandit with same vallet created in user
     * as param
     */
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
        
    }
    
    /**
     * @param amount specifies amount to add to vallet
     */
    public void addBalance(int amount)
    {
        vallet.addBalance(amount);
    }
   
    /**
     * 
     */
    public void buyHat()
    {
        if (hat == null) {
            if (vallet.returnBalance() >= 10)
            {
                hat = store.returnHat();
                vallet.removeBalance(10);
                System.out.println("You bought a " 
                    + store.returnHat().type + ".");
            } 
            else {
                System.out.println("You cant afford a hat, " + 
                    "it costs 10 credits.");
            }
        } 
        else {
            System.out.println("You already have a hat!");
        }
    }
    
    /**
     * @return balance in UserVallet
     */
    public int returnBalance()
    {
        return vallet.returnBalance();
    }

    /**
     * @param  amount of lines to play
     */
    public void play(int amount)
    {
        bandit.play(amount);
    }
    
}