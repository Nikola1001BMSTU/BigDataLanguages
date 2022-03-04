package lab_3.var_3.part_1;

import java.util.Objects;

public class Key {
    int id;
    boolean used;
    Key() {
        used = false;
    }
    public String toString() {
        return "Ключ с номером: " + id + " Использован? " + used;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Key key = (Key) o;
        return id == key.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
