package lr81;


import java.util.concurrent.ThreadLocalRandom;

import static lr81.lr811.flag;
import static lr81.lr811.account;

public class lr811 {
    public volatile static int flag;
    public volatile static int account;

    public static void main(String[] args) throws InterruptedException {
        account = 0;
        flag = 0;
        Adder add = new Adder();
        Subber sub = new Subber();
        add.start();
        sub.start();
        while (true){
            Thread.sleep(5000);
            flag = ThreadLocalRandom.current().nextInt(0, 2 + 1);
        }
    }
}
class Adder extends Thread {
    public Adder() {
    }
    @Override
    public void run() {
        while (true) {
            if (flag == 1) {
                int n = ThreadLocalRandom.current().nextInt(1, 100 + 1);
                account += n;
                System.out.println("New income " + n);
                System.out.println("Current account = " + account);
                flag = 0;
            }
        }
    }
}

class Subber extends Thread {
    public Subber() {
    }
    @Override
    public void run() {
        while (true) {
            if (flag == 2) {
                int n = ThreadLocalRandom.current().nextInt(1, 100 + 1);
                System.out.println("Trying to withdraw " + n);
                if (account < n){
                    System.out.println("Not enough money :c");
                } else {
                    account -= n;
                    System.out.println("Success");
                }
                System.out.println("Current account = " + account);
                flag = 0;
            }
        }
    }
}
