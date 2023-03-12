package OOP_3_1;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public class NodeList {
    private Map<String,Person> li = new HashMap();

    public NodeList(Map<String, Person> li) {
        this.li = li;
    }

    public void append(String a,Person ob){
        this.li.put(a, ob);
    }
    public void setLi(@NotNull Map<String, Person> li) {
        this.li = li;
    }

    public Map<String, Person> getLi() {
        return li;
    }

    @Override
    public String toString() {
        return "NodeList{" +
                "li=" + li +
                '}';
    }
}
