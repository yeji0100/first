package fegopa;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class �ν���û����ȸ {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					�ν���û����ȸ window = new �ν���û����ȸ();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public �ν���û����ȸ() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 359, 520);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		
		JPanel panel = new JPanel();
		panel.setBounds(12, 10, 319, 461);
		panel.setBackground(new Color(255,0,0,0));
		frame.getContentPane().add(panel);
		
		JButton btn_�ڷΰ��� = new JButton("");
		btn_�ڷΰ���.setBounds(266, 0, 53, 53);
		btn_�ڷΰ���.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.setLayout(null);
		panel.add(btn_�ڷΰ���);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 155, 295, 296);
		panel.add(scrollPane);
		
		//���� ���� ��ư ����� ��� ���� ��ϼ� ��ȸ â���� �����ϳ�? �̰� ����? ����?
		JButton btnNewButton = new JButton("\uCD95\uC81C\uC120\uD0DD");
		btnNewButton.setBounds(12, 79, 181, 23);
		panel.add(btnNewButton);
		
		
		String url = getClass().getResource("").getPath();
		Image image15 = new ImageIcon(url + "image/15.png").getImage();
		JLabel lbl_img15 = new JLabel(new ImageIcon(image15.getScaledInstance(343, 481, Image.SCALE_SMOOTH)));
		lbl_img15.setBounds(0, 0, 343, 481);
		frame.getContentPane().add(lbl_img15);
	

	}
}
