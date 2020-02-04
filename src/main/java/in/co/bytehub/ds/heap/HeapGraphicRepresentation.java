package in.co.bytehub.ds.heap;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HeapGraphicRepresentation {

	private JFrame frame;
	private JPanel panel;
	private Heap heap;
	private static final int HEAP_SIZE = 16;
	private final int buttonWidth = 50;
	private final int buttonHeight = 25;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HeapGraphicRepresentation window = new HeapGraphicRepresentation();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public HeapGraphicRepresentation() {
		heap = new Heap(HEAP_SIZE);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setLayout(null);

		JButton button = new JButton("1");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				heap.push(1);
				displayHeap(heap);
			}
		});

		button.setBounds(6, 6, buttonWidth, buttonHeight);
		frame.getContentPane().add(button);

		JButton button_1 = new JButton("2");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				heap.push(2);
				displayHeap(heap);
			}
		});
		button_1.setBounds(70, 6, buttonWidth, buttonHeight);
		frame.getContentPane().add(button_1);

		JButton button_2 = new JButton("3");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				heap.push(3);
				displayHeap(heap);
			}
		});
		button_2.setBounds(134, 6, buttonWidth, buttonHeight);
		frame.getContentPane().add(button_2);

		JButton button_3 = new JButton("4");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				heap.push(4);
				displayHeap(heap);
			}
		});
		button_3.setBounds(198, 6, buttonWidth, buttonHeight);
		frame.getContentPane().add(button_3);

		JButton button_4 = new JButton("5");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				heap.push(5);
				displayHeap(heap);
			}
		});
		button_4.setBounds(262, 6, buttonWidth, buttonHeight);
		frame.getContentPane().add(button_4);

		JButton button_5 = new JButton("6");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				heap.push(6);
				displayHeap(heap);
			}
		});
		button_5.setBounds(6, 47, buttonWidth, buttonHeight);
		frame.getContentPane().add(button_5);

		JButton button_6 = new JButton("7");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				heap.push(7);
				displayHeap(heap);
			}
		});
		button_6.setBounds(70, 47, buttonWidth, buttonHeight);
		frame.getContentPane().add(button_6);

		JButton button_7 = new JButton("8");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				heap.push(8);
				displayHeap(heap);
			}
		});
		button_7.setBounds(134, 47, buttonWidth, buttonHeight);
		frame.getContentPane().add(button_7);

		JButton button_8 = new JButton("9");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				heap.push(9);
				displayHeap(heap);
			}
		});
		button_8.setBounds(198, 47, buttonWidth, buttonHeight);
		frame.getContentPane().add(button_8);

		JButton button_9 = new JButton("10");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				heap.push(10);
				displayHeap(heap);
			}
		});
		button_9.setBounds(262, 47, buttonWidth, buttonHeight);
		frame.getContentPane().add(button_9);

		JButton button_10 = new JButton("11");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				heap.push(11);
				displayHeap(heap);
			}
		});
		button_10.setBounds(6, 88, buttonWidth, buttonHeight);
		frame.getContentPane().add(button_10);

		JButton button_11 = new JButton("12");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				heap.push(12);
				displayHeap(heap);
			}
		});
		button_11.setBounds(70, 88, buttonWidth, buttonHeight);
		frame.getContentPane().add(button_11);

		JButton button_12 = new JButton("13");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				heap.push(13);
				displayHeap(heap);
			}
		});
		button_12.setBounds(134, 88, buttonWidth, buttonHeight);
		frame.getContentPane().add(button_12);

		JButton button_13 = new JButton("14");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				heap.push(14);
				displayHeap(heap);
			}
		});
		button_13.setBounds(198, 88, buttonWidth, buttonHeight);
		frame.getContentPane().add(button_13);

		JButton button_14 = new JButton("15");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				heap.push(15);
				displayHeap(heap);
			}
		});
		button_14.setBounds(262, 88, buttonWidth, buttonHeight);
		frame.getContentPane().add(button_14);

		JButton button_15 = new JButton("16");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				heap.push(16);
				displayHeap(heap);
			}
		});
		button_15.setBounds(6, 129, buttonWidth, buttonHeight);
		frame.getContentPane().add(button_15);

		JButton button_16 = new JButton("17");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				heap.push(17);
				displayHeap(heap);
			}
		});
		button_16.setBounds(70, 129, buttonWidth, buttonHeight);
		frame.getContentPane().add(button_16);

		JButton button_17 = new JButton("18");
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				heap.push(18);
				displayHeap(heap);
			}
		});
		button_17.setBounds(134, 129, buttonWidth, buttonHeight);
		frame.getContentPane().add(button_17);

		JButton button_18 = new JButton("19");
		button_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				heap.push(19);
				displayHeap(heap);
			}
		});
		button_18.setBounds(198, 129, buttonWidth, buttonHeight);
		frame.getContentPane().add(button_18);

		JButton button_19 = new JButton("20");
		button_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				heap.push(20);
				displayHeap(heap);
			}
		});
		button_19.setBounds(262, 129, buttonWidth, buttonHeight);
		frame.getContentPane().add(button_19);

		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(5, 170, 1000, 285);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JButton btnRemove = new JButton("Remove");
		btnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				heap.pop();
				displayHeap(heap);
			}
		});
		btnRemove.setBounds(431, 48, 89, 23);
		frame.getContentPane().add(btnRemove);

		frame.setBounds(100, 100, 1010, 519);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void displayHeap(Heap heap) {
		if (!heap.isHeapFull()) {
			panel.removeAll();

			int rootX = 500;
			int rootY = 5;
			addNode(rootX, rootY, 1);

			panel.repaint();
		}

	}

	private void addNode(int x, int y, int nodeIndex) {
		if (nodeIndex <= heap.size) {
			JButton node = new JButton(String.valueOf(heap.heap[nodeIndex]));
			node.setEnabled(false);
			node.setBackground(Color.CYAN);
			node.setBounds(x, y, buttonWidth, buttonHeight);
			panel.add(node);

			if (heap.size >= nodeIndex * 2) {
				addNode(x - calculateGap(nodeIndex) * buttonWidth, y + 2 * buttonHeight, nodeIndex * 2);
			}
			if (heap.size >= nodeIndex * 2 + 1) {
				addNode(x + calculateGap(nodeIndex) * buttonWidth, y + 2 * buttonHeight, nodeIndex * 2 + 1);
			}
		}
	}

	private int calculateGap(int nodeIndex) {
		if (nodeIndex == 1) {
			return 4;
		}
		if (nodeIndex > 1 && nodeIndex < 4) {
			return 2;
		}

		if (nodeIndex >= 4 && nodeIndex < 8) {
			return 1;
		}
		return 1;
	}
}
