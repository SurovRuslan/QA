import java.io.Console;
import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Task 1.1");
        Calendar calendar = Calendar.getInstance();
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        System.out.println("Today is " + Day.values()[dayOfWeek-1]);

        System.out.println("\nTask 1.2");
        Random random = new Random();
        int rnd = random.nextInt((30 - 1) + 1) + 1;
        System.out.println("Random number: " + rnd);
        System.out.println("Enum Value: " + Alphabet.values()[rnd-1]);

        System.out.println("\nTask 2.1");
        System.out.print("Input a number: ");
        Automorphic automorphic = new Automorphic(scan.nextInt());
        automorphic.Print();

        System.out.println("\nTask 2.2");
        System.out.print("How many lucky numbers do you want to see: " );
        int rangeHN = new Scanner(System.in).nextInt();
        for(int i = 1; i <= rangeHN; i++){
            int resHON = i;

            while(resHON != 1 && resHON != 4){
                resHON = HappyNumbers.HappyOrNot(resHON);
            }

            if(resHON == 1)
                System.out.print(i + " ");
        }


        System.out.println("\nTask 3.1");
        String first = "Strings are so cool!";
        String second = "Strings are so cool";

        System.out.print("String 1: ");
        first = new Scanner(System.in).nextLine();
        System.out.print("String 2: ");
        second = new Scanner(System.in).nextLine();

        StringCompare.Compare(first,second);

        System.out.println("\nTask 3.2");
        String forReplace = "The quick brown fox jumps over the lazy dog.";
        System.out.println("Old string: " + forReplace);
        System.out.println("New string: " + forReplace.replaceAll("fox","cat"));

        System.out.println("\nTask 3.3");
        String forReverse = "The quick brown fox jumps";
        ReverseString.Reverse(forReverse);

    }
}
enum Day {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY
}


