package lab_3.var_3.part_1;

public class Main {
    public static void main(String[] args) {
        int id = 1;
        Door door1 = new Door(1, 5);
        Key key1 = new Key();
        id++;
        door1.addKey(key1);
        House home = new House(door1, 6);
        Door door2 = new Door(2, 4);
        Key key2 = new Key();
        id++;
        home.addDoor(door2);
        Key key3 = new Key();
        id++;
        door2.addKey(key2);
        door2.addKey(key3);
        //System.out.println("Количество дверей равно: " + home.getNumberDoor());
        //System.out.println("Количество ключей у двери с индексом: " + door2.id + " равно: " + home.numberKeyDoor(door2));
        //home.closeKey(door1, key1, door1.id, key1.id);
        home.getInfo();

        home.closeKey(door1, key1, door1.id, key1.id);
        System.out.println();
        home.getInfo();
    }
}
