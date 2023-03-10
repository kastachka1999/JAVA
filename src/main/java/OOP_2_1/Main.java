package OOP_2_1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Children son = new Children("Андрей",14,"boy");
        Children doter = new Children("Аня",12,"girl");
        Parents mother = new Parents("Наташа",36,"girl");
        Parents dad = new Parents("Саша",38,"boy");
        Gran grandad = new Gran("Назар",67,"boy");
        Gran granny = new Gran("Нелли",67,"girl");



        Map<String, Person> family = new HashMap<String, Person>();
        family.put(son.getRole(), son);
        family.put(doter.getRole(), doter);
        family.put(mother.getRole(), mother);
        family.put(dad.getRole(), dad);
        family.put(grandad.getRole(), grandad);
        family.put(granny.getRole(), granny);

        granny.printChilds(family);
        granny.printParents(family);



    }
}
