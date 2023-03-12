package OOP_3_1;

import java.util.Map;

public interface GetParents {
    default void  printParents(Map<String, Person> list){
        System.out.println("Нет родителей");
    }
}
