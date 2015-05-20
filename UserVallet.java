
/**
 * Vallet for user to be used in User and passed to Bandit
 * 
 * @author Yngve Olsen Ranestad
 * @version 20.05.15
 */
public class UserVallet
{
    private int balance;

    /**
     * Constructor for objects of class UserVallet
     */
    public UserVallet()
    {
        balance = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     * @return balance of vallet
     */
    public int returnBalance()
    {
        return balance;
    }
    
    /**
     * sets balance to 0
     */
    public void resetBalance()
    {
        balance  = 0;
    }
    
    /**
     * @param amount for amount to remove
     * @return balance after amount is removed
     */
    public int removeBalance(int amount)
    {
        balance = balance - amount;
        return balance;
    }
    
    /**
     * @param amount for amount to remove
     * @return balance after amount is added
     */
    public int addBalance(int amount)
    {
        balance = balance + amount;
        return balance;
    }
}
