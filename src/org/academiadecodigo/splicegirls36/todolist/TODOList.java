package org.academiadecodigo.splicegirls36.todolist;

import java.util.Iterator;
import java.util.PriorityQueue;

public class TODOList implements Iterable<TODOList.TODO> {

    private PriorityQueue<TODO> list;

    public TODOList() {
        this.list = new PriorityQueue<>();
    }

    @Override
    public Iterator<TODO> iterator() {
        return list.iterator();
    }

    enum ImportanceLevel {

        HIGH,
        MEDIUM,
        LOW;
    }

    class TODO implements Comparable<TODO> {

        private ImportanceLevel importance;
        private int priority;
        private String item;

        TODO(ImportanceLevel importance, int priority, String item) {

            this.importance = importance;
            this.priority = priority;
            this.item = item;
        }

        @Override
        public int compareTo(TODO todo) {
            int result;

            result = this.importance.compareTo(todo.importance);
            if (result != 0) {
                return result;
            }
            // Now importance is the same for both todo items
            if (this.priority < todo.priority) {
                result = -1;
            } else if (this.priority > todo.priority) {
                result = 1;
            } else {
                result = (this.item.compareTo(todo.item));
            }
            return result;
        }

        @Override
        public String toString() {
            return importance + ": " + priority + ", " + item + "\n";
        }
    }

    public boolean add(ImportanceLevel importance, int priority, String item) {

        return list.offer(new TODO(importance, priority, item));
    }

    public TODO remove() {
        return list.poll();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public String toString() {
        return "TODO List:" + "\n" + list;
    }
}
