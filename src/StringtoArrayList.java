/**
 * Created by mrugeshkumar on 4/9/17.
 */
public class StringtoArrayList {
    public static void main(String args[]){
        String strings = "99,42,55,81,79,64,22";
        String str[] = strings.split(",");

        java.util.List nl = new java.util.ArrayList();
        nl = java.util.Arrays.asList(str);
        for(Object s: nl){
            System.out.println(s);
        }
    }
}
