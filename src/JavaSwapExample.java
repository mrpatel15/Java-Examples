/**
 * Created by mrugesh patel on 4/11/17.
 */
public class JavaSwapExample {
    public static void main(String[] args) {

        int x = 20;
        int y = 10;

        System.out.println("Before Swapping");
        System.out.println("Value of x is :" + x);
        System.out.println("Value of y is :" + y);

        //add both the numbers and assign it to first
        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("Before Swapping");
        System.out.println("Value of x is :" + x);
        System.out.println("Value of y is :" + y);
    }
}
