import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JRadioButton;
import java.awt.GridBagConstraints;
import javax.swing.JToggleButton;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import net.miginfocom.swing.MigLayout;
import javax.swing.JScrollBar;

public class builder {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					builder window = new builder();
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
	public builder() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 705, 463);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setTitle("ChronoTimer");
		
		JButton btnPower = new JButton("Power");
		btnPower.setBounds(12, 25, 94, 25);
		frame.getContentPane().add(btnPower);
		
		JRadioButton rdbtnCh = new JRadioButton("ch1");
		rdbtnCh.setBounds(160, 0, 49, 25);
		frame.getContentPane().add(rdbtnCh);
		
		JRadioButton rdbtnCh_1 = new JRadioButton("ch2");
		rdbtnCh_1.setBounds(160, 60, 49, 25);
		frame.getContentPane().add(rdbtnCh_1);
		
		JButton btnFunction = new JButton("Function");
		btnFunction.setBounds(12, 236, 94, 25);
		frame.getContentPane().add(btnFunction);
		
		JButton btnSwap = new JButton("Swap");
		btnSwap.setBounds(12, 280, 94, 25);
		frame.getContentPane().add(btnSwap);
		
		JRadioButton rdbtnCh_2 = new JRadioButton("ch3");
		rdbtnCh_2.setBounds(213, 0, 49, 25);
		frame.getContentPane().add(rdbtnCh_2);
		
		JRadioButton rdbtnCh_3 = new JRadioButton("ch4");
		rdbtnCh_3.setBounds(213, 60, 49, 25);
		frame.getContentPane().add(rdbtnCh_3);
		
		JRadioButton rdbtnCh_4 = new JRadioButton("ch5");
		rdbtnCh_4.setBounds(266, 0, 49, 25);
		frame.getContentPane().add(rdbtnCh_4);
		
		JRadioButton rdbtnCh_5 = new JRadioButton("ch6");
		rdbtnCh_5.setBounds(266, 60, 54, 25);
		frame.getContentPane().add(rdbtnCh_5);
		
		JRadioButton rdbtnCh_6 = new JRadioButton("ch7");
		rdbtnCh_6.setBounds(319, 0, 49, 25);
		frame.getContentPane().add(rdbtnCh_6);
		
		JRadioButton rdbtnCh_7 = new JRadioButton("ch8");
		rdbtnCh_7.setBounds(324, 60, 49, 25);
		frame.getContentPane().add(rdbtnCh_7);
		
		JTextArea queueScreen = new JTextArea();
		queueScreen.setBounds(144, 118, 278, 274);
		frame.getContentPane().add(queueScreen);
		
		JButton btnPrinterPower = new JButton("Printer Power");
		btnPrinterPower.setBounds(497, 41, 120, 25);
		frame.getContentPane().add(btnPrinterPower);
		
		JTextArea printScreen = new JTextArea();
		printScreen.setBounds(470, 79, 184, 69);
		frame.getContentPane().add(printScreen);
		
		JPanel panel = new JPanel();
		panel.setBounds(485, 224, 143, 136);
		frame.getContentPane().add(panel);
		panel.setLayout(new MigLayout("", "[][][]", "[][][][]"));
		
		JButton button = new JButton("1");
		panel.add(button, "cell 0 0");
		
		JButton button_1 = new JButton("2");
		panel.add(button_1, "cell 1 0,growx");
		
		JButton button_2 = new JButton("3");
		panel.add(button_2, "cell 2 0,growx");
		
		JButton button_3 = new JButton("4");
		panel.add(button_3, "cell 0 1");
		
		JButton button_4 = new JButton("5");
		panel.add(button_4, "cell 1 1");
		
		JButton button_5 = new JButton("6");
		panel.add(button_5, "cell 2 1,growx");
		
		JButton button_6 = new JButton("7");
		panel.add(button_6, "cell 0 2");
		
		JButton button_7 = new JButton("8");
		panel.add(button_7, "cell 1 2");
		
		JButton button_8 = new JButton("9");
		panel.add(button_8, "cell 2 2,growx");
		
		JButton button_9 = new JButton("*");
		panel.add(button_9, "cell 0 3");
		
		JButton button_10 = new JButton("0");
		panel.add(button_10, "cell 1 3");
		
		JButton button_11 = new JButton("#");
		panel.add(button_11, "cell 2 3");
	}
}
