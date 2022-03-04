package lab_3.var_3.part_1;

import java.util.Arrays;
import java.util.Objects;

public class House {
    Door[] doors;
    int numberDoor;
    House(Door door, int maxDoor){
        this.numberDoor = 0;
        doors = new Door[maxDoor];
        doors[numberDoor] = door;
        numberDoor++;
        }
    public void addDoor(Door door){
        doors[numberDoor] = door;
        numberDoor++;
    }

    public int getNumberDoor() {
        return numberDoor;
    }
    public int numberKeyDoor(Door door) {
        return door.getNumberKey();
    }
    public void getInfo() {
        Arrays.stream(this.doors).filter(x -> x!=null).forEach(x-> x.getInfoDoor());
    }

    public void closeKey(Door door, Key key, int idDoor, int idKey) {
        System.out.println("Дверь с номером: " + door.id + " закрыта на ключ с номером: " + key.id);
        door.open = false;
        key.used = true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return numberDoor == house.numberDoor && Arrays.equals(doors, house.doors);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(numberDoor);
        result = 31 * result + Arrays.hashCode(doors);
        return result;
    }
}
