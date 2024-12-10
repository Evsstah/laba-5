import java.util.ArrayList;
import java.util.List;

public class List1 {
    private List<Integer> list;

    public List1() {
        this.list = new ArrayList<>();
    }

    public void addElement(int element) {
        list.add(element);
    }

    public List<Integer> getList() {
        return list;
    }

    @Override
    public String toString() {
        return list.toString();
    }
}