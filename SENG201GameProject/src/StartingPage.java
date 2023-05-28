import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;

public class StartingPage {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StartingPage window = new StartingPage();
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
	public StartingPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(176, 196, 222));
		frame.setBounds(100, 100, 647, 459);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("I already have a club");
		btnNewButton.setFont(new Font("Futura", Font.PLAIN, 15));
		btnNewButton.setBounds(224, 292, 209, 64);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnGetStarted = new JButton("GET STARTED");
		btnGetStarted.setFont(new Font("Futura", Font.PLAIN, 15));
		btnGetStarted.setBounds(224, 231, 209, 64);
		frame.getContentPane().add(btnGetStarted);
		
		JLabel lblNewLabel = new JLabel("Badminton Masters");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Futura", Font.PLAIN, 50));
		lblNewLabel.setBounds(0, 110, 647, 76);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblWelcomeTo = new JLabel("B U I L D   Y O U R   D R E A M   T E A M");
		lblWelcomeTo.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcomeTo.setFont(new Font("Futura", Font.PLAIN, 13));
		lblWelcomeTo.setBounds(0, 178, 647, 41);
		frame.getContentPane().add(lblWelcomeTo);
	}
}
