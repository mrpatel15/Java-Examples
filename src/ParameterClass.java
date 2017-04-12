/**
 * Created by mrugesh patel on 4/12/17.
 * <p>
 * Parameter passing and Returning a Value from a Method
 */
public class ParameterClass {

    public static void main(String[] args) {
//        test("mrugesh"); // Method being called.
//        test("heni"); // Method being called.
//        test("dad");
//        test("mom");

//        Add(100, 20, 33);
//        Add(40, 20, 55);
//        Add(100, 40, 77);

// Arithmatic operation examples

        int sum = Add(100, 20, 55);

        int result = sum * 15;

        System.out.println(result);
    }

    // Method definition to call in another Method

    public static void test(String name) {
        System.out.println("Hello " + name);
    }

//    public static void Add (int a, int b, int c) {
//        System.out.println(a + b + c);
//    }

    /* use int inseted of void - returning valie uisng int */
    public static int Add(int a, int b, int c) {
//        System.out.println(a + b + c);
        return (a + b + c);
    }

}
