package OOP_3_1;

import java.util.Map;

public interface GetChild extends GetParents{
    default void printChilds(Map<String, Person> list){
        System.out.println("Пока еще нет детей");
    }
}
