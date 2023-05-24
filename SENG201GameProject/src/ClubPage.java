import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JSlider;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JProgressBar;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JMenuItem;
import javax.swing.JToggleButton;
import javax.swing.JSeparator;

public class ClubPage {

	private JFrame frmBadmintonTournamentClub;
	private GameHandler gameHandler;
	private int selectedAthlete;
	
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_2;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_2_1;
	private JButton btnNewButton_1_1;
	private JButton btnNewButton_3;
	private JButton btnNewButton_5;
	private JButton btnNewButton_5_1;
	private JProgressBar progressBar;
	private JProgressBar progressBar_1;
	private JProgressBar progressBar_2;
	private JPanel panel_2;
	private JLabel lblNewLabel_10;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_11;
	private JLabel lblNewLabel_12;
	private JButton btnNewButton_4;
	private JButton btnNewButton_7;
	private JButton btnNewButton_8;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_9_1;
	private JPanel panel_1;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameHandler gameHandler = new GameHandler();
					ClubPage window = new ClubPage(gameHandler);
					window.frmBadmintonTournamentClub.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ClubPage(GameHandler gameHandler) {
		this.gameHandler = gameHandler;
		initialize();
	}

	public void hidePage() {
		frmBadmintonTournamentClub.setVisible(false);
	}
	public void showPage() {
		onAppear();
		frmBadmintonTournamentClub.setVisible(true);
		
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBadmintonTournamentClub = new JFrame();
		frmBadmintonTournamentClub.getContentPane().setBackground(new Color(176, 196, 222));
		frmBadmintonTournamentClub.setTitle((gameHandler.getAppName()+"(Club Page)"));
		frmBadmintonTournamentClub.setBounds(100, 100, 636, 517);
		frmBadmintonTournamentClub.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBadmintonTournamentClub.setLocationRelativeTo(null);
		frmBadmintonTournamentClub.getContentPane().setLayout(null);
		
		btnNewButton = new JButton("Name");
		btnNewButton.setBackground(new Color(244, 164, 96));
		btnNewButton.setFont(new Font("SF Pro Rounded", Font.PLAIN, 16));
		btnNewButton.setBounds(80, 119, 80, 80);
		frmBadmintonTournamentClub.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				panel_1.setVisible(false);
				gameHandler.getPlayerTeam().setSelectedActiveMembers(0);
				selectedAthlete = 0;
				refreshCard();
			}
		});
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(250, 250, 210));
		panel.setForeground(new Color(250, 250, 210));
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(308, 79, 309, 392);
		frmBadmintonTournamentClub.getContentPane().add(panel);
		
		lblNewLabel_2 = new JLabel(gameHandler.getSelectedAthlete(selectedAthlete).getName());
		lblNewLabel_2.setBounds(116, 21, 185, 20);
		lblNewLabel_2.setFont(new Font("SF Pro Rounded", Font.PLAIN, 16));
		
		JLabel lblNewLabel_3 = new JLabel("Age:");
		lblNewLabel_3.setBounds(20, 47, 68, 20);
		lblNewLabel_3.setFont(new Font("SF Pro Rounded", Font.PLAIN, 16));
		
		JLabel lblNewLabel_4 = new JLabel("Height:");
		lblNewLabel_4.setBounds(20, 73, 90, 20);
		lblNewLabel_4.setFont(new Font("SF Pro Rounded", Font.PLAIN, 16));
		
		JLabel lblNewLabel_5 = new JLabel("Durability:");
		lblNewLabel_5.setBounds(20, 189, 82, 20);
		lblNewLabel_5.setFont(new Font("SF Pro Rounded", Font.PLAIN, 16));
		
		progressBar = new JProgressBar();
		progressBar.setBounds(20, 213, 270, 20);
		progressBar.setFont(new Font("SF Pro Rounded", Font.PLAIN, 16));
		
		JLabel lblNewLabel_6 = new JLabel("Offense:");
		lblNewLabel_6.setBounds(20, 235, 65, 20);
		lblNewLabel_6.setFont(new Font("SF Pro Rounded", Font.PLAIN, 16));
		
		progressBar_1 = new JProgressBar();
		progressBar_1.setBounds(20, 259, 270, 20);
		progressBar_1.setFont(new Font("SF Pro Rounded", Font.PLAIN, 16));
		
		JLabel lblNewLabel_7 = new JLabel("Defense:");
		lblNewLabel_7.setBounds(20, 287, 68, 20);
		lblNewLabel_7.setFont(new Font("SF Pro Rounded", Font.PLAIN, 16));
		
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(245, 245, 220));
		panel_1.setBounds(20, 342, 274, 31);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		
		JLabel lblNewLabel_3_1 = new JLabel("Name:");
		lblNewLabel_3_1.setBounds(20, 21, 55, 20);
		lblNewLabel_3_1.setFont(new Font("SF Pro Rounded", Font.PLAIN, 16));
		
		lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setBounds(116, 47, 187, 20);
		lblNewLabel_9.setFont(new Font("SF Pro Rounded", Font.PLAIN, 16));
		
		lblNewLabel_9_1 = new JLabel("");
		lblNewLabel_9_1.setBounds(116, 73, 187, 20);
		lblNewLabel_9_1.setFont(new Font("SF Pro Rounded", Font.PLAIN, 16));
		panel.setLayout(null);
		panel_1.setLayout(null);
		panel.add(panel_1);
		
		
		btnNewButton_7 = new JButton("Equip");
		btnNewButton_7.setBounds(0, 0, 140, 29);
		btnNewButton_7.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				if(!getPlayer(selectedAthlete).getName().equals("")) {
					int selectedIndex = gameHandler.getPlayerTeam().getSelectedActiveMembers();
					//temp Player diambil dari active player
					Athlete tempPlayer = getPlayer(selectedIndex);
					gameHandler.getPlayerTeam().getMembers().set(selectedIndex, getPlayer(selectedAthlete));
					gameHandler.getPlayerTeam().getMembers().set(selectedAthlete, tempPlayer);
					System.out.println(gameHandler.getPlayerTeam().getMembers().get(0) == getPlayer(0));
					onAppear();
					refreshCard();
				}
			}
		});
		panel_1.add(btnNewButton_7);
		btnNewButton_8 = new JButton("Sell");
		btnNewButton_8.setBounds(134, 0, 140, 29);
		panel_1.add(btnNewButton_8);
		panel.add(lblNewLabel_7);
		panel.add(progressBar_1);
		panel.add(progressBar);
		panel.add(lblNewLabel_6);
		panel.add(lblNewLabel_5);
		panel.add(lblNewLabel_4);
		panel.add(lblNewLabel_9_1);
		panel.add(lblNewLabel_3_1);
		panel.add(lblNewLabel_3);
		panel.add(lblNewLabel_2);
		panel.add(lblNewLabel_9);
		
		progressBar_2 = new JProgressBar();
		progressBar_2.setFont(new Font("Dialog", Font.PLAIN, 16));
		progressBar_2.setBounds(20, 310, 270, 20);
		panel.add(progressBar_2);
		
		JLabel lblNewLabel_8 = new JLabel("E Q U I P M E N T S");
		lblNewLabel_8.setBounds(20, 105, 164, 25);
		panel.add(lblNewLabel_8);
		lblNewLabel_8.setFont(new Font("Dialog", Font.PLAIN, 14));
		
		btnNewButton_5 = new JButton("Rackets");
		btnNewButton_5.setBounds(20, 139, 135, 39);
		panel.add(btnNewButton_5);
		btnNewButton_5.setFont(new Font("SF Pro Rounded", Font.PLAIN, 16));
		
		btnNewButton_5_1 = new JButton("Shoes");
		btnNewButton_5_1.setBounds(167, 139, 128, 39);
		panel.add(btnNewButton_5_1);
		btnNewButton_5_1.setFont(new Font("SF Pro Rounded", Font.PLAIN, 16));
		
		btnNewButton_1 = new JButton("Name");
		btnNewButton_1.setFont(new Font("SF Pro Rounded", Font.PLAIN, 16));
		btnNewButton_1.setBounds(159, 119, 80, 80);
		frmBadmintonTournamentClub.getContentPane().add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				panel_1.setVisible(false);
				gameHandler.getPlayerTeam().setSelectedActiveMembers(1);
				selectedAthlete = 1;
				refreshCard();
			}
		});
		
		btnNewButton_2 = new JButton("Name");
		btnNewButton_2.setFont(new Font("SF Pro Rounded", Font.PLAIN, 16));
		btnNewButton_2.setBounds(80, 236, 80, 80);
		frmBadmintonTournamentClub.getContentPane().add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				panel_1.setVisible(true);
				selectedAthlete = 2;
				refreshCard();
			}
		});
		
		
		btnNewButton_2_1 = new JButton("Name");
		btnNewButton_2_1.setFont(new Font("SF Pro Rounded", Font.PLAIN, 16));
		btnNewButton_2_1.setBounds(159, 314, 80, 80);
		frmBadmintonTournamentClub.getContentPane().add(btnNewButton_2_1);
		btnNewButton_2_1.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				panel_1.setVisible(true);
				selectedAthlete = 5;
				refreshCard();
			}
		});
		
		btnNewButton_1_1 = new JButton("Name");
		btnNewButton_1_1.setFont(new Font("SF Pro Rounded", Font.PLAIN, 16));
		btnNewButton_1_1.setBounds(80, 314, 80, 80);
		frmBadmintonTournamentClub.getContentPane().add(btnNewButton_1_1);
		btnNewButton_1_1.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				panel_1.setVisible(true);
				selectedAthlete = 4;
				refreshCard();
			}
		});
		
		btnNewButton_3 = new JButton("Name");
		btnNewButton_3.setFont(new Font("SF Pro Rounded", Font.PLAIN, 16));
		btnNewButton_3.setBounds(159, 236, 80, 80);
		frmBadmintonTournamentClub.getContentPane().add(btnNewButton_3);
		btnNewButton_3.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				panel_1.setVisible(true);
				selectedAthlete = 3;
				refreshCard();
			}
		});
		
		JButton btnNewButton_6 = new JButton("Back");
		btnNewButton_6.setForeground(new Color(0, 0, 0));
		btnNewButton_6.setFont(new Font("SF Pro Rounded", Font.PLAIN, 14));
		btnNewButton_6.setBounds(6, 6, 60, 29);
		frmBadmintonTournamentClub.getContentPane().add(btnNewButton_6);
		
		lblNewLabel = new JLabel("T E A M");
		lblNewLabel.setForeground(new Color(25, 25, 112));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel.setBounds(51, 39, 223, 38);
		frmBadmintonTournamentClub.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(128, 128, 128));
		separator.setBounds(48, 72, 223, 12);
		frmBadmintonTournamentClub.getContentPane().add(separator);
		
		panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBackground(new Color(250, 250, 210));
		panel_2.setBounds(308, 39, 309, 30);
		frmBadmintonTournamentClub.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		lblNewLabel_10 = new JLabel("P  R  O  F  I  L  E");
		lblNewLabel_10.setBounds(0, 0, 309, 30);
		panel_2.add(lblNewLabel_10);
		lblNewLabel_10.setForeground(new Color(100, 149, 237));
		lblNewLabel_10.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		
		lblNewLabel_1 = new JLabel("A C T I V E :");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(73, 91, 95, 16);
		frmBadmintonTournamentClub.getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_11 = new JLabel("R E S E R V E S :");
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11.setBounds(80, 211, 95, 16);
		frmBadmintonTournamentClub.getContentPane().add(lblNewLabel_11);
		
		lblNewLabel_12 = new JLabel("Team Inventory:");
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_12.setBounds(80, 405, 128, 16);
		frmBadmintonTournamentClub.getContentPane().add(lblNewLabel_12);
		
		btnNewButton_4 = new JButton("New button");
		btnNewButton_4.setBounds(80, 427, 159, 40);
		frmBadmintonTournamentClub.getContentPane().add(btnNewButton_4);
		btnNewButton_6.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				gameHandler.setPage(2);
				GameMaster.showSelectedPage(gameHandler.getPage());
			}
		});
	}
	public void onAppear() {
		selectedAthlete = 0;
		lblNewLabel.setText(gameHandler.getTeamName());
		refreshCard();
		btnNewButton.setText(getPlayer(0).getName());
		btnNewButton_1.setText(getPlayer(1).getName());
		btnNewButton_2.setText(getPlayer(2).getName());
		btnNewButton_2_1.setText(getPlayer(5).getName());
		btnNewButton_1_1.setText(getPlayer(4).getName());
		btnNewButton_3.setText(getPlayer(3).getName());
		btnNewButton_4.setText(getPlayer(6).getName());
	}
	
	public void refreshCard() {
		lblNewLabel_2.setText(getPlayer(selectedAthlete).getName());
		lblNewLabel_9.setText(Integer.toString(getPlayer(selectedAthlete).getage()));
		lblNewLabel_9_1.setText(Float.toString(getPlayer(selectedAthlete).getheight()));
		progressBar.setValue((int) getPlayer(selectedAthlete).getOffense());
		progressBar_1.setValue((int) getPlayer(selectedAthlete).getDefence());
		progressBar_2.setValue((int) getPlayer(selectedAthlete).getStamina());
		btnNewButton_5.setText(getPlayer(selectedAthlete).getEquipment(0).getName());
		btnNewButton_5_1.setText(getPlayer(selectedAthlete).getEquipment(1).getName());
	}
	
	public Athlete getPlayer(int index) {
		return gameHandler.getPlayerTeam().getMembers().get(index);
	}
}
