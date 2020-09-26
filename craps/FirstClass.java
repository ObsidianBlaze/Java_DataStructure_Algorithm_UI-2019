package craps;
import javax.swing.JFrame;
import javax.swing.JTextField;
public class FirstClass extends JFrame{
    JTextField textField;
   public FirstClass(){
       textField = new JTextField();
       textField.setToolTipText("Input a value.");
       
       textField.setBounds(150,150,300,300);
       setLayout(null);
       add(textField);
       setVisible(true);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       setSize(500,500);
       setTitle("Hello");
   }
   public static void main(String[] args){
       FirstClass fc = new FirstClass();
   }
}
