public class ForLoopArray {
    public static void main(String[] args){
        String[] boy = {"1","2","3","4"};
        int total = 0;
        for(String temp:boy){
            total += Integer.parseInt(temp);
        }
        System.out.println(total);
        int[] age = {2,3,4,5};
        
        for(int temp:age){
            System.out.println(temp);
        }
        
        
    }
}
