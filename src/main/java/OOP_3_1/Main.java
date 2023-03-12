package OOP_3_1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Children son = new Children("Андрей",14,"boy");
        Children doter = new Children("Аня",12,"girl");
        Parents mother = new Parents("Наташа",36,"girl");
        Parents dad = new Parents("Саша",38,"boy");
        Gran grandad = new Gran("Назар",67,"boy");
        Gran granny = new Gran("Нелли",67,"girl");

        NodeList family = new NodeList(new HashMap<String,Person>());

        family.append(son.getRole(), son);
        family.append(doter.getRole(), doter);
        family.append(mother.getRole(), mother);
        family.append(dad.getRole(), dad);
        family.append(grandad.getRole(), grandad);
        family.append(granny.getRole(), granny);

        granny.printParents(family.getLi());
        System.out.println(family);

        /* Map<String, Person> family = new HashMap<String, Person>();
        family.put(son.getRole(), son);
        family.put(doter.getRole(), doter);
        family.put(mother.getRole(), mother);
        family.put(dad.getRole(), dad);
        family.put(grandad.getRole(), grandad);
        family.put(granny.getRole(), granny);

        granny.printChilds(family);
        granny.printParents(family);
    */


    }
}
