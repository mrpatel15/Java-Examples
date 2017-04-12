/**
 * Created by mrugesh patel  on 4/11/17.
 */
public class FindFactorial {
    public static void main(String[] args) {

        int number = 5;         // 5*4*3*2*1 = 120
        int factorial = number;

        for (int i = (number - 1); i > 1; i--) {
            factorial = factorial * i;
        }

        System.out.println("Factorial of " + number + " is " + factorial);

    }
}
