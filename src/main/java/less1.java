import java.util.Random;

//Первый семинар.
//1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
//2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
//3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
//4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
//
//Пункты реализовать в методе main
//*Пункты реализовать в разных методах
public class less1 {
   static Random random = new Random();

    public static  void main(String[] args){
        int i = getN();
        System.out.println(i);//1

        int n = Integer.toBinaryString(i).length()-1;
        System.out.println(bit1(i));
        System.out.println(n);//2

        int[] m1 = cratn(i,n);
        System.out.println(m1.length);//3

        int[] m2 = NeCratn(i,n);
        System.out.println(m2.length);//4


    }
    static int getN(){
        int i = random.nextInt(2000);
        return i;
    }
    static int bit1(int x) {
        int t = 1 << 30;
        while (x < t) t >>= 1;
        return t;
    }

    static int[] cratn(int i,int n){
        int max = Short.MAX_VALUE;

        int count = 0;
        int k = i;
        while(k <= max){
            if (k%n == 0) count++;
            k++;
        }

        int[] mass = new int[count];
        for(int j = 0;j <mass.length;j++){
            if (i%n == 0) mass[j] = i;
            i++;
        }
        return mass;
    }

    static int[] NeCratn(int i,int n){
        int min = Short.MIN_VALUE;
        int coun = 0;
        int k = min;
        while(k <= i){
            if (k%n == 0) coun++;
            k++;
        }

        int[] mass = new int[coun];

        for(int j = 0;j <mass.length;j++){
            if (i%n == 0) mass[j] = min;
            min++;
        }
        return mass;
    }
}
