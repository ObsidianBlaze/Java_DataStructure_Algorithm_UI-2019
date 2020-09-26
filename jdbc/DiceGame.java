/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

/**
 *
 * @author user
 */

//import static osas.python.Python.*;
//import java.util.Scanner;
public class DiceGame{
    public static void main(String[] args){
//        print("The value is " + 3);

//        int rand;
//        rand =( 1 + (int)(Math.random() * 7));
//        System.out.println(rand);

    int number = 0;
int[] numbers = new int[1];
m(number, numbers);
System.out.println("number is " + number + " and numbers[0] is " + numbers[0]);


int[] t = new int[3];
//        age(t);

//Scanner input = new Scanner(System.in);

//Input the text to be counted
//System.out.println("Input the the text to be counted.");
//String a = input.nextLine();

//String[] b = a.split(" ");

//        int counted = 1;
//        for(int i = 0; i < a.length(); i++){
//            char value = a.charAt(i);
//            if(value == ','){
//                counted += 1;
//            }

//        int len = b.length;

//        System.out.println(len);
//
//for(String temp : b){
//    System.out.println(temp);
//}       
        
        
        
//            wordCounter();

    }

public static void m(int x, int[] y) {
x = 3;
y[0] = 3;
}
    
    public static void wordCounter(){
        String word = "I am a good girl, I live in mile12.";
        int counted = 1;
        for(int i = 0; i < word.length(); i++){
            char value = word.charAt(i);
            if(value == ' '){
                counted += 1;
            }
            
        }
        System.out.println(counted);
        
        
    }
    
    public static void age(int[] age){
        
        for(int t:age){
            System.out.println(t);
        }

    }
    
}
