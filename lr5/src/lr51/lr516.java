package lr51;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class lr516 {
    public static void main(String[] args) {
        int amount = 1;
        try {
            Scanner in = new Scanner(System.in);
            amount = in.nextInt();
        } catch (Exception e){
            System.out.println("baaaad input");
        }
        Drob[] my_array = new Drob[amount];
        int n = 3 * amount;
        for (int i = 0; i < amount; i++) {
            try {
                int a = ThreadLocalRandom.current().nextInt(2, n + 2);
                int b = ThreadLocalRandom.current().nextInt(2, n + 2);
                int[] c = new int[a];
                for (int j = 0; j < a; j++) {
                    c[j] = ThreadLocalRandom.current().nextInt(2, n + 1);
                }
                my_array[i] = new Drob(a, b, c);
            } catch (OutOfMemoryError e){
                System.out.println("too many drobs, will be " + (i-1));
                amount = i-1;
                break;
            }
        }
        System.out.println("my_array:");
        for (int i = 0; i < amount; i++) {
            try {
                System.out.println(my_array[i]);
            } catch (OutOfMemoryError e) {
                System.out.println("too big to print");
            }
        }
        try{
            System.out.println("sum = " + Drob.sum(my_array[0], my_array[1]));
            System.out.println("min = " + Drob.min(my_array[0], my_array[1]));
            System.out.println("mul = " + Drob.mul(my_array[0], my_array[1]));
            System.out.println("div = " + Drob.div(my_array[0], my_array[1]));
        } catch (Exception e){
            System.out.println("tooo less items");
        }
    }

}
