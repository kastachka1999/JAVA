package OOP_2_2;

public interface AnimalDo {
    default void say(){
        System.out.println("Not say");
    }

    void eat();
    void go(People ob);


}
