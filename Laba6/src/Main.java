import java.io.IOException;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException, NoSuchMethodException {

    System.out.println("Task 1.1");
    String[] arrT1 = {"Съешь", "ещё", "этих", "мягких", "французских", "булок", ",", "да", "выпей", "же", "чаю"};

    Task1.ExchangeThePositions(arrT1,0,8);

        System.out.println("\nTask 1.2");

        ArrayList<Integer> testIntList = new ArrayList<Integer>();
        testIntList.add(1);
        testIntList.add(10);
        testIntList.add(13);
        testIntList.add(666);
        testIntList.add(555);
        testIntList.add(42);
        testIntList.add(7);
        testIntList.add(99);
        testIntList.add(88);
        var MaxElement = Task1.max(testIntList,3,8);

        System.out.println("Input List: " + Arrays.toString(testIntList.toArray()));
        System.out.println("Максимальный элемент: " + MaxElement);

        System.out.println("\nTask 2.1");
        System.out.println("Оригинальный класс");
        ObjectFoAnnotations objectFoAnnotations = new ObjectFoAnnotations();
        objectFoAnnotations.Slozhenie(5,7);
        objectFoAnnotations.Vichitanie(9,4);
        System.out.println("Переопределенный");
        OverAnnotation overAnnotation = new OverAnnotation();
        overAnnotation.Slozhenie(5,7);
        overAnnotation.Vichitanie(9,4);


        System.out.println("\nTask 2.2");
        TestMyAnnotation testMyAnnotation = new TestMyAnnotation();
        Method method = testMyAnnotation.getClass().getMethod("OutputAnnotationParam");
        MyAnnotation myAnn = method.getAnnotation(MyAnnotation.class);
        System.out.println("Значение аннотации: "+ myAnn.value2());


        System.out.println("\nTask 3.1");
        Task3.FileToLinkedList("./src/hoku.txt");

        System.out.println("\nTask 3.2");
        System.out.print("Что за символ будем искать?: ");

        Task3.SearchChar("./src/task3_2.txt", new  Scanner(System.in).next().charAt(0) );

        System.out.println("\nTask 3.3");

        MyProperty myProperty = null;
        String propKey, propValue;

        Scanner scan = new Scanner(System.in);

        try {
            myProperty = new MyProperty("./src/myProperties.txt");
            myProperty.propsPrint();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.print("\nВведите название настройки свойство которой хотите увидеть: ");

        propKey = scan.nextLine();

        propValue = myProperty.SearchProperty(propKey);
        
        System.out.println("Свойство: " + propKey + ", содержит значение: " + propValue);

        System.out.println("\nОбновите свойство");
        System.out.print("Введите название свойства: ");
        propKey = scan.nextLine();
        System.out.print("Введите свойства: ");
        propValue = scan.nextLine();
        myProperty.UpdateProperty(propKey,propValue);
        myProperty.propsPrint();

        System.out.println("\nДобавте свое свойство");
        System.out.print("Введите название свойства: ");
        propKey = scan.nextLine();
        System.out.print("Введите свойства: ");
        propValue = scan.nextLine();
        myProperty.UpdateProperty(propKey,propValue);
        myProperty.propsPrint();
    }

}
