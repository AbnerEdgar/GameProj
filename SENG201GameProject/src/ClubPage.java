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
	private JButton btnNewButton_2_2;
	private JButton btnNewButton_1_2;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JButton btnNewButton_5_1;
	private JProgressBar progressBar;
	private JProgressBar progressBar_1;
	private JProgressBar progressBar_2;
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
		
		JLabel lblNewLabel_1 = new JLabel("Members");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("SF Pro Rounded", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(36, 93, 233, 16);
		frmBadmintonTournamentClub.getContentPane().add(lblNewLabel_1);
		
		btnNewButton = new JButton("Name");
		btnNewButton.setFont(new Font("SF Pro Rounded", Font.PLAIN, 16));
		btnNewButton.setBounds(36, 131, 80, 80);
		frmBadmintonTournamentClub.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				selectedAthlete = 0;
				refreshCard();
			}
		});
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(250, 250, 210));
		panel.setForeground(new Color(250, 250, 210));
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel.setBounds(308, 83, 309, 382);
		frmBadmintonTournamentClub.getContentPane().add(panel);
		
		lblNewLabel_2 = new JLabel(gameHandler.getSelectedAthlete(selectedAthlete).getName());
		lblNewLabel_2.setBounds(103, 30, 210, 20);
		lblNewLabel_2.setFont(new Font("SF Pro Rounded", Font.PLAIN, 16));
		
		JLabel lblNewLabel_3 = new JLabel("Position:");
		lblNewLabel_3.setBounds(7, 56, 68, 20);
		lblNewLabel_3.setFont(new Font("SF Pro Rounded", Font.PLAIN, 16));
		
		JLabel lblNewLabel_4 = new JLabel("Nationality:");
		lblNewLabel_4.setBounds(7, 82, 90, 20);
		lblNewLabel_4.setFont(new Font("SF Pro Rounded", Font.PLAIN, 16));
		
		JLabel lblNewLabel_5 = new JLabel("Durability:");
		lblNewLabel_5.setBounds(7, 108, 82, 20);
		lblNewLabel_5.setFont(new Font("SF Pro Rounded", Font.PLAIN, 16));
		
		progressBar = new JProgressBar();
		progressBar.setBounds(7, 134, 291, 20);
		progressBar.setFont(new Font("SF Pro Rounded", Font.PLAIN, 16));
		
		JLabel lblNewLabel_6 = new JLabel("Offense:");
		lblNewLabel_6.setBounds(7, 160, 65, 20);
		lblNewLabel_6.setFont(new Font("SF Pro Rounded", Font.PLAIN, 16));
		
		progressBar_1 = new JProgressBar();
		progressBar_1.setBounds(7, 186, 280, 20);
		progressBar_1.setFont(new Font("SF Pro Rounded", Font.PLAIN, 16));
		
		JLabel lblNewLabel_7 = new JLabel("Defense:");
		lblNewLabel_7.setBounds(7, 212, 68, 20);
		lblNewLabel_7.setFont(new Font("SF Pro Rounded", Font.PLAIN, 16));
		
		progressBar_2 = new JProgressBar();
		progressBar_2.setBounds(7, 238, 280, 20);
		progressBar_2.setFont(new Font("SF Pro Rounded", Font.PLAIN, 16));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(7, 280, 291, 95);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		
		JLabel lblNewLabel_3_1 = new JLabel("Name:");
		lblNewLabel_3_1.setBounds(7, 30, 55, 20);
		lblNewLabel_3_1.setFont(new Font("SF Pro Rounded", Font.PLAIN, 16));
		
		JLabel lblNewLabel_9 = new JLabel("New label");
		lblNewLabel_9.setBounds(103, 56, 210, 20);
		lblNewLabel_9.setFont(new Font("SF Pro Rounded", Font.PLAIN, 16));
		
		JLabel lblNewLabel_9_1 = new JLabel("New label");
		lblNewLabel_9_1.setBounds(103, 82, 210, 20);
		lblNewLabel_9_1.setFont(new Font("SF Pro Rounded", Font.PLAIN, 16));
		panel.setLayout(null);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_8 = new JLabel("Equipment:");
		lblNewLabel_8.setBounds(6, 6, 104, 16);
		lblNewLabel_8.setFont(new Font("SF Pro Rounded", Font.PLAIN, 16));
		panel_1.add(lblNewLabel_8);
		
		btnNewButton_5 = new JButton("Rackets");
		btnNewButton_5.setBounds(6, 34, 135, 55);
		btnNewButton_5.setFont(new Font("SF Pro Rounded", Font.PLAIN, 16));
		panel_1.add(btnNewButton_5);
		
		btnNewButton_5_1 = new JButton("Shoes");
		btnNewButton_5_1.setBounds(146, 34, 128, 55);
		btnNewButton_5_1.setFont(new Font("SF Pro Rounded", Font.PLAIN, 16));
		panel_1.add(btnNewButton_5_1);
		panel.add(panel_1);
		panel.add(lblNewLabel_7);
		panel.add(progressBar_1);
		panel.add(progressBar_2);
		panel.add(progressBar);
		panel.add(lblNewLabel_6);
		panel.add(lblNewLabel_5);
		panel.add(lblNewLabel_4);
		panel.add(lblNewLabel_9_1);
		panel.add(lblNewLabel_3_1);
		panel.add(lblNewLabel_3);
		panel.add(lblNewLabel_2);
		panel.add(lblNewLabel_9);
		
		btnNewButton_1 = new JButton("Name");
		btnNewButton_1.setFont(new Font("SF Pro Rounded", Font.PLAIN, 16));
		btnNewButton_1.setBounds(115, 131, 80, 80);
		frmBadmintonTournamentClub.getContentPane().add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				selectedAthlete = 1;
				refreshCard();
			}
		});
		
		btnNewButton_2 = new JButton("Name");
		btnNewButton_2.setFont(new Font("SF Pro Rounded", Font.PLAIN, 16));
		btnNewButton_2.setBounds(194, 131, 80, 80);
		frmBadmintonTournamentClub.getContentPane().add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				selectedAthlete = 2;
				refreshCard();
			}
		});
		
		
		btnNewButton_2_1 = new JButton("Name");
		btnNewButton_2_1.setFont(new Font("SF Pro Rounded", Font.PLAIN, 16));
		btnNewButton_2_1.setBounds(194, 207, 80, 80);
		frmBadmintonTournamentClub.getContentPane().add(btnNewButton_2_1);
		btnNewButton_2_1.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				selectedAthlete = 5;
				refreshCard();
			}
		});
		
		btnNewButton_1_1 = new JButton("Name");
		btnNewButton_1_1.setFont(new Font("SF Pro Rounded", Font.PLAIN, 16));
		btnNewButton_1_1.setBounds(115, 207, 80, 80);
		frmBadmintonTournamentClub.getContentPane().add(btnNewButton_1_1);
		btnNewButton_1_1.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				selectedAthlete = 4;
				refreshCard();
			}
		});
		
		btnNewButton_3 = new JButton("Name");
		btnNewButton_3.setFont(new Font("SF Pro Rounded", Font.PLAIN, 16));
		btnNewButton_3.setBounds(36, 207, 80, 80);
		frmBadmintonTournamentClub.getContentPane().add(btnNewButton_3);
		btnNewButton_3.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				selectedAthlete = 3;
				refreshCard();
			}
		});
		
		btnNewButton_2_2 = new JButton("Name");
		btnNewButton_2_2.setFont(new Font("SF Pro Rounded", Font.PLAIN, 16));
		btnNewButton_2_2.setBounds(194, 283, 80, 80);
		frmBadmintonTournamentClub.getContentPane().add(btnNewButton_2_2);
		btnNewButton_2_2.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				selectedAthlete = 8;
				refreshCard();
			}
		});
		
		btnNewButton_1_2 = new JButton("Name");
		btnNewButton_1_2.setFont(new Font("SF Pro Rounded", Font.PLAIN, 16));
		btnNewButton_1_2.setBounds(115, 283, 80, 80);
		frmBadmintonTournamentClub.getContentPane().add(btnNewButton_1_2);
		btnNewButton_1_2.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				selectedAthlete = 7;
				refreshCard();
			}
		});
		
		btnNewButton_4 = new JButton("Name");
		btnNewButton_4.setFont(new Font("SF Pro Rounded", Font.PLAIN, 16));
		btnNewButton_4.setBounds(36, 283, 80, 80);
		frmBadmintonTournamentClub.getContentPane().add(btnNewButton_4);
		btnNewButton_4.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				selectedAthlete = 6;
				refreshCard();
			}
		});
		
		JButton btnNewButton_6 = new JButton("Back");
		btnNewButton_6.setForeground(new Color(0, 0, 0));
		btnNewButton_6.setFont(new Font("SF Pro Rounded", Font.PLAIN, 14));
		btnNewButton_6.setBounds(6, 6, 60, 29);
		frmBadmintonTournamentClub.getContentPane().add(btnNewButton_6);
		
		lblNewLabel = new JLabel("\"Team Name\"");
		lblNewLabel.setForeground(new Color(240, 230, 140));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("SF Pro Rounded", Font.BOLD, 20));
		lblNewLabel.setBounds(6, 6, 624, 65);
		frmBadmintonTournamentClub.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(128, 128, 128));
		separator.setBounds(46, 114, 223, 12);
		frmBadmintonTournamentClub.getContentPane().add(separator);
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
		btnNewButton_2_2.setText(getPlayer(8).getName());
		btnNewButton_1_2.setText(getPlayer(7).getName());
		btnNewButton_4.setText(getPlayer(6).getName());
	}
	
	public void refreshCard() {
		lblNewLabel_2.setText(getPlayer(selectedAthlete).getName());
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
