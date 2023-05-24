import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;

public class EndingGamePage {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EndingGamePage window = new EndingGamePage();
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
	public EndingGamePage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(176, 196, 222));
		frame.setBounds(100, 100, 639, 483);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Team Name");
		lblNewLabel.setBackground(new Color(238, 232, 170));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Futura", Font.PLAIN, 50));
		lblNewLabel.setBounds(179, 124, 313, 114);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Seasons duration:");
		lblNewLabel_1.setFont(new Font("Futura", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(216, 239, 123, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Accumulated Balance:");
		lblNewLabel_2.setFont(new Font("Futura", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(216, 277, 149, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Accumulated Points:");
		lblNewLabel_2_1.setFont(new Font("Futura", Font.PLAIN, 13));
		lblNewLabel_2_1.setBounds(216, 316, 149, 16);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setFont(new Font("Futura", Font.PLAIN, 13));
		lblNewLabel_3.setBounds(377, 239, 61, 16);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setFont(new Font("Futura", Font.PLAIN, 13));
		lblNewLabel_4.setBounds(377, 277, 61, 16);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_3_1 = new JLabel("New label");
		lblNewLabel_3_1.setFont(new Font("Futura", Font.PLAIN, 13));
		lblNewLabel_3_1.setBounds(377, 316, 61, 16);
		frame.getContentPane().add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_5 = new JLabel("See you again next season!");
		lblNewLabel_5.setFont(new Font("Futura", Font.PLAIN, 30));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(153, 100, 386, 39);
		frame.getContentPane().add(lblNewLabel_5);
		
		JButton btnNewButton = new JButton("Close");
		btnNewButton.setFont(new Font("Futura", Font.PLAIN, 13));
		btnNewButton.setBounds(288, 367, 117, 29);
		frame.getContentPane().add(btnNewButton);
	}

}
