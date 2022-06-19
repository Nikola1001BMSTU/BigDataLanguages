package lr72;

import java.util.HashSet;
import java.util.Scanner;

public class lr726 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashSet<String> set = new HashSet<>();
        String[] my_list = in.nextLine().split(" ");
        for (String s : my_list) {
            if (s.substring(0, 1).equals(s.substring(s.length() - 1))){
                set.add(s);
            }
        }
        System.out.println(set);
    }
}
