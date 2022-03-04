package lab_3.var_2;


public class House {
    int id;
    int number;
    double space;
    int floor;
    int roomNumber;
    String street;
    String building;
    int lifetime;

    House(int id, int number, double space,  int floor, int roomNumber, String street, String building, int lifetime) {
        this.id = id;
        this.number = number;
        this.space = space;
        this.floor = floor;
        this.roomNumber = roomNumber;
        this.street = street;
        this.building = building;
        this.lifetime = lifetime;
    }
    public static void showInfoRooms(int rooms, House houses[], int n) {
        for (int i = 0; i < n; i++) {
            if (rooms == houses[i].roomNumber) {
                System.out.println(houses[i].toString());
            }
        }
    }
    public static void showInfoRoomsFloors(int rooms, int lowerFloor, int highFloor,  House houses[], int n) {
        for (int i = 0; i < n; i++)
            if (houses[i].roomNumber == rooms && houses[i].floor>=lowerFloor && houses[i].floor <= highFloor) {
                System.out.println(houses[i].toString());
            }
    }
    public static void showInfoSpace(int space,  House houses[], int n) {
        for (int i = 0; i < n; i++)
            if (houses[i].space > space) {
                System.out.println(houses[i].toString());
            }
    }
    public static void createObj(int n) {
        House[] houses = new House[n];
        houses[0] = new House(1, 3, 35.6, 1, 1, "Байкальская", "Дом", 100);
        houses[1] = new House(2, 95, 82.3, 5, 3, "Арбатская", "Дом", 150);
        houses[2] = new House(3, 161, 57.9, 11, 3, "Никольская", "Дом", 125);
        showInfoRooms(1, houses, n);
        System.out.println();
        showInfoRoomsFloors(3, 5, 10, houses, n);
        System.out.println();
        showInfoSpace(40, houses, n);
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getSpace() {
        return space;
    }

    public void setSpace(double space) {
        this.space = space;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public int getLifetime() {
        return lifetime;
    }

    public void setLifetime(int lifetime) {
        this.lifetime = lifetime;
    }

    public String toString () {
        return id + " " + number + " " + space + " " + floor + " " + roomNumber + " " + street + " " + building + " " + lifetime;
    }

    public static void main(String[] args) {
        int n = 3;
        createObj(n);
    }
}

