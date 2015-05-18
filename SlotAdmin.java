import java.util.*;
/**
 * Write a description of class SlotAdmin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SlotAdmin
{
    public static int[] reward = new int[10];
    public int[] spins = new int[10];
    public static int rewardSize;
    public static int i;
    public static String returnedReward;
    public static int[] rewardList = new int[9];
    static final int ORANGEPRIZE = 2;
    static final int APPLEPRIZE = 4;
    static final int JOKERPRIZE = 8;
    public static final ArrayList<String> SYMBOLS = new ArrayList<String>();
    //static final List<String> SYMBOLS = Arrays.asList("orange", "apple", "joker");
    //http://gabrito.com/post/instantiating-and-populating-a-list-or-collection
    static List<String> theRewards = Arrays.asList("**********","Rewards:","Orange = " + ORANGEPRIZE,"Apple = " + APPLEPRIZE, "Joker = " + JOKERPRIZE, 
                                                        "**********");
   
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
        rewardList[0] = 0;
        /*SYMBOLS.set(1, new String("apple"));
        SYMBOLS.set(2, new String("orange"));
        SYMBOLS.set(3, new String("joker"));*/
    }
    
    /**
     * clears out rewardList from 0 to 8
     */
    public static void clearRewardList()
    {
        for (int j = 0; j <= 8; j++) {
            rewardList[j] = 0;
        }
    }
    
    /**
     * @returns int from index of reward[]
     */
    public int getRewardInfo(int i)
    {
        return reward[i];
    }
        
    
    /**
     * @returns true if rewardList is empty
     * for use in bandit to check if you won anything
     */
    public static boolean rewardListEmpty(int payin)
    {
        for (int j = 0; j <= payin - 1; j++) {
            if (rewardList[j] == 1) {
                return false;
            }
        }
            return true;
    }
        
    /**
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
