package fegopa;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class �ν���û��_���� {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					�ν���û��_���� window = new �ν���û��_����();
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
	public �ν���û��_����() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 359, 520);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		String img19 = "C:\\Users\\SMT082\\git\\FirstProject\\�����1��������Ʈ\\image\\19.png";
		Image image19 = new ImageIcon(img19).getImage();
		frame.getContentPane().setLayout(null);
		JLabel lbl_img19 = new JLabel(new ImageIcon(image19.getScaledInstance(343, 481, Image.SCALE_SMOOTH)));
		lbl_img19.setBounds(0, 0, 343, 481);
		frame.getContentPane().add(lbl_img19);
		
		textField = new JTextField();
		textField.setBounds(64, 84, 218, 21);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(64, 123, 218, 21);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(64, 155, 218, 21);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(64, 192, 218, 21);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(64, 225, 218, 21);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(64, 263, 218, 21);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(64, 302, 218, 58);
		frame.getContentPane().add(textField_6);
		
		JButton �ڷΰ��� = new JButton("New button");
		�ڷΰ���.setBounds(47, 425, 76, 23);
		frame.getContentPane().add(�ڷΰ���);
		
		JButton �����ϱ� = new JButton("New button");
		�����ϱ�.setBounds(135, 425, 76, 23);
		frame.getContentPane().add(�����ϱ�);
		
		JButton �����Ϸ� = new JButton("New button");
		�����Ϸ�.setBounds(223, 425, 76, 23);
		frame.getContentPane().add(�����Ϸ�);
		
		JButton ���Ϻҷ����� = new JButton("New button");
		���Ϻҷ�����.setBounds(135, 392, 76, 23);
		frame.getContentPane().add(���Ϻҷ�����);
		
	}

}
