import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.SwingConstants;

public class MainGamePage {

	private JFrame frmBadmintonTournamentMain;
	private GameHandler gameHandler;
	
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_4_1;
	private JLabel lblNewLabel_4_2;
	private JLabel lblNewLabel_4_3;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameHandler gameHandler = new GameHandler();
					MainGamePage window = new MainGamePage(gameHandler);
					window.frmBadmintonTournamentMain.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainGamePage(GameHandler gameHandler) {
		this.gameHandler = gameHandler;
		initialize();
	}

	public void hidePage() {
		frmBadmintonTournamentMain.setVisible(false);
	}
	public void showPage() {
		frmBadmintonTournamentMain.setVisible(true);
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBadmintonTournamentMain = new JFrame();
		frmBadmintonTournamentMain.setTitle((gameHandler.getAppName()+"(Home Page)"));
		frmBadmintonTournamentMain.setBounds(100, 100, 530, 497);
		frmBadmintonTournamentMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBadmintonTournamentMain.setLocationRelativeTo(null);
		frmBadmintonTournamentMain.setResizable(false);
		
		JLabel lblNewLabel_1 = new JLabel("Current Season:");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		
		JButton btnNewButton = new JButton("C L U B");
		btnNewButton.setFont(new Font("SF Pro Rounded", Font.PLAIN, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gameHandler.setPage(3);
				GameMaster.hideAllPage();
				GameMaster.showSelectedPage(gameHandler.getPage());
			}
		});
		
		JButton btnSTA = new JButton("S T A D I U M");
		btnSTA.setFont(new Font("SF Pro Rounded", Font.PLAIN, 16));
		btnSTA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gameHandler.setPage(4);
				GameMaster.hideAllPage();
				GameMaster.showSelectedPage(gameHandler.getPage());
			}
		});
		
		JButton btnRES = new JButton("M A R K E T");
		btnRES.setFont(new Font("SF Pro Rounded", Font.PLAIN, 16));
		btnRES.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gameHandler.setPage(5);
				GameMaster.hideAllPage();
				GameMaster.showSelectedPage(gameHandler.getPage());
			}
		});
		
		JButton btnMAR = new JButton("S A V E  G A M E");
		btnMAR.setFont(new Font("SF Pro Rounded", Font.PLAIN, 16));
		btnMAR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnSAV = new JButton("L O A D  G A M E");
		btnSAV.setFont(new Font("SF Pro Rounded", Font.PLAIN, 16));
		btnSAV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnSKI = new JButton("S K I P  W E E K");
		btnSKI.setFont(new Font("SF Pro Rounded", Font.PLAIN, 16));
		btnSKI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gameHandler.setRemainingWeek(gameHandler.getRemainingWeek()-1);
				onAppear();
			}
		});
		
		JButton btnNewButton_1 = new JButton("Back");
		
		lblNewLabel_4_3 = new JLabel(Float.toString(gameHandler.getRemainingWeek()));
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), null, null, null));
		GroupLayout groupLayout = new GroupLayout(frmBadmintonTournamentMain.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnMAR, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
							.addGap(12)
							.addComponent(btnSAV, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
							.addGap(12)
							.addComponent(btnSKI, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
									.addGap(12)
									.addComponent(btnSTA, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
									.addGap(12)
									.addComponent(btnRES, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE))
								.addComponent(panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(337)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(49)
											.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE))
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(152)
											.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE))))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(328)
									.addComponent(lblNewLabel_4_3, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)))))
					.addGap(6))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(8)
							.addComponent(btnNewButton_1)
							.addGap(12)
							.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
							.addGap(29)
							.addComponent(lblNewLabel_4_3))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(12)
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnSTA, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnRES, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE))
					.addGap(17)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnMAR, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnSAV, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnSKI, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(23, Short.MAX_VALUE))
		);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Balance:");
		lblNewLabel.setBounds(6, 53, 61, 19);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("SF Pro Rounded", Font.PLAIN, 16));
		
		JLabel lblNewLabel_3 = new JLabel("Points:");
		lblNewLabel_3.setBounds(6, 74, 49, 19);
		panel.add(lblNewLabel_3);
		lblNewLabel_3.setFont(new Font("SF Pro Rounded", Font.PLAIN, 16));
		
		JLabel lblNewLabel_2 = new JLabel("Remaining Week:");
		lblNewLabel_2.setBounds(6, 29, 117, 26);
		panel.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("SF Pro Rounded", Font.PLAIN, 16));
		
		lblNewLabel_4 = new JLabel(Float.toString(gameHandler.getBalance()));
		lblNewLabel_4.setFont(new Font("SF Pro Rounded", Font.PLAIN, 16));
		lblNewLabel_4.setBounds(163, 54, 82, 16);
		panel.add(lblNewLabel_4);
		
		lblNewLabel_4_1 = new JLabel(Float.toString(gameHandler.getPoints()));
		lblNewLabel_4_1.setFont(new Font("SF Pro Rounded", Font.PLAIN, 16));
		lblNewLabel_4_1.setBounds(163, 75, 82, 16);
		panel.add(lblNewLabel_4_1);
		
		lblNewLabel_4_2 = new JLabel(Float.toString(gameHandler.getCurrentSeason()));
		lblNewLabel_4_2.setFont(new Font("SF Pro Rounded", Font.PLAIN, 16));
		lblNewLabel_4_2.setBounds(163, 34, 82, 16);
		panel.add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_5 = new JLabel("Player's Status");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("SF Pro Rounded", Font.BOLD, 18));
		lblNewLabel_5.setBounds(6, 0, 477, 26);
		panel.add(lblNewLabel_5);
		lblNewLabel_5.setBackground(new Color(255, 255, 255));
		
		JLabel lblNewLabel_2_1 = new JLabel("Active Members:");
		lblNewLabel_2_1.setFont(new Font("SF Pro Rounded", Font.PLAIN, 16));
		lblNewLabel_2_1.setBounds(302, 29, 117, 26);
		panel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_4_2_1 = new JLabel("0.0");
		lblNewLabel_4_2_1.setFont(new Font("SF Pro Rounded", Font.PLAIN, 16));
		lblNewLabel_4_2_1.setBounds(459, 34, 24, 16);
		panel.add(lblNewLabel_4_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Matchs Won:");
		lblNewLabel_2_1_1.setFont(new Font("SF Pro Rounded", Font.PLAIN, 16));
		lblNewLabel_2_1_1.setBounds(302, 49, 117, 26);
		panel.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Matchs Loss:");
		lblNewLabel_2_1_1_1.setFont(new Font("SF Pro Rounded", Font.PLAIN, 16));
		lblNewLabel_2_1_1_1.setBounds(302, 70, 117, 26);
		panel.add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_4_2_1_1 = new JLabel("0.0");
		lblNewLabel_4_2_1_1.setFont(new Font("SF Pro Rounded", Font.PLAIN, 16));
		lblNewLabel_4_2_1_1.setBounds(459, 55, 24, 16);
		panel.add(lblNewLabel_4_2_1_1);
		
		JLabel lblNewLabel_4_2_1_2 = new JLabel("0.0");
		lblNewLabel_4_2_1_2.setFont(new Font("SF Pro Rounded", Font.PLAIN, 16));
		lblNewLabel_4_2_1_2.setBounds(459, 76, 24, 16);
		panel.add(lblNewLabel_4_2_1_2);
		frmBadmintonTournamentMain.getContentPane().setLayout(groupLayout);
	}
	public void onAppear() {
		lblNewLabel_4.setText(Float.toString(gameHandler.getBalance()));
		lblNewLabel_4_1.setText(Float.toString(gameHandler.getPoints()));
		lblNewLabel_4_2.setText(Float.toString(gameHandler.getCurrentSeason()));
		lblNewLabel_4_3.setText(Float.toString(gameHandler.getRemainingWeek()));
	}
}
