package OOP_3_2;

public  class People implements People_to_Animal{
    private String name;
    private Integer age;
    private String sex;


    public People(String name, Integer age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    public People(String name, Integer age) {
        this(name,age,"Undefined");
    }

    public People(String name){
        this(name,1,"Undefined");
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

    @Override
    public void call(Animal an) {
        an.setStatus("Go to");
        StringBuffer strBuffer = new StringBuffer(an.getStatus());
        String change= strBuffer.append(" " + this.getName()).toString();
        an.setStatus(change);
        System.out.printf("Позвал %s \n",an.getName());
    }
    @Override
    public void feed(Animal an){
        an.setStatus("Eat");
        System.out.println("Eat");
    }
}
