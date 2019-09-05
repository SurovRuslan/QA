public class Mouse {

    public static int mouseCol = 1;
    public final int mouseNumber;
    public Mouse(){
        mouseNumber = mouseCol++;
    }

    public Mouse(int number) {
        mouseNumber = number;
    }
    void hop(){
        System.out.println("Мыша номер " + mouseNumber + " прыгает!");
    }

}
