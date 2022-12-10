package in.co.bytehub.app;

import in.co.bytehub.ds.queue.BlockingQueue;

import java.util.stream.IntStream;

public class BlockingQueueTest {

    public static void main(String[] args) throws InterruptedException {

        BlockingQueue<Integer> blockingQueue = new BlockingQueue<>();


        Thread producer1 = new Thread(() ->
                IntStream
                        .range(1, 15)
                        .forEach(blockingQueue::put)
                , "Producer-1"
        );


        Thread consumer1 = new Thread(() -> {
            for (int i = 1; i < 15; i++) {
                blockingQueue.take();
            }
        }
                , "Consumer-1"
        );


        producer1.start();
        System.out.println("Producer-1 Started ....");

        consumer1.start();
        System.out.println("Consumer-1 Started ....");

        producer1.join();
        consumer1.join();

        System.out.println("Blocking Queue Size at final : " + blockingQueue.getSize());
        System.out.println("Main end .... ");

    }
}
