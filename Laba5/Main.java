import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Task 1.1.");
        try
        {
            throw new FileNotFoundException("Файла тут нєма, да и недолжно быть.");
        }
        catch(Exception e)
        {
            System.out.println("Вывод из кетча: " + e);
        }
        finally
        {
            System.out.println("Вывод Finally блока.");
        }
        System.out.println("\nTask 1.2.");

        try {
            UseMyException.MyThrowMethod();
        } catch(MyException me) {
            System.err.println("Caught Exception1");
            me.printStackTrace();
        } finally {
            System.out.println("Made it to finally");
        }

        System.out.println("\nTask 1.3.");

        MyExceptionNull myExceptionNull = null;

        try {
            System.out.println(myExceptionNull.toString());
        } catch(NullPointerException npe) {
            System.err.println("Вывод кетч NullPointerException");
            npe.printStackTrace();
        } finally {
            System.out.println("Вывод Finally блока.");
        }

        System.out.println("\nTask 1.4.");
        System.out.println("\nУгадать прпвильный ввод: ");
        Scanner input = new Scanner(System.in);
        while(true){
            try {
                int notBad = input.nextInt();
                System.out.println("Правильный ввод: " + notBad);
                System.out.println("Прожка продолжается дальше");
                break;
            } catch (Exception e){
                String bad = input.next();
                System.out.println("Неверный ввод: " + bad);
                continue;
            }
        }

        System.out.println("\nTask 2.2.");
        ArrayList<Mouse> gerbilList = new ArrayList<Mouse>();
        for (int i=0; i<7; i++){
            gerbilList.add(new Mouse());
        }
        for (int i=0; i<7; i++){
            (gerbilList.get(i)).hop();
        }

        System.out.println("\nTask 2.1.");

        double[] da = new double[10];

        MyArray.fill(da, new MyArray.RandDoubleGenerator());

        System.out.println(MyArray.toString(da));

        System.out.println("\nTask 2.3.");
        Map<String, Mouse> mouseMap = new HashMap<String, Mouse>();
        mouseMap.put("First", new Mouse(1));
        mouseMap.put("Second", new Mouse(2));
        mouseMap.put("Third", new Mouse(3));
        mouseMap.put("Fourth", new Mouse(4));

        System.out.println(mouseMap);
        System.out.println();
        Iterator<Map.Entry<String, Mouse>> ite = mouseMap.entrySet().iterator();
        while (ite.hasNext()) {
            Map.Entry<String, Mouse> entry = ite.next();
            System.out.println("(Ключ мыши: " + entry.getKey() + ")");
            entry.getValue().hop();
        }
    }
}
