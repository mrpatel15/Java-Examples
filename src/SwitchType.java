/**
 * Created by mrugeshkumar on 4/9/17.
 */
public class SwitchType {
      public static void main(String args[]) {
            int a = 3;

            switch (a) {
                case 1:
                    System.out.println("You chose One");
                    break;

                case 2:
                    System.out.println("You chose Two");
                    break;

                case 3:
                    System.out.println("You chose Three");
                    break;

                case 4:
                    System.out.println("You chose Four");
                    break;

                case 5:
                    System.out.println("You chose Five");
                    break;

                default:
                    System.out.println("Invalid Choice. Enter a no between 1 and 5");
                    break;
            }
        }
}