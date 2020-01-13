package in.co.bytehub.ds.queue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PriorityQueue<E> implements PriorityQueueInterface<PriorityNode<E>> {

    private static final Logger LOGGER = Logger.getLogger(PriorityQueue.class.getName());
    protected List<PriorityNode<E>> items = new ArrayList<PriorityNode<E>>();

    public boolean offer(PriorityNode<E> item) {
        if (null == item) {
            LOGGER.info("OFFER: Item is null");
            return false;
        }
        items.add(item);
        Collections.sort(items);
        return true;
    }

    public PriorityNode<E> poll() {
        if (isEmpty()) {
            LOGGER.log(Level.WARNING, "POLL: Queue is Empty");
            return null;
        }
        PriorityNode<E> priorityNode = items.get(0);
        items.remove(0);
        return priorityNode;
    }

    public int size() {
        return items.size();
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public void clear() {
        items.clear();
    }

    public PriorityNode<E> get(int x) {
        if (x < size()) {
            return items.get(x);
        }
        LOGGER.info("GET: Index is out of boundary");
        return null;
    }

    public PriorityNode<E> Set(int x, PriorityNode<E> item) {
        items.add(x, item);
        Collections.sort(items);
        return item;
    }

    public PriorityNode<E> peek() {
        if (isEmpty()) {
            LOGGER.log(Level.WARNING, "PEEK: Queue is Empty");
            return null;
        }
        return items.get(0);
    }

    @Override
    public String toString() {
        return items.toString();
    }


}
