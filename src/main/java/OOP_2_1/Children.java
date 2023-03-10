package OOP_2_1;

import java.util.Map;

public class Children extends Person implements GetChild{
    private String hoIs;
    private String role;

    @Override
    public void printParents(Map<String, Person> list) {

        for (Map.Entry<String, Person> item : list.entrySet()) {
            if (item.getKey().equals("son")) {
                System.out.printf("%s является отцом  %s \n", item.getValue().getName(), getName());
            } else if (item.getKey().equals("doter")) {
                System.out.printf("%s является матерью  %s \n", item.getValue().getName(), getName());
            }
        }

    }

    /**
     * Создает обьект ребенка
     * @param name име
     * @param age года
     * @param sex от пола зависит роль и кем является
     */
    public Children(String name, Integer age, String sex) {
        super(name, age, sex);
        if (sex.equalsIgnoreCase("boy")){
            this.hoIs = "son";
            this.role = "grandson";
        } else if (sex.equalsIgnoreCase("girl")){
            this.hoIs = "daughter";
            this.role = "granddaughter";
        } else {
            this.hoIs = "Undefined";
            this.role = "Undefined";
        }
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

    public Children(String name) {
        super(name);
    }
}
