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
	private JLabel lblNewLabel_4_2_1;
	private JLabel lblNewLabel_4_2_1_1;
	private JLabel lblNewLabel_4_2_1_2;
	
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
		onAppear();
		frmBadmintonTournamentMain.setVisible(true);
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBadmintonTournamentMain = new JFrame();
		frmBadmintonTournamentMain.getContentPane().setBackground(new Color(176, 196, 222));
		frmBadmintonTournamentMain.setTitle((gameHandler.getAppName()+"(Home Page)"));
		frmBadmintonTournamentMain.setBounds(100, 100, 569, 501);
		frmBadmintonTournamentMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBadmintonTournamentMain.setLocationRelativeTo(null);
		frmBadmintonTournamentMain.setResizable(false);
		
		JLabel lblNewLabel_1 = new JLabel("Current Season:");
		lblNewLabel_1.setBounds(932, 52, 126, 16);
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		
		JButton btnNewButton = new JButton("C L U B");
		btnNewButton.setForeground(new Color(100, 149, 237));
		btnNewButton.setBackground(new Color(240, 230, 140));
		btnNewButton.setBounds(18, 131, 167, 158);
		btnNewButton.setFont(new Font("Futura", Font.PLAIN, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gameHandler.setPage(3);
				GameMaster.hideAllPage();
				GameMaster.showSelectedPage(gameHandler.getPage());
			}
		});
		
		JButton btnSTA = new JButton("S T A D I U M");
		btnSTA.setForeground(new Color(100, 149, 237));
		btnSTA.setBounds(197, 131, 170, 158);
		btnSTA.setFont(new Font("Futura", Font.PLAIN, 16));
		btnSTA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gameHandler.setPage(4);
				GameMaster.hideAllPage();
				GameMaster.showSelectedPage(gameHandler.getPage());
			}
		});
		
		JButton btnRES = new JButton("M A R K E T");
		btnRES.setForeground(new Color(100, 149, 237));
		btnRES.setBounds(379, 131, 167, 158);
		btnRES.setFont(new Font("Futura", Font.PLAIN, 16));
		btnRES.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gameHandler.setPage(5);
				GameMaster.hideAllPage();
				GameMaster.showSelectedPage(gameHandler.getPage());
			}
		});
		
		JButton btnMAR = new JButton("S A V E  G A M E");
		btnMAR.setForeground(new Color(100, 149, 237));
		btnMAR.setBounds(18, 295, 167, 158);
		btnMAR.setFont(new Font("Futura", Font.PLAIN, 16));
		btnMAR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnSAV = new JButton("L O A D  G A M E");
		btnSAV.setForeground(new Color(100, 149, 237));
		btnSAV.setBounds(197, 295, 170, 158);
		btnSAV.setFont(new Font("Futura", Font.PLAIN, 16));
		btnSAV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnSKI = new JButton("S K I P  W E E K");
		btnSKI.setForeground(new Color(100, 149, 237));
		btnSKI.setBounds(379, 295, 164, 158);
		btnSKI.setFont(new Font("Futura", Font.PLAIN, 16));
		btnSKI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(gameHandler.getRemainingWeek()>0) {
					gameHandler.setCurrentWeek(gameHandler.getCurrentWeek()+1);
					gameHandler.setRemainingWeek(gameHandler.getRemainingWeek()-1);
				}
				onAppear();
			}
		});
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.setBounds(1035, 11, 117, 29);
		
		lblNewLabel_4_3 = new JLabel(Float.toString(gameHandler.getRemainingWeek()));
		lblNewLabel_4_3.setBounds(874, 97, 61, 16);
		frmBadmintonTournamentMain.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(250, 250, 210));
		panel.setBounds(18, 8, 528, 105);
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), null, null, null));
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Balance:");
		lblNewLabel.setBounds(22, 53, 82, 19);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Futura", Font.PLAIN, 16));
		
		JLabel lblNewLabel_3 = new JLabel("Points:");
		lblNewLabel_3.setBounds(22, 74, 69, 19);
		panel.add(lblNewLabel_3);
		lblNewLabel_3.setFont(new Font("Futura", Font.PLAIN, 16));
		
		JLabel lblNewLabel_2 = new JLabel("Remaining Week:");
		lblNewLabel_2.setBounds(22, 29, 142, 26);
		panel.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Futura", Font.PLAIN, 16));
		
		lblNewLabel_4 = new JLabel(Float.toString(gameHandler.getBalance()));
		lblNewLabel_4.setFont(new Font("Futura", Font.PLAIN, 16));
		lblNewLabel_4.setBounds(176, 56, 82, 16);
		panel.add(lblNewLabel_4);
		
		lblNewLabel_4_1 = new JLabel(Float.toString(gameHandler.getPoints()));
		lblNewLabel_4_1.setFont(new Font("Futura", Font.PLAIN, 16));
		lblNewLabel_4_1.setBounds(176, 77, 82, 16);
		panel.add(lblNewLabel_4_1);
		
		lblNewLabel_4_2 = new JLabel(Float.toString(gameHandler.getRemainingWeek()));
		lblNewLabel_4_2.setFont(new Font("Futura", Font.PLAIN, 16));
		lblNewLabel_4_2.setBounds(176, 36, 82, 16);
		panel.add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_5 = new JLabel("Player's Status");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Futura", Font.BOLD, 18));
		lblNewLabel_5.setBounds(0, 0, 528, 26);
		panel.add(lblNewLabel_5);
		lblNewLabel_5.setBackground(new Color(255, 255, 255));
		
		JLabel lblNewLabel_2_1 = new JLabel("Active Members:");
		lblNewLabel_2_1.setFont(new Font("Futura", Font.PLAIN, 16));
		lblNewLabel_2_1.setBounds(317, 29, 142, 26);
		panel.add(lblNewLabel_2_1);
		
		lblNewLabel_4_2_1 = new JLabel("0.0");
		lblNewLabel_4_2_1.setFont(new Font("Futura", Font.PLAIN, 16));
		lblNewLabel_4_2_1.setBounds(458, 35, 51, 16);
		panel.add(lblNewLabel_4_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Matchs Won:");
		lblNewLabel_2_1_1.setFont(new Font("Futura", Font.PLAIN, 16));
		lblNewLabel_2_1_1.setBounds(317, 49, 117, 26);
		panel.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Matchs Loss:");
		lblNewLabel_2_1_1_1.setFont(new Font("Futura", Font.PLAIN, 16));
		lblNewLabel_2_1_1_1.setBounds(317, 70, 117, 26);
		panel.add(lblNewLabel_2_1_1_1);
		
		lblNewLabel_4_2_1_1 = new JLabel("0.0");
		lblNewLabel_4_2_1_1.setFont(new Font("Futura", Font.PLAIN, 16));
		lblNewLabel_4_2_1_1.setBounds(458, 56, 51, 16);
		panel.add(lblNewLabel_4_2_1_1);
		
		lblNewLabel_4_2_1_2 = new JLabel("0.0");
		lblNewLabel_4_2_1_2.setFont(new Font("Futura", Font.PLAIN, 16));
		lblNewLabel_4_2_1_2.setBounds(458, 77, 51, 16);
		panel.add(lblNewLabel_4_2_1_2);
		frmBadmintonTournamentMain.getContentPane().add(panel);
		frmBadmintonTournamentMain.getContentPane().add(btnNewButton);
		frmBadmintonTournamentMain.getContentPane().add(btnMAR);
		frmBadmintonTournamentMain.getContentPane().add(btnSTA);
		frmBadmintonTournamentMain.getContentPane().add(btnSAV);
		frmBadmintonTournamentMain.getContentPane().add(btnSKI);
		frmBadmintonTournamentMain.getContentPane().add(btnRES);
		frmBadmintonTournamentMain.getContentPane().add(lblNewLabel_1);
		frmBadmintonTournamentMain.getContentPane().add(btnNewButton_1);
		frmBadmintonTournamentMain.getContentPane().add(lblNewLabel_4_3);
	}
	public void onAppear() {
		lblNewLabel_4.setText(Float.toString(gameHandler.getBalance()));
		lblNewLabel_4_1.setText(Float.toString(gameHandler.getPoints()));
		lblNewLabel_4_2.setText(Integer.toString(gameHandler.getRemainingWeek()));
		//TODO: active member update, match won, match loss
		lblNewLabel_4_2_1.setText("");
		lblNewLabel_4_2_1_1.setText("");
		lblNewLabel_4_2_1_2.setText("");
	}
}
