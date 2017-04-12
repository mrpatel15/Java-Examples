/**
 * Created by mrugesh patel on 4/11/17.
 */
public class JavaInvertTriangle {
    public static void main(String args[]) {
        int num = 9;
        while (num > 0) {
            for (int i = 1; i <= num; i++) {
                System.out.print(" " + num + " ");
            }
            System.out.print("\n");
            num--;
        }
    }
}
