package lr74;

import java.util.Scanner;

public class lr745 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int i = 0;
        while (i < str.length() - 1){
            if (str.substring(i, i+1).equals(str.substring(i+1, i+2))){
                str = str.substring(0, i) + str.substring(i + 1, str.length());
            }else {
                i++;
            }
        }
        System.out.println(str);
    }
}
