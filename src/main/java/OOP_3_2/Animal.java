package OOP_3_2;

public abstract class  Animal {
    private String name;
    private Integer age;

    private String status;
    private String sex;

    public Animal(String name, Integer age, String status, String sex) {
        this.name = name;
        this.age = age;
        this.status = status;
        this.sex = sex;
    }

    public Animal(String name) {
        this(name,1,"Undefined","Undefined");
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }


}
