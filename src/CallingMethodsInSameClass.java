/**
 * Created by mrugesh patel on 4/11/17.
 */
public class CallingMethodsInSameClass {
    // Method definition performing a Call to another Method
    public static void main(String[] args) {
        Method1(); // Method being called.
        Method2(); // Method being called.
    }

    // Method definition to call in another Method

    public static void Method1() {
        System.out.println("Hello World! Mrugesh!!");
    }

    // Method definition performing a Call to another Method
    public static void Method2() {
        Method1(); // Method being called.
    }
}

