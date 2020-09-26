package exercises;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorSwing extends JFrame{
    JButton button1, button2, buttonadd, btnequal;
    JTextField result;
    Double firstNumber, secondNumber, equal;
    String operations;
    
    CalculatorSwing()
    {
        button1 = new JButton("1");
        button1.setBounds(50, 90, 50, 50);
        button1.addActionListener(e ->
        {
            String enterNumber = result.getText() + button1.getText();
            result.setText(enterNumber);
        });
        
        
        button2 = new JButton("2");
        button2.setBounds(120, 90, 50, 50);
        button2.addActionListener(e ->
        {
            String enterNumber = result.getText() + button2.getText();
            result.setText(enterNumber);
        });
        
        buttonadd = new JButton("+");
        buttonadd.setBounds(85,140,50,50);
        buttonadd.addActionListener(e -> 
        { 
            firstNumber = Double.parseDouble(result.getText());
            result.setText("");
            operations = "+";
        });
        
        result = new JTextField();
        result.setBounds(40, 40, 130, 40);
        result.setEditable(false);
        
        btnequal = new JButton("=");
        btnequal.setBounds(80,180,50,50);
        btnequal.addActionListener(e -> 
        {
            String answer;
            secondNumber = Double.parseDouble(result.getText());
                if(operations .equals("+"))
                {
                    equal = firstNumber + secondNumber;
                    answer = String.format("%.0f", equal);
                    result.setText(answer);
                }
        });
        
        
        
        setLayout(null);
        add(button1); add(button2); add(buttonadd); add(result); add(btnequal);
        setVisible(true);
        setSize(300,300);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args){
        CalculatorSwing calculator = new CalculatorSwing();
    }

}