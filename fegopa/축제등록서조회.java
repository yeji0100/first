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

public class ������ϼ���ȸ {

	private JFrame frame; //��� ���� ��ȸ â �� -> ������ ���� ��ϼ� ��ȸ â? �̷��� ������Ѿ��ұ�?

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					������ϼ���ȸ window = new ������ϼ���ȸ();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ������ϼ���ȸ() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 359, 520);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		panel.setBounds(12, 10, 319, 461);
		panel.setBackground(new Color(255,0,0,0));
		frame.getContentPane().add(panel);

		JButton btn_�ڷΰ��� = new JButton("");
		btn_�ڷΰ���.setBounds(256, 0, 63, 53);
		btn_�ڷΰ���.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.setLayout(null);
		panel.add(btn_�ڷΰ���);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 84, 295, 356);
		panel.add(scrollPane);

		String url = getClass().getResource("").getPath();
		Image image14 = new ImageIcon(url + "image/14.png").getImage();
		JLabel lbl_img14 = new JLabel(new ImageIcon(image14.getScaledInstance(343, 481, Image.SCALE_SMOOTH)));
		lbl_img14.setBounds(0, 0, 343, 481);
		frame.getContentPane().add(lbl_img14);

	}

}
