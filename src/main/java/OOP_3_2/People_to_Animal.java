package OOP_3_2;

public interface People_to_Animal {
    default void call(Animal an){
        System.out.printf("%s не ходит",an.getName());
    }

    void feed(Animal an);
}
