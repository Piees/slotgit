import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Dimension;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;
/**
 * Write a description of class Gui here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gui
{
    User usr = new User();
    private int addBalanceInputAmount;
    private String stringAmount;
    final HashMap<Integer, ArrayList<Integer>> rewardAllocation = new HashMap<Integer, ArrayList<Integer>>(); //key is placement and value is rewards lines
    private int oldBalance;
    JLabel creditLabel;
    JLabel spin1Label;
    JLabel spin2Label;
    JLabel spin3Label;
    JLabel spin4Label;
    JLabel spin5Label;
    JLabel spin6Label;
    JLabel spin7Label;
    JLabel spin8Label;
    JLabel spin9Label;
    ImageIcon apple = new ImageIcon("images/apple.jpg");
    ImageIcon orange = new ImageIcon("images/orange.jpg");
    ImageIcon joker = new ImageIcon("images/joker.png");
    ImageIcon appleWin = new ImageIcon("images/appleWin.png");
    ImageIcon orangeWin = new ImageIcon("images/orangeWin.png");
    ImageIcon jokerWin = new ImageIcon("images/jokerWin.png");
    
    public Gui()
    {
        rewardAllocation.put(1, new ArrayList<Integer>(Arrays.asList(2, 4)));
        rewardAllocation.put(2, new ArrayList<Integer>(Arrays.asList(2)));
        rewardAllocation.put(3, new ArrayList<Integer>(Arrays.asList(2, 5)));
        rewardAllocation.put(4, new ArrayList<Integer>(Arrays.asList(1)));
        rewardAllocation.put(5, new ArrayList<Integer>(Arrays.asList(1, 4, 5)));
        rewardAllocation.put(6, new ArrayList<Integer>(Arrays.asList(1)));
        rewardAllocation.put(7, new ArrayList<Integer>(Arrays.asList(3, 5)));
        rewardAllocation.put(8, new ArrayList<Integer>(Arrays.asList(3)));
        rewardAllocation.put(9, new ArrayList<Integer>(Arrays.asList(3, 4)));
        JFrame frame = new JFrame("Spins'O'Fun!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        
        /**
         * @JLabel
         * spin1Label
         */
        spin1Label = new JLabel();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 1;
        gbc.gridy = 0;
        spin1Label.setText("<html><body style='height:57px'>Welcome<body></html>");
        frame.getContentPane().add(spin1Label, gbc);
        
        /**
         * @JLabel
         * spin2Label
         */
        spin2Label = new JLabel();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 2;
        gbc.gridy = 0;
        spin2Label.setText("<html><body style='height:57px'>to<body></html>");
        frame.getContentPane().add(spin2Label, gbc);
        
        /**
         * @JLabel
         * spin3Label
         */
        spin3Label= new JLabel();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 3;
        gbc.gridy = 0;
        spin3Label.setText("<html><body style='height:57px'>Slots'O'Fun!<body></html>");
        frame.getContentPane().add(spin3Label, gbc);
        /**
         * @JLabel
         * spin4Label
         */
        spin4Label = new JLabel();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 1;
        gbc.gridy = 1;
        spin4Label.setText("<html><body style='height:57px'>Welcome<body></html>");
        frame.getContentPane().add(spin4Label, gbc);
        
        /**
         * @JLabel
         * spin5Label
         */
        spin5Label = new JLabel();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 2;
        gbc.gridy = 1;
        spin5Label.setText("<html><body style='height:57px'>to<body></html>");
        frame.getContentPane().add(spin5Label, gbc);
        
        /**
         * @JLabel
         * spin6Label
         */
        spin6Label= new JLabel();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 3;
        gbc.gridy = 1;
        spin6Label.setText("<html><body style='height:57px'>Slots'O'Fun!<body></html>");
        frame.getContentPane().add(spin6Label, gbc);
        /**
         * @JLabel
         * spin7Label
         */
        spin7Label = new JLabel();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 1;
        gbc.gridy = 2;
        spin7Label.setText("<html><body style='height:57px'>Welcome<body></html>");
        frame.getContentPane().add(spin7Label, gbc);
        
        /**
         * @JLabel
         * spin8Label
         */
        spin8Label = new JLabel();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 2;
        gbc.gridy = 2;
        spin8Label.setText("<html><body style='height:57px'>to<body></html>");
        frame.getContentPane().add(spin8Label, gbc);
        
        /**
         * @JLabel
         * spin9Label
         */
        spin9Label= new JLabel();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 3;
        gbc.gridy = 2;
        spin9Label.setText("<html><body style='height:57px'>Slots'O'Fun!<body></html>");
        frame.getContentPane().add(spin9Label, gbc);
        
        /**
         * @JLabel
         * explainatory text for addBalanceInput
         */
        JLabel addBalanceInputLabel = new JLabel();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        addBalanceInputLabel.setText("Add amount of balance to be added: ");
        frame.getContentPane().add(addBalanceInputLabel, gbc);
        
        
        /**
         * @JTextField
         * Input for addBalance
         */
        final JTextField addBalanceInput = new JTextField();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 2;
        gbc.gridy = 3;
        frame.getContentPane().add(addBalanceInput, gbc);
        
        
        /**
         * @button
         * adds balance
         */
        JButton addBalanceButton = new JButton(new AbstractAction() {
            public void actionPerformed(ActionEvent e)
            {
                String stringAmount = addBalanceInput.getText();
                addBalanceInputAmount = Integer.valueOf(stringAmount);
                usr.vallet.addBalance(addBalanceInputAmount);
                creditLabel.setText("Credits: " + usr.vallet.returnBalance());
                addBalanceInput.setText("");
                JOptionPane.showMessageDialog(null, "Your current balance is: " + usr.vallet.returnBalance());
            }
        });
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 4;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        addBalanceButton.setText("Add Balance");
        frame.getContentPane().add(addBalanceButton, gbc);
        
        
        /**
         * @button
         * plays 1 line
         */
        JButton pOneBut = new JButton(new AbstractAction(){
        public void actionPerformed(ActionEvent e)
        {
            oldBalance = usr.vallet.returnBalance();
            usr.play(1);
            creditLabel.setText("Credits: " + usr.vallet.returnBalance());
            spin1Label.setIcon(returnIcon(1, 1));
            spin2Label.setIcon(returnIcon(2, 1));
            spin3Label.setIcon(returnIcon(3, 1));
            spin4Label.setIcon(returnIcon(4, 1));
            spin5Label.setIcon(returnIcon(5, 1));
            spin6Label.setIcon(returnIcon(6, 1));
            spin7Label.setIcon(returnIcon(7, 1));
            spin8Label.setIcon(returnIcon(8, 1));
            spin9Label.setIcon(returnIcon(9, 1));
            rewardPopup(1);
        }});
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 4;
        pOneBut.setText("Play 1 line");
        frame.getContentPane().add(pOneBut, gbc);
        
        /**
         * @button
         * play 2 lines
         */
        JButton pTwoBut = new JButton(new AbstractAction(){
            public void actionPerformed(ActionEvent e)
            {
                oldBalance = usr.vallet.returnBalance();
                usr.play(2);
                creditLabel.setText("Credits: " + usr.vallet.returnBalance());
                spin1Label.setIcon(returnIcon(1, 2));
                spin2Label.setIcon(returnIcon(2, 2));
                spin3Label.setIcon(returnIcon(3, 2));
                spin4Label.setIcon(returnIcon(4, 2));
                spin5Label.setIcon(returnIcon(5, 2));
                spin6Label.setIcon(returnIcon(6, 2));
                spin7Label.setIcon(returnIcon(7, 2));
                spin8Label.setIcon(returnIcon(8, 2));
                spin9Label.setIcon(returnIcon(9, 2));
                rewardPopup(2);
            }
        });
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 1;
        gbc.gridy = 4;
        pTwoBut.setText("Play 2 lines");
        frame.getContentPane().add(pTwoBut, gbc);
        
        /**
         * @button
         * play 3 lines
         */
        JButton pThreeBut = new JButton(new AbstractAction(){
            public void actionPerformed(ActionEvent e)
            {
            oldBalance = usr.vallet.returnBalance();
            usr.play(3);
            creditLabel.setText("Credits: " + usr.vallet.returnBalance());
            spin1Label.setIcon(returnIcon(1, 3));
            spin2Label.setIcon(returnIcon(2, 3));
            spin3Label.setIcon(returnIcon(3, 3));
            spin4Label.setIcon(returnIcon(4, 3));
            spin5Label.setIcon(returnIcon(5, 3));
            spin6Label.setIcon(returnIcon(6, 3));
            spin7Label.setIcon(returnIcon(7, 3));
            spin8Label.setIcon(returnIcon(8, 3));
            spin9Label.setIcon(returnIcon(9, 3));
            rewardPopup(3);
            }
        });
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 2;
        gbc.gridy = 4;
        pThreeBut.setText("Play 3 lines");
        frame.getContentPane().add(pThreeBut, gbc);
        
        /**
         * @button
         * play 4 lines
         */
        JButton pFourBut = new JButton(new AbstractAction(){
            public void actionPerformed(ActionEvent e)
            {
                oldBalance = usr.vallet.returnBalance();
                usr.play(4);
                creditLabel.setText("Credits: " + usr.vallet.returnBalance());
                spin1Label.setIcon(returnIcon(1, 4));
                spin2Label.setIcon(returnIcon(2, 4));
                spin3Label.setIcon(returnIcon(3, 4));
                spin4Label.setIcon(returnIcon(4, 4));
                spin5Label.setIcon(returnIcon(5, 4));
                spin6Label.setIcon(returnIcon(6, 4));
                spin7Label.setIcon(returnIcon(7, 4));
                spin8Label.setIcon(returnIcon(8, 4));
                spin9Label.setIcon(returnIcon(9, 4));
                rewardPopup(4);
            }
        });
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx =3;
        gbc.gridy = 4;
        pFourBut.setText("Play 4 lines");
        frame.getContentPane().add(pFourBut, gbc);
        
        /**
         * @button
         * play 5 lines
         */
        JButton pFiveBut = new JButton(new AbstractAction(){
            public void actionPerformed(ActionEvent e)
            {
                oldBalance = usr.vallet.returnBalance();
                usr.play(5);
                creditLabel.setText("Credits: " + usr.vallet.returnBalance());
                spin1Label.setIcon(returnIcon(1, 5));
                spin2Label.setIcon(returnIcon(2, 5));
                spin3Label.setIcon(returnIcon(3, 5));
                spin4Label.setIcon(returnIcon(4, 5));
                spin5Label.setIcon(returnIcon(5, 5));
                spin6Label.setIcon(returnIcon(6, 5));
                spin7Label.setIcon(returnIcon(7, 5));
                spin8Label.setIcon(returnIcon(8, 5));
                spin9Label.setIcon(returnIcon(9, 5));
                rewardPopup(5);
            }
        });
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 4;
        gbc.gridy = 4;
        pFiveBut.setText("Play 5 lines");
        frame.getContentPane().add(pFiveBut, gbc);
        
         /**
         * @JLabel
         * current credits
         */
        creditLabel = new JLabel();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 2;
        creditLabel.setText("Credits: " + usr.vallet.returnBalance());
        frame.getContentPane().add(creditLabel, gbc);
        
    
        // pack and view frame
        frame.pack();
        frame.setSize(650, 350);
        frame.setVisible(true);
    }
    
    /**
     * used in returnIcon to clear welcome text after spin has been done
     */
    public void clearLabelText() {
        spin1Label.setText("");
        spin2Label.setText("");
        spin3Label.setText("");
        spin4Label.setText("");
        spin5Label.setText("");
        spin6Label.setText("");
        spin7Label.setText("");
        spin8Label.setText("");
        spin9Label.setText("");
    }
    
    public ImageIcon returnWinIcon(int i){
        if (usr.bandit.adm.getRewardInfo(i) == usr.bandit.adm.APPLEPRIZE) {
            clearLabelText();
            return appleWin;
        } else if (usr.bandit.adm.getRewardInfo(i) == usr.bandit.adm.ORANGEPRIZE) {
            clearLabelText();
            return orangeWin;
        } else if (usr.bandit.adm.getRewardInfo(i) == usr.bandit.adm.JOKERPRIZE) {
            clearLabelText();
            return jokerWin;
        }
        return null;
    }
    
    public ImageIcon returnLossIcon(int i) {
        if (usr.bandit.adm.getRewardInfo(i) == usr.bandit.adm.APPLEPRIZE) {
            clearLabelText();
            return apple;
        } else if (usr.bandit.adm.getRewardInfo(i) == usr.bandit.adm.ORANGEPRIZE) {
            clearLabelText();
            return orange;
        } else if (usr.bandit.adm.getRewardInfo(i) == usr.bandit.adm.JOKERPRIZE) {
            clearLabelText();
            return joker;
        }
        return null;
    }
    
    /**
     * returns icon for label i for amounts of lines played
     */
    public ImageIcon returnIcon(int i, int line) { //i = 4, line = 1
        for (int itr : rewardAllocation.get(i)) {//itr=1
            if ((usr.bandit.rng.rewards.get(itr) !=0) && itr <= line) {
                return returnWinIcon(i);
            }
        }
        return returnLossIcon(i);
    }
    
    public void rewardPopup(int i) {
        if (oldBalance <= (i - 1)) {
            JOptionPane.showMessageDialog(null, "Insufficient balance, please add more");
        } else {
            JOptionPane.showMessageDialog(null, "Your balance changed by " + (usr.vallet.returnBalance() - oldBalance));
        }
    }
}
