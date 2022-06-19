package lr72;

import java.util.Scanner;

public class lr725 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = 0;
        String vowels = "eyuioaEYUIOA";
        String[] my_list = in.nextLine().split(" ");
        for (String s : my_list) {
            if (vowels.contains(s.substring(0, 1)) && vowels.contains(s.substring(s.length() - 1))) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
