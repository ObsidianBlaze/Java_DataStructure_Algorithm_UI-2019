package game;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
public class GUI extends JFrame implements ActionListener{
    JPanel panel;
    JMenu file,edit, view, game;
    JMenuBar menubar;
    JButton button, bt;
    JMenuItem nw,open, gam;
    JRadioButton rbt, rbt1;
    ButtonGroup gro;
    JFileChooser ch;
    
    GUI(){
        //creating a menubar
        menubar = new JMenuBar(); add(menubar); setJMenuBar(menubar);
        //creating a menu for the menubar
        file = new JMenu("FIle");edit = new JMenu("Edit");view = new JMenu("View");
        //add the menu to the menubar
        menubar.add(file);menubar.add(edit);menubar.add(view);
        //adding the menuitems to the menu
        nw = new JMenuItem("New");
        open = new JMenuItem("Open");
        game = new JMenu("game");
        gam = new JMenuItem("sudoku");
        game.add(gam);
        file.add(nw); file.add(open);
        file.add(game);
        try {
            //setting the bounds
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        ch = new JFileChooser();
        ch.setBounds(170,300,400,300);
        
        
        button = new JButton("Submit");
        button.setBounds(170,220,80,50);
        bt = new JButton("Clear");
        bt.setBounds(260, 220, 80, 50);
        
        //adding radiobutton
        rbt = new JRadioButton();
        rbt.setBounds(170,200,30,30);
        rbt1 = new JRadioButton();
        rbt1.setBounds(200,200,30,30);
        gro = new ButtonGroup();
        gro.add(rbt);
        gro.add(rbt1);
        rbt.addActionListener(this);
        button.addActionListener(this);
        rbt1.addActionListener(this);
        bt.addActionListener(this);
        
        panel = new JPanel();
        panel.setLayout(null);
        setVisible(true);
        setLocationRelativeTo(null);
        setSize(300,300);
        setDefaultCloseOperation(GUI.EXIT_ON_CLOSE);
        add(panel);
        panel.add(button); panel.add(rbt);
        panel.add(rbt1); panel.add(bt);
        panel.add(ch);
        setTitle("Building a GUI");
        
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == button)
            rbt.setSelected(true);
        else if(e.getSource() == bt){
            gro.clearSelection();
        }
    }
public static void main(String[] args){
        GUI ob = new GUI();
}
}
