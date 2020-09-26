

import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Customer extends JFrame {
    
        JLabel   lbCustomer ,lbID, lbName, lbAddress, lbCity, lbState, lbPhone;
        JTextField  txtID, txtName,txtAddress,txtCity, txtState, txtPhone;
        JPanel bar,pane,pane2;
        JButton btnsave,btnclear;

    public Customer(){
    
      pane = new JPanel();
      pane.setSize(450,50);
      pane.setBackground(Color.gray); 
      
      pane2 = new JPanel();
      pane2.setBounds(0,300,450,100);
      //pane2.setSize(450,50);
      pane2.setBackground(Color.gray);  
        
      bar = new JPanel();
      bar.setLayout(null);
      bar.setBackground(Color.cyan);
        
       lbCustomer = new  JLabel("Customer");
       lbCustomer.setFont(new Font("Tahoma", Font.BOLD,25 ));
       lbCustomer.setBounds(150,30,250,20);  //x,y,w,h
       lbCustomer.setForeground(Color.CYAN);
       
               
       lbID = new  JLabel("ID :-");
       lbID.setBounds(70,100,205,25);
       lbID.setFont(new Font("Engraver MT", Font.BOLD,15 ));
       txtID = new JTextField(10);
       txtID.setBounds(170,100,160,25);
       
       lbName = new  JLabel("Name :-");
       lbName.setBounds(70,130,205,25);
       lbName.setFont(new Font("Engraver MT", Font.BOLD,15 ));
       txtName = new JTextField(25);
       txtName.setBounds(170,130,160,25);
                                                 //x,y,w,h
       lbAddress = new  JLabel("Address :-");
       lbAddress.setBounds(70,160,205,25);
       lbAddress.setFont(new Font("Engraver MT", Font.BOLD,15 ));
       txtAddress = new JTextField(25);
       txtAddress.setBounds(170,160,160,25);
       
       lbCity = new  JLabel("City :-");
       lbCity.setBounds(70,190,205,25);
       lbCity.setFont(new Font("Engraver MT", Font.BOLD,15 ));
       txtCity = new JTextField(25);
       txtCity.setBounds(170,190,160,25);
         
       lbState  = new  JLabel("State :-");
       lbState.setBounds(70,220,205,25);
       lbState.setFont(new Font("Engraver MT", Font.BOLD,15 ));
       txtState = new JTextField(25);
       txtState.setBounds(170,220,160,25);
       
       lbPhone = new  JLabel("Phone :-");
       lbPhone.setBounds(70,250,205,25);
       lbPhone.setFont(new Font("Engraver MT", Font.BOLD,15 ));
       txtPhone = new JTextField(25);
       txtPhone.setBounds(170,250,160,25);
       
       btnsave = new JButton("Save");
       btnsave.setBounds(150,310,80,30);
       btnsave.setBackground(Color.black);
       btnsave.setForeground(Color.white);
       
       btnclear = new JButton("Clear");
       btnclear.setBounds(250,310,80,30);
       btnclear.setBackground(Color.black);
       btnclear.setForeground(Color.white);
       
       ImageIcon imgs = new ImageIcon("F:\\SHOWMANHOUSE\\Database_40px.png");
       this.setIconImage(imgs.getImage());
       
        bar.add(lbCustomer);
        
        bar.add(lbID);bar.add(txtID);
        bar.add(lbName);bar.add(txtName);
        bar.add(lbAddress);bar.add(txtAddress);
        bar.add(lbCity);bar.add(txtCity);
        bar.add(lbState);bar.add(txtState);
        bar.add(lbPhone);bar.add(txtPhone);
        
        //Adding the new panels
        add(pane);
        add(pane2);
        
        //Adding to ALTERNATIVE Panels
        pane.add(lbCustomer);
        pane2.add(btnsave);
        pane2.add(btnclear);
        
        bar.add(pane2); //Adding button to the main JPanel
        
        //setLayout(new BorderLayout());
        add(bar,(new BorderLayout().CENTER));
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
            
    public static void main(String[] args) {
       
        Customer cs = new Customer();
        cs.setVisible(true);
        cs.setResizable(false);
        cs.setSize(450,400);
        cs.setTitle("SHOWMAN HOUSE DATABASE");
        cs.setLocationRelativeTo(null);
        cs.getContentPane().setBackground(Color.orange);
        
    }
    
}
