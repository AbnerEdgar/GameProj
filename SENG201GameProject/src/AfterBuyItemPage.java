import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		frame.setBounds(100, 100, 658, 499);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Would you like to add your ");
		lblNewLabel.setFont(new Font("Futura", Font.PLAIN, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 101, 661, 55);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("athlete to ACTIVE or RESERVE ?");
		lblNewLabel_1.setFont(new Font("Futura", Font.PLAIN, 25));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(0, 150, 661, 39);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("A C T I V E");
		btnNewButton.setFont(new Font("Futura", Font.PLAIN, 18));
		btnNewButton.setBounds(134, 201, 188, 41);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("Back");
		btnNewButton_2.setBounds(6, 6, 90, 29);
		frame.getContentPane().add(btnNewButton_2);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBackground(new Color(176, 196, 222));
		panel.setBounds(195, 292, 283, 120);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("*Pick an active athlete to switch place with.*");
		lblNewLabel_2.setBounds(6, 6, 271, 27);
		panel.add(lblNewLabel_2);
		lblNewLabel_2.setForeground(new Color(139, 0, 0));
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(6, 32, 136, 82);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("New button");
		btnNewButton_1_1.setBounds(141, 32, 136, 82);
		panel.add(btnNewButton_1_1);
		
		JButton btnRES_1 = new JButton("R E S E R V E");
		btnRES_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRES_1.setFont(new Font("Futura", Font.PLAIN, 18));
		btnRES_1.setBounds(334, 201, 188, 41);
		frame.getContentPane().add(btnRES_1);
	}

}
