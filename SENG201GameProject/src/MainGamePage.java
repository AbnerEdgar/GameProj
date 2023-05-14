import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class MainGamePage {

	private JFrame frmBadmintonTournamentMain;
	private GameHandler gameHandler;
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
		frmBadmintonTournamentMain.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Balance:");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel.setBounds(28, 49, 61, 16);
		frmBadmintonTournamentMain.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Current Season:");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(287, 49, 126, 16);
		frmBadmintonTournamentMain.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Remaining Week:");
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(287, 94, 142, 16);
		frmBadmintonTournamentMain.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("C L U B");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gameHandler.setPage(3);
				GameMaster.hideAllPage();
				GameMaster.showSelectedPage(gameHandler.getPage());
			}
		});
		btnNewButton.setBounds(18, 136, 155, 147);
		frmBadmintonTournamentMain.getContentPane().add(btnNewButton);
		
		JButton btnSTA = new JButton("S T A D I U M");
		btnSTA.setBounds(185, 136, 155, 147);
		frmBadmintonTournamentMain.getContentPane().add(btnSTA);
		btnSTA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gameHandler.setPage(4);
				GameMaster.hideAllPage();
				GameMaster.showSelectedPage(gameHandler.getPage());
			}
		});
		
		JButton btnRES = new JButton("M A R K E T");
		btnRES.setBounds(352, 136, 155, 147);
		frmBadmintonTournamentMain.getContentPane().add(btnRES);
		btnRES.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				gameHandler.setPage(5);
				GameMaster.hideAllPage();
				GameMaster.showSelectedPage(gameHandler.getPage());
			}
		});
		
		JButton btnMAR = new JButton("S A V E  G A M E");
		btnMAR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMAR.setBounds(18, 300, 155, 147);
		frmBadmintonTournamentMain.getContentPane().add(btnMAR);
		
		JButton btnSAV = new JButton("L O A D  G A M E");
		btnSAV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSAV.setBounds(185, 300, 155, 147);
		frmBadmintonTournamentMain.getContentPane().add(btnSAV);
		
		JButton btnSKI = new JButton("S K I P  W E E K");
		btnSKI.setBounds(352, 300, 155, 147);
		frmBadmintonTournamentMain.getContentPane().add(btnSKI);
		
		JLabel lblNewLabel_3 = new JLabel("Points:");
		lblNewLabel_3.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(28, 94, 61, 16);
		frmBadmintonTournamentMain.getContentPane().add(lblNewLabel_3);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.setBounds(390, 8, 117, 29);
		frmBadmintonTournamentMain.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBounds(95, 50, 61, 16);
		frmBadmintonTournamentMain.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("New label");
		lblNewLabel_4_1.setBounds(82, 95, 61, 16);
		frmBadmintonTournamentMain.getContentPane().add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("New label");
		lblNewLabel_4_2.setBounds(400, 50, 61, 16);
		frmBadmintonTournamentMain.getContentPane().add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_4_3 = new JLabel("New label");
		lblNewLabel_4_3.setBounds(410, 95, 61, 16);
		frmBadmintonTournamentMain.getContentPane().add(lblNewLabel_4_3);
	}

}
