package OOP_2_1;

import java.util.Map;

public class Gran extends Person implements GetChild{

    private String hoIs;
    private String role;

    @Override
    public void printChilds(Map<String, Person> list) {
        for (Map.Entry<String, Person> item : list.entrySet()) {
            if (item.getKey().equals("son")) {
                System.out.printf("%s является сыном  %s \n", item.getValue().getName(), getName());
            } else if (item.getKey().equals("doter")) {
                System.out.printf("%s является дочерью  %s \n", item.getValue().getName(), getName());
            }
        }
    }

    public Gran(String name, Integer age, String sex) {
        super(name, age, sex);
        if (sex.equalsIgnoreCase("boy")){
            this.hoIs = "grandad";
            this.role = "father";
        } else if (sex.equalsIgnoreCase("girl")){
            this.hoIs = "granny";
            this.role = "mother";
        } else {
            this.hoIs = "Undefined";
            this.role = "Undefined";
        }
    }

    public Gran(String name) {
        super(name);
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getHoIs() {
        return hoIs;
    }

    public void setHoIs(String hoIs) {
        this.hoIs = hoIs;
    }
}
