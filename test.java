import java.util.ArrayList;
import java.util.Iterator;
/**
 * Write a description of class test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class test
{
    // instance variables - replace the example below with your own
    public ArrayList<Integer> rewards = new ArrayList<Integer>(6);

    /**
     * Constructor for objects of class test
     */
    public test()
    {
        // initialise instance variables
        for (int i = 0; i <  6; i++) {
            rewards.add(0);
        }
        rewards.set(5, 2);
    }
    
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void sampleMethod()
    {
        // put your code here
        Iterator<Integer> itr = rewards.iterator();
        while (itr.hasNext()) {
            Integer number = itr.next();
            System.out.println(number);
        }
    }
}
