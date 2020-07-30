package fegopa;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import DAOVO.����ȸ��_DAO;
import DAOVO.����ȸ��_VO;

import javax.swing.JTextField;
import javax.swing.DropMode;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Image;

public class ����Ż��_���� {

	private JFrame frame;
	private JTextField ��й�ȣ;
	private JTextField ��й�ȣȮ��;
	private JTextField �ּ�;
	private JTextField �����;
	private JTextField ����ó;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	
	����ȸ��_DAO ����dao = new ����ȸ��_DAO();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					����Ż��_���� window = new ����Ż��_����();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ����Ż��_����() {
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
		��й�ȣ.setText(����dao.showHostInfo().getPW());
		��й�ȣ.setDropMode(DropMode.INSERT);
		��й�ȣ.setBounds(130, 124, 291, 37);
		frame.getContentPane().add(��й�ȣ);
		��й�ȣ.setColumns(10);
		
		��й�ȣȮ�� = new JTextField();
		��й�ȣȮ��.setDropMode(DropMode.INSERT);
		��й�ȣȮ��.setColumns(10);
		��й�ȣȮ��.setBounds(130, 174, 291, 37);
		frame.getContentPane().add(��й�ȣȮ��);
		
		�ּ� = new JTextField();
		�ּ�.setText(����dao.showHostInfo().get�ּ�());
		�ּ�.setDropMode(DropMode.INSERT);
		�ּ�.setColumns(10);
		�ּ�.setBounds(130, 224, 291, 37);
		frame.getContentPane().add(�ּ�);
		
		����� = new JTextField();
		�����.setText(����dao.showHostInfo().get�����());
		�����.setDropMode(DropMode.INSERT);
		�����.setColumns(10);
		�����.setBounds(130, 274, 291, 37);
		frame.getContentPane().add(�����);
		
		����ó = new JTextField();
		����ó.setText(����dao.showHostInfo().get����ó());
		����ó.setDropMode(DropMode.INSERT);
		����ó.setColumns(10);
		����ó.setBounds(130, 324, 291, 37);
		frame.getContentPane().add(����ó);
		
		JButton btnNewButton = new JButton("\uB4A4\uB85C\uAC00\uAE30");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				����������_����.main(null);
			}
		});
		btnNewButton.setBounds(153, 416, 128, 44);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uC815\uBCF4\uBCC0\uACBD");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				����ȸ��_VO vo = new ����ȸ��_VO(��й�ȣ.getText(), �ּ�.getText(), �����.getText(), ����ó.getText());
				
				if (��й�ȣ.getText().equals(��й�ȣȮ��.getText())) {
					����dao.updateHostInfo(vo);
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
				
				����dao.deleteHost();
				
				JOptionPane.showMessageDialog(null, "ȸ��Ż�� �Ǿ����ϴ�.");
				
			}
		});
		btn_delAccount.setBounds(29, 423, 96, 30);
		frame.getContentPane().add(btn_delAccount);
		
		lblNewLabel_1 = new JLabel("\uBCC0\uACBD\uD560 \uBE44\uBC00\uBC88\uD638");
		lblNewLabel_1.setBounds(29, 135, 96, 15);
		frame.getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("\uBE44\uBC00\uBC88\uD638 \uD655\uC778");
		lblNewLabel_2.setBounds(29, 185, 89, 15);
		frame.getContentPane().add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("\uBCC0\uACBD\uD560 \uC8FC\uC18C");
		lblNewLabel_3.setBounds(29, 235, 89, 15);
		frame.getContentPane().add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("\uBCC0\uACBD\uD560 \uAE30\uAD00\uBA85");
		lblNewLabel_4.setBounds(29, 285, 89, 15);
		frame.getContentPane().add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("\uBCC0\uACBD\uD560 \uC5F0\uB77D\uCC98");
		lblNewLabel_5.setBounds(29, 335, 89, 15);
		frame.getContentPane().add(lblNewLabel_5);
		
		String url = getClass().getResource("").getPath();
		Image image16 = new ImageIcon(url + "image/16.png").getImage();
		JLabel lbl_img16 = new JLabel(new ImageIcon(image16.getScaledInstance(343, 481, Image.SCALE_SMOOTH)));
		lbl_img16.setBounds(0, 0, 343, 481);
		frame.getContentPane().add(lbl_img16);
	}
}
