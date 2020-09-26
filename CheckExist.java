import java.io.*;
import java.util.*;
import java.lang.*;
public class CheckExist {
//    public static void main(String[] args){
//    
//        File file = new File("G:\\h\\");
//        
//        if(file.exists())
//            System.out.println(file.getName() + " exsits.");
//        else
//            System.out.println("It doesn't");
//    }
}

class AddFiles{

    
    public static void main(String[] args){

     Formatter f;
     
     try{
         f = new Formatter("G:\\h\\boruto.java");

         
         f.format("%s%s", "public class Hello{public static void main(String[] args){}}"," Of a man who cried blood.");
         
         f.close();
         
        System.out.println("Created");


     }
     catch(Exception e){
         System.out.println("Exception Raised.");
     }
     

    }

}
