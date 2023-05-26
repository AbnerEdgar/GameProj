import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class TeamInventoryPage {

	private JFrame frame;
	private GameHandler gameHandler;
	private JButton btnNewButton_5;
	private JButton btnNewButton_5_3;
	private JButton btnNewButton_5_1;
	private JButton btnNewButton_5_4;
	private JButton btnNewButton_5_5;
	private JButton btnNewButton_5_3_1;
	private JButton btnNewButton_5_4_1;
	private JButton btnNewButton_5_5_1;
	private JButton btnNewButton;
	private JButton btnNewButton_3;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameHandler gameHandler = new GameHandler();
					TeamInventoryPage window = new TeamInventoryPage(gameHandler);
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
	public TeamInventoryPage(GameHandler gameHandler) {
		initialize();
	}
	
	public void hidePage() {
		frame.setVisible(false);
	}
	public void showPage() {
		onAppear();
		frame.setVisible(true);
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
		panel.setBounds(25, 61, 591, 360);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setForeground(new Color(0, 0, 0));
		panel_1.setBounds(6, 6, 580, 70);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Team's Inventory");
		lblNewLabel.setBounds(6, 8, 566, 58);
		panel_1.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Futura", Font.PLAIN, 40));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(6, 79, 579, 275);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		btnNewButton_5 = new JButton("New button");
		btnNewButton_5.setBounds(47, 29, 117, 98);
		panel_2.add(btnNewButton_5);
		
		btnNewButton_5_3 = new JButton("New button");
		btnNewButton_5_3.setBounds(169, 29, 117, 98);
		panel_2.add(btnNewButton_5_3);
		
		btnNewButton_5_4 = new JButton("New button");
		btnNewButton_5_4.setBounds(47, 131, 117, 98);
		panel_2.add(btnNewButton_5_4);
		
		btnNewButton_5_5 = new JButton("New button");
		btnNewButton_5_5.setBounds(169, 131, 117, 98);
		panel_2.add(btnNewButton_5_5);
		
		btnNewButton_5_1 = new JButton("New button");
		btnNewButton_5_1.setBounds(289, 29, 117, 98);
		panel_2.add(btnNewButton_5_1);
		
		btnNewButton_5_3_1 = new JButton("New button");
		btnNewButton_5_3_1.setBounds(411, 29, 117, 98);
		panel_2.add(btnNewButton_5_3_1);
		
		btnNewButton_5_4_1 = new JButton("New button");
		btnNewButton_5_4_1.setBounds(289, 131, 117, 98);
		panel_2.add(btnNewButton_5_4_1);
		
		btnNewButton_5_5_1 = new JButton("New button");
		btnNewButton_5_5_1.setBounds(411, 131, 117, 98);
		panel_2.add(btnNewButton_5_5_1);
		
		btnNewButton = new JButton("Equip");
		btnNewButton.setBounds(456, 241, 117, 29);
		panel_2.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		btnNewButton_3 = new JButton("Back");
		btnNewButton_3.setBounds(6, 4, 117, 29);
		frame.getContentPane().add(btnNewButton_3);
		btnNewButton_3.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				gameHandler.setPage(3);
				GameMaster.showSelectedPage(gameHandler.getPage());
			}
		});
	}
	public void onAppear() {
		
	}
}
