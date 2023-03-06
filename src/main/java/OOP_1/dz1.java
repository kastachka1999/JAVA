package OOP_1;
import java.util.*;
/*
1. Реализовать, с учетом ооп подхода, приложение для проведения исследований с генеалогическим древом.
Идея: описать некоторое количество компонент, например:
* модель человека
* компонента хранения связей и отношений между людьми: родитель, ребёнок - классика,
но можно подумать и про отношение, брат, свекровь, сестра и т. д.
* компонент для проведения исследований
* дополнительные компоненты, например отвечающие за вывод данных в консоль, загрузку и
сохранения в файл, получение\построение отдельных моделей человека
Под “проведением исследования” можно понимать получение всех детей выбранного человека.
 */
public class dz1 {
    public static void main(String[] args) {
        Parent daddy = new Parent("Sasha",32,"boy","dad");
        daddy.viewPeople();
        daddy.setChild("Andry",14,"boy");
        daddy.setChild("Nadya",10,"girl");
        daddy.getChild();


    }
}


class People{

    protected String name;
    protected int age;
    protected String sex;

    public People(String name, int age,String sex) {
        setName(name);
        setAge(age);
        setSex(sex);
    }

    public People(String name) {
        this(name,18,"Undefined");
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }

    public void setSex(String sex){
        this.sex = sex;
    }

    public void viewPeople(){
        System.out.printf("Name: %s Age: %d Sex: %s\n",this.name,this.age,this.sex);
    }

}

class Parent extends People{
    public String status;
    Map<String, People> childrns = new HashMap<String, People>();

    public Parent(String name,int age,String sex,String status){
        super(name,age,sex);
        this.status = status;
    }

    @Override
    public void viewPeople(){
        System.out.printf("Name: %s Age: %d Sex: %s Status: %s\n",this.name,this.age,this.sex,this.status);
    }

    public void setChild(String name,int age,String sex) {
        this.childrns.put(name,new People(name,age,sex));
    }

    public void getChild(){
        for(Map.Entry<String, People> item : childrns.entrySet()){
            String s = "son";
            String ho = item.getValue().sex;
            if (ho.equalsIgnoreCase("girl")){
                s = "doter";
            }
            System.out.printf("%s is %s on %s\n",item.getKey(),s,this.name);
        }
    }



}


