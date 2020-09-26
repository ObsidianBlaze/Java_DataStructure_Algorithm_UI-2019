

//{14,13,27,40,18}
public class Order{
	public static void main(String... args){
		int[] numbers = {14,13,27,40,18};
		int[] ordered = new int[numbers.length];
		int checker = 0;
                
		for(int i = 0; i < numbers.length; i++){
			
			if(findLargest(14,13,27,40,18) > checker){
				ordered[i] = findLargest(14,13,27,40,18);
			}
				System.out.println(ordered[i]);
			
		}
	}
	public static int findLargest(int... values){
		int biggestNum = 0;
		for(int i = 0; i < values.length; i++){
			if(values[i] > biggestNum){
				biggestNum = values[i];
			}
		}
		return biggestNum;
	}
}