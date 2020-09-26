
public class RecursionDemo {

    public static void main(String[] args) {
        meth(10);
    }

    public static int meth(int runner) {
        if (runner == 0) {
            System.exit(0);
        }
        System.out.println(runner);

        return meth(runner - 1);
    }

}
