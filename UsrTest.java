
import java.util.ArrayList;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class UsrTest for class User
 *
 * @author  Yngve Olsen Ranestad
 * @version 20.05.15
 */
public class UsrTest
{
    private ArrayList<Integer> winAnalyst = new ArrayList<Integer>();
    private int x;
    private int y;
    private String streng;
    private int winInt;
    /**
     * Default constructor for test class UsrTest
     */
    public UsrTest()
    {
       
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    /**
     * tests average balance after 100 games starting with 100 balance
     * and does this gameamount times
     */
    @Test
    public void usertest()
    {
        int gameamount = 10000;
        y = 0;
        while (y != gameamount) {
            x = 0;
            User user2 = new User();
            user2.addBalance(100);
            y = y + 1;
            while (x != 100) {
                user2.play(5);
                x = x + 1;
                assert (user2.returnBalance() >= 0) : "Vallet is less than 0";
            }
            System.out.println(user2.returnBalance());
            if (user2.returnBalance() > 4) {
                winInt = winInt + user2.returnBalance();
            }
            System.out.println("Average win: " + winInt / gameamount);
        }
    }
}

