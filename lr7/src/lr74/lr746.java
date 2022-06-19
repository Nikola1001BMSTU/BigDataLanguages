package lr74;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class lr746 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> my_list = new ArrayList<>();
        while (in.hasNext()){
            String s = in.next();
            if (s.equals("stop")){
                break;
            }
            my_list.add(s);
        }
        Collections.sort(my_list);
        System.out.println(my_list);
    }
}
