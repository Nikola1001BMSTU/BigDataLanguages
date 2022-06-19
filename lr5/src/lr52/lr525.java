package lr52;

import java.util.Objects;

public class lr525 {
    public static void main(String[] args) {
        Book[] my_book = Book.make_list(5);
        try {
            my_book[0] = new Book(1, "1", "1", "1", 1, 1, 1, false);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            my_book[1] = new Book(2, "2", "1", "1", 2, 1, 1, false);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            my_book[2] = new Book(3, "3", "2", "1", 3, 1, -1, false);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            my_book[3] = new Book(4, "4", "2", "1", 4, -1, 1, false);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            my_book[4] = new Book(5, "5", "2", "2", 5, 1, 1, false);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("books of author 2:");
        for (int i = 0; i < 5; i++) {
            try {
                if (Objects.equals(my_book[i].getAuthor(), "2")) {
                    System.out.println(my_book[i]);
                }
            }catch (Exception ignored){}
        }
        System.out.println("books of publisher 1:");
        for (int i = 0; i < 5; i++) {
            try {
                if (Objects.equals(my_book[i].getPublisher(), "1")) {
                    System.out.println(my_book[i]);
                }
            } catch (Exception ignored){}
        }
        System.out.println("books of year later 3:");
        for (int i = 0; i < 5; i++) {
            try {
                if (my_book[i].getYear() > 3) {
                    System.out.println(my_book[i]);
                }
            }catch (Exception ignored){}
        }
    }
}
