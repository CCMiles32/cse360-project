//package GUI;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import javax.swing.*;

public class cookTimePage extends cartPage implements ActionListener{
	//initializing variables
    static JFrame cookTimePage = new JFrame();
    JLabel acceptedOrderLabel = new JLabel();
    JLabel waitTimeLabel = new JLabel();
    JLabel titleLabel = new JLabel("Wait Time Page");
    JLabel statusLabel = new JLabel("Status: Cooking", JLabel.LEFT);
    JLabel asuImage3 = new JLabel(new ImageIcon(new ImageIcon(getClass().getResource("asu.png")).getImage().getScaledInstance(175, 75, Image.SCALE_DEFAULT)));
    JButton backButton = new JButton("Back");
    cookTimePage(int estWaitTime) {
    	//title properties
    	asuImage3.setBounds(0, 0, 175, 75);
    	asuImage3.setBackground(Color.WHITE);
    	asuImage3.setOpaque(true);
    	
    	titleLabel.setBounds(175, 0, 525, 75);
    	titleLabel.setFont(new java.awt.Font(Font.SANS_SERIF, java.awt.Font.BOLD, 40));
    	titleLabel.setBackground(Color.white);
    	titleLabel.setForeground(SunDevilBlack);
    	titleLabel.setOpaque(true);
    	
    	//declaring variables properties
        acceptedOrderLabel.setText("Your order has been accepted");
        acceptedOrderLabel.setFont(new java.awt.Font("Serif", java.awt.Font.PLAIN, 25));
        acceptedOrderLabel.setBounds(125, 180, 350, 30);
        
        statusLabel.setFont(new java.awt.Font("Serif", java.awt.Font.PLAIN, 25));
        statusLabel.setForeground(Color.RED);
        statusLabel.setBounds(125, 150, 350, 30);
         
        backButton.setBounds(50,300,100,50);
        backButton.setBackground(SunDevilBlack);
        backButton.setForeground(Color.WHITE);
        backButton.addActionListener(this);
        
        waitTimeLabel.setText("Estimated wait time is " + estWaitTime + " minutes");
        waitTimeLabel.setFont(new java.awt.Font("Serif", java.awt.Font.PLAIN, 25));
        waitTimeLabel.setForeground(Color.WHITE);
        waitTimeLabel.setBackground(SunDevilMaroon);
        waitTimeLabel.setBorder(blackBrdr);
        waitTimeLabel.setOpaque(true);
        waitTimeLabel.setBounds(125, 210, 350, 30);

        //setting the scene and adding content to the JFrame
        cookTimePage.setVisible(true); //makes frame visible
        cookTimePage.setTitle("Checkout"); //sets title
        cookTimePage.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //sets exit to close app
        cookTimePage.setResizable(false); //makes GUI ajustable
        cookTimePage.setSize(700,400); //setse starting dimentions
        cookTimePage.setLocationRelativeTo(null); //When opened, opens in center of screen
        cookTimePage.getContentPane().setBackground(SunDevilGold);
        cookTimePage.add(acceptedOrderLabel);
        cookTimePage.add(waitTimeLabel);
        cookTimePage.add(titleLabel);
        cookTimePage.add(asuImage3);
        cookTimePage.add(statusLabel);
        cookTimePage.add(backButton);
        //ensure contents stay in their fixed position 
        cookTimePage.getContentPane().setLayout(null);


    }

    @Override
        public void actionPerformed(java.awt.event.ActionEvent e) {
            if (e.getSource() == backButton){
                System.out.println("back button pressed");
                
                cookTimePage.dispose();

                // go second
            chefStartCooking pizzadone = new chefStartCooking();
                
                System.out.println("page disposed 1");
        }
    }
}
