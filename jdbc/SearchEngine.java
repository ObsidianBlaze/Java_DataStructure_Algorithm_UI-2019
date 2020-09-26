package jdbc;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class SearchEngine implements ActionListener 
{
    JLabel heading, lbl1, lbl2, lbl3, lbl4, lbl5, lbl6, lbl7, lbl8;
    JTextField txt1, txt2, txt3, txt4, txt5, txt6, txt7;
    JButton show, exit;
    JComboBox list;
    String tablename;
    String query;
    Connection con;
    PreparedStatement stat;
    Statement stmt;
    ResultSet rs;
    Font f;
    JPanel p1;
    JFrame f1;

    public SearchEngine() 
    {
		//Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		
        list = new JComboBox();
        list.addItem("Select One");
        list.addItem("Authors");
        list.addItem("Books");
        list.addItem("Publishers");

    }

    public void compshow() 
    {
        f1 = new JFrame("The City Library");
        p1 = new JPanel();
        heading = new JLabel("SEARCH ENGINE");
        lbl1 = new JLabel("Select the table: ");
        lbl2 = new JLabel("");
        lbl3 = new JLabel("");
        lbl4 = new JLabel("");
        lbl5 = new JLabel("");
        lbl6 = new JLabel("");
        lbl7 = new JLabel("");
        lbl8 = new JLabel("");

        txt1 = new JTextField();
        txt2 = new JTextField();
        txt2.setEditable(false);
        txt3 = new JTextField();
        txt3.setEditable(false);
        txt4 = new JTextField();
        txt4.setEditable(false);
        txt5 = new JTextField();
        txt5.setEditable(false);
        txt6 = new JTextField();
        txt6.setEditable(false);
        txt7 = new JTextField();
        txt7.setEditable(false);

        show = new JButton("Show");
        exit = new JButton("Exit");


        p1.setLayout(null);
        heading.setBounds(250, 35, 200, 40);
        p1.add(heading);

        lbl1.setBounds(75, 90, 200, 30);
        list.setBounds(400, 90, 200, 25);

        p1.add(lbl1);
        p1.add(list);


        lbl2.setBounds(75, 150, 200, 30);
        txt1.setBounds(400, 150, 200, 25);
        txt1.setVisible(false);

        p1.add(lbl2);
        p1.add(txt1);

        lbl3.setBounds(75, 180, 200, 30);
        txt2.setBounds(400, 180, 200, 25);
        txt2.setVisible(false);

        p1.add(lbl3);
        p1.add(txt2);

        lbl4.setBounds(75, 210, 200, 30);
        txt3.setBounds(400, 210, 200, 25);
        txt3.setVisible(false);

        p1.add(lbl4);
        p1.add(txt3);

        lbl5.setBounds(75, 240, 200, 30);
        txt4.setBounds(400, 240, 200, 25);
        txt4.setVisible(false);

        p1.add(lbl5);
        p1.add(txt4);

        lbl6.setBounds(75, 270, 200, 30);
        txt5.setBounds(400, 270, 200, 25);
        txt5.setVisible(false);

        p1.add(lbl6);
        p1.add(txt5);

        lbl7.setBounds(75, 300, 200, 30);
        txt6.setBounds(400, 300, 200, 25);
        txt6.setVisible(false);

        p1.add(lbl7);
        p1.add(txt6);

        lbl8.setBounds(75, 330, 200, 30);
        txt7.setBounds(400, 330, 200, 25);
        txt7.setVisible(false);

        p1.add(lbl8);
        p1.add(txt7);

        show.setBounds(400, 370, 100, 30);
        exit.setBounds(525, 370, 100, 30);

        p1.add(show);
        p1.add(exit);

        f1.add(p1);
        f1.setSize(680, 500);
        f1.setVisible(true);

        show.addActionListener(this);
        exit.addActionListener(this);
        list.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) 
    {
        if (ae.getActionCommand().equals("Exit")) 
        {
            System.exit(0);
        }
        if (ae.getSource() == list) 
        {
            try 
            {
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				
                con = DriverManager.getConnection("jdbc:sqlserver://as-salam; databaseName=Library;user=sa;password=123456");
                stmt = con.createStatement();

                tablename = list.getSelectedItem().toString();

                if (tablename.equals("Authors")) 
                {
                    query = "Select * from " + tablename + " where au_id = '";
                    lbl2.setText("Author ID: ");
                    lbl3.setText("Author Name: ");
                    lbl4.setText("Phone:");
                    lbl5.setText("Address: ");
                    lbl6.setText("City: ");
                    lbl7.setText("State: ");
                    lbl8.setText("Zip: ");
                    txt1.setVisible(true);
                    txt2.setVisible(true);
                    txt3.setVisible(true);
                    txt4.setVisible(true);
                    txt5.setVisible(true);
                    txt6.setVisible(true);
                    txt7.setVisible(true);
                    txt1.setText("");
                    txt2.setText("");
                    txt3.setText("");
                    txt4.setText("");
                    txt5.setText("");
                    txt6.setText("");
                    txt7.setText("");

                } 
                else if (tablename.equals("Books")) 
                {
                    query = "Select * from " + tablename + " where book_id = '";
                    lbl2.setText("Book ID: ");
                    lbl3.setText("Book Name: ");
                    lbl4.setText("Price:");
                    lbl5.setText("Author ID: ");
                    lbl6.setText("Publisher ID: ");
                    lbl7.setText("Date of Publishing: ");
                    lbl8.setText("");

                    txt1.setVisible(true);
                    txt2.setVisible(true);
                    txt3.setVisible(true);
                    txt4.setVisible(true);
                    txt5.setVisible(true);
                    txt6.setVisible(true);
                    txt7.setVisible(false);
                    txt1.setText("");
                    txt2.setText("");
                    txt3.setText("");
                    txt4.setText("");
                    txt5.setText("");
                    txt6.setText("");
                    txt7.setText("");

                } 
                else if (tablename.equals("Publishers")) 
                {
                    query = "Select * from " + tablename + " where pub_id = '";
                    lbl2.setText("Publisher ID: ");
                    lbl3.setText("Publisher Name: ");
                    lbl4.setText("Phone:");
                    lbl5.setText("Address: ");
                    lbl6.setText("City: ");
                    lbl7.setText("State: ");
                    lbl8.setText("Zip:");

                    txt1.setVisible(true);
                    txt2.setVisible(true);
                    txt3.setVisible(true);
                    txt4.setVisible(true);
                    txt5.setVisible(true);
                    txt6.setVisible(true);
                    txt7.setVisible(true);
                    txt1.setText("");
                    txt2.setText("");
                    txt3.setText("");
                    txt4.setText("");
                    txt5.setText("");
                    txt6.setText("");
                    txt7.setText("");
                } 
                else 
                {
                    lbl2.setText("");
                    lbl3.setText("");
                    lbl4.setText("");
                    lbl5.setText("");
                    lbl6.setText("");
                    lbl7.setText("");
                    lbl8.setText("");

                    txt1.setVisible(false);
                    txt2.setVisible(false);
                    txt3.setVisible(false);
                    txt4.setVisible(false);
                    txt5.setVisible(false);
                    txt6.setVisible(false);
                    txt7.setVisible(false);
                    txt1.setText("");
                    txt2.setText("");
                    txt3.setText("");
                    txt4.setText("");
                    txt5.setText("");
                    txt6.setText("");
                    txt7.setText("");
                }
            } 
            catch (Exception e) 
            {
                System.out.println("Error " + e);
            }
        }

        if (ae.getActionCommand().equals("Show")) 
        {
            if (!txt1.getText().equals("")) 
            {
                try 
                {
                    con = DriverManager.getConnection("jdbc:sqlserver://as-salam;  databaseName=Library;user=sa;password=123456");
                    stmt = con.createStatement();

                    rs = stmt.executeQuery(query + txt1.getText() + "'");
                    boolean status = rs.next();
                    if (status == true) 
                    {
                        txt1.setText(rs.getString(1));
                        txt2.setText(rs.getString(2));
                        txt3.setText(rs.getString(3));
                        txt4.setText(rs.getString(4));
                        txt5.setText(rs.getString(5));
                        txt6.setText(rs.getString(6));
                        if (tablename.equals("Authors") || tablename.equals("Publishers")) 
                        {
                            txt7.setText(rs.getString(7));
                        }

                        con.close();
                    } 
                    else 
                    {
                        JOptionPane.showMessageDialog(f1, "No Record Found", "Information", JOptionPane.INFORMATION_MESSAGE);
                        txt1.setText("");
                        txt2.setText("");
                        txt3.setText("");
                        txt4.setText("");
                        txt5.setText("");
                        txt6.setText("");
                        txt7.setText("");
                    }
                } 
                catch (Exception e) 
                {
                    JOptionPane.showMessageDialog(f1, "No Record Found", "Information", JOptionPane.INFORMATION_MESSAGE);
                    txt1.setText("");
                }
            } 
            else 
            {
                JOptionPane.showMessageDialog(f1, "Invalid Selection or Entry", "Error Message", JOptionPane.ERROR_MESSAGE);
            }
        }
        
    }
    public static void main(String args[]) 
    {
        SearchEngine a = new SearchEngine();
        a.compshow();
    }
}

