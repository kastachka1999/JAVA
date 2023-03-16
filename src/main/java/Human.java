import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Human {
    private int id;
    static int counter;
    private String name;
    private String surname;
    private String gender;

    private Integer age;

    static{
        counter = 100;
    }




    public Human(String name, String surname, String gender, Integer age) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.age = age;
        this.id = counter++;
    }

    public int getId() {
        return id;
    }

    public Object[] toArray(String abs){
        List<String> obj = new ArrayList<>();
        obj.add(this.name);
        obj.add(this.surname);
        obj.add(this.age.toString());
        obj.add(this.gender);
        obj.add(abs);
        return obj.toArray();
    }

    public Human(){
        this("Undefined","Undefined","Undefined",0);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return Objects.equals(name, human.name) && Objects.equals(surname, human.surname) && Objects.equals(gender, human.gender) && Objects.equals(age, human.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, gender, age);
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
