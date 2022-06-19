package lr52;

public class House {
    private int id;
    private int house_number;
    private int square;
    private int floor;
    private int room_amount;
    private String street;
    private boolean type;
    private int availability_till;

    public House(int id, int house_number, int square, int floor, int room_amount, String street, boolean type, int availability_till) throws Exception {
        this.id = id;
        this.house_number = house_number;
        this.square = square;
        if (floor < 1){
            throw new Exception("Floor < 1");
        }
        this.floor = floor;
        if (room_amount < 1){
            throw new Exception("Room_amount < 1");
        }
        this.room_amount = room_amount;
        this.street = street;
        this.type = type;
        this.availability_till = availability_till;
    }

    public House() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHouse_number() {
        return house_number;
    }

    public void setHouse_number(int house_number) {
        this.house_number = house_number;
    }

    public int getSquare() {
        return square;
    }

    public void setSquare(int square) {
        this.square = square;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getRoom_amount() {
        return room_amount;
    }

    public void setRoom_amount(int room_amount) {
        this.room_amount = room_amount;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public boolean isType() {
        return type;
    }

    public void setType(boolean type) {
        this.type = type;
    }

    public int getAvailability_till() {
        return availability_till;
    }

    public void setAvailability_till(int availability_till) {
        this.availability_till = availability_till;
    }

    public static House[] make_list(int amount){
        return new House[amount];
    }

    @Override
    public String toString() {
        return "House{" +
                "id=" + id +
                ", house_number=" + house_number +
                ", square=" + square +
                ", floor=" + floor +
                ", room_amount=" + room_amount +
                ", street='" + street + '\'' +
                ", type=" + type +
                ", availability_till=" + availability_till +
                '}';
    }
}
