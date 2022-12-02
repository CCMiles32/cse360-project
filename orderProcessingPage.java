

//package GUI;
import java.awt.Color;
import java.awt.LayoutManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.*;
import javax.swing.JFrame;



public class orderProcessingPage extends homePage implements ActionListener{

    //create the new frame
    static JFrame orderProcessingPage = new JFrame();

    //instance variables
    String[] daysString   = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
    String[] monthsString = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
    String[] yearsString  = {"2000","2001","2002","2003","2004","2005","2006","2007","2008","2009", "2010","2011","2012","2013","2014","2015","2016", "2017","2018","2019","2020","2021","2022","2023"};
    String orderToBeSearched = "";
    String orderMonth = "";
    String orderDay = "";
    String orderYear = "";

    JButton searchByDate = new JButton();

    JComboBox daysBox   = new JComboBox(daysString);
    JComboBox monthsBox = new JComboBox(monthsString);
    JComboBox yearsBox  = new JComboBox(yearsString);
    



    orderProcessingPage(){

        daysBox.setBounds(50,50,100,30);
        daysBox.addActionListener(this);
        monthsBox.setBounds(200,50,100,30); 
        monthsBox.addActionListener(this);   
        yearsBox.setBounds(350,50,100,30);
        yearsBox.addActionListener(this);

        searchByDate.setBounds(150,250,300,30);
        searchByDate.addActionListener(this); 
        searchByDate.setText("Search");
    


        orderProcessingPage.setVisible(true); //makes frame visible
        orderProcessingPage.setTitle("Order Processing"); //sets title
        orderProcessingPage.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //sets exit to close app
        orderProcessingPage.setResizable(false); //makes GUI adjustable
        orderProcessingPage.setSize(700,400); //set the starting dimensions
        orderProcessingPage.setLocationRelativeTo(null); //When opened, opens in center of screen
        orderProcessingPage.setLayout(new java.awt.FlowLayout());
        orderProcessingPage.getContentPane().setBackground(SunDevilGold);
        
        orderProcessingPage.add(monthsBox);
        orderProcessingPage.add(daysBox);
        orderProcessingPage.add(yearsBox);
        orderProcessingPage.add(searchByDate);
        
        
        


    }

    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {

        //SEARCH BUTTON 
        if(e.getSource() == searchByDate) {
            //order Logic
            System.out.println("SEARCH PRESSED");
            orderToBeSearched = orderMonth + "/" + orderDay + "/" + orderYear;
            System.out.println(orderToBeSearched);  
            this.dispose();  
            orderProcessingPage.dispose();
            new previousOrderPage(orderDay, orderMonth, orderYear);
        }


        if(e.getSource() == monthsBox) {
            if (monthsBox.getSelectedIndex() == 0){
                System.out.println("Jan");
                orderMonth = "Jan";
            }
            if (monthsBox.getSelectedIndex() == 1){
                System.out.println("Feb");
                orderMonth = "Feb";
            }
            if (monthsBox.getSelectedIndex() == 2){
                System.out.println("Mar");
                orderMonth = "Mar";
            }
            if (monthsBox.getSelectedIndex() == 3){
                System.out.println("Apr");
                orderMonth = "Apr";
            }
            if (monthsBox.getSelectedIndex() == 4){
                System.out.println("May");
                orderMonth = "May";
            }
            if (monthsBox.getSelectedIndex() == 5){
                System.out.println("Jun");
                orderMonth = "Jun";
            }
            if (monthsBox.getSelectedIndex() == 6){
                System.out.println("Jul");
                orderMonth = "Jul";
            }
            if (monthsBox.getSelectedIndex() == 7){
                System.out.println("Aug");
                orderMonth = "Aug";
            }
            if (monthsBox.getSelectedIndex() == 8){
                System.out.println("Sept");
                orderMonth = "Sept";
            }
            if (monthsBox.getSelectedIndex() == 9){
                System.out.println("Oct");
                orderMonth = "Oct";
            }
            if (monthsBox.getSelectedIndex() == 10){
                System.out.println("Nov");
                orderMonth = "Nov";
            }
            if (monthsBox.getSelectedIndex() == 11){
                System.out.println("Dec");
                orderMonth = "Dec";
            }

        }
    
        
        if(e.getSource() == yearsBox) {
            if (yearsBox.getSelectedIndex() == 0){
                System.out.println("2000");
                orderYear = "2000";
            }
            if (yearsBox.getSelectedIndex() == 1){
                System.out.println("2001");
                orderYear = "2001";
            }
            if (yearsBox.getSelectedIndex() == 2){
                System.out.println("2002");
                orderYear = "2002";
            }
            if (yearsBox.getSelectedIndex() == 3){
                System.out.println("2003");
                orderYear = "2003";
            }
            if (yearsBox.getSelectedIndex() == 4){
                System.out.println("2004");
                orderYear = "2004";
            }
            if (yearsBox.getSelectedIndex() == 5){
                System.out.println("2005");
                orderYear = "2005";
            }
            if (yearsBox.getSelectedIndex() == 6){
                System.out.println("2006");
                orderYear = "2006";
            }
            if (yearsBox.getSelectedIndex() == 7){
                System.out.println("2007");
                orderYear = "2007";
            }
            if (yearsBox.getSelectedIndex() == 8){
                System.out.println("2008");
                orderYear = "2008";
            }
            if (yearsBox.getSelectedIndex() == 9){
                System.out.println("2009");
                orderYear = "2009";
            }
            if (yearsBox.getSelectedIndex() == 10){
                System.out.println("2010");
                orderYear = "2010";
            }
            if (yearsBox.getSelectedIndex() == 11){
                System.out.println("2011");
                orderYear = "2011";
            }
            if (yearsBox.getSelectedIndex() == 12){
                System.out.println("2012");
                orderYear = "2012";
            }
            if (yearsBox.getSelectedIndex() == 13){
                System.out.println("2013");
                orderYear = "2013";
            }
            if (yearsBox.getSelectedIndex() == 14){
                System.out.println("2014");
                orderYear = "2014";
            }
            if (yearsBox.getSelectedIndex() == 15){
                System.out.println("2015");
                orderYear = "2015";
            }
            if (yearsBox.getSelectedIndex() == 16){
                System.out.println("2016");
                orderYear = "2016";
            }
            if (yearsBox.getSelectedIndex() == 17){
                System.out.println("2017");
                orderYear = "2017";
            }
            if (yearsBox.getSelectedIndex() == 18){
                System.out.println("2018");
                orderYear = "2018";
            }
            if (yearsBox.getSelectedIndex() == 19){
                System.out.println("2019");
                orderYear = "2019";
            }
            if (yearsBox.getSelectedIndex() == 20){
                System.out.println("2020");
                orderYear = "2020";
            }
            if (yearsBox.getSelectedIndex() == 21){
                System.out.println("2021");
                orderYear = "2021";
            }
            if (yearsBox.getSelectedIndex() == 22){
                System.out.println("2022");
                orderYear = "2022";
            }
            if (yearsBox.getSelectedIndex() == 23){
                System.out.println("2023");
                orderYear = "2023";
            }
            if (yearsBox.getSelectedIndex() == 0){
                System.out.println("2000");
                orderYear = "2000";
            }
            
        }

        if(e.getSource() == daysBox) {

            if (daysBox.getSelectedIndex() == 0){
                System.out.println("0");
                orderDay = "0";
            }
            if (daysBox.getSelectedIndex() == 1){
                System.out.println("1");
                orderDay = "1";
            }
            if (daysBox.getSelectedIndex() == 2){
                System.out.println("2");
                orderDay = "2";
            }
            if (daysBox.getSelectedIndex() == 3){
                System.out.println("3");
                orderDay = "3";
            }
            if (daysBox.getSelectedIndex() == 4){
                System.out.println("4");
                orderDay = "4";
            }
            if (daysBox.getSelectedIndex() == 5){
                System.out.println("5");
                orderDay = "5";
            }
            if (daysBox.getSelectedIndex() == 6){
                System.out.println("6");
                orderDay = "6";
            }
            if (daysBox.getSelectedIndex() == 7){
                System.out.println("7");
                orderDay = "7";
            }
            if (daysBox.getSelectedIndex() == 8){
                System.out.println("8");
                orderDay = "8";
            }
            if (daysBox.getSelectedIndex() == 9){
                System.out.println("9");
                orderDay = "9";
            }
            if (daysBox.getSelectedIndex() == 10){
                System.out.println("10");
                orderDay = "10";
            }
            if (daysBox.getSelectedIndex() == 11){
                System.out.println("11");
                orderDay = "11";
            }
            if (daysBox.getSelectedIndex() == 12){
                System.out.println("12");
                orderDay = "12";
            }
            if (daysBox.getSelectedIndex() == 13){
                System.out.println("13");
                orderDay = "13";
            }
            if (daysBox.getSelectedIndex() == 14){
                System.out.println("14");
                orderDay = "14";
            }
            if (daysBox.getSelectedIndex() == 15){
                System.out.println("15");
                orderDay = "15";
            }
            if (daysBox.getSelectedIndex() == 16){
                System.out.println("16");
                orderDay = "16";
            }
            if (daysBox.getSelectedIndex() == 17){
                System.out.println("17");
                orderDay = "17";
            }
            if (daysBox.getSelectedIndex() == 18){
                System.out.println("18");
                orderDay = "18";
            }
            if (daysBox.getSelectedIndex() == 19){
                System.out.println("19");
                orderDay = "19";
            }
            if (daysBox.getSelectedIndex() == 20){
                System.out.println("20");
                orderDay = "20";
            }
            if (daysBox.getSelectedIndex() == 21){
                System.out.println("21");
                orderDay = "21";
            }
            if (daysBox.getSelectedIndex() == 22){
                System.out.println("22");
                orderDay = "22";
            }
            if (daysBox.getSelectedIndex() == 23){
                System.out.println("23");
                orderDay = "23";
            }
            if (daysBox.getSelectedIndex() == 24){
                System.out.println("24");
                orderDay = "24";
            }
            if (daysBox.getSelectedIndex() == 25){
                System.out.println("25");
                orderDay = "25";
            }
            if (daysBox.getSelectedIndex() == 26){
                System.out.println("26");
                orderDay = "26";
            }
            if (daysBox.getSelectedIndex() == 27){
                System.out.println("27");
                orderDay = "27";
            }
            if (daysBox.getSelectedIndex() == 28){
                System.out.println("28");
                orderDay = "28";
            }
            if (daysBox.getSelectedIndex() == 29){
                System.out.println("29");
                orderDay = "29";
            }
            if (daysBox.getSelectedIndex() == 30){
                System.out.println("30");
                orderDay = "30";
            }
            if (daysBox.getSelectedIndex() == 31){
                System.out.println("31");
                orderDay = "31";
            }

        }
    }   
}