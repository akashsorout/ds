package in.co.bytehub.app;

import in.co.bytehub.ds.heap.Heap;

public class HeapTester {

	public static void main(String[] args) {

		Heap heap = new Heap();

		heap.push(10);
		heap.push(20);
		heap.push(5);

		heap.print();

		heap.push(15);
		heap.push(23);
		heap.push(13);

		heap.push(4);
		heap.push(8);
		heap.push(40);
		heap.push(15);

		heap.push(11);
		heap.push(34);
		heap.push(56);

		heap.push(2);
		heap.push(3);

		int popItem = heap.pop();
		System.out.println("Pop Item: " + popItem);

		popItem = heap.pop();
		System.out.println("Pop Item: " + popItem);
		heap.print();

	}

}
