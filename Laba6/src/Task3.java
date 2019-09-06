import java.io.*;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Task3 {

    public static void FileToLinkedList(String filePath)
    {
        String listContent = new String();
        int count = 1;
        File file = new File(filePath);
        LinkedList<String> list = new LinkedList<String>();

        try {
            Scanner fileScanner = new Scanner(new FileInputStream(file));
            while (fileScanner.hasNextLine()){
                listContent = fileScanner.nextLine();
                list.add(listContent);
            }
            fileScanner.close();
        }catch(FileNotFoundException fnf){
            fnf.printStackTrace();
        }
        catch (Exception e) {
            e.printStackTrace();
            System.out.println("\nПрограмма остановлена при попытке считывания файла...");
        }

        Collections.reverse(list);
        Iterator iter = list.iterator();
        while (iter.hasNext()) {
            System.out.print("Строка " + (count++) + " : ");
            System.out.println(iter.next());
        }


    }
    public static void SearchChar(String filePath, char searchSymbol)
    {
        File file = new File(filePath);
        int searchSymbolCount = 0;;
        String line = "";
        try {
            Scanner fileScanner = new Scanner(new FileInputStream(file));
            while (fileScanner.hasNextLine()){
                line += fileScanner.nextLine();

            }
            fileScanner.close();
        }catch(FileNotFoundException fnf){
            fnf.printStackTrace();
        }
        catch (Exception e) {
            e.printStackTrace();
            System.out.println("\nПрограмма остановлена при попытке считывания файла...");
        }

            for (int i = 0; i < line.length(); i++)
            {
                if (line.charAt(i) == searchSymbol)
                {
                    searchSymbolCount++;
                }
            }

        System.out.println("В строке: " + line);
        System.out.println("Содержится " + searchSymbolCount + " символов " + searchSymbol);
    }

}
