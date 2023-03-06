package OOP_1;
import java.util.*;

/*
3. Подумать как описать логику взаимодействия человека и домашнего питомца.
 Сценарий: “Человек “зовёт” котика “кис-кис”, котик отзывается.
 Какое ещё взаимодействие может быть?
 */
public class dz1_3 {
    public static void main(String[] args) {
        Hoz andrey = new Hoz("Andry");
        Animal cat = new Animal("Barsik","cat");
        andrey.Pocormil(cat);
        cat.printStatus();
        andrey.Pozval(cat);
        cat.printStatus();
    }
}

class Hoz{
    public String name;

    public Hoz(String name){
        this.name = name;
    }

    public void Pozval(Animal cat){
        System.out.println("\nкис-кис");
        cat.setStatus("идет");
    }
    public void Pocormil(Animal cat){
        cat.setStatus("ест");
    }
}

class Animal{
    String name;
    String status;
    String hoIs;

    public Animal(String name,String hoIs){
        this.name = name;
        this.hoIs = hoIs;
        this.status = "живет";
    }

    public void setStatus(String doing){
        this.status = doing;
    }
    public void printStatus(){
        System.out.printf("%s %s %s",hoIs,this.name,status);
    }
}
