import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;

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
		panel.setBounds(160, 197, 323, 133);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Accumulated Points:");
		lblNewLabel.setFont(new Font("Futura", Font.PLAIN, 16));
		lblNewLabel.setBounds(44, 81, 160, 16);
		panel.add(lblNewLabel);
		
		JLabel lblBalances = new JLabel("Balances:");
		lblBalances.setFont(new Font("Futura", Font.PLAIN, 20));
		lblBalances.setBounds(44, 38, 93, 27);
		panel.add(lblBalances);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(216, 82, 61, 16);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("New label");
		lblNewLabel_1_1.setBounds(216, 46, 61, 16);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("You win!");
		lblNewLabel_2.setForeground(new Color(220, 20, 60));
		lblNewLabel_2.setBackground(new Color(176, 224, 230));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Futura", Font.PLAIN, 80));
		lblNewLabel_2.setBounds(135, 71, 363, 114);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("exit");
		btnNewButton.setBounds(270, 352, 117, 29);
		frame.getContentPane().add(btnNewButton);
	}

}
