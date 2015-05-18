
/**
 * Write a description of class UserVallet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class UserVallet
{
    // instance variables - replace the example below with your own
    private int balance;

    /**
     * Constructor for objects of class UserVallet
     */
    public UserVallet()
    {
        // initialise instance variables
        balance = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int returnBalance()
    {
        return balance;
    }
    
    public void resetBalance()
    {
        balance  = 0;
    }
    
    public int removeBalance(int amount)
    {
        return balance = balance - amount;
    }
    
    public int addBalance(int amount)
    {
        return balance =balance + amount;
    }
}
