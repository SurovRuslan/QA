import java.util.Arrays;
import java.util.List;

public class Task1 {

    public static <T> void ExchangeThePositions(T[] arrayValue, int i, int j) {

        System.out.println("Input array: "+ Arrays.toString(arrayValue));

        T tmp = arrayValue[i];
        arrayValue[i] = arrayValue[j];
        arrayValue[j] = tmp;

        System.out.println("Exchanged array: "+ Arrays.toString(arrayValue));
    }

    public static <T extends Object & Comparable<? super T>> T max(List<? extends T> list, int begin, int end) {

        T maxElem = list.get(begin);

        for (begin = begin + 1; begin < end; ++begin)
            if (maxElem.compareTo(list.get(begin)) < 0)
                maxElem = list.get(begin);
        return maxElem;
    }



}
