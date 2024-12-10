import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueueList {
    private final List<Integer> list;

    public QueueList(List<Integer> list) {
        this.list = list;
    }

    public Queue<Integer> buildQueue() {
        Queue<Integer> queue = new LinkedList<>();
        // Добавляем элементы из списка в очередь
        for (int i = 0; i < list.size(); i++) {
            queue.add(list.get(i));
        }
        // Добавляем элементы из списка в обратном порядке в очередь
        for (int i = list.size() - 1; i >= 0; i--) {
            queue.add(list.get(i));
        }
        return queue;
    }

    @Override
    public String toString() {
        return "Список = " + list;
    }
}