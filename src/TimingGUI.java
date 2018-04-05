//import java.awt.*;
//import java.awt.event.*;
//
//import javax.swing.BoxLayout;
//import javax.swing.ButtonGroup;
//import javax.swing.JButton;
//import javax.swing.JComboBox;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JOptionPane;
//import javax.swing.JPanel;
//import javax.swing.JRadioButton;
//import javax.swing.JTextField;
//import javax.swing.WindowConstants;
//
//import java.util.*;
//
//
//public class TimingGUI extends JFrame implements ActionListener {
//
//	JTextField fNameBox = new JTextField(20);
//	JTextField lNameBox = new JTextField(20);
//	JTextField phoneBox = new JTextField(10);
//	JTextField departmentBox = new JTextField(50);
//	
//	JButton a = new JButton("a");
//	JButton b = new JButton("b");
//	JButton c = new JButton("c");
//	JButton d = new JButton("d");
//
//	JFrame frame = new JFrame();
//
//	JPanel fields = new JPanel();
//
//	
//	
//	public TimingGUI() {
//		createComponents();
//	}
//	
//	public void createComponents() {
//		frame.setLayout(new BorderLayout());
//
//		fields.setLayout(new FlowLayout());
//		frame.setTitle("test");
//		setSize(1000, 1000);
//		
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//		frame.add(fields, BorderLayout.CENTER);
//		frame.add(b, BorderLayout.SOUTH);
//		frame.add(c, BorderLayout.EAST);
//		frame.add(d, BorderLayout.WEST);
//		
//		
//		fields.add(b);
//		fields.add(c);
//		fields.add(d);
//		fields.add(a);
//		
//		
//		
//
//		
//		
//		
//		fields.setVisible(true);
//		setVisible(true);
//		
//	}
//
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		// TODO Auto-generated method stub
//		
//	}
//	
//	
//	
//	
//}
