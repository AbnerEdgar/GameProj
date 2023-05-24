import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AfterBuyItemPage {

	private GameHandler gameHandler;
	private JFrame frame;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel;
	private JButton btnNewButton_2;
	private JButton btnRES;
	private JButton btnNewButton;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameHandler gameHandler = new GameHandler();
					AfterBuyItemPage window = new AfterBuyItemPage(gameHandler);
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
	public AfterBuyItemPage(GameHandler gameHandler) {
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
		frame.setBounds(100, 100, 451, 301);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		
		lblNewLabel = new JLabel("Would you like to move your athlete");
		lblNewLabel.setFont(new Font("Futura", Font.PLAIN, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(116, 99, 244, 28);
		frame.getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("to ACTIVE or RESERVE ?");
		lblNewLabel_1.setFont(new Font("Futura", Font.PLAIN, 18));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(101, 133, 271, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		btnNewButton = new JButton("A C T I V E");
		btnNewButton.setFont(new Font("Futura", Font.PLAIN, 12));
		btnNewButton.setBounds(90, 171, 117, 29);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				// if item is athlete then goback to home
				if(gameHandler.getBuyCategory() == 3) {
					//TODO: add to active
					gameHandler.setPage(2);
					GameMaster.showSelectedPage(gameHandler.getPage());
				} else {
					gameHandler.setPage(3);
					GameMaster.showSelectedPage(gameHandler.getPage());
				}
			}
		});
		
		btnRES = new JButton("R E S E R V E");
		btnRES.setFont(new Font("Futura", Font.PLAIN, 12));
		btnRES.setBounds(224, 171, 136, 29);
		frame.getContentPane().add(btnRES);
		btnRES.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				btnNewButton.addActionListener(new ActionListener() {
					@Override 
					public void actionPerformed(ActionEvent e) {
						// if item is athlete then goback to home
						if(gameHandler.getBuyCategory() == 3) {
							//TODO: add to reserve
							gameHandler.getPlayerTeam().getMembers().set(gameHandler.getPlayerTeam().getActiveMembers(), getBoughtAthlete());
							gameHandler.setPage(2);
							GameMaster.showSelectedPage(gameHandler.getPage());
						} else {
							gameHandler.setPage(5);
							GameMaster.showSelectedPage(gameHandler.getPage());
						}
					}
				});
			}
		});
		
		btnNewButton_2 = new JButton("Back");
		btnNewButton_2.setBounds(6, 6, 90, 29);
		frame.getContentPane().add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				gameHandler.setPage(2);
				GameMaster.showSelectedPage(gameHandler.getPage());
			}
		});
		
	}
	public void onAppear() {
		if(gameHandler.getBuyCategory() == 3) {
			lblNewLabel.setText("Would you like to move your");
			lblNewLabel_1.setText("athlete to ACTIVE or RESERVE?");
			btnNewButton.setText("A C T I V E");
			btnRES.setText("R E S E R V E");
		}else {
			lblNewLabel.setText("Your Item has been added to your inventory");
			lblNewLabel_1.setText("Would you like to go to MARKET or CLUB?");
			btnNewButton.setText("C L U B");
			btnRES.setText("M A R K E T");
		}
	}
	
	public Athlete getBoughtAthlete() {
		return gameHandler.getMarketAthletes().get(gameHandler.getSelectedIAthlete());
	}
	
	
}
