package lr61;

import java.util.ArrayList;
import java.util.Scanner;

public class lr616 {
    public static void main(String[] args) {
        ArrayList<Integer> my_list = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            my_list.add(in.nextInt());
        }
        int i = 0;
        int k = 0;
        while (i != 9){
            k = i;
            if (my_list.get(k) >= 0) {
                while (k > 0 && my_list.get(k - 1) < 0){
                    int mid = my_list.get(k);
                    my_list.set(k, my_list.get(k-1));
                    my_list.set(k - 1, mid);
                    k--;
                }
            }else{
                while (k < 9 && my_list.get(k + 1) > 0) {
                    int mid = my_list.get(k);
                    my_list.set(k, my_list.get(k + 1));
                    my_list.set(k + 1, mid);
                    k++;
                }
            }
            if (i == k) {
                i++;
            }
        }
        System.out.println(my_list);
    }
}
