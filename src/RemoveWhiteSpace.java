/**
 * Created by mrugesh patel on 4/9/17.
 */
public class RemoveWhiteSpace {


    public static void main(String a[]){

        /*  Java trim funnction - remove white space  */

//        String MyString = "  mrugesh patel   ";
//        System.out.println(MyString.trim());

      /*  check lenth of array  */

//        String myString = "Hello world 111 222!";
//        int myStringLength = myString.length();
//        System.out.println(myStringLength);


       /*  convert lower case
           convert Upper case
           replace function
           IndexOf function
        */

        String myString = "Hello world AAA bbb" + "  CCCC";
        int myStringLength = myString.length();
//        String myStringCase = myString.toLowerCase();

//        String myStringCase = myString.toUpperCase();
//        System.out.println(myStringCase);

//        System.out.println(myString.replace('e', 'a'));

        System.out.println(myString.indexOf('o'));

    }
}
