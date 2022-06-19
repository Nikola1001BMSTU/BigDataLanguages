package lr81;

import java.util.HashMap;
import java.util.concurrent.ThreadLocalRandom;

import static lr81.lr813.flag;
import static lr81.lr813.storage;

public class lr813 {

    public volatile static boolean flag;
    public volatile static HashMap<Integer, Integer> storage;

    public static void main(String[] args) {
        storage = new HashMap<>();
        Supplier sup = new Supplier();
        Customer cus = new Customer();
        sup.start();
        cus.start();
    }
}


class Supplier extends Thread {
    public Supplier() {
    }
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int goods = ThreadLocalRandom.current().nextInt(1, 10 + 1);
            int amount = ThreadLocalRandom.current().nextInt(1, 100 + 1);
            System.out.println("New supply " + goods + ". Amount = " + amount);
            if (storage.containsKey(goods)) {
                storage.put(goods, storage.get(goods) + amount);
            } else {
                storage.put(goods, amount);
            }
            flag = true;
        }
    }
}

class Customer extends Thread {
    public Customer() {
    }
    @Override
    public void run() {
        int good_i_want = ThreadLocalRandom.current().nextInt(1, 10 + 1);
        int amount_i_want = ThreadLocalRandom.current().nextInt(1, 100 + 1);
        System.out.println("order = " + amount_i_want + " pieces of " + good_i_want);
        while (true) {
            while (!flag) {
                // беск цикл
            }
            if (storage.containsKey(good_i_want) && storage.get(good_i_want) >= amount_i_want) {
                storage.put(good_i_want, storage.get(good_i_want) - amount_i_want);
                System.out.println("Just took " + amount_i_want + " of " + good_i_want);
                good_i_want = ThreadLocalRandom.current().nextInt(1, 10 + 1);
                amount_i_want = ThreadLocalRandom.current().nextInt(1, 100 + 1);
                System.out.println("order = " + amount_i_want + " pieces of " + good_i_want);
            } else {
                System.out.println("No goods I want :c");
            }
            flag = false;
        }
    }
}
