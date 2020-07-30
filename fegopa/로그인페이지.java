package fegopa;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JTextField;

import DAOVO.�Ϲ�ȸ��_DAO;
import DAOVO.�Ϲ�ȸ��_VO;
import DAOVO.����ȸ��_DAO;
import DAOVO.����ȸ��_VO;

import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class �α��������� {

	private JFrame frame;
	private JTextField ���̵�;
	private JPasswordField ��й�ȣ;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					�α��������� window = new �α���������();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public �α���������() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setTitle("�����");
		frame.setBounds(100,100,359,520);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		���̵� = new JTextField();
		���̵�.setBounds(108, 164, 187, 43);
		frame.getContentPane().add(���̵�);
		���̵�.setColumns(10);
		
		��й�ȣ = new JPasswordField();
		��й�ȣ.setBounds(109, 229, 187, 35);
		frame.getContentPane().add(��й�ȣ);
		
		JLabel lblNewLabel = new JLabel("\uBE44\uBC00\uBC88\uD638");
		lblNewLabel.setBounds(67, 225, 40, 43);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblId = new JLabel("\uC544\uC774\uB514 \uC785\uB825");
		lblId.setBounds(56, 168, 40, 35);
		frame.getContentPane().add(lblId);
		
		JButton btnNewButton = new JButton("\uC77C\uBC18\uD68C\uC6D0 \uB85C\uADF8\uC778");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//�α��� ��� ����
				
				�Ϲ�ȸ��_VO �Ϲ�vo = new �Ϲ�ȸ��_VO(���̵�.getText(), ��й�ȣ.getText());
				�Ϲ�ȸ��_DAO �Ϲ�dao = new �Ϲ�ȸ��_DAO();
				
				String result = �Ϲ�dao.logIN(�Ϲ�vo);
				�Ϲ�dao.updateLogtime(���̵�.getText());
				
				if (result != null) {
					frame.dispose();
					����������_�Ϲ�.main(null);
				} else {
				JOptionPane.showMessageDialog(null, "�α��ν��� : ���̵� �Ǵ� ��й�ȣ�� Ʋ�Ƚ��ϴ�.");
				}
				
			}
		});
		btnNewButton.setBounds(39, 287, 140, 52);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uC77C\uBC18\uD68C\uC6D0\uAC00\uC785");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				ȸ������_�Ϲ�.main(null);
			}
		});
		btnNewButton_1.setBounds(99, 362, 150, 35);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\uC8FC\uCD5C\uD68C\uC6D0 \uB85C\uADF8\uC778");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//�α��� ��� ����
				
				����ȸ��_VO ����vo = new ����ȸ��_VO(���̵�.getText(), ��й�ȣ.getText());
				����ȸ��_DAO ����dao = new ����ȸ��_DAO();
				
				String result = ����dao.logIN(����vo);
				����dao.updateLogtime(���̵�.getText());
				
				if (result != null) {
					frame.dispose();
					����������_����.main(null);
				} else {
				JOptionPane.showMessageDialog(null, "�α��ν��� : ���̵� �Ǵ� ��й�ȣ�� Ʋ�Ƚ��ϴ�.");
				}
				
			}
		});
		btnNewButton_2.setBounds(191, 287, 140, 52);
		frame.getContentPane().add(btnNewButton_2);
		
		
		JButton btnNewButton_1_1 = new JButton("\uC8FC\uCD5C\uD68C\uC6D0\uAC00\uC785");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				ȸ������_����.main(null);
			}
		});
		btnNewButton_1_1.setBounds(99, 406, 150, 35);
		frame.getContentPane().add(btnNewButton_1_1);

		
		String url = getClass().getResource("").getPath();
		Image image5 = new ImageIcon(url + "image/5.png").getImage();
		JLabel lbl_img5 = new JLabel(new ImageIcon(image5.getScaledInstance(343, 481, Image.SCALE_SMOOTH)));
		lbl_img5.setBounds(0, 0, 343, 481);
		frame.getContentPane().add(lbl_img5);
	}
}
