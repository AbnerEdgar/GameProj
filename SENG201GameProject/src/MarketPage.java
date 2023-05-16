import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;

public class MarketPage {

	private JFrame frmBadmintonTournamentMarket;
	private GameHandler gameHandler;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameHandler gameHandler = new GameHandler();
					MarketPage window = new MarketPage(gameHandler);
					window.frmBadmintonTournamentMarket.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MarketPage(GameHandler gameHandler) {
		this.gameHandler = gameHandler;
		initialize();
	}

	public void hidePage() {
		frmBadmintonTournamentMarket.setVisible(false);
	}
	public void showPage() {
		frmBadmintonTournamentMarket.setVisible(true);
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBadmintonTournamentMarket = new JFrame();
		frmBadmintonTournamentMarket.setTitle("Badminton Tournament Market Page");
		frmBadmintonTournamentMarket.setBounds(100, 100, 496, 334);
		frmBadmintonTournamentMarket.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBadmintonTournamentMarket.setLocationRelativeTo(null);
		frmBadmintonTournamentMarket.getContentPane().setLayout(null);
		frmBadmintonTournamentMarket.setResizable(false);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.setBounds(362, 18, 117, 29);
		frmBadmintonTournamentMarket.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				gameHandler.setPage(2);
				GameMaster.showSelectedPage(gameHandler.getPage());
			}
		});
		
		JButton btnNewButton_1 = new JButton("BUY");
		btnNewButton_1.setBounds(28, 105, 82, 60);
		frmBadmintonTournamentMarket.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("R A C K E T S: ");
		lblNewLabel.setBounds(29, 77, 95, 16);
		frmBadmintonTournamentMarket.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("S H O E S:");
		lblNewLabel_1.setBounds(29, 188, 68, 16);
		frmBadmintonTournamentMarket.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton_1_1 = new JButton("BUY");
		btnNewButton_1_1.setBounds(122, 105, 82, 60);
		frmBadmintonTournamentMarket.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("BUY");
		btnNewButton_1_2.setBounds(216, 105, 82, 60);
		frmBadmintonTournamentMarket.getContentPane().add(btnNewButton_1_2);
		
		JButton btnNewButton_1_3 = new JButton("BUY");
		btnNewButton_1_3.setBounds(310, 105, 82, 60);
		frmBadmintonTournamentMarket.getContentPane().add(btnNewButton_1_3);
		
		JButton btnNewButton_1_3_1 = new JButton("BUY");
		btnNewButton_1_3_1.setBounds(310, 217, 82, 60);
		frmBadmintonTournamentMarket.getContentPane().add(btnNewButton_1_3_1);
		
		JButton btnNewButton_1_2_1 = new JButton("BUY");
		btnNewButton_1_2_1.setBounds(216, 217, 82, 60);
		frmBadmintonTournamentMarket.getContentPane().add(btnNewButton_1_2_1);
		
		JButton btnNewButton_1_1_1 = new JButton("BUY");
		btnNewButton_1_1_1.setBounds(122, 217, 82, 60);
		frmBadmintonTournamentMarket.getContentPane().add(btnNewButton_1_1_1);
		
		JButton btnNewButton_1_4 = new JButton("BUY");
		btnNewButton_1_4.setBounds(28, 217, 82, 60);
		frmBadmintonTournamentMarket.getContentPane().add(btnNewButton_1_4);
	}
}
