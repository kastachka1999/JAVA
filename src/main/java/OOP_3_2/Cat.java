package OOP_3_2;

public class Cat extends Animal implements AnimalDo{

    private String hoIs;

    public String getHoIs() {
        return hoIs;
    }

    public void setHoIs(String hoIs) {
        this.hoIs = hoIs;
    }

    public Cat(String name, Integer age, String status, String sex, String hoIs) {
        super(name, age, status, sex);
        this.hoIs = hoIs;
    }

    public Cat(String name, String role) {
        super(name);
        this.hoIs = role;
    }


    public void go(People ob) {
        super.setStatus("Go to");
        StringBuffer strBuffer = new StringBuffer(getStatus());
        String change= strBuffer.append(" " + ob.getName()).toString();
        super.setStatus(change);

    }

    public void eat(){
        super.setStatus("Eat");
        System.out.println("Cat eat");
    }

    @Override
    public void say() {
        System.out.println("Meow");
    }
}
