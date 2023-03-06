package OOP_1;

import java.util.HashMap;
import java.util.Map;

/*
2. Описать с ООП стиле, логику взаимодействия объектов реального мира между собой:
 шкаф-человек. Какие члены должны быть у каждого из классов?
 */
public class dz1_2 {
    public static void main(String[] args) {
        Peopl sanok = new Peopl("Sanya",33,"boy");
        Imush car = new Imush("BMW",333,"Sanya",3333);
        car.havUse("Sanya");
        car.view();
        sanok.setImush(car);
        sanok.setImush("skaf",33,"Sanya",3224);
        sanok.getImush();
    }
}

class Imush{
    public String name;
    public int gabar;
    public String use;
    public int cena;

    public Imush(String name, int gabar,String use,int cena){
        this.name = name;
        this.gabar = gabar;
        this.use = use;
        this.cena = cena;
    }

    public void view(){
        System.out.printf("%s cenoi %d  has use %s\n",name,cena,use);
    }

    public void havUse(String name){
        this.use = name;
    }
}

class Peopl{
    String name;
    int age;
    String sex;

    Map<String, Imush> imush = new HashMap<String, Imush>();

    public Peopl(String name,int age,String sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public void setImush(String name,int gabar,String use,int cena){
        imush.put(name, new Imush(name,gabar,use,cena));
    }
    public void setImush(Imush obj){
        imush.put(obj.name, obj);
    }

    public void getPeople(){
        System.out.printf("%s age:%d sex:%s\n",this.name,age,sex);
    }

    public void getImush(){
        System.out.printf("%s have:\n",this.name);
        for(Map.Entry<String, Imush>  item : imush.entrySet()){
            System.out.printf("Obj: %s  Cena: %d \n", item.getKey(), item.getValue().cena);
        }
    }


}