import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Font;

public class AfterBuyItemPage {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AfterBuyItemPage window = new AfterBuyItemPage();
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
	public AfterBuyItemPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(176, 196, 222));
		frame.setBounds(100, 100, 451, 301);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Would you like to add your ");
		lblNewLabel.setFont(new Font("Futura", Font.PLAIN, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(116, 99, 244, 28);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("athlete to ACTIVE or RESERVE ?");
		lblNewLabel_1.setFont(new Font("Futura", Font.PLAIN, 18));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(101, 133, 271, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("A C T I V E");
		btnNewButton.setFont(new Font("Futura", Font.PLAIN, 12));
		btnNewButton.setBounds(90, 171, 117, 29);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnRES = new JButton("R E S E R V E");
		btnRES.setFont(new Font("Futura", Font.PLAIN, 12));
		btnRES.setBounds(224, 171, 136, 29);
		frame.getContentPane().add(btnRES);
		
		JButton btnNewButton_2 = new JButton("Back");
		btnNewButton_2.setBounds(6, 6, 90, 29);
		frame.getContentPane().add(btnNewButton_2);
	}

}
