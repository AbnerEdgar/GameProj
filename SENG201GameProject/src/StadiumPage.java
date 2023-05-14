import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;

public class StadiumPage {

	private JFrame frmBadmintonTournamentStadium;
	private GameHandler gameHandler;
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
		frmBadmintonTournamentStadium.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBadmintonTournamentStadium = new JFrame();
		frmBadmintonTournamentStadium.setTitle((gameHandler.getAppName()+"(Stadium Page)"));
		frmBadmintonTournamentStadium.setBounds(100, 100, 652, 432);
		frmBadmintonTournamentStadium.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBadmintonTournamentStadium.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel.setBounds(20, 20, 130, 323);
		frmBadmintonTournamentStadium.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("THOMAS CUP");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_1 = new JLabel("$ 700");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		
		JLabel lblNewLabel_2 = new JLabel("50 points");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))
				.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
				.addComponent(lblNewLabel_2, GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(77)
					.addComponent(lblNewLabel)
					.addGap(7)
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_2)
					.addGap(174))
		);
		panel.setLayout(gl_panel);
		
		JButton btnNewButton = new JButton("Join");
		btnNewButton.setBounds(18, 347, 130, 29);
		frmBadmintonTournamentStadium.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Join");
		btnNewButton_1.setBounds(180, 347, 130, 29);
		frmBadmintonTournamentStadium.getContentPane().add(btnNewButton_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_1.setBounds(182, 20, 130, 323);
		frmBadmintonTournamentStadium.getContentPane().add(panel_1);
		
		JLabel lblSeaGames = new JLabel("SEA GAMES");
		lblSeaGames.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_1_1 = new JLabel("$ 250");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		
		JLabel lblNewLabel_2_1 = new JLabel("50 points");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addComponent(lblSeaGames, GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
				.addComponent(lblNewLabel_1_1, GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
				.addComponent(lblNewLabel_2_1, GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(78)
					.addComponent(lblSeaGames)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_2_1)
					.addGap(174))
		);
		panel_1.setLayout(gl_panel_1);
		
		JButton btnNewButton_2 = new JButton("Join");
		btnNewButton_2.setBounds(338, 347, 130, 29);
		frmBadmintonTournamentStadium.getContentPane().add(btnNewButton_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_2.setBounds(340, 20, 130, 323);
		frmBadmintonTournamentStadium.getContentPane().add(panel_2);
		
		JLabel lblOlympic = new JLabel("OLYMPIC ");
		lblOlympic.setHorizontalAlignment(SwingConstants.CENTER);
		lblOlympic.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		
		JLabel lblNewLabel_1_2 = new JLabel("$ 400");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		
		JLabel lblNewLabel_2_2 = new JLabel("50 points");
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_panel_2.createSequentialGroup()
							.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(lblOlympic, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel_1_2, GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
						.addComponent(lblNewLabel_2_2, GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(78)
					.addComponent(lblOlympic)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_1_2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_2_2)
					.addGap(168))
		);
		panel_2.setLayout(gl_panel_2);
		
		JButton btnNewButton_3 = new JButton("Join");
		btnNewButton_3.setBounds(497, 347, 130, 29);
		frmBadmintonTournamentStadium.getContentPane().add(btnNewButton_3);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_3.setBounds(499, 20, 130, 323);
		frmBadmintonTournamentStadium.getContentPane().add(panel_3);
		
		JLabel lblBWF = new JLabel("NZ OPEN");
		lblBWF.setHorizontalAlignment(SwingConstants.CENTER);
		lblBWF.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		
		JLabel lblNewLabel_1_3 = new JLabel("$ 300");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		
		JLabel lblNewLabel_2_3 = new JLabel("50 points");
		lblNewLabel_2_3.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addComponent(lblBWF, GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
				.addComponent(lblNewLabel_1_3, GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
				.addComponent(lblNewLabel_2_3, GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGap(78)
					.addComponent(lblBWF)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_1_3, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_2_3)
					.addGap(169))
		);
		panel_3.setLayout(gl_panel_3);
	}
}
