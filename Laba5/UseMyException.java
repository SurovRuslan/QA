public class UseMyException {

    public static void MyThrowMethod() throws MyException {
        System.out.println("Message from method");
        throw new MyException("From MyThrowMethod");
    }

}
