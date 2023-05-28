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

/**
 * The AfterBuyItemPage class represents a GUI page that is displayed after buying an item.
 * It provides options to move an athlete to the active or reserve team.
 */
public class AfterBuyItemPage {

	private GameHandler gameHandler;
	private JFrame frame;
	private JLabel lblQuestion1;
	private JLabel lblQuestion2;
	private JButton btnActive;
	private JButton btnReserve;
	private JButton btnBack;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameHandler gameHandler = new GameHandler();
					AfterBuyItemPage window = new AfterBuyItemPage(gameHandler);
					window.showPage();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Constructs an instance of the AfterBuyItemPage class.
	 * @param gameHandler the GameHandler instance
	 */
	public AfterBuyItemPage(GameHandler gameHandler) {
		this.gameHandler = gameHandler;
		initialize();
	}
	
	/**
	 * Hides the current page.
	 */
	public void hidePage() {
		frame.setVisible(false);
	}
	
	/**
	 * Shows the current page.
	 */
	public void showPage() {
		updateComponents();
		frame.setVisible(true);
	}

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(176, 196, 222));
		frame.setBounds(100, 100, 582, 404);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		
//		JLabel lblNewLabel = new JLabel("Would you like to add your ");
//		lblNewLabel.setFont(new Font("Futura", Font.PLAIN, 25));
//		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
//		lblNewLabel.setBounds(0, 101, 576, 55);
//		frame.getContentPane().add(lblNewLabel);
//=======
		lblQuestion1 = new JLabel("Would you like to move your athlete");
		lblQuestion1.setFont(new Font("Futura", Font.PLAIN, 18));
		lblQuestion1.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuestion1.setBounds(17, 98, 413, 28);
		frame.getContentPane().add(lblQuestion1);
//>>>>>>> branch 'Master' of https://github.com/Devanamonguchi/GameProj.git
//		
//<<<<<<< HEAD
//		JLabel lblNewLabel_1 = new JLabel("athlete to ACTIVE or RESERVE ?");
//		lblNewLabel_1.setFont(new Font("Futura", Font.PLAIN, 25));
//		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
//		lblNewLabel_1.setBounds(0, 150, 576, 39);
//		frame.getContentPane().add(lblNewLabel_1);
//=======
		lblQuestion2 = new JLabel("to ACTIVE or RESERVE?");
		lblQuestion2.setFont(new Font("Futura", Font.PLAIN, 18));
		lblQuestion2.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuestion2.setBounds(17, 132, 413, 27);
		frame.getContentPane().add(lblQuestion2);
//>>>>>>> branch 'Master' of https://github.com/Devanamonguchi/GameProj.git
		
//<<<<<<< HEAD
//		JButton btnNewButton = new JButton("A C T I V E");
//		btnNewButton.setFont(new Font("Futura", Font.PLAIN, 18));
//		btnNewButton.setBounds(103, 201, 188, 41);
//		frame.getContentPane().add(btnNewButton);
//=======
		btnActive = new JButton("ACTIVE");
		btnActive.setFont(new Font("Futura", Font.PLAIN, 12));
		btnActive.setBounds(90, 171, 117, 29);
		frame.getContentPane().add(btnActive);
		btnActive.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				moveAthleteToActive();
			}
		});
//>>>>>>> branch 'Master' of https://github.com/Devanamonguchi/GameProj.git
		
//<<<<<<< HEAD
//		JButton btnNewButton_2 = new JButton("Back");
//		btnNewButton_2.setBounds(6, 6, 90, 29);
//		frame.getContentPane().add(btnNewButton_2);
//		
//		JButton btnRES_1 = new JButton("R E S E R V E");
//		btnRES_1.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//			}
//		});
//		btnRES_1.setFont(new Font("Futura", Font.PLAIN, 18));
//		btnRES_1.setBounds(303, 201, 188, 41);
//		frame.getContentPane().add(btnRES_1);
//=======
		btnReserve = new JButton("RESERVE");
		btnReserve.setFont(new Font("Futura", Font.PLAIN, 12));
		btnReserve.setBounds(224, 171, 136, 29);
		frame.getContentPane().add(btnReserve);
		btnReserve.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				moveAthleteToReserve();
			}
		});
		
		btnBack = new JButton("Back");
		btnBack.setBounds(6, 6, 90, 29);
		frame.getContentPane().add(btnBack);
		btnBack.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				goBack();
			}
		});
//>>>>>>> branch 'Master' of https://github.com/Devanamonguchi/GameProj.git
	}

	/**
	 * Updates the components on the page based on the buy category.
	 */
	public void updateComponents() {
		if(gameHandler.getBuyCategory() == 3) {
			lblQuestion1.setText("Would you like to move your athlete");
			lblQuestion2.setText("to ACTIVE or RESERVE?");
			btnActive.setText("ACTIVE");
			btnReserve.setText("RESERVE");
		} else {
			lblQuestion1.setText("Item has been added to your inventory");
			lblQuestion2.setText("Would you like to go to CLUB or MARKET?");
			btnActive.setText("CLUB");
			btnReserve.setText("MARKET");
		}
	}
	
	/**
	 * Retrieves the bought athlete from the market.
	 * @return the bought athlete
	 */
	public Athlete getBoughtAthlete() {
		return gameHandler.getMarketAthletes().get(gameHandler.getSelectedIAthlete());
	}
	
	/**
	 * Moves the athlete to the active team and updates the page accordingly.
	 */
	public void moveAthleteToActive() {
		if(gameHandler.getBuyCategory() == 3) {
			gameHandler.getPlayerTeam().getMembers().set(gameHandler.getPlayerTeam().getActiveMembers(), getBoughtAthlete());
			gameHandler.getPlayerTeam().setActiveMembers(gameHandler.getPlayerTeam().getActiveMembers()+1);
			gameHandler.setPage(2);
			GameMaster.showSelectedPage(gameHandler.getPage());
		} else {
			gameHandler.setPage(3);
			GameMaster.showSelectedPage(gameHandler.getPage());
		}
	}
	
	/**
	 * Moves the athlete to the reserve team and updates the page accordingly.
	 */
	public void moveAthleteToReserve() {
		if(gameHandler.getBuyCategory() == 3) {
			gameHandler.getPlayerTeam().getMembers().set(gameHandler.getPlayerTeam().getActiveMembers(), getBoughtAthlete());
			gameHandler.getPlayerTeam().setActiveMembers(gameHandler.getPlayerTeam().getActiveMembers()+1);
			gameHandler.setPage(2);
			GameMaster.showSelectedPage(gameHandler.getPage());
		} else {
			gameHandler.setPage(5);
			GameMaster.showSelectedPage(gameHandler.getPage());
		}
	}
	
	/**
	 * Navigates back to the previous page.
	 */
	public void goBack() {
		gameHandler.setPage(2);
		GameMaster.showSelectedPage(gameHandler.getPage());
	}
}