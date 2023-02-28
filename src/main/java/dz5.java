import java.util.*;
public class dz5 {
    public static void main(String[] args){
        Map<Integer, String> states = new HashMap<Integer, String>();
        states.put(1, "Germany");
        states.put(2, "Spain");
        states.put(3, "Italy");
        states.put(4, "France");
        states.put(5, "Russia");
        states.put(6, "Belarus");

        for (int i = 1;i<=states.size();i++) {
            states.replace(i, states.get(i) + "!");
        }
        for(Map.Entry<Integer, String> item : states.entrySet()){
            System.out.printf("Key: %d  Value: %s \n", item.getKey(), item.getValue());
        }

        Map<Integer, String> states2 = new HashMap<Integer, String>();
        states2.put(0, "-");
        states2.put(2, "-");
        states2.put(3, "-");
        states2.put(4, "-");
        states2.put(5, "-");
        states2.put(9, "-");

        for (int i = 0;i <= states2.size();i++){
            if (states2.containsKey(i) == states.containsKey(i)) {
                states2.put(i,states.get(i));
            }
        }
        System.out.println();
        for(Map.Entry<Integer, String> item : states2.entrySet()){
            System.out.printf("Key: %d  Value: %s \n", item.getKey(), item.getValue());
        }



    }
}
