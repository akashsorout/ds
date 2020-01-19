package in.co.bytehub.ds.heap.ui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JEditorPane;
import javax.swing.JTree;
import javax.swing.JTextPane;
import javax.swing.JDesktopPane;

public class HeapGraphicRepresentation {

	private JFrame frame;

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
				int id = e.getID();
				System.out.println(id);
			}
		});
		button.setBounds(6, 6, 52, 29);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("2");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_1.setBounds(70, 6, 52, 29);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("3");
		button_2.setBounds(134, 6, 52, 29);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("4");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_3.setBounds(198, 6, 52, 29);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("5");
		button_4.setBounds(262, 6, 52, 29);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("6");
		button_5.setBounds(6, 47, 52, 29);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("7");
		button_6.setBounds(70, 47, 52, 29);
		frame.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("8");
		button_7.setBounds(134, 47, 52, 29);
		frame.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("9");
		button_8.setBounds(198, 47, 52, 29);
		frame.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("10");
		button_9.setBounds(262, 47, 52, 29);
		frame.getContentPane().add(button_9);
		
		JButton button_10 = new JButton("11");
		button_10.setBounds(6, 88, 52, 29);
		frame.getContentPane().add(button_10);
		
		JButton button_11 = new JButton("12");
		button_11.setBounds(70, 88, 52, 29);
		frame.getContentPane().add(button_11);
		
		JButton button_12 = new JButton("13");
		button_12.setBounds(134, 88, 52, 29);
		frame.getContentPane().add(button_12);
		
		JButton button_13 = new JButton("14");
		button_13.setBounds(198, 88, 52, 29);
		frame.getContentPane().add(button_13);
		
		JButton button_14 = new JButton("15");
		button_14.setBounds(262, 88, 52, 29);
		frame.getContentPane().add(button_14);
		
		JButton button_15 = new JButton("16");
		button_15.setBounds(6, 129, 52, 29);
		frame.getContentPane().add(button_15);
		
		JButton button_16 = new JButton("17");
		button_16.setBounds(70, 129, 52, 29);
		frame.getContentPane().add(button_16);
		
		JButton button_17 = new JButton("18");
		button_17.setBounds(134, 129, 52, 29);
		frame.getContentPane().add(button_17);
		
		JButton button_18 = new JButton("19");
		button_18.setBounds(198, 129, 52, 29);
		frame.getContentPane().add(button_18);
		
		JButton button_19 = new JButton("20");
		button_19.setBounds(262, 129, 52, 29);
		frame.getContentPane().add(button_19);
		
		JButton btnRoot = new JButton("Root");
		btnRoot.setBounds(307, 208, 117, 29);
		frame.getContentPane().add(btnRoot);
		
		
		
		frame.setBounds(100, 100, 789, 519);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
