public class MyException extends Exception {

    public MyException(String message) {
        super(message);
        System.out.println("From MyException custom exception message: " + message);
    }
}
