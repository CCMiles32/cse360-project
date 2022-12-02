

//package GUI;
import java.awt.Color;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.*;

import javax.swing.*;



public class previousOrderPage extends orderProcessingPage implements ActionListener{

    static JFrame previousOrderPage = new JFrame();


    JLabel orderName = new JLabel();
    JLabel orderID = new JLabel();
    JLabel orderItself = new JLabel();
    JLabel orderDate = new JLabel();
    JLabel orderStatus = new JLabel();
    JLabel asuImage7 = new JLabel(new ImageIcon(new ImageIcon(getClass().getResource("asu.png")).getImage().getScaledInstance(175, 75, Image.SCALE_DEFAULT)));
    JLabel menuTitel = new JLabel("SunDevil Pizza", JLabel.LEFT);
    
    previousOrderPage(String day, String month, String year){
        orderProcessingPage.dispose();
        this.dispose();

        orderName.setText("Name:   Adrian Mena");
        orderName.setFont(new java.awt.Font("Serif", java.awt.Font.PLAIN, 25));
        orderName.setBackground(Color.WHITE);
        orderName.setOpaque(true);
        orderName.setBorder(blackBrdr);
        orderName.setBounds(100, 190, 500, 30);

        orderID.setText("ID:        1218736758");
        orderID.setFont(new java.awt.Font("Serif", java.awt.Font.PLAIN, 25));
        orderID.setBackground(Color.WHITE);
        orderID.setOpaque(true);
        orderID.setBorder(blackBrdr);
        orderID.setBounds(100, 160, 500, 30);

        orderItself.setText("Order:   Cheese with Mushrooms and Onion");
        orderItself.setFont(new java.awt.Font("Serif", java.awt.Font.PLAIN, 25));
        orderItself.setBackground(Color.WHITE);
        orderItself.setOpaque(true);
        orderItself.setBorder(blackBrdr);
        orderItself.setBounds(100, 220, 500, 30);

        orderDate.setText("Date:     " + "12" + " " + "2" + " " + "2022");
        orderDate.setFont(new java.awt.Font("Serif", java.awt.Font.PLAIN, 25));
        orderDate.setBackground(Color.WHITE);
        orderDate.setOpaque(true);
        orderDate.setBorder(blackBrdr);
        orderDate.setBounds(100, 130, 500, 30);

        orderStatus.setText("Status:   COMPLETED");
        orderStatus.setFont(new java.awt.Font("Serif", java.awt.Font.PLAIN, 25));
        //orderStatus.setBackground(SunDevilMaroon);
        orderStatus.setForeground(Color.RED);
        orderStatus.setBackground(SunDevilBlack);
        orderStatus.setOpaque(true);
        orderStatus.setBorder(blackBrdr);
        //orderStatus.setOpaque(true);
        //orderStatus.setBorder(blackBrdr);
        orderStatus.setBounds(100, 100, 500, 30);

        asuImage7.setBounds(0,0,200,50);
        asuImage7.setBackground(Color.WHITE);
        asuImage7.setOpaque(true);
        
        menuTitle.setBounds(200,0,500,50);
        menuTitle.setBackground(Color.WHITE);
        menuTitle.setOpaque(true);
        
        previousOrderPage.setVisible(true); //makes frame visible
        previousOrderPage.setTitle("Previous Order"); //sets title
        previousOrderPage.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //sets exit to close app
        previousOrderPage.setResizable(false); //makes GUI ajustable
        previousOrderPage.setSize(700,400); //setse starting dimentions
        previousOrderPage.setLocationRelativeTo(null); //When opened, opens in center of screen
        //previousOrderPage.setLayout(new java.awt.FlowLayout());
        previousOrderPage.getContentPane().setBackground(SunDevilGold);
        previousOrderPage.getContentPane().setLayout(null);
        
        previousOrderPage.add(asuImage7);
        previousOrderPage.add(menuTitle);
        previousOrderPage.add(orderDate);
        previousOrderPage.add(orderStatus);
        previousOrderPage.add(orderID);
        previousOrderPage.add(orderItself);
        previousOrderPage.add(orderName);
    }









}