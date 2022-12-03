import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;

import javax.swing.*;
public class chefpizzadone extends chefPage implements ActionListener{
    //instance variables
    static JFrame chefpizzadone = new JFrame();
    JLabel asuImage6 = new JLabel(new ImageIcon(new ImageIcon(getClass().getResource("asu.png")).getImage().getScaledInstance(175, 75, Image.SCALE_DEFAULT)));
    JLabel chefTitle = new JLabel();
    JLabel pizzaLabel = new JLabel();
    JLabel menuTitle = new JLabel("SunDevil Pizza", JLabel.LEFT);
    JLabel reminder = new JLabel("Thank you for your hard work!", JLabel.LEFT);
    JLabel pizzaTextField = new JLabel("Confirmation email has been sent.", JLabel.CENTER);
    JLabel statusLabel = new JLabel("STATUS: READY FOR PICKUP", JLabel.CENTER);
    JButton backButton = new JButton("Back");
    
    chefpizzadone(){
        this.dispose();
        System.out.println("Your pizza is ready!");

        //
        statusLabel.setBounds(150, 100, 400, 50);
        statusLabel.setForeground(Color.RED);
        
        //initialize pizza text field
        pizzaTextField.setBounds(150, 150, 400, 50);
        //pizzaTextField.addActionListener(this);
        //pizzaTextField.setEditable(false);
        pizzaTextField.setBackground(SunDevilGold);
        pizzaTextField.setOpaque(true);
        pizzaTextField.setForeground(SunDevilBlack);
        pizzaTextField.setBorder(blackBrdr);

        backButton.setBounds(50,300,100,50);
        backButton.setBackground(SunDevilBlack);
        backButton.setForeground(Color.WHITE);
        backButton.addActionListener(this);

        
        //menu title and image
        asuImage6.setBounds(0,0,200,50);
        asuImage6.setBackground(Color.WHITE);
        asuImage6.setOpaque(true);
        menuTitle.setFont(new java.awt.Font(Font.SANS_SERIF, java.awt.Font.BOLD, 40));
        menuTitle.setBackground(Color.WHITE);
        menuTitle.setOpaque(true);
        menuTitle.setBounds(200,0,500,50);
        
        //reminder setup
        reminder.setForeground(Color.LIGHT_GRAY);
        reminder.setBounds(275, 300, 200, 30);
        
        //setting up and adding nodes to the scene
        chefpizzadone.setVisible(true); //makes frame visible
        chefpizzadone.setTitle("Pickup"); //sets title
        chefpizzadone.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //sets exit to close app
        chefpizzadone.setResizable(false); //makes GUI ajustable
        chefpizzadone.setSize(700,400); //setse starting dimentions
        chefpizzadone.setLocationRelativeTo(null); //When opened, opens in center of screen
        chefpizzadone.getContentPane().setBackground(SunDevilMaroon);
        chefpizzadone.add(backButton);
        chefpizzadone.add(chefTitle);
        chefpizzadone.add(menuTitle);
        chefpizzadone.add(asuImage6);
        chefpizzadone.add(pizzaLabel);
        chefpizzadone.add(pizzaTextField);
        chefpizzadone.add(reminder);
        chefpizzadone.add(statusLabel);
        chefpizzadone.getContentPane().setLayout(null); //absolute position
    
    }

    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
        if (e.getSource() == backButton){
            System.out.println("back button pressed");
            
            chefpizzadone.dispose();

            // go second
            homePage thirdHomePage = new homePage();
    }
}

}
