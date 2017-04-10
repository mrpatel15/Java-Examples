/**
 * Created by mrugeshkumar on 4/9/17.
 */
public class EqualCheck {
    public static void main(String args[]){
        String a = "AVATAR";
        String b = "avatar";
//  red-define method
        if(a.equals(b)){
            System.out.println("Both strings are equal.");
        } else {
            System.out.println("Both strings are not equal.");
        }

        if(a.equalsIgnoreCase(b)){
            System.out.println("Both strings are equal.");
        } else {
            System.out.println("Both strings are not equal.");
        }
    }
}
