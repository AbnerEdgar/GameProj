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
		frmBadmintonTournamentClub.setTitle((gameHandler.getAppName()+"(Club Page)"));
		frmBadmintonTournamentClub.setBounds(100, 100, 636, 517);
		frmBadmintonTournamentClub.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBadmintonTournamentClub.setLocationRelativeTo(null);
		frmBadmintonTournamentClub.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Athletes:");
		lblNewLabel_1.setFont(new Font("SF Pro Rounded", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(41, 103, 196, 16);
		frmBadmintonTournamentClub.getContentPane().add(lblNewLabel_1);
		
		btnNewButton = new JButton("Name");
		btnNewButton.setFont(new Font("SF Pro Rounded", Font.PLAIN, 16));
		btnNewButton.setBounds(36, 131, 67, 80);
		frmBadmintonTournamentClub.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				selectedAthlete = 0;
				refreshCard();
			}
		});
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel.setBounds(308, 83, 309, 382);
		frmBadmintonTournamentClub.getContentPane().add(panel);
		
		lblNewLabel_2 = new JLabel(gameHandler.getSelectedAthlete(selectedAthlete).getName());
		lblNewLabel_2.setFont(new Font("SF Pro Rounded", Font.PLAIN, 16));
		
		JLabel lblNewLabel_3 = new JLabel("Position:");
		lblNewLabel_3.setFont(new Font("SF Pro Rounded", Font.PLAIN, 16));
		
		JLabel lblNewLabel_4 = new JLabel("Nationality:");
		lblNewLabel_4.setFont(new Font("SF Pro Rounded", Font.PLAIN, 16));
		
		JLabel lblNewLabel_5 = new JLabel("Durability");
		lblNewLabel_5.setFont(new Font("SF Pro Rounded", Font.PLAIN, 16));
		
		progressBar = new JProgressBar();
		progressBar.setFont(new Font("SF Pro Rounded", Font.PLAIN, 16));
		
		JLabel lblNewLabel_6 = new JLabel("Offense");
		lblNewLabel_6.setFont(new Font("SF Pro Rounded", Font.PLAIN, 16));
		
		progressBar_1 = new JProgressBar();
		progressBar_1.setFont(new Font("SF Pro Rounded", Font.PLAIN, 16));
		
		JLabel lblNewLabel_7 = new JLabel("Defense");
		lblNewLabel_7.setFont(new Font("SF Pro Rounded", Font.PLAIN, 16));
		
		progressBar_2 = new JProgressBar();
		progressBar_2.setFont(new Font("SF Pro Rounded", Font.PLAIN, 16));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(15)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
						.addComponent(progressBar_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblNewLabel_7)
						.addComponent(progressBar_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblNewLabel_6)
						.addComponent(progressBar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblNewLabel_5)
						.addComponent(lblNewLabel_4)
						.addComponent(lblNewLabel_3)
						.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 280, GroupLayout.PREFERRED_SIZE))
					.addGap(20))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(17)
					.addComponent(lblNewLabel_2)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblNewLabel_3)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_4)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblNewLabel_5)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(progressBar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_6)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(progressBar_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_7)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(progressBar_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(15, Short.MAX_VALUE))
		);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_8 = new JLabel("Equipment:");
		lblNewLabel_8.setFont(new Font("SF Pro Rounded", Font.PLAIN, 16));
		lblNewLabel_8.setBounds(6, 6, 104, 16);
		panel_1.add(lblNewLabel_8);
		
		btnNewButton_5 = new JButton("Rackets");
		btnNewButton_5.setFont(new Font("SF Pro Rounded", Font.PLAIN, 16));
		btnNewButton_5.setBounds(6, 34, 135, 55);
		panel_1.add(btnNewButton_5);
		
		btnNewButton_5_1 = new JButton("Shoes");
		btnNewButton_5_1.setFont(new Font("SF Pro Rounded", Font.PLAIN, 16));
		btnNewButton_5_1.setBounds(146, 34, 128, 55);
		panel_1.add(btnNewButton_5_1);
		panel.setLayout(gl_panel);
		
		btnNewButton_1 = new JButton("Name");
		btnNewButton_1.setFont(new Font("SF Pro Rounded", Font.PLAIN, 16));
		btnNewButton_1.setBounds(104, 131, 67, 80);
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
		btnNewButton_2.setBounds(172, 131, 67, 80);
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
		btnNewButton_2_1.setBounds(172, 207, 67, 80);
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
		btnNewButton_1_1.setBounds(104, 207, 67, 80);
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
		btnNewButton_3.setBounds(36, 207, 67, 80);
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
		btnNewButton_2_2.setBounds(172, 283, 67, 80);
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
		btnNewButton_1_2.setBounds(104, 283, 67, 80);
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
		btnNewButton_4.setBounds(36, 283, 67, 80);
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
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("SF Pro Rounded", Font.BOLD, 20));
		lblNewLabel.setBounds(6, 6, 624, 65);
		frmBadmintonTournamentClub.getContentPane().add(lblNewLabel);
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
