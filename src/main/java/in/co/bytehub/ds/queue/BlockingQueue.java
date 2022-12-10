package in.co.bytehub.ds.queue;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class BlockingQueue<T> {

    private final int MAX_SIZE = 10;
    private volatile List<T> queue = new LinkedList<>();

    public synchronized void put(T item) {
        if (queue.size() == MAX_SIZE) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if (queue.isEmpty()) {
            System.out.println("May be Consumers are waiting having consideration queue is empty. " +
                    "\nNotify them Don't wait, We are adding item in queue");
            notify();
        }
        queue.add(item);
        System.out.println("Added item : " + item + " Size : " + queue.size() + " : " + Thread.currentThread().getName());
        try {
            // Just Adding Some delay For thread switch.. make some diff in producing and consuming rate
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized T take() {
        if (queue.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if (queue.size() == MAX_SIZE) {
            System.out.println("May be producer are waiting having consideration, We have done our job, So relax. " +
                    "\n Time to tell them start work again As Consumer is started consuming");
            notify();
        }

        T removedItem = queue.remove(0);
        System.out.println("Item Consumed : " + removedItem + " Size : " + queue.size() + " : " + Thread.currentThread().getName());
        // Just Adding Some delay For thread switch.. make some diff in producing and consuming rate
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return removedItem;
    }

    public int getSize() {
        return queue.size();
    }
}
