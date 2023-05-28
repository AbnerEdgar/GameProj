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
import javax.swing.JSeparator;

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
	private JLabel lblNewLabel_2;
	private int selectedItem;
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
		this.gameHandler = gameHandler;
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
		selectedItem = 0;
		
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
		btnNewButton_5.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				selectedItem = 0;
				if(gameHandler.getInventoryShoe().get(selectedItem).getName().equals("")) {
					btnNewButton.setVisible(false);
				}else {
					btnNewButton.setVisible(true);
				}
			}
		});
		
		btnNewButton_5_3 = new JButton("New button");
		btnNewButton_5_3.setBounds(169, 29, 117, 98);
		panel_2.add(btnNewButton_5_3);
		btnNewButton_5_3.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				selectedItem = 1;
				if(gameHandler.getInventoryShoe().get(selectedItem).getName().equals("")) {
					btnNewButton.setVisible(false);
				}else {
					btnNewButton.setVisible(true);
				}
			}
		});
		
		btnNewButton_5_4 = new JButton("New button");
		btnNewButton_5_4.setBounds(47, 131, 117, 98);
		panel_2.add(btnNewButton_5_4);
		btnNewButton_5_4.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				selectedItem = 4;
				if(gameHandler.getInventoryRacket().get(selectedItem%4).getName().equals("")) {
					btnNewButton.setVisible(false);
				}else {
					btnNewButton.setVisible(true);
				}
			}
		});
		
		btnNewButton_5_5 = new JButton("New button");
		btnNewButton_5_5.setBounds(169, 131, 117, 98);
		panel_2.add(btnNewButton_5_5);
		btnNewButton_5_5.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				selectedItem = 5;
				if(gameHandler.getInventoryRacket().get(selectedItem%4).getName().equals("")) {
					btnNewButton.setVisible(false);
				}else {
					btnNewButton.setVisible(true);
				}
			}
		});
		
		btnNewButton_5_1 = new JButton("New button");
		btnNewButton_5_1.setBounds(289, 29, 117, 98);
		panel_2.add(btnNewButton_5_1);
		btnNewButton_5_1.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				selectedItem = 2;
				if(gameHandler.getInventoryShoe().get(selectedItem).getName().equals("")) {
					btnNewButton.setVisible(false);
				}else {
					btnNewButton.setVisible(true);
				}
			}
		});
		
		btnNewButton_5_3_1 = new JButton("New button");
		btnNewButton_5_3_1.setBounds(411, 29, 117, 98);
		panel_2.add(btnNewButton_5_3_1);
		btnNewButton_5_3_1.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				selectedItem = 3;
				if(gameHandler.getInventoryShoe().get(selectedItem).getName().equals("")) {
					btnNewButton.setVisible(false);
				}else {
					btnNewButton.setVisible(true);
				}
			}
		});
		
		btnNewButton_5_4_1 = new JButton("New button");
		btnNewButton_5_4_1.setBounds(289, 131, 117, 98);
		panel_2.add(btnNewButton_5_4_1);
		btnNewButton_5_4_1.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				selectedItem = 6;
				if(gameHandler.getInventoryRacket().get(selectedItem%4).getName().equals("")) {
					btnNewButton.setVisible(false);
				}else {
					btnNewButton.setVisible(true);
				}
			}
		});
		
		btnNewButton_5_5_1 = new JButton("New button");
		btnNewButton_5_5_1.setBounds(411, 131, 117, 98);
		panel_2.add(btnNewButton_5_5_1);
		btnNewButton_5_5_1.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				selectedItem = 7;
				if(gameHandler.getInventoryRacket().get(selectedItem%4).getName().equals("")) {
					btnNewButton.setVisible(false);
				}else {
					btnNewButton.setVisible(true);
				}
			}
		});
		
		btnNewButton = new JButton("Equip");
		btnNewButton.setBounds(456, 241, 117, 29);
		panel_2.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				if(gameHandler.isSellButton()) {
					float tempPrice;
					if(selectedItem > 3) {
						Racket tempRacket = gameHandler.getInventoryRacket().get(selectedItem%4);
						gameHandler.getInventoryRacket().remove(selectedItem%4);
						tempPrice = tempRacket.getPrice() * 0.9f;
						gameHandler.getInventoryRacket().add(new Racket());
					}else {
						Shoe tempShoe = gameHandler.getInventoryShoe().get(selectedItem);
						gameHandler.getInventoryShoe().remove(selectedItem);
						tempPrice = tempShoe.getPrice() * 0.9f;
						gameHandler.getInventoryShoe().add(new Shoe());
					}
					gameHandler.setBalance(gameHandler.getBalance() + tempPrice);
				}else {
					Athlete target = gameHandler.getPlayerTeam().getMembers().get(gameHandler.getClubSelectedAthlete());
					if(selectedItem > 3) {
						Racket tempRacket = target.getRacket();
						target.setRacket(gameHandler.getInventoryRacket().get(selectedItem%4));
						gameHandler.getInventoryRacket().set(selectedItem%4, tempRacket);
					}else {
						Shoe tempShoe = target.getShoe();
						target.setShoe(gameHandler.getInventoryShoe().get(selectedItem));
						gameHandler.getInventoryShoe().set(selectedItem, tempShoe);
					}
					gameHandler.setPage(3);
					GameMaster.showSelectedPage(gameHandler.getPage());
				}
				onAppear();
			}
		});
		
		JLabel lblNewLabel_1 = new JLabel("<html>R<br>a<br>c<br>q<br>u<br>e<br>t</html>");
		lblNewLabel_1.setFont(new Font("Futura", Font.BOLD, 13));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(6, 135, 38, 121);
		
		panel_2.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("<html>S<br>h<br>o<br>e<br>s</html>");
		lblNewLabel_2.setFont(new Font("Futura", Font.BOLD, 13));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(6, 18, 38, 121);
		panel_2.add(lblNewLabel_2);
		
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
		if(gameHandler.isSellButton()) {
			btnNewButton.setText("Sell");
		}else {
			btnNewButton.setText("Equip");
		}
		btnNewButton_5.setText(gameHandler.getInventoryShoe().get(0).getName());
		btnNewButton_5_3.setText(gameHandler.getInventoryShoe().get(1).getName());
		btnNewButton_5_1.setText(gameHandler.getInventoryShoe().get(2).getName());
		btnNewButton_5_3_1.setText(gameHandler.getInventoryShoe().get(3).getName());
		btnNewButton_5_4.setText(gameHandler.getInventoryRacket().get(0).getName());
		btnNewButton_5_5.setText(gameHandler.getInventoryRacket().get(1).getName());
		btnNewButton_5_4_1.setText(gameHandler.getInventoryRacket().get(2).getName());
		btnNewButton_5_5_1.setText(gameHandler.getInventoryRacket().get(3).getName());
		if(gameHandler.getInventoryShoe().get(selectedItem).getName().equals("")) {
			btnNewButton.setVisible(false);
		}else {
			btnNewButton.setVisible(true);
		}
	}
}
