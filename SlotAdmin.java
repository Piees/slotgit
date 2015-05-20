import java.util.*;
/**
 * reward and list manager
 * 
 * @author Yngve Olsen Ranestad
 * @version 20.05.15
 */
public class SlotAdmin
{
    /**
     * used to store value of each symbol after a spin
     */
    public static int[] reward = new int[10];
    /**
     * stores base value of each symbol after spin
     */
    public int[] spins = new int[10];
    static final int ORANGEPRIZE = 2;
    static final int APPLEPRIZE = 4;
    static final int JOKERPRIZE = 8;
    /**
     * use index values next to base value of spin to return string fo symbol
     */
    public static final ArrayList<String> SYMBOLS = new ArrayList<String>();
    //http://gabrito.com/post/instantiating-and-populating-a-list-or-collection
    static List<String> theRewards = Arrays.asList("**********", "Rewards:", 
        "Orange = " + ORANGEPRIZE, "Apple = " + APPLEPRIZE, "Joker = " 
        + JOKERPRIZE, "**********");
   
    /**
     * Constructor for objects of class SlotAdmin
     */
    public SlotAdmin()
    {
        SYMBOLS.clear();
        SYMBOLS.add(new String("Error"));
        SYMBOLS.add(new String("orange"));
        SYMBOLS.add(new String("apple"));
        SYMBOLS.add(new String("joker"));
    }
    
    /**
     * @param i to return specific reward
     * @return i from index of reward[]
     */
    public int getRewardInfo(int i)
    {
        return reward[i];
    }
        
    /**
     * @param rewardLine for line to be set
     * @param newReward for value to be set
     * sets reward to rewardLine from newReward
     */
    public static void setReward(int rewardLine, String newReward)
    {
        theRewards.set(rewardLine, newReward);
    }
    
    /**
     * get rewards
     * http://stackoverflow.com/questions/2697182/how-to-use-an-array-list
     */
    public static void printRewards() 
    {   
        for (String s : theRewards) {
            System.out.println(s);   
        }
    }
}
