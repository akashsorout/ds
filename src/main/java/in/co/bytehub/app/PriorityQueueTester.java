
package in.co.bytehub.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import in.co.bytehub.ds.queue.NSPQ;
import in.co.bytehub.ds.queue.PriorityNode;
import in.co.bytehub.ds.queue.PriorityQueue;
import in.co.bytehub.ds.queue.PriorityQueueInterface;

public class PriorityQueueTester {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueueInterface<PriorityNode<String>> priorityQueue = null;

        System.out.println("Choose Tester: \n1.\tPriority Queue\n2.\tNSPQ");
        int testerOption = 0;
        try {
            testerOption = Integer.parseInt(bufferedReader.readLine());
        } catch (NumberFormatException e) {
            System.out.println("Select a NUMBER");
        }
        switch (testerOption) {
            case 1:
                priorityQueue = new PriorityQueue<String>();
                break;
            case 2:
                priorityQueue = new NSPQ<String>();
                break;
            default:
                System.out.println("Wrong OPTION Selected !!!");
                System.exit(0);
        }



        /*
         * Pre-populated data
         * */
        priorityQueue.offer(new PriorityNode<String>("node1", 1));
        priorityQueue.offer(new PriorityNode<String>("node2", 3));
        priorityQueue.offer(new PriorityNode<String>("node3", 2));

        while (true) {
            System.out.println("1. Print");
            System.out.println("2. Size");
            System.out.println("3. Empty");
            System.out.println("4. Add");
            System.out.println("5. Remove");
            System.out.println("6. Clear");
            System.out.println("7. Exit");

            String input = bufferedReader.readLine();
            int option = 0;
            try {
                option = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Select a NUMBER");
            }
            switch (option) {
                case 1:
                    System.out.println(priorityQueue);
                    break;
                case 2:
                    System.out.println(String.format("Size : %d", priorityQueue.size()));
                    break;
                case 3:
                    System.out.println("Queue is empty : " + priorityQueue.isEmpty());
                    break;
                case 4:
                    System.out.println("Enter the data (String)\n");
                    String data = bufferedReader.readLine();
                    System.out.println("Enter the priority (Integer)\n");
                    int priority = Integer.parseInt(bufferedReader.readLine());
                    PriorityNode<String> item = new PriorityNode<String>(data, priority);
                    priorityQueue.offer(item);
                    break;
                case 5:
                    System.out.println(priorityQueue.poll());
                    break;
                case 6:
                    priorityQueue.clear();
                    break;
                case 7:
                    System.out.println("Exit !!");
                    System.exit(0);
                default:
                    System.out.println("Wrong OPTION Selected !!!");
                    break;
            }

        }

    }

}
