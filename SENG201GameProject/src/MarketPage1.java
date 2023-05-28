import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JProgressBar;

public class MarketPage1 {

	private JFrame frmBadmintonTournamentMarket;
	private GameHandler gameHandler;
	
	private JLabel lblNewLabel_2;
	private JProgressBar progressBar;
	private JProgressBar progressBar_1;
	private JLabel lblNewLabel_2_1;
	private JLabel lblNewLabel;
	private JButton btnNewButton_1_2;
	private JButton btnNewButton_1_2_1;
	private JButton btnNewButton_1_2_2;
	private JButton btnNewButton_1_2_3;
	private JLabel lblNewLabel_3;
	private JButton btnNewButton_2;
	
	/**
     * Launches the Market Page 1 application.
     *
     * @param args command line arguments
     */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameHandler gameHandler = new GameHandler();
					MarketPage1 window = new MarketPage1(gameHandler);
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
	public MarketPage1(GameHandler gameHandler) {
		this.gameHandler = gameHandler;
		initialize();
	}

	/**
     * Hides the Market Page.
     */
	public void hidePage() {
		frmBadmintonTournamentMarket.setVisible(false);
	}
	
	/**
     * Shows the Market Page.
     */
	public void showPage() {
		onAppear();
		frmBadmintonTournamentMarket.setVisible(true);
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBadmintonTournamentMarket = new JFrame();
		frmBadmintonTournamentMarket.getContentPane().setBackground(new Color(176, 196, 222));
		frmBadmintonTournamentMarket.setTitle("Badminton Tournament Market Page");
		frmBadmintonTournamentMarket.setBounds(100, 100, 639, 479);
		frmBadmintonTournamentMarket.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBadmintonTournamentMarket.setLocationRelativeTo(null);
		frmBadmintonTournamentMarket.setResizable(false);
		frmBadmintonTournamentMarket.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Home");
		btnNewButton.setBounds(6, 6, 86, 28);
		btnNewButton.setFont(new Font("Futura", Font.PLAIN, 12));
		frmBadmintonTournamentMarket.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				gameHandler.setPage(2);
				GameMaster.showSelectedPage(gameHandler.getPage());
			}
		});
		
		
		JInternalFrame internalFrame = new JInternalFrame("D E T A I L S");
		internalFrame.getContentPane().setBackground(new Color(240, 230, 140));
		internalFrame.setForeground(new Color(255, 215, 0));
		internalFrame.setBackground(new Color(255, 255, 255));
		internalFrame.setBounds(427, 49, 206, 396);
		frmBadmintonTournamentMarket.getContentPane().add(internalFrame);
		internalFrame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("Y O N E X");
		lblNewLabel_5.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(20, 16, 82, 34);
		internalFrame.getContentPane().add(lblNewLabel_5);
		
		lblNewLabel = new JLabel("1000Z");
		lblNewLabel.setBounds(20, 48, 61, 16);
		internalFrame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1_1 = new JLabel("Specification:");
		lblNewLabel_1_1.setBounds(20, 213, 92, 16);
		internalFrame.getContentPane().add(lblNewLabel_1_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(20, 72, 145, 129);
		internalFrame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Weight:");
		lblNewLabel_1.setBounds(20, 241, 54, 16);
		internalFrame.getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("83 gram");
		lblNewLabel_2.setBounds(95, 241, 61, 16);
		internalFrame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_2 = new JLabel("Defense: ");
		lblNewLabel_1_2.setBounds(20, 292, 73, 16);
		internalFrame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_4 = new JLabel("Offense:");
		lblNewLabel_4.setBounds(20, 313, 61, 16);
		internalFrame.getContentPane().add(lblNewLabel_4);
		
		progressBar = new JProgressBar();
		progressBar.setMaximum(10);
		progressBar.setBackground(new Color(169, 169, 169));
		progressBar.setBounds(83, 292, 82, 20);
		internalFrame.getContentPane().add(progressBar);
		
		progressBar_1 = new JProgressBar();
		progressBar_1.setMaximum(10);
		progressBar_1.setBounds(83, 313, 82, 20);
		internalFrame.getContentPane().add(progressBar_1);
		
		JLabel lblNewLabel_1_3 = new JLabel("Price:");
		lblNewLabel_1_3.setBounds(20, 264, 61, 16);
		internalFrame.getContentPane().add(lblNewLabel_1_3);
		
		lblNewLabel_2_1 = new JLabel("$ 123");
		lblNewLabel_2_1.setBounds(95, 264, 61, 16);
		internalFrame.getContentPane().add(lblNewLabel_2_1);
		
		btnNewButton_2 = new JButton("Buy");
		btnNewButton_2.setBounds(104, 6, 72, 29);
		internalFrame.getContentPane().add(btnNewButton_2);
		/**
		 * ActionListener implementation for the btnNewButton_2 button.
		 * Performs the action when the button is clicked.
		 */
		btnNewButton_2.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        // Check if the player has enough money to buy the selected racket
		        if (gameHandler.getBalance() >= gameHandler.getMarketRackets().get(gameHandler.getSelectedIRacket()).getPrice()) {
		            // Check if there is available slot in the racket inventory
		            if (gameHandler.racketInventoryAvailable()) {
		                // Deduct the price of the racket from the player's balance
		                gameHandler.setBalance(gameHandler.getBalance() - gameHandler.getMarketRackets().get(gameHandler.getSelectedIRacket()).getPrice());
		             // Find an empty slot in the racket inventory and add the selected racket
		                for (int count = 0; count < gameHandler.getInventoryRacket().size(); count++) {
		                    if (gameHandler.getInventoryRacket().get(count).getName().isEmpty()) {
		                        gameHandler.getInventoryRacket().set(count, gameHandler.getMarketRackets().get(gameHandler.getSelectedIRacket()));
		                        gameHandler.getMarketRackets().set(count, new Racket());
		                        gameHandler.setPage(10);
		                        GameMaster.showSelectedPage(gameHandler.getPage());
		                        break;
		                    }
		                }
		            }
		        }
		    }
		});
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(521, 6, 112, 28);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		frmBadmintonTournamentMarket.getContentPane().add(panel);
		panel.setLayout(null);
		
		lblNewLabel_3 = new JLabel("$....123");
		lblNewLabel_3.setBounds(6, 6, 100, 16);
		panel.add(lblNewLabel_3);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Futura", Font.PLAIN, 12));
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1_1.setBackground(new Color(250, 250, 210));
		panel_1_1.setBounds(108, 84, 307, 339);
		frmBadmintonTournamentMarket.getContentPane().add(panel_1_1);
		
		JLabel lblNewLabel_6 = new JLabel("R A C K E T S");
		lblNewLabel_6.setForeground(new Color(100, 149, 237));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_6.setFont(new Font("Futura", Font.ITALIC, 30));
		lblNewLabel_6.setBounds(6, 22, 276, 52);
		panel_1_1.add(lblNewLabel_6);
		
		btnNewButton_1_2 = new JButton("");
		btnNewButton_1_2.setFont(new Font("Futura", Font.PLAIN, 12));
		btnNewButton_1_2.setBounds(17, 86, 129, 103);
		panel_1_1.add(btnNewButton_1_2);
		btnNewButton_1_2.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				if(gameHandler.getMarketRackets().get(0).getName().equals("")) {
					btnNewButton_2.setVisible(false);
				}else {
					btnNewButton_2.setVisible(true);
				}
				gameHandler.setSelectedIRacket(0);
				refreshCard();
			}
		});
		
		
		btnNewButton_1_2_1 = new JButton("");
		btnNewButton_1_2_1.setFont(new Font("Futura", Font.PLAIN, 12));
		btnNewButton_1_2_1.setBounds(153, 86, 129, 103);
		panel_1_1.add(btnNewButton_1_2_1);
		btnNewButton_1_2_1.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				if(gameHandler.getMarketRackets().get(1).getName().equals("")) {
					btnNewButton_2.setVisible(false);
				}else {
					btnNewButton_2.setVisible(true);
				}
				gameHandler.setSelectedIRacket(1);
				refreshCard();
			}
		});
		
		btnNewButton_1_2_2 = new JButton("");
		btnNewButton_1_2_2.setFont(new Font("Futura", Font.PLAIN, 12));
		btnNewButton_1_2_2.setBounds(153, 207, 129, 103);
		panel_1_1.add(btnNewButton_1_2_2);
		btnNewButton_1_2_2.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				if(gameHandler.getMarketRackets().get(2).getName().equals("")) {
					btnNewButton_2.setVisible(false);
				}else {
					btnNewButton_2.setVisible(true);
				}
				gameHandler.setSelectedIRacket(2);
				refreshCard();
			}
		});
		
		btnNewButton_1_2_3 = new JButton("");
		btnNewButton_1_2_3.setFont(new Font("Futura", Font.PLAIN, 12));
		btnNewButton_1_2_3.setBounds(17, 207, 129, 103);
		panel_1_1.add(btnNewButton_1_2_3);
		btnNewButton_1_2_3.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				if(gameHandler.getMarketRackets().get(3).getName().equals("")) {
					btnNewButton_2.setVisible(false);
				}else {
					btnNewButton_2.setVisible(true);
				}
				gameHandler.setSelectedIRacket(3);
				refreshCard();
			}
		});
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_1.setBackground(new Color(250, 250, 210));
		panel_1.setBounds(10, 84, 86, 339);
		frmBadmintonTournamentMarket.getContentPane().add(panel_1);
		
		JLabel lblCategory = new JLabel("Catalog:");
		lblCategory.setHorizontalAlignment(SwingConstants.CENTER);
		lblCategory.setBounds(17, 22, 52, 16);
		panel_1.add(lblCategory);
		
		JButton btnNewButton_1 = new JButton("Rackets");
		btnNewButton_1.setForeground(new Color(210, 180, 140));
		btnNewButton_1.setBounds(-15, 71, 119, 41);
		btnNewButton_1.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				gameHandler.setPage(5);
				GameMaster.showSelectedPage(gameHandler.getPage());
			}
		});
		panel_1.add(btnNewButton_1);
		
		
		
		JButton btnNewButton_1_1 = new JButton("Shoes");
		btnNewButton_1_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1_1.setBackground(new Color(152, 251, 152));
		btnNewButton_1_1.setBounds(-15, 124, 119, 41);
		btnNewButton_1_1.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				gameHandler.setPage(6);
				GameMaster.showSelectedPage(gameHandler.getPage());
			}
		});
		panel_1.add(btnNewButton_1_1);
		
		
		JButton btnNewButton_1_3 = new JButton("Athletes");
		btnNewButton_1_3.setBounds(-15, 176, 119, 41);
		btnNewButton_1_3.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				gameHandler.setPage(7);
				GameMaster.showSelectedPage(gameHandler.getPage());
			}
		});
		panel_1.add(btnNewButton_1_3);
		internalFrame.setVisible(true);
	}
	
	 /**
     * Handles the appearance of the GUI elements.
     */
    public void onAppear() {
        gameHandler.setSelectedIRacket(0);
        btnNewButton_1_2.setIcon(getScaledImage(gameHandler.getMarketRackets().get(0).getImage()));
        btnNewButton_1_2_1.setIcon(getScaledImage(gameHandler.getMarketRackets().get(1).getImage()));
        btnNewButton_1_2_2.setIcon(getScaledImage(gameHandler.getMarketRackets().get(2).getImage()));
        btnNewButton_1_2_3.setIcon(getScaledImage(gameHandler.getMarketRackets().get(3).getImage()));
        lblNewLabel_3.setText("$" + gameHandler.getBalance());
        if(gameHandler.getMarketRackets().get(1).getName().equals("")) {
			btnNewButton_2.setVisible(false);
		}else {
			btnNewButton_2.setVisible(true);
		}
        refreshCard();
    }

    /**
     * Refreshes the GUI elements with the selected racket's information.
     */
    public void refreshCard() {
        lblNewLabel.setText(gameHandler.getMarketRackets().get(gameHandler.getSelectedIRacket()).getName());
        lblNewLabel_2.setText(Integer.toString(gameHandler.getMarketRackets().get(gameHandler.getSelectedIRacket()).getWeight()) + " gram");
        progressBar.setValue((int) gameHandler.getMarketRackets().get(gameHandler.getSelectedIRacket()).getOffense());
        progressBar_1.setValue((int) gameHandler.getMarketRackets().get(gameHandler.getSelectedIRacket()).getDefense());
        lblNewLabel_2_1.setText("$" + Float.toString(gameHandler.getMarketRackets().get(gameHandler.getSelectedIRacket()).getPrice()));
    }
    public ImageIcon getScaledImage(String path) {
		ImageIcon temp = new ImageIcon(path);
		Image img = temp.getImage();
		img = img.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
		temp = new ImageIcon(img);
		return temp; 
	}
}
