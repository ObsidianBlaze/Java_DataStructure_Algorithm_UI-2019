public class HighestNumber {


    public static void main(String[] args){
    
        int[] numbers = {100,23,54,33,12,89,32};
        
        int max = 0;
        
        for(int i = 0; i < numbers.length; i++){
        
        
            if(numbers[i] > max){
                max = numbers[i];
                
                System.out.println("Max is " + max);
            }
        
        }
        
        for(int i : numbers){
            if(i > max)
                max = i;
        }
        System.out.println(max);
        
    }
    
}
