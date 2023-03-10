package OOP_2_1;

import java.util.ArrayList;
import java.util.Map;

public class Parents extends Person implements GetChild {
    private String hoIs;
    private String role;
    public static int count;

    @Override
    public void printChilds(Map<String, Person> list) {
        for (Map.Entry<String, Person> item : list.entrySet()) {
            if (item.getKey().equals("grandson")) {
                System.out.printf("%s является сыном  %s \n", item.getValue().getName(), getName());
            } else if (item.getKey().equals("granddaughter")) {
                System.out.printf("%s является дочерью  %s \n", item.getValue().getName(), getName());
            }
        }
    }

    @Override
    public void printParents(Map<String, Person> list) {
        for (Map.Entry<String, Person> item : list.entrySet()) {
            if (item.getKey().equals("father")) {
                System.out.printf("%s является отцом  %s \n", item.getValue().getName(), getName());
            } else if (item.getKey().equals("mother")) {
                System.out.printf("%s является матерью  %s \n", item.getValue().getName(), getName());
            }
        }

    }

    /**
     * необходимое количество родителей (больше двух родителей не может быть)
     */
    static{
        count=1;
    }
    public Parents(String name, Integer age, String sex) {
        super(name, age, sex);
        if (sex.equalsIgnoreCase("boy")){
            this.hoIs = "dad";
            this.role = "son";
        } else if (sex.equalsIgnoreCase("girl")){
            this.hoIs = "mother";
            this.role = "doter";
        } else {
            this.hoIs = "Undefined";
            this.hoIs = "Undefined";
        }
        count++;
    }

    public String getHoIs() {
        return hoIs;
    }

    public void setHoIs(String hoIs) {
        this.hoIs = hoIs;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Parents(String name) {
        super(name);
    }



}
