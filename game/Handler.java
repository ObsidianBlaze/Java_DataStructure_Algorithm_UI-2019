package game;
import java.awt.Color;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Handler extends JFrame implements ActionListener{
    JButton button, close;
    JPanel panel;
    JTextArea message;
    JLabel lab, lar;
    GUI g;
        Handler(){
            setTitle("Home");
            lab = new JLabel("Hell");
            lar = new JLabel("Himmel");
            button = new JButton("clicked");
            close = new JButton("close");
            panel = new JPanel();
            message = new JTextArea(5,5);
            message.setText("Welcome to ");
            message.setForeground(Color.red);
            message.setVisible(true);
            add(panel);
            button.addActionListener(this);
            close.addActionListener(this);
            panel.add(button);panel.add(lab);
            panel.add(message);panel.add(lar);
            panel.add(close);
            setSize(300,300);
            setVisible(true);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
        }
        public void actionPerformed(ActionEvent e){
            if(e.getSource() == button){
             g = new GUI();
             message.setText("die");
            }
            else
            if(e.getSource() == close){
                g.dispose();
                message.setText("Welcome to the jungle");
            }
            
            
        }
        public static void main(String[] args){
            Handler h = new Handler();
        }
}
