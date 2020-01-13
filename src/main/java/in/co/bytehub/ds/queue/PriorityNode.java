package in.co.bytehub.ds.queue;

public class PriorityNode<E> implements Comparable {

    private E data;
    private Integer priority;

    public PriorityNode(E data, int priority) {
        this.data = data;
        this.priority = priority;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int compareTo(Object o) {
        PriorityNode<E> node = (PriorityNode<E>) o;
        return priority.compareTo(node.getPriority());
    }

    @Override
    public String toString() {
        return " {data=" + data + ", priority=" + priority + "} ";
    }

}
