import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JProgressBar;

public class MarketPage3 {

	private JFrame frame;
	private GameHandler gameHandler;
	private JButton btnNewButton_1_2_1;
	private JButton btnNewButton_1_2_1_1;
	private JButton btnNewButton_1_2_2;
	private JButton btnNewButton_1_2_3;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_2_1;
	private JProgressBar progressBar;
	private JProgressBar progressBar_1;
	private JButton btnNewButton;
	private JLabel lblNewLabel_3;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameHandler gameHandler = new GameHandler();
					MarketPage3 window = new MarketPage3(gameHandler);
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

	public MarketPage3(GameHandler gameHandler) {
		// TODO Auto-generated constructor stub
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
		frame.setBounds(100, 100, 639, 477);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel.setBounds(521, 6, 112, 28);
		frame.getContentPane().add(panel);
		
		lblNewLabel_3 = new JLabel("$....123");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Futura", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(16, 6, 90, 16);
		panel.add(lblNewLabel_3);
		
		btnNewButton = new JButton("Home");
		btnNewButton.setFont(new Font("Futura", Font.PLAIN, 12));
		btnNewButton.setBounds(6, 6, 86, 28);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				gameHandler.setPage(2);
				GameMaster.showSelectedPage(gameHandler.getPage());
			}
		});
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1_1.setBackground(new Color(250, 250, 210));
		panel_1_1.setBounds(115, 91, 307, 339);
		frame.getContentPane().add(panel_1_1);
		
		JLabel lblNewLabel_6 = new JLabel("A T H L E T E S");
		lblNewLabel_6.setForeground(new Color(100, 149, 237));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_6.setFont(new Font("Futura", Font.ITALIC, 30));
		lblNewLabel_6.setBounds(6, 22, 276, 52);
		panel_1_1.add(lblNewLabel_6);
		
		btnNewButton_1_2_1 = new JButton("100ZZ");
		btnNewButton_1_2_1.setFont(new Font("Futura", Font.PLAIN, 12));
		btnNewButton_1_2_1.setBounds(17, 86, 129, 103);
		panel_1_1.add(btnNewButton_1_2_1);
		btnNewButton_1_2_1.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				gameHandler.setSelectedIAthlete(0);
				refreshCard();
			}
		});
		
		btnNewButton_1_2_1_1 = new JButton("100ZZ");
		btnNewButton_1_2_1_1.setFont(new Font("Futura", Font.PLAIN, 12));
		btnNewButton_1_2_1_1.setBounds(153, 86, 129, 103);
		panel_1_1.add(btnNewButton_1_2_1_1);
		btnNewButton_1_2_1_1.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				gameHandler.setSelectedIAthlete(1);
				refreshCard();
			}
		});
		
		btnNewButton_1_2_2 = new JButton("100ZZ");
		btnNewButton_1_2_2.setFont(new Font("Futura", Font.PLAIN, 12));
		btnNewButton_1_2_2.setBounds(153, 207, 129, 103);
		panel_1_1.add(btnNewButton_1_2_2);
		btnNewButton_1_2_2.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				gameHandler.setSelectedIAthlete(2);
				refreshCard();
			}
		});
		
		btnNewButton_1_2_3 = new JButton("100ZZ");
		btnNewButton_1_2_3.setFont(new Font("Futura", Font.PLAIN, 12));
		btnNewButton_1_2_3.setBounds(17, 207, 129, 103);
		panel_1_1.add(btnNewButton_1_2_3);
		btnNewButton_1_2_3.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				gameHandler.setSelectedIAthlete(3);
				refreshCard();
			}
		});
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setForeground(new Color(238, 130, 238));
		panel_1_2.setLayout(null);
		panel_1_2.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_1_2.setBackground(new Color(250, 250, 210));
		panel_1_2.setBounds(14, 88, 86, 339);
		frame.getContentPane().add(panel_1_2);
		
		JLabel lblCategory_1 = new JLabel("Catalog:");
		lblCategory_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblCategory_1.setBounds(17, 22, 52, 16);
		panel_1_2.add(lblCategory_1);
		
		JButton btnNewButton_1 = new JButton("Rackets");
		btnNewButton_1.setBounds(-15, 71, 119, 41);
		btnNewButton_1.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				gameHandler.setPage(5);
				GameMaster.showSelectedPage(gameHandler.getPage());
			}
		});
		panel_1_2.add(btnNewButton_1);
		
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
		panel_1_2.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_3_2 = new JButton("Athletes");
		btnNewButton_1_3_2.setForeground(new Color(210, 180, 140));
		btnNewButton_1_3_2.setBounds(-15, 176, 119, 41);
		btnNewButton_1_3_2.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				gameHandler.setPage(7);
				GameMaster.showSelectedPage(gameHandler.getPage());
			}
		});
		panel_1_2.add(btnNewButton_1_3_2);
		
		JInternalFrame internalFrame = new JInternalFrame("P R O F I L E");
		internalFrame.getContentPane().setBackground(new Color(240, 230, 140));
		internalFrame.setBounds(430, 57, 200, 388);
		frame.getContentPane().add(internalFrame);
		internalFrame.getContentPane().setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(16, 37, 145, 129);
		internalFrame.getContentPane().add(panel_2);
		
		JLabel lblNewLabel_1 = new JLabel("Height:");
		lblNewLabel_1.setBounds(16, 230, 54, 16);
		internalFrame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_3 = new JLabel("Price:");
		lblNewLabel_1_3.setBounds(16, 258, 61, 16);
		internalFrame.getContentPane().add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_2 = new JLabel("Defense: ");
		lblNewLabel_1_2.setBounds(16, 286, 73, 16);
		internalFrame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_4 = new JLabel("Offense:");
		lblNewLabel_4.setBounds(16, 307, 61, 16);
		internalFrame.getContentPane().add(lblNewLabel_4);
		
		progressBar_1 = new JProgressBar();
		progressBar_1.setMaximum(100);
		progressBar_1.setBounds(79, 307, 82, 20);
		internalFrame.getContentPane().add(progressBar_1);
		
		progressBar = new JProgressBar();
		progressBar.setMaximum(100);
		progressBar.setForeground(new Color(250, 128, 114));
		progressBar.setBackground(new Color(255, 182, 193));
		progressBar.setBounds(79, 286, 82, 20);
		internalFrame.getContentPane().add(progressBar);
		
		lblNewLabel_2_1 = new JLabel("$ 123");
		lblNewLabel_2_1.setBounds(79, 258, 61, 16);
		internalFrame.getContentPane().add(lblNewLabel_2_1);
		
		lblNewLabel_2 = new JLabel("180");
		lblNewLabel_2.setBounds(82, 230, 61, 16);
		internalFrame.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton_2 = new JButton("Buy");
		btnNewButton_2.setBounds(98, 6, 72, 29);
		internalFrame.getContentPane().add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				// if money is enough then
				if(gameHandler.getBalance() >= gameHandler.getMarketAthletes().get(gameHandler.getSelectedIAthlete()).getPrice()) {
					// if racket inven have a slot then
					if(gameHandler.getPlayerTeam().getActiveMembers() < 6) {
						gameHandler.setBalance(gameHandler.getBalance() - gameHandler.getMarketAthletes().get(gameHandler.getSelectedIAthlete()).getPrice());
						gameHandler.setPage(10);
						GameMaster.showSelectedPage(gameHandler.getPage());
					}
				}
			}
		});
		
		JLabel lblNewLabel = new JLabel("Name:");
		lblNewLabel.setBounds(16, 178, 54, 16);
		internalFrame.getContentPane().add(lblNewLabel);
		
		lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setBounds(79, 178, 61, 16);
		internalFrame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_7 = new JLabel("Age:");
		lblNewLabel_7.setBounds(16, 206, 46, 16);
		internalFrame.getContentPane().add(lblNewLabel_7);
		
		lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setBounds(79, 206, 61, 16);
		internalFrame.getContentPane().add(lblNewLabel_8);
		internalFrame.setVisible(true);
	}
	public void onAppear() {
		gameHandler.setSelectedIAthlete(0);
		btnNewButton_1_2_1.setText(gameHandler.getMarketAthletes().get(0).getName());
		btnNewButton_1_2_1_1.setText(gameHandler.getMarketAthletes().get(1).getName());
		btnNewButton_1_2_2.setText(gameHandler.getMarketAthletes().get(2).getName());
		btnNewButton_1_2_3.setText(gameHandler.getMarketAthletes().get(3).getName());
		lblNewLabel_3.setText("$ " + gameHandler.getBalance());
		refreshCard();
	}
	
	public void refreshCard() {
		lblNewLabel_5.setText(gameHandler.getMarketAthletes().get(gameHandler.getSelectedIAthlete()).getName());
		lblNewLabel_8.setText(Integer.toString(gameHandler.getMarketAthletes().get(gameHandler.getSelectedIAthlete()).getAge()));
		lblNewLabel_2_1.setText(Float.toString(gameHandler.getMarketAthletes().get(gameHandler.getSelectedIAthlete()).getPrice()));
		lblNewLabel_2.setText(Float.toString(gameHandler.getMarketAthletes().get(gameHandler.getSelectedIAthlete()).getHeight()));
		progressBar_1.setValue((int) gameHandler.getMarketAthletes().get(gameHandler.getSelectedIAthlete()).getOffense());
		progressBar.setValue((int) gameHandler.getMarketAthletes().get(gameHandler.getSelectedIAthlete()).getDefense());
	}
}
