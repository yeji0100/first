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

public class main1 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main1 window = new main1();
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
	public main1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("�����");
		frame.setBounds(100, 100, 359, 520);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		String img2 = "C:\\Users\\SMT082\\git\\FirstProject\\�����1��������Ʈ\\image\\2.png";
		Image image2 = new ImageIcon(img2).getImage();
		JLabel lbl_img2 = new JLabel(new ImageIcon(image2.getScaledInstance(343, 481, Image.SCALE_SMOOTH)));
		lbl_img2.setBounds(0, 0, 343, 481);
		frame.getContentPane().add(lbl_img2);

		
		
		JPanel panel_��ϰ��� = new JPanel();
		panel_��ϰ���.setBackground(new Color(255, 0, 0, 0));
		panel_��ϰ���.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				�α���������.main(null);
				
			}
		});
		panel_��ϰ���.setBackground(Color.ORANGE);
		panel_��ϰ���.setBounds(110, 181, 123, 102);
		frame.getContentPane().add(panel_��ϰ���);
		panel_��ϰ���.setLayout(null);
		
		JPanel panel_back = new JPanel();
		panel_back.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				main.main(null);
			}
		});
		panel_back.setBackground(Color.YELLOW);
		panel_back.setBounds(12, 251, 60, 45);
		frame.getContentPane().add(panel_back);
		panel_back.setLayout(null);
		
		JPanel panel_next = new JPanel();
		panel_next.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				main2.main(null);
				
				
			}
		});
		panel_next.setLayout(null);
		panel_next.setBackground(Color.YELLOW);
		panel_next.setBounds(271, 251, 60, 45);
		frame.getContentPane().add(panel_next);
		
		
	}
}
