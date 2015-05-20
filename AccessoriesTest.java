

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class AccessoriesTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class AccessoriesTest
{
    /**
     * Default constructor for test class AccessoriesTest
     */
    public AccessoriesTest()
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
     * override test for returnType in hat and glasses
     * 
     */
    @Test
    public void accTest()
    {
        Hat hat1 = new Hat("Fedora", 10, "A fedora", 1);
        Glasses glasses1 = new Glasses("Sunglasses", 12, "It's sunglasses", 1);
        Hat hat2 = new Hat("Cool fedora", 20, "A cool fedora", 2);
        assertEquals(hat1.returnType(), "Fedora");
        assertEquals(glasses1.returnType(), "Sunglasses", 2);
    }
}
