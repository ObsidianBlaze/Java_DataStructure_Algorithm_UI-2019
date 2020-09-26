import java.util.Scanner;
import java.awt.event.*;
import java.awt.Event;
import javax.swing.*;
import java.awt.*;
public class Age extends JFrame{
    JButton button;
    public Age(){
        button = new JButton("Click");
        button.setBounds(400,400,70,50);
        setLayout(null);
        add(button);
        button.addActionListener(e->System.exit(0));
        setVisible(true);
        setTitle("TITI");
        setSize(400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        Age a = new Age();
        Scanner in = new Scanner(System.in);
        int input = 1;
        int result = 0;
        while(input !=0){
            System.out.println("Input a number");
            input = in.nextInt();
            result += input;
            System.out.println(result);
        }
        int[] boy = new int[]{45,12,36};
        for(int s:boy){System.out.println(s);}
    }
}
