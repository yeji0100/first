package fegopa;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class ������ϼ�_���� {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JButton btn�ڷΰ���;
	private JButton btn�����ϱ�;
	private JButton btn����������;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					������ϼ�_���� window = new ������ϼ�_����();
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
	public ������ϼ�_����() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 359, 520);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
		
		textField = new JTextField();
		textField.setBounds(56, 91, 230, 21);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(56, 132, 230, 21);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(56, 168, 230, 21);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(56, 211, 230, 21);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(56, 252, 230, 85);
		frame.getContentPane().add(textField_4);
		
		btn�ڷΰ��� = new JButton("New button");
		btn�ڷΰ���.setBounds(46, 423, 80, 23);
		frame.getContentPane().add(btn�ڷΰ���);
		
		btn�����ϱ� = new JButton("New button");
		btn�����ϱ�.setBounds(134, 423, 80, 23);
		frame.getContentPane().add(btn�����ϱ�);
		
		btn���������� = new JButton("New button");
		btn����������.setBounds(219, 423, 80, 23);
		frame.getContentPane().add(btn����������);
		
		
		String url = getClass().getResource("").getPath();
		Image image12 = new ImageIcon(url + "image/12.png").getImage();
		JLabel lbl_img12 = new JLabel(new ImageIcon(image12.getScaledInstance(343, 481, Image.SCALE_SMOOTH)));
		lbl_img12.setBounds(0, 0, 343, 481);
		frame.getContentPane().add(lbl_img12);
	}
	
	
	

}
