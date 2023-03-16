import org.jetbrains.annotations.NotNull;

import java.util.*;
import java.util.Iterator;
import java.util.Map;

public class Sick<K,V extends Patient> {
    Map<K,V> sicks = new HashMap<>();

    public Sick() {

    }

    public void add(K k,V v){
        this.sicks.putIfAbsent(k,v);
    }
    public void setSicks(Map<K, V> sicks) {
        this.sicks = sicks;
    }

    public void ConsoleLog(){
        for(Map.Entry<K, V> item : this.sicks.entrySet()){
            System.out.printf("Key: %s  Value: %s  Status:%s\n", item.getKey(), item.getValue(),item.getValue().getStatus());
        }
    }

    public Patient Priority() {
        int whoseId = 0;
        for(Map.Entry<K, V> item : this.sicks.entrySet()){
            if (item.getValue().getPriority() == 1) {
                whoseId =(int) item.getKey();
                return this.sicks.get(whoseId);
            } else if (item.getValue().getPriority() == 2){
                whoseId =(int) item.getKey();
                return this.sicks.get(whoseId);
            } else if (item.getValue().getPriority() == 3){
                whoseId =(int) item.getKey();
                return this.sicks.get(whoseId);
            } else {
                return this.sicks.get(whoseId);
            }

        }

        return null;
    }

    public Map<K, V> getSicks() {
        return sicks;
    }
}
