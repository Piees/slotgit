import java.util.ArrayList;
/**
 * @author Yngve
 * @version 3
 */
public class BanditRng
{
    static int i;
    static int j;
    static int[] spin;
    static String[] args;
    public ArrayList<Integer> rewards = new ArrayList<Integer>(6);
    static int k;  
    SlotAdmin adm = new SlotAdmin();
    
    
    /**
     * constructor
     */
    public BanditRng()
    {
        for (int i = 0; i <  6; i++) {
            rewards.add(0);
        }
    }
    
    /**
     * spinmath
     * @param brgs math
     */
    public void spin() {
            for (j = 1; j <= 3; j++) {
                for (i = 1; i <= 3; i++) {  
                    k++;
                    adm.spins[k] = adm.spins[k] + 1 + (int)
                        (Math.random() * ((3 - 1) + 1));
                    if ((adm.spins[k] == 1) && !(i % 3 == 0)) {
                        System.out.print("Orange ");
                        adm.reward[k] = adm.ORANGEPRIZE;
                    } 
                    else if ((adm.spins[k] == 2) && !(i % 3 == 0)) {
                        System.out.print("Apple ");
                        adm.reward[k] = adm.APPLEPRIZE;
                    } 
                    else if ((adm.spins[k] == 3) && !(i % 3 == 0)) {
                        System.out.print("Joker ");
                        adm.reward[k] = adm.JOKERPRIZE;
                    }
                    else if ((adm.spins[k] == 1) && (i % 3 == 0)) {
                        System.out.println("Orange");
                        adm.reward[k] = adm.ORANGEPRIZE;
                    } 
                    else if ((adm.spins[k] == 2) && (i % 3 == 0)) {
                        System.out.println("Apple");
                        adm.reward[k] = adm.APPLEPRIZE;
                    } 
                    else if ((adm.spins[k] == 3) && (i % 3 == 0)) {
                        System.out.println("Joker");
                        adm.reward[k] = adm.JOKERPRIZE;
                    }
                    adm.spins[k] = 0;
                }
            }
            k = 0;     
        } 
        
    public void resetRewards(){
        for (int i = 0; i <  6; i++) {
            rewards.set(i, 0);
        }  
    }
        
    public void reward()
    {
        resetRewards();
        spin();
            if (((adm.reward[1] == adm.reward[2]) && 
                (adm.reward[1] == adm.reward[3]) && 
                (adm.reward[2] == adm.reward[3]))) {
                    rewards.set(2, adm.reward[2]);
                }
            if ((adm.reward[4] == adm.reward[5]) && 
                    (adm.reward[4] == adm.reward[6]) && 
                    (adm.reward[5] == adm.reward[6])) {
                        rewards.set(1, adm.reward[5]);
                    }
            if ((adm.reward[7] == adm.reward[8]) &&
                     (adm.reward[7] == adm.reward[9]) &&
                     (adm.reward[8] == adm.reward[9])) {
                         rewards.set(3, adm.reward[8]);
                    }
            if ((adm.reward[1] == adm.reward[5]) &&
                     (adm.reward[1] == adm.reward[9]) &&
                     (adm.reward[5] == adm.reward[9])) {
                         rewards.set(4, adm.reward[5]);
                    }
            if ((adm.reward[7] == adm.reward[5]) &&
                     (adm.reward[7] == adm.reward[3]) &&
                     (adm.reward[5] == adm.reward[3])) {
                         rewards.set(5, adm.reward[5]);
                    }
    }
}
