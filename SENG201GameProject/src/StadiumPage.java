import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.JMenuItem;
import java.util.Random;

public class StadiumPage {

	private JFrame frmBadmintonTournamentStadium;
	private GameHandler gameHandler;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblSeaGames;
	private JButton btnNewButton;
	private JLabel lblNewLabel_1_1;
	private JLabel lblNewLabel_2_1;
	private JLabel lblOlympic;
	private JLabel lblNewLabel_1_2;
	private JLabel lblNewLabel_2_2;
	private JButton btnNewButton_4;
	private JLabel lblBWF;
	private JLabel lblNewLabel_1_3;
	private JLabel lblNewLabel_2_3;
	private JButton btnNewButton_2;
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameHandler gameHandler = new GameHandler();
					StadiumPage window = new StadiumPage(gameHandler);
					window.frmBadmintonTournamentStadium.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StadiumPage(GameHandler gameHandler) {
		this.gameHandler = gameHandler;
		initialize();
	}
	
	public void hidePage() {
		frmBadmintonTournamentStadium.setVisible(false);
	}
	public void showPage() {
		onAppear();
		frmBadmintonTournamentStadium.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBadmintonTournamentStadium = new JFrame();
		frmBadmintonTournamentStadium.getContentPane().setBackground(new Color(176, 196, 222));
		frmBadmintonTournamentStadium.setTitle((gameHandler.getAppName()+"(Stadium Page)"));
		frmBadmintonTournamentStadium.setBounds(100, 100, 622, 322);
		frmBadmintonTournamentStadium.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBadmintonTournamentStadium.setLocationRelativeTo(null);
		frmBadmintonTournamentStadium.setResizable(false);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 230, 140));
		panel.setBounds(14, 79, 144, 192);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		
		lblNewLabel = new JLabel("THOMAS CUP");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("SF Pro Rounded", Font.PLAIN, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		lblNewLabel_1 = new JLabel("$ 700");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("SF Pro Rounded", Font.PLAIN, 22));
		
		lblNewLabel_2 = new JLabel("50 points");
		lblNewLabel_2.setFont(new Font("SF Pro Rounded", Font.PLAIN, 13));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		
		btnNewButton = new JButton("Join");
		btnNewButton.setFont(new Font("SF Pro Rounded", Font.PLAIN, 13));
		btnNewButton.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				int matchIndex = 0;
				gameHandler.getMatchHistory().add(getMatch(matchIndex));
				gameHandler.setPage(8);
				GameMaster.showSelectedPage(gameHandler.getPage());
			}
		});
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_2, GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap(12, Short.MAX_VALUE)
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
						.addComponent(lblNewLabel_1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(72)
					.addComponent(lblNewLabel)
					.addGap(12)
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 14, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnNewButton))
		);
		panel.setLayout(gl_panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(240, 230, 140));
		panel_1.setBounds(164, 79, 144, 192);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		
		lblSeaGames = new JLabel("SEA GAMES");
		lblSeaGames.setFont(new Font("SF Pro Rounded", Font.PLAIN, 16));
		lblSeaGames.setHorizontalAlignment(SwingConstants.CENTER);
		
		lblNewLabel_1_1 = new JLabel("$ 250");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("SF Pro Rounded", Font.PLAIN, 22));
		
		lblNewLabel_2_1 = new JLabel("50 points");
		lblNewLabel_2_1.setFont(new Font("SF Pro Rounded", Font.PLAIN, 13));
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(240, 230, 140));
		panel_2.setBounds(314, 79, 142, 192);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		
		lblOlympic = new JLabel("OLYMPIC ");
		lblOlympic.setHorizontalAlignment(SwingConstants.CENTER);
		lblOlympic.setFont(new Font("SF Pro Rounded", Font.PLAIN, 16));
		
		lblNewLabel_1_2 = new JLabel("$ 400");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("SF Pro Rounded", Font.PLAIN, 22));
		
		lblNewLabel_2_2 = new JLabel("50 points");
		lblNewLabel_2_2.setFont(new Font("SF Pro Rounded", Font.PLAIN, 13));
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		
		btnNewButton_4 = new JButton("Back");
		btnNewButton_4.setBounds(6, 6, 60, 29);
		btnNewButton_4.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				gameHandler.setPage(2);
				GameMaster.showSelectedPage(gameHandler.getPage());
			}
		});
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(240, 230, 140));
		panel_3.setBounds(462, 79, 144, 192);
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		
		lblBWF = new JLabel("NZ OPEN");
		lblBWF.setHorizontalAlignment(SwingConstants.CENTER);
		lblBWF.setFont(new Font("SF Pro Rounded", Font.PLAIN, 16));
		
		lblNewLabel_1_3 = new JLabel("$ 300");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setFont(new Font("SF Pro Rounded", Font.PLAIN, 22));
		
		lblNewLabel_2_3 = new JLabel("50 points");
		lblNewLabel_2_3.setFont(new Font("SF Pro Rounded", Font.PLAIN, 13));
		lblNewLabel_2_3.setHorizontalAlignment(SwingConstants.CENTER);
		
		btnNewButton_2 = new JButton("Join");
		btnNewButton_2.setFont(new Font("SF Pro Rounded", Font.PLAIN, 13));
		btnNewButton_2.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				int matchIndex = 3;
				gameHandler.getMatchHistory().add(getMatch(matchIndex));
				gameHandler.setPage(8);
				GameMaster.showSelectedPage(gameHandler.getPage());
			}
		});
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addComponent(lblNewLabel_1_3, GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addComponent(lblNewLabel_2_3, GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
				.addComponent(lblBWF, GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGap(69)
					.addComponent(lblBWF)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblNewLabel_1_3, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_2_3)
					.addPreferredGap(ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
					.addComponent(btnNewButton_2))
		);
		panel_3.setLayout(gl_panel_3);
		
		JButton btnNewButton_1 = new JButton("Join");
		btnNewButton_1.setFont(new Font("SF Pro Rounded", Font.PLAIN, 13));
		btnNewButton_1.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				int matchIndex = 2;
				gameHandler.getMatchHistory().add(getMatch(matchIndex));
				gameHandler.setPage(8);
				GameMaster.showSelectedPage(gameHandler.getPage());
			}
		});
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addComponent(lblOlympic, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
				.addComponent(lblNewLabel_1_2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
				.addComponent(lblNewLabel_2_2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(72)
					.addComponent(lblOlympic)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_1_2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_2_2)
					.addPreferredGap(ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
					.addComponent(btnNewButton_1))
		);
		panel_2.setLayout(gl_panel_2);
		
		JButton btnNewButton_3 = new JButton("Join");
		btnNewButton_3.setFont(new Font("SF Pro Rounded", Font.PLAIN, 13));
		btnNewButton_3.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				int matchIndex = 1;
				gameHandler.getMatchHistory().add(getMatch(matchIndex));
				gameHandler.setPage(8);
				GameMaster.showSelectedPage(gameHandler.getPage());
			}
		});
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(btnNewButton_3, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addComponent(lblNewLabel_1_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
				.addComponent(lblNewLabel_2_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
				.addComponent(lblSeaGames, GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(72)
					.addComponent(lblSeaGames, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_2_1)
					.addPreferredGap(ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
					.addComponent(btnNewButton_3))
		);
		panel_1.setLayout(gl_panel_1);
		frmBadmintonTournamentStadium.getContentPane().setLayout(null);
		frmBadmintonTournamentStadium.getContentPane().add(btnNewButton_4);
		frmBadmintonTournamentStadium.getContentPane().add(panel);
		frmBadmintonTournamentStadium.getContentPane().add(panel_1);
		frmBadmintonTournamentStadium.getContentPane().add(panel_2);
		frmBadmintonTournamentStadium.getContentPane().add(panel_3);
		
		JLabel lblNewLabel_3 = new JLabel("T O U R N A M E N T S");
		lblNewLabel_3.setForeground(new Color(25, 25, 112));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Dialog", Font.BOLD, 35));
		lblNewLabel_3.setBounds(0, 14, 621, 53);
		frmBadmintonTournamentStadium.getContentPane().add(lblNewLabel_3);
	}
	public void onAppear() {
		Random random = new Random();
		lblNewLabel.setText(getMatchName(0));
		lblNewLabel_1.setText("$"+Float.toString(getMatchPrice(0)));
		lblNewLabel_2.setText(Float.toString(getMatchPoint(0))+"points");
		lblSeaGames.setText(getMatchName(1));
		lblNewLabel_1_1.setText("$"+Float.toString(getMatchPrice(1)));
		lblNewLabel_2_1.setText(Float.toString(getMatchPoint(1))+"points");
		lblOlympic.setText(getMatchName(2));
		lblNewLabel_1_2.setText("$"+Float.toString(getMatchPrice(2)));
		lblNewLabel_2_2.setText(Float.toString(getMatchPoint(2))+"points");
		lblBWF.setText(getMatchName(3));
		lblNewLabel_1_3.setText("$"+Float.toString(getMatchPrice(3)));
		lblNewLabel_2_3.setText(Float.toString(getMatchPoint(3))+"points");
	
	}
	public String getMatchName(int index) {
		return getMatch(index).getName();
	}
	public float getMatchPrice(int index) {
		float difficulty = getMatch(index).getDifficulty();
		int price = getMatch(index).getPrice();
		float totalWeek = gameHandler.getRemainingWeek() + gameHandler.getCurrentWeek();
		float currentWeek = gameHandler.getCurrentWeek();
		float calcPrice = price + ((float) price * ((difficulty/10) * 0.3f)) + ((float) price * (currentWeek/totalWeek) * 0.9f);
		return calcPrice;
	}
	public float getMatchPoint(int index) {
		float difficulty = getMatch(index).getDifficulty();
		int points = getMatch(index).getPoint();
		float totalWeek = gameHandler.getRemainingWeek() + gameHandler.getCurrentWeek();
		float currentWeek = gameHandler.getCurrentWeek();
		float calcPoints = points + ((float) points * ((difficulty/10) * 0.3f)) + ((float) points * (currentWeek/totalWeek) * 0.9f);
		return calcPoints;
	}
	public Match getMatch(int index) {
		return gameHandler.getWeeklyMatches().get(gameHandler.getCurrentWeek()-1).get(index);
	}
}
