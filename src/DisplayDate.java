import java.util.Date;

/**
 * Created by mrugesh patel on 4/11/17.
 */
public class DisplayDate {
    public static void main(String args[]) {
        // Instantiate a objects
        Date date1 = new Date();
        Date date2 = new Date();

        if (date1.compareTo(date2) > 0) {
            System.out.println("Date1 is after Date2");
        } else if (date1.compareTo(date2) < 0) {
            System.out.println("Date1 is before Date2");
        } else {
            System.out.println("Date1 is equal to Date2");
        }

    }
}
