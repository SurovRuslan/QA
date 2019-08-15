public class Automorphic {

    private int square = 0;
    private String squareStr = "";
    private String valueStr = "";

    public Automorphic(int value)
    {
        square = value * value;
        squareStr = Integer.toString(square);
        valueStr = Integer.toString(value);
    }

    public void Print()
    {
        if(squareStr.endsWith(valueStr))
        {
            System.out.println("Automorphic Number.");
        }
        else
        {
            System.out.println("Not automorphic Number.");
        }
    }
}
