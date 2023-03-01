import java.util.HashMap;
import java.util.*;
import java.util.HashSet;

/*
Разработать программу, имитирующую поведение коллекции HashSet.
В программе содать метод add добавляющий элемент, метод toString
возвращающий строку с элементами множества и метод позволяющий читать э
лементы по индексу. Формат данных Integer.
 */

public class dz6 {
    public static void main(String[] args) {

    }
}

class MySet {
    HashMap<Integer, Object> val = new HashMap<>();
    public static final Object OBJECT = new Object();

    void add(int ad) {
        val.putIfAbsent(ad, OBJECT);
    }

    public String toString() {
        return val.keySet().toString();
    }

    int set(int a) {
        int s = (int) val.keySet().toArray()[a];
        return s;
    }


}