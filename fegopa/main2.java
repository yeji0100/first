package fegopa;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class main2 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main2 window = new main2();
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
	public main2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("�����");
		frame.setBounds(700, 200, 470, 543);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				�α���������.main(null);
				
			}
		});
		panel_1.setBackground(Color.ORANGE);
		panel_1.setBounds(124, 129, 197, 149);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(42, 61, 116, 21);
		textField.setText("\uB300\uC5EC \uBC14\uB85C\uAC00\uAE30 \uBC84\uD2BC");
		textField.setToolTipText("");
		panel_1.add(textField);
		textField.setColumns(10);
		
		JPanel panel_back = new JPanel();
		panel_back.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				main1.main(null);
			}
		});
		panel_back.setBackground(Color.YELLOW);
		panel_back.setBounds(12, 194, 79, 57);
		frame.getContentPane().add(panel_back);
		panel_back.setLayout(null);
		
		textField_1 = new JTextField();
		textField_1.setBounds(24, 10, 42, 21);
		textField_1.setText("\uB4A4\uB85C");
		panel_back.add(textField_1);
		textField_1.setColumns(10);
		
		JPanel panel_next = new JPanel();
		panel_next.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				main3.main(null);
				
				
			}
		});
		panel_next.setLayout(null);
		panel_next.setBackground(Color.YELLOW);
		panel_next.setBounds(351, 183, 79, 57);
		frame.getContentPane().add(panel_next);
		
		textField_2 = new JTextField();
		textField_2.setText("\uC55E\uC73C\uB85C");
		textField_2.setColumns(10);
		textField_2.setBounds(25, 10, 42, 21);
		panel_next.add(textField_2);
		
		String url = getClass().getResource("").getPath();
		Image image3 = new ImageIcon(url + "image/3.png").getImage();
		JLabel lbl_img3 = new JLabel(new ImageIcon(image3.getScaledInstance(343, 481, Image.SCALE_SMOOTH)));
		lbl_img3.setBounds(0, 0, 343, 481);
		frame.getContentPane().add(lbl_img3);
		
	}
}
