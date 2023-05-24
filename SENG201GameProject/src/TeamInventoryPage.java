import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class TeamInventoryPage {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TeamInventoryPage window = new TeamInventoryPage();
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
	public TeamInventoryPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(176, 196, 222));
		frame.setBounds(100, 100, 637, 483);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(250, 250, 210));
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(25, 61, 361, 360);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setForeground(new Color(0, 0, 0));
		panel_1.setBounds(6, 6, 348, 70);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Team's Inventory");
		lblNewLabel.setFont(new Font("Futura", Font.PLAIN, 40));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(6, 6, 336, 58);
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(6, 79, 348, 275);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton_5 = new JButton("New button");
		btnNewButton_5.setBounds(52, 34, 117, 98);
		panel_2.add(btnNewButton_5);
		
		JButton btnNewButton_5_3 = new JButton("New button");
		btnNewButton_5_3.setBounds(174, 34, 117, 98);
		panel_2.add(btnNewButton_5_3);
		
		JButton btnNewButton_5_4 = new JButton("New button");
		btnNewButton_5_4.setBounds(52, 136, 117, 98);
		panel_2.add(btnNewButton_5_4);
		
		JButton btnNewButton_5_5 = new JButton("New button");
		btnNewButton_5_5.setBounds(174, 136, 117, 98);
		panel_2.add(btnNewButton_5_5);
		
		JButton btnNewButton = new JButton("2");
		btnNewButton.setBounds(332, 433, 31, 16);
		frame.getContentPane().add(btnNewButton);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(250, 250, 210));
		panel_3.setBounds(398, 61, 215, 360);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(255, 215, 0)));
		panel_4.setBackground(new Color(255, 255, 224));
		panel_4.setBounds(6, 6, 203, 348);
		panel_3.add(panel_4);
		panel_4.setLayout(null);
		
		JButton btnNewButton_4 = new JButton("Equip");
		btnNewButton_4.setBounds(65, 306, 117, 29);
		panel_4.add(btnNewButton_4);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_5.setBackground(new Color(255, 255, 255));
		panel_5.setBounds(6, 6, 191, 208);
		panel_4.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Selected items:");
		lblNewLabel_2.setBounds(6, 6, 120, 16);
		panel_5.add(lblNewLabel_2);
		
		JButton btnNewButton_5_1 = new JButton("New button");
		btnNewButton_5_1.setBounds(6, 34, 84, 29);
		panel_5.add(btnNewButton_5_1);
		
		JButton btnNewButton_5_2 = new JButton("New button");
		btnNewButton_5_2.setBounds(6, 70, 84, 29);
		panel_5.add(btnNewButton_5_2);
		
		JButton btnNewButton_5_1_1 = new JButton("New button");
		btnNewButton_5_1_1.setBounds(6, 102, 84, 29);
		panel_5.add(btnNewButton_5_1_1);
		
		JButton btnNewButton_5_2_1 = new JButton("New button");
		btnNewButton_5_2_1.setBounds(6, 138, 84, 29);
		panel_5.add(btnNewButton_5_2_1);
		
		JButton btnNewButton_5_1_2 = new JButton("New button");
		btnNewButton_5_1_2.setBounds(6, 170, 84, 29);
		panel_5.add(btnNewButton_5_1_2);
		
		JButton btnNewButton_5_1_3 = new JButton("New button");
		btnNewButton_5_1_3.setBounds(101, 34, 84, 29);
		panel_5.add(btnNewButton_5_1_3);
		
		JButton btnNewButton_5_2_2 = new JButton("New button");
		btnNewButton_5_2_2.setBounds(101, 70, 84, 29);
		panel_5.add(btnNewButton_5_2_2);
		
		JButton btnNewButton_5_1_1_1 = new JButton("New button");
		btnNewButton_5_1_1_1.setBounds(101, 102, 84, 29);
		panel_5.add(btnNewButton_5_1_1_1);
		
		JButton btnNewButton_5_2_1_1 = new JButton("New button");
		btnNewButton_5_2_1_1.setBounds(101, 138, 84, 29);
		panel_5.add(btnNewButton_5_2_1_1);
		
		JButton btnNewButton_5_1_2_1 = new JButton("New button");
		btnNewButton_5_1_2_1.setBounds(101, 170, 84, 29);
		panel_5.add(btnNewButton_5_1_2_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(21, 267, 161, 27);
		panel_4.add(comboBox);
		
		JLabel lblNewLabel_3 = new JLabel("Select an Athlete:");
		lblNewLabel_3.setBounds(28, 239, 169, 16);
		panel_4.add(lblNewLabel_3);
		
		JLabel lblNewLabel_1 = new JLabel("Page");
		lblNewLabel_1.setFont(new Font("Futura", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(249, 432, 37, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("1");
		btnNewButton_1.setBounds(289, 432, 31, 16);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("3");
		btnNewButton_2.setBounds(375, 432, 31, 16);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Back");
		btnNewButton_3.setBounds(6, 4, 117, 29);
		frame.getContentPane().add(btnNewButton_3);
	}

}
