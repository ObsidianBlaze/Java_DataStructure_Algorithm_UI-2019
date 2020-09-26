import java.util.Scanner;

public class UserInfo {
    
        Scanner input = new Scanner(System.in);
        String FirstName, SecondName, LastName, Title, PhoneNum, ID;

        //trying to store numbers for the phone.
//        int no[] = new int[3];
        
        public UserInfo(){
        System.out.println("Program to take prompt from users.\n");
        
        //accepting users info
        System.out.println("Input Title: Mr for male and Mrs/Miss/Ms for female");
        Title = input.nextLine();
        System.out.println("Input First Name: eg. Messi");
        FirstName = input.nextLine();
        System.out.println("Input Second Name: eg. Ronaldo");
        SecondName = input.nextLine();
        System.out.println("Input Last Name: eg. Maradonna");
        LastName = input.nextLine();
        System.out.println("Input Phone Number: eg. 0799115321");
        PhoneNum = input.nextLine();
        
        
        
        System.out.println("Input ID: eg. 175");
        ID = input.nextLine();
        
            //changing the cases of the input files
            FirstName = FirstName.toUpperCase(); Title = Title.toUpperCase();
            SecondName = SecondName.toUpperCase(); LastName = LastName.toUpperCase();
            
        }
    public void logic(){
        
        
        if(Title.contains("Mr")||Title.contains("mr")||PhoneNum.contains("079")||ID.contains("173") ){
            System.out.println("Your Name is: " + Title + ". " + FirstName + " " + SecondName + " " + LastName + ", Gender: Male," + " Phone Company is Zain. " + " Major: ComputerScience");}
        else
            if(Title.contains("Mrs")||Title.contains("mrs")||Title.contains("Miss")||Title.contains("miss")||Title.contains("Ms")||Title.contains("ms")||PhoneNum.contains("078")||ID.contains("176")){
System.out.println("Your Name is: " + Title + ". " + FirstName + " " + SecondName + " " + LastName + ", Gender: Female," + " Phone Company is Uminah. " + " Major: Software Engineering");            }
    }
    public static void main(String[] args){
        UserInfo Info = new UserInfo();
        Info.logic();
    }
}
