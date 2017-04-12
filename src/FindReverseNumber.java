/**
 * Created by mrugesh patel on 4/11/17.
 */
public class FindReverseNumber {
    public static void main(String[] args) {

        //number defined
        int number = 123456789;
        int reversedNumber = 0;
        int temp = 0;

        while (number > 0) {
            //modulus operator used to strip off the last digit
            temp = number % 10;

            //create reversed number
            reversedNumber = reversedNumber * 10 + temp;
            number = number / 10;
        }

        //output
        System.out.println("Reversed Number is: " + reversedNumber);
    }
}
