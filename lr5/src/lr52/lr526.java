package lr52;

public class lr526 {
    public static void main(String[] args){
        House[] my_house = House.make_list(5);

        try {
            my_house[0] = new House(1, 1, 1, 1, 1, "1", false, 1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            my_house[1] = new House(2, 1, 2, 2, 1, "1", false, 1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            my_house[2] = new House(3, 1, 3, 1, 2, "1", false, 1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            my_house[3] = new House(4, 1, 4, 3, -1, "1", false, 1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            my_house[4] = new House(5, 1, 5, -1, 1, "1", false, 1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("flats with 1 room:");
        for (int i = 0; i < 5; i++) {
            try {
                if (my_house[i].getRoom_amount() == 1) {
                    System.out.println(my_house[i]);
                }
            } catch (Exception ignored){}
        }
        System.out.println("flats with 1 room between 2 and 3 floors:");
        for (int i = 0; i < 5; i++) {
            try {
                if (my_house[i].getRoom_amount() == 1 && my_house[i].getFloor() >= 2 && my_house[i].getFloor() <= 3) {
                    System.out.println(my_house[i]);
                }
            }catch (Exception ignored){}
        }
        System.out.println("flats Square > 2");
        for (int i = 0; i < 5; i++) {
            try {
                if (my_house[i].getSquare() > 2) {
                    System.out.println(my_house[i]);
                }
            }catch (Exception ignored){}
        }
    }
}
