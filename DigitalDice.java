
import java.util.Random;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DigitalDice extends JFrame {
    private JLabel diceLabel;
    private Random random;
    
    public DigitalDice() {
        random = new Random();
        
        setTitle("Digital Dice Roller");
        setSize(300, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        
        // Dice display
        diceLabel = new JLabel("⚀", JLabel.CENTER);
        diceLabel.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 120));
        add(diceLabel, BorderLayout.CENTER);
        
        // Roll button
        JButton rollButton = new JButton("Roll Dice");
        rollButton.setFont(new Font("Arial", Font.BOLD, 18));
        rollButton.addActionListener(e -> rollDice());
        add(rollButton, BorderLayout.SOUTH);
    }
    
    private void rollDice() {
        int number = random.nextInt(6) + 1;
        String[] diceFaces = {"⚀", "⚁", "⚂", "⚃", "⚄", "⚅"};
        diceLabel.setText(diceFaces[number - 1]);
        setTitle("You rolled: " + number);
    }
    
    public static void main(String[] args) {
        new DigitalDice().setVisible(true);
    }
}
