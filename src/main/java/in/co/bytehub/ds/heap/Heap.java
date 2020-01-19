package in.co.bytehub.ds.heap;

/* 				Heap: 
 * 				/	\
 * 
 * 		MAX-Heap	MIN-Heap
 * 
 *  MAX-heap: is a
 *  		- complete binary tree
 *  		- All descendants of a node must be smaller. i.e. ROOT will be max
 *  
 *  MIN-heap: is a
 *  		- complete binary tree
 *  		- All descendants of a node must be greater.  i.e. ROOT will be min
 * 
 * We are working on MAX-heap now.
 * Array- Representation of HEAP: 1-based index 
 * if node is at index    = i	
 * it's parent will be at = i/2
 * it's left child will be at = 2*i
 * it's right child will be at = 2*i + 1
 * */
public class Heap {
	int[] heap;
	int size;

	public Heap(int capicity) {
		heap = new int[capicity];
		size = 0;
	}

	public Heap() {
		heap = new int[16];
		size = 0;
	}

	public void push(int item) {

		// size is 0 initially So, add the item as 1-based array index.
		// So, basically we are appending item in last of array

		heap[++size] = item;

		int i = size; // i - is an iterator for tree bottom to up

		// consider 1-based index. So, root will be at heap[1]
		// start traversing tree from bottom to top i.e last element added to root
		// and make sure each node satisfies the condition of heap
		// i/2 is the index of it's parent
		int parentIndex = i / 2;
		while (parentIndex >= 1) {
			if (heap[i] > heap[parentIndex]) {
				// swap
				int temp = heap[i];
				heap[i] = heap[parentIndex];
				heap[parentIndex] = temp;
			}
			i = parentIndex; // previous parent Node becomes the iterating node
			parentIndex = i / 2; // find new parent of current node
		}
	}
	
	public int peek() {
		return heap[1];
	}

	public void print() {
		for (int x = 0; x < heap.length; x++) {
			System.out.print("\t" + heap[x]);
		}
		System.out.println("");
		System.out.println("____________________________________________________");
		int i = 1;
		while (i <= size) {
			System.out.println(heap[i]);
			if (2 * i <= size) {
				System.out.print(heap[2 * i] + "\t");
				if ((2 * i + 1) <= size)
					System.out.println(heap[2 * i + 1]);

			}
			i = 2 * i + 2;
		}
	}
}
