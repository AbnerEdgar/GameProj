import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class SaveGamePage {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SaveGamePage window = new SaveGamePage();
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
	public SaveGamePage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(176, 196, 222));
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(250, 250, 210));
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(6, 6, 617, 419);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.setBounds(6, 6, 117, 29);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Player 1");
		btnNewButton_1.setBounds(70, 207, 160, 141);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Player 2");
		btnNewButton_1_1.setBounds(229, 207, 160, 141);
		panel.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("Player 3");
		btnNewButton_1_2.setBounds(388, 207, 160, 141);
		panel.add(btnNewButton_1_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 128));
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(70, 111, 478, 95);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("S A V E  G A M E");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(6, 6, 466, 83);
		panel_1.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Futura", Font.PLAIN, 40));
		frame.setBackground(new Color(176, 196, 222));
		frame.setBounds(100, 100, 629, 459);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
