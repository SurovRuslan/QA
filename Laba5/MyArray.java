import java.util.Random;

public class MyArray {

    public static String toString(double[] a) {
        StringBuffer result = new StringBuffer("[");
        for(int i = 0; i < a.length; i++) {
            result.append(a[i]);
            if(i < a.length - 1)
                result.append(", ");
        }
        result.append("]");
        return result.toString();
    }

    public static void
    fill(double[] a, DoubleGenerator gen) {
        for(int i = 0; i < a.length; i++)
            a[i] = gen.next();
    }

    private static Random r = new Random();

    public static class
    RandDoubleGenerator implements DoubleGenerator {
        public double next() {return r.nextDouble();}
    }
}
