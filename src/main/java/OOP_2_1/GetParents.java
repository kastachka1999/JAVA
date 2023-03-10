package OOP_2_1;

import java.util.ArrayList;
import java.util.Map;

public interface GetParents {
    default void  printParents(Map<String, Person> list){
        System.out.println("Нет родителей");
    }
}
