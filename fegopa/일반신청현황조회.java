
package fegopa;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class �Ϲݽ�û��Ȳ��ȸ {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					�Ϲݽ�û��Ȳ��ȸ window = new �Ϲݽ�û��Ȳ��ȸ();
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
	public �Ϲݽ�û��Ȳ��ȸ() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 359, 520);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 10, 319, 461);
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
		
		table = new JTable();
		scrollPane.setColumnHeaderView(table);
		
		
		String url = getClass().getResource("").getPath();
		Image image20 = new ImageIcon(url + "image/20.png").getImage();
		JLabel lbl_img20 = new JLabel(new ImageIcon(image20.getScaledInstance(343, 481, Image.SCALE_SMOOTH)));
		lbl_img20.setBounds(0, 0, 343, 481);
		frame.getContentPane().add(lbl_img20);

	}
}
