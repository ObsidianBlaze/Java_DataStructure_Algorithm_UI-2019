
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.TreeMap;

public class ArrayDemo {

    String name;

    public ArrayDemo(String name){
        this.name = name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    
    public static void main(String... args) {
        ArrayList<String> cities = new ArrayList();
        cities.add("Lagos");
        cities.add("Delta");

        ListIterator<String> li = cities.listIterator();

        while (li.hasNext()) {
            System.out.println(li.next());
        }

        System.out.println(age(34));

        //Working with tree map.
        TreeMap<Integer, String> userInfo = new TreeMap();

        //Adding users to the map.
        userInfo.put(1, "David");
        userInfo.put(2, "Samuel");

        System.out.println(userInfo.get(1));

    }

    public static <T> T age(T x) {
        return x;
    }
}
