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

public class ClubPage {

	private JFrame frmBadmintonTournamentClub;
	private GameHandler gameHandler;
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
		frmBadmintonTournamentClub.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\"Team Name\"");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 31));
		lblNewLabel.setBounds(41, 16, 231, 80);
		frmBadmintonTournamentClub.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Athletes:");
		lblNewLabel_1.setBounds(41, 107, 61, 16);
		frmBadmintonTournamentClub.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Name");
		btnNewButton.setBounds(41, 135, 67, 80);
		frmBadmintonTournamentClub.getContentPane().add(btnNewButton);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel.setBounds(293, 118, 315, 349);
		frmBadmintonTournamentClub.getContentPane().add(panel);
		
		JLabel lblNewLabel_2 = new JLabel("TAUFIK HIDAYAT");
		
		JLabel lblNewLabel_3 = new JLabel("Position:");
		
		JLabel lblNewLabel_4 = new JLabel("Nationality:");
		
		JLabel lblNewLabel_5 = new JLabel("Durability");
		
		JProgressBar progressBar = new JProgressBar();
		
		JLabel lblNewLabel_6 = new JLabel("Attack");
		
		JProgressBar progressBar_1 = new JProgressBar();
		
		JLabel lblNewLabel_7 = new JLabel("Defense");
		
		JProgressBar progressBar_2 = new JProgressBar();
		
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
		lblNewLabel_8.setBounds(6, 6, 104, 16);
		panel_1.add(lblNewLabel_8);
		
		JButton btnNewButton_5 = new JButton("Rackets");
		btnNewButton_5.setBounds(6, 34, 135, 55);
		panel_1.add(btnNewButton_5);
		
		JButton btnNewButton_5_1 = new JButton("Shoes");
		btnNewButton_5_1.setBounds(146, 34, 128, 55);
		panel_1.add(btnNewButton_5_1);
		panel.setLayout(gl_panel);
		
		JButton btnNewButton_1 = new JButton("Name");
		btnNewButton_1.setBounds(109, 135, 67, 80);
		frmBadmintonTournamentClub.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Name");
		btnNewButton_2.setBounds(177, 135, 67, 80);
		frmBadmintonTournamentClub.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("Name");
		btnNewButton_2_1.setBounds(177, 227, 67, 80);
		frmBadmintonTournamentClub.getContentPane().add(btnNewButton_2_1);
		
		JButton btnNewButton_1_1 = new JButton("Name");
		btnNewButton_1_1.setBounds(109, 227, 67, 80);
		frmBadmintonTournamentClub.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_3 = new JButton("Name");
		btnNewButton_3.setBounds(41, 227, 67, 80);
		frmBadmintonTournamentClub.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_2_2 = new JButton("Name");
		btnNewButton_2_2.setBounds(177, 319, 67, 80);
		frmBadmintonTournamentClub.getContentPane().add(btnNewButton_2_2);
		
		JButton btnNewButton_1_2 = new JButton("Name");
		btnNewButton_1_2.setBounds(109, 319, 67, 80);
		frmBadmintonTournamentClub.getContentPane().add(btnNewButton_1_2);
		
		JButton btnNewButton_4 = new JButton("Name");
		btnNewButton_4.setBounds(41, 319, 67, 80);
		frmBadmintonTournamentClub.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_6 = new JButton("Back");
		btnNewButton_6.setBounds(502, 16, 117, 29);
		frmBadmintonTournamentClub.getContentPane().add(btnNewButton_6);
	}
}
