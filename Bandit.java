import java.util.*;
/**
 * Slot machine operations manager
 * 
 * @author Yngve 
 * @version 3
 */
public class Bandit
{
    UserVallet vallet;
    BanditRng rng = new BanditRng();
    SlotAdmin adm = new SlotAdmin();
    private int winnings;
    /**
     * Arraylist for outputting which row user won on
     */
    public static final ArrayList<String> ROWS = new ArrayList<String>();
    
    /**
     * @param k Uservallet to pass vallet in user
     */
    public Bandit(UserVallet k)
    {
        vallet = k;
        ROWS.clear();
        ROWS.add(new String("Error"));
        ROWS.add(new String("middle"));
        ROWS.add(new String("upper"));
        ROWS.add(new String("bottom"));
        ROWS.add(new String("upper left to bottom right"));
        ROWS.add(new String("bottom left to upper right"));
    }
    
    /**
     * prints rewards, local version of adm.printRewards()
     */
    public void allRewards() 
    {
        adm.printRewards();
    }

    /**
     * @param buyIn cost of current game
     * spins if balance is greater than cost of game else prints error
     */
    public void play(int buyIn) 
    {
        winnings = 0;
        if ((vallet.returnBalance() >= buyIn) && (buyIn >= 1)) {
            System.out.println("**********");
            rng.reward();
            winnings = 0;
            for (int i = 1; i <= buyIn; i++) {
                winnings = winnings + rng.rewards.get(i);
            }
            if (winnings == 0) {
                System.out.println("You lost!");
                vallet.removeBalance(buyIn);
            } 
            else {
                for (int y = 1; y < ROWS.size(); y++) {
                    if (rng.rewards.get(y) != 0) {
                        System.out.println("You won on " 
                            + ROWS.get(y) + " row");
                    }
                }
                System.out.println("You won " + winnings + " credits!");
                vallet.addBalance(winnings);
            }
            System.out.println("Your current balance is: " 
                + vallet.returnBalance());   
        }
        else {
            System.out.println("Add more credit");
        }
    }
}
