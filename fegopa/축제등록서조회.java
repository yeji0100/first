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

public class 축제등록서조회 {

	private JFrame frame; //모든 축제 조회 창 선 -> 선택한 축제 등록서 조회 창? 이렇게 연결시켜야할까?

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					축제등록서조회 window = new 축제등록서조회();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public 축제등록서조회() {
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

		JButton btn_뒤로가기 = new JButton("");
		btn_뒤로가기.setBounds(256, 0, 63, 53);
		btn_뒤로가기.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.setLayout(null);
		panel.add(btn_뒤로가기);

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
