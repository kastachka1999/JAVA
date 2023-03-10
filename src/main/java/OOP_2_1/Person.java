package OOP_2_1;

public abstract class Person {
    private Integer age;
    private String name;
    private String sex;

    public Person( String name,Integer age, String sex) {
        this.age = age;
        this.name = name;
        this.sex = sex;
    }

    public Person(String name){
        this(name,18,"boy");
    }


    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
