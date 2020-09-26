
public class Sort {

    public static void sorter(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    smallest = j;
                }
            }
            int temp = array[i];
            array[i] = array[smallest];
            array[smallest] = temp;

        }
    }

    public static void main(String[] args) {
        int[] elements = {34, 21, 23};
        int count = 1;
        while(count <= 7){
            sorter(elements);
            count++;
        }
        for(int i : elements)
            System.out.println(i);
    }
}
