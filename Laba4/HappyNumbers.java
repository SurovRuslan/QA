public class HappyNumbers {

    public static int HappyOrNot(int value){
        int square = 0, sum = 0;

        while(value > 0){
            square = value%10;
            sum = sum + (square*square);
            value = value/10;
        }
        return sum;
    }
}
