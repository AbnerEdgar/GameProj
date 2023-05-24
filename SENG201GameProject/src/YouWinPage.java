import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class YouWinPage {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					YouWinPage window = new YouWinPage();
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
	public YouWinPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(176, 196, 222));
		frame.setBounds(100, 100, 605, 462);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 250, 205));
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(175, 205, 283, 133);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Points:");
		lblNewLabel.setFont(new Font("Futura", Font.PLAIN, 18));
		lblNewLabel.setBounds(43, 39, 61, 16);
		panel.add(lblNewLabel);
		
		JLabel lblBalances = new JLabel("Balances:");
		lblBalances.setFont(new Font("Futura", Font.PLAIN, 18));
		lblBalances.setBounds(43, 72, 96, 16);
		panel.add(lblBalances);
	}

}
