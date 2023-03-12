package OOP_3_2;

public class Main {
    public static void main(String[] args) {
        Cat bars = new Cat("Барсик",1,"Живет","boy","cat");
        People dima = new People("Дима",23,"boy");
        bars.say();
        System.out.println(bars.getStatus());
        dima.call(bars);
        System.out.println(bars.getStatus());
    }
}
