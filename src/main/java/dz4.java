import java.util.Scanner;
import java.util.ArrayList;

/*
1.Ввод с консоли в формате Ф.И.О Возраст пол
2.Выход из режима вода по горячей кнопке
3.Вывод несортированного списка в формате Иванов И.И. 32M
4.Два варианта продолжения, либо вывод списка сортированного по возрасту либо завершение приложения.
 */
public class dz4 {
    public static void main(String[] args){
        ArrayList<String> lst = new ArrayList<String>();
        Scanner in = new Scanner(System.in);
        StringBuffer strBuffer = new StringBuffer();

        boolean flag = true;
        int id = 0;

        while (flag){
            System.out.println("\nвыход - q \nпоказать список - s");
            System.out.println("Ведите данные в формате (Ф И О Возраст Пол)");
            String str = in.nextLine();
            if (str.equalsIgnoreCase("q")) {
                flag = false;
            } else if (str.equalsIgnoreCase("s")) {
                view(lst);
                flag = false;
            } else {
                lst.add(id,str);
                id++;
            }

        }


    }
    static void view(ArrayList<String> arr){
        for (String item : arr){
            String[] mas = item.split(" ");
            String fam = mas[0];
            StringBuilder im = new StringBuilder(mas[1]);
            StringBuilder ot = new StringBuilder(mas[2]);
            String age = mas[3];
            String p = mas[4];
            System.out.printf("%s %s.%s. %s %s\n", fam, im.charAt(0),ot.charAt(0),age,p);
        }
    }
}
