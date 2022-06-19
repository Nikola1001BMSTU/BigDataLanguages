package lab_3.var_3.part_1;

import java.util.Arrays;
import java.util.Objects;

public class Door {
    int id;
    boolean open;
    int numberKey;
    Key[] keys;
    Door(int id, int maxKey) {
        keys = new Key[maxKey];
        this.id = id;
        this.numberKey = 0;
        open = true;
    }

    public int getNumberKey() {
        return numberKey;
    }
    public String toString() {
        return "Дверь с номером: " + id + " Открыта? " + open + " Количесво ключей: " + numberKey;
    }
    public void getInfoDoor() {
        System.out.println(this.toString());
        Arrays.stream(this.keys).filter(x -> x!=null).forEach(x -> System.out.println(x.toString()));
    }
    public void addKey(Key key) {
        keys[numberKey] = key;
        numberKey++;
        key.id = numberKey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Door door = (Door) o;
        return id == door.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
