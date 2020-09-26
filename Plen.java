public class Plen {
   public static void main(String[] args){
       for(int i = 1; i<=5; i++){
           for(int j = 1; j<=i; j++){
               System.out.print("*");
           }
           System.out.println("");
           
       }
       System.out.println("nin \"Ok\"");
       System.out.println("Another \"quote\"");
       
       String name = "Cock";
       String ame = "Cocks";
       
       if(name.equals(ame)){
           System.out.println("True");
       }
       else{
           System.out.println("False");
       }
       
       System.out.println(name.length()-1);
   }
}
