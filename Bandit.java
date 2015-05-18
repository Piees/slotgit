import java.util.*;
/**
 * @author Yngve 
 * @version 3
 */
public class Bandit extends Slot
{
    UserVallet vallet;
    BanditRng rng = new BanditRng();
    private int winnings;
    public static final ArrayList<String> ROWS = new ArrayList<String>();
    
    /**
     * public
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
     * spins if balance is greater than cost of game else prints error
     */
    public void play(int buyIn) 
    {
        winnings = 0;
        if ((vallet.returnBalance() >= buyIn) && (buyIn >= 1)) {
        System.out.println("**********");
        rng.reward();
//        Iterator<Integer> rewardsItr = rng.rewards.iterator();
//        while (rewardsItr.hasNext()) {
//            Integer rewardsNext = rewardsItr.next();
//            if (rewardsNext >
/**        if (rng.rewards.contains(1) || rng.rewards.contains(2) || rng.rewards.contains(3)) {
            for (int i = 1; i <= buyIn; i++) {
                winnings = winnings + rng.rewards.get(i);
            }
            
            vallet.addBalance(winnings);
            System.out.println("Du vant!");
        } else {
            vallet.removeBalance(buyIn);
            System.out.println("ÆSHJ taper");
        }**/
        winnings = 0;
        for (int i = 1; i <= buyIn; i++) {
            winnings = winnings + rng.rewards.get(i);
        }
        if (winnings == 0) {
            System.out.println("You lost!");
            vallet.removeBalance(buyIn);
        } else {
            for (int y = 1; y < ROWS.size(); y++) {
                if (rng.rewards.get(y) != 0) {
                    System.out.println("You won on " + ROWS.get(y) + " row");
                }
            }
            System.out.println("You won " + winnings + " credits!");
            vallet.addBalance(winnings);
        }
        System.out.println("Your current balance is: " + vallet.returnBalance());   
    }
    else {
            System.out.println("Add more credit");
        }
    }
}
