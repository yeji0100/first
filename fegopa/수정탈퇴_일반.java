package fegopa;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.DropMode;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class ����Ż��_�Ϲ� {

	private JFrame frame;
	private JTextField ��й�ȣ;
	private JTextField ��й�ȣȮ��;
	private JTextField �ּ�;
	private JTextField �̸�;
	private JTextField ����ó;
	private JTextField �������;
	private JTextField �̸���;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	
	�Ϲ�ȸ��_DAO �Ϲ�dao = new �Ϲ�ȸ��_DAO();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					����Ż��_�Ϲ� window = new ����Ż��_�Ϲ�();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ����Ż��_�Ϲ�() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(700, 200, 470, 543);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uAC1C\uC778\uC815\uBCF4 \uC218\uC815 / \uD0C8\uD1F4");
		lblNewLabel.setFont(new Font("���ʷҵ���", Font.PLAIN, 24));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(97, 30, 259, 37);
		frame.getContentPane().add(lblNewLabel);
		
		��й�ȣ = new JTextField();
		��й�ȣ.setText(�Ϲ�dao.showCustomerInfo().getPW());
		��й�ȣ.setDropMode(DropMode.INSERT);
		��й�ȣ.setBounds(130, 93, 291, 37);
		frame.getContentPane().add(��й�ȣ);
		��й�ȣ.setColumns(10);
		
		��й�ȣȮ�� = new JTextField();
		��й�ȣȮ��.setDropMode(DropMode.INSERT);
		��й�ȣȮ��.setColumns(10);
		��й�ȣȮ��.setBounds(130, 143, 291, 37);
		frame.getContentPane().add(��й�ȣȮ��);
		
		�ּ� = new JTextField();
		�ּ�.setText(�Ϲ�dao.showCustomerInfo().get�ּ�());
		�ּ�.setDropMode(DropMode.INSERT);
		�ּ�.setColumns(10);
		�ּ�.setBounds(130, 193, 291, 37);
		frame.getContentPane().add(�ּ�);
		
		�̸� = new JTextField();
		�̸�.setText(�Ϲ�dao.showCustomerInfo().get�̸�());
		�̸�.setDropMode(DropMode.INSERT);
		�̸�.setColumns(10);
		�̸�.setBounds(130, 243, 291, 37);
		frame.getContentPane().add(�̸�);
		
		����ó = new JTextField();
		����ó.setText(�Ϲ�dao.showCustomerInfo().get����ó());
		����ó.setDropMode(DropMode.INSERT);
		����ó.setColumns(10);
		����ó.setBounds(130, 293, 291, 37);
		frame.getContentPane().add(����ó);
		
		������� = new JTextField();
		�������.setText(�Ϲ�dao.showCustomerInfo().get�������());
		�������.setDropMode(DropMode.INSERT);
		�������.setColumns(10);
		�������.setBounds(130, 390, 291, 37);
		frame.getContentPane().add(�������);
		
		�̸��� = new JTextField();
		�̸���.setText(�Ϲ�dao.showCustomerInfo().get�̸���());
		�̸���.setDropMode(DropMode.INSERT);
		�̸���.setColumns(10);
		�̸���.setBounds(130, 343, 291, 37);
		frame.getContentPane().add(�̸���);
		
		JButton btnNewButton = new JButton("\uB4A4\uB85C\uAC00\uAE30");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(153, 416, 128, 44);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uC815\uBCF4\uBCC0\uACBD");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				�Ϲ�ȸ��_VO vo = new �Ϲ�ȸ��_VO(��й�ȣ.getText(), �ּ�.getText(), �̸�.getText(), ����ó.getText(), �������.getText(), �̸���.getText());
				
				if (��й�ȣ.getText().equals(��й�ȣȮ��.getText())) {
					�Ϲ�dao.updateCustomerInfo(vo);
					JOptionPane.showMessageDialog(null, "ȸ������ ���� ����");
				} else {
					JOptionPane.showMessageDialog(null, "ȸ������ ���� ����");
				}
				
			}
		});
		btnNewButton_1.setBounds(293, 416, 128, 44);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btn_delAccount = new JButton("\uACC4\uC815 \uD0C8\uD1F4 ");
		btn_delAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				�Ϲ�dao.deleteCustomer();
				
				JOptionPane.showMessageDialog(null, "ȸ��Ż�� �Ǿ����ϴ�.");
				
			}
		});
		btn_delAccount.setBounds(29, 423, 96, 30);
		frame.getContentPane().add(btn_delAccount);
		
		lblNewLabel_1 = new JLabel("\uBCC0\uACBD\uD560 \uBE44\uBC00\uBC88\uD638");
		lblNewLabel_1.setBounds(29, 104, 96, 15);
		frame.getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("\uBE44\uBC00\uBC88\uD638 \uD655\uC778");
		lblNewLabel_2.setBounds(29, 154, 89, 15);
		frame.getContentPane().add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("\uBCC0\uACBD\uD560 \uC8FC\uC18C");
		lblNewLabel_3.setBounds(29, 204, 89, 15);
		frame.getContentPane().add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("\uBCC0\uACBD\uD560 \uC774\uB984");
		lblNewLabel_4.setBounds(29, 254, 89, 15);
		frame.getContentPane().add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("\uBCC0\uACBD\uD560 \uC5F0\uB77D\uCC98");
		lblNewLabel_5.setBounds(29, 304, 89, 15);
		frame.getContentPane().add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("\uBCC0\uACBD\uD560 \uC774\uBA54\uC77C");
		lblNewLabel_6.setBounds(29, 354, 89, 15);
		frame.getContentPane().add(lblNewLabel_6);
		
		
		lblNewLabel_7 = new JLabel("\uBCC0\uACBD\uD560 \uC0DD\uB144\uC6D4\uC77C");
		lblNewLabel_7.setBounds(29, 401, 96, 15);
		frame.getContentPane().add(lblNewLabel_7);
	}
}
