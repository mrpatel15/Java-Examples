/**
 * Created by mrugesh patel on 4/12/17.
 * <p>
 * duplicate characters fro a assigned string
 */

public class DuplicateChar {
    public static void main(String argu[]) {

        String str = "w3schools W3SCHOLS";
        int cnt = 0;
        char[] inp = str.toCharArray();
        System.out.println("Duplicate Characters are:");
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (inp[i] == inp[j]) {
                    System.out.println(inp[j]);
                    cnt++;
                    break;
                }
            }
        }
    }
}
