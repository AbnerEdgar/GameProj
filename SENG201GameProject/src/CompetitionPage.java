import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.JEditorPane;
import javax.swing.Timer;
import javax.swing.JButton;

import java.util.Random;

public class CompetitionPage {
	
	
	private JFrame frmBattleGroundPage;
	private GameHandler gameHandler;
	
	private JTable table;
	private JSlider slider;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private int sliderVal;
	private boolean isMax;
	private int hitBoxLeftBound;
	private int hitBoxRightBound;
	private int maxLeftBound;
	private int maxRightBound;
	private int hitBoxWidth;
	private boolean isHit;
	private boolean isExtended;
	private Timer timer = new Timer(50, e -> {
		doThis();
	});
	
	private JLabel lblJpn;
	private JLabel lblNames_1;
	private JLabel lblNames_1_1;
	private JPanel panel_3_3_2;
	private JPanel panel_3_1_2_2;
	private int gamePointPlayer_1; // the first game point
	private int gamePointPlayer_2; // the second game point
	private int gamePointPlayer_3; // the third game point if needed
	private int gamePointBOT_1; // the first game point
	private int gamePointBOT_2; // the second game point
	private int gamePointBOT_3; // the third game point if needed
	private int round;
	private int turn = 1; // 1 - player, 2 - bot 
	
	private JLabel lblScore;
	private JLabel lblScore_2;
	private JLabel lblScore_1;
	private JLabel lblScore_1_1;
	
	private Timer timer2 = new Timer(200, e -> {
		if(turn == 2) {
			BOTMove();
		}
	});;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameHandler gameHandler = new GameHandler();
					CompetitionPage window = new CompetitionPage(gameHandler);
					window.frmBattleGroundPage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CompetitionPage(GameHandler gameHandler) {
		this.gameHandler = gameHandler;
		initialize();
	}
	public void hidePage() {
		frmBattleGroundPage.setVisible(false);
	}
	public void showPage() {
		onAppear();
		frmBattleGroundPage.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		isHit = false;
		isExtended = false;
		isMax = false;
		sliderVal = 0;
		hitBoxLeftBound = 0;
		hitBoxRightBound = 0;
		//From trial and error
		maxLeftBound = 32;
		maxRightBound = 550;
		//-------------------
		hitBoxWidth = 0;
		timer.start();
		timer2.start();
		frmBattleGroundPage = new JFrame();
		frmBattleGroundPage.setTitle("Battle Ground Page");
		frmBattleGroundPage.setBounds(100, 100, 749, 577);
		frmBattleGroundPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBattleGroundPage.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(192, 192, 192));
		panel.setBorder(null);
		panel.setBounds(32, 433, 682, 84);
		frmBattleGroundPage.getContentPane().add(panel);
		panel.setLayout(null);
		
		btnNewButton_1 = new JButton(""); //hitbox
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(Color.RED);
		btnNewButton_1.setEnabled(false);
		btnNewButton_1.setBounds(598, 19, 51, 29);
		panel.add(btnNewButton_1);
		
		slider = new JSlider();
		slider.setValue(0);
		slider.setBounds(24, 19, 632, 29);
		panel.add(slider);
		
		btnNewButton = new JButton("Smash!");
		btnNewButton.setBounds(275, 49, 117, 29);
		panel.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				//get all info of hitbox
				recalculateHitBoxBound();
				//translate slider value to coordinate
				float hitValue = (float) sliderVal;
				float resolution = (float) slider.getMaximum();
				float sliderWidth = (float) slider.getWidth();
				float sliderOffset = (float) slider.getX();
				float transValue = hitValue/resolution * sliderWidth + sliderOffset;
				//compare slider value to left bound and right bound
				if(transValue >= hitBoxLeftBound && transValue <= hitBoxRightBound) {
					//When the smash is in.
					if(turn == 1) {
						updatePointPlayer();
					}
					System.out.println("Kena OI!");
				}else {
					//When the smash is not in.
					System.out.println("gak kena OI!");
					if (turn == 1) {
						turn = 2;
						updatePointBOT();
					}else if (turn == 2) {
						turn = 1;
						updatePointPlayer();
					}
				}
				Random random = new Random();
				//		     random.nextInt(maxValue - minValue + 1) + minValue;
				//			 to get integer from a range of minValue and maxValue;
				int ranPos = random.nextInt(maxRightBound - maxLeftBound + 1) + maxLeftBound;
				randomizeHitBox(0.5f,ranPos);
				//updateScore
				lblScore.setText(Integer.toString(gamePointPlayer_1));
				lblScore_2.setText(Integer.toString(gamePointPlayer_2));
				lblScore_1.setText(Integer.toString(gamePointBOT_1));
				lblScore_1_1.setText(Integer.toString(gamePointBOT_2));
			}
		});
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBounds(31, 17, 69, 38);
		frmBattleGroundPage.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		lblJpn = new JLabel("JPN");
		lblJpn.setHorizontalAlignment(SwingConstants.CENTER);
		lblJpn.setBounds(6, 6, 57, 26);
		panel_3.add(lblJpn);
		
		table = new JTable();
		table.setBounds(64, 132, 187, -44);
		frmBattleGroundPage.getContentPane().add(table);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3_1.setBounds(31, 55, 69, 38);
		frmBattleGroundPage.getContentPane().add(panel_3_1);
		panel_3_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BOTS");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(6, 6, 57, 26);
		panel_3_1.add(lblNewLabel);
		
		JPanel panel_3_1_1 = new JPanel();
		panel_3_1_1.setLayout(null);
		panel_3_1_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3_1_1.setBounds(106, 55, 172, 38);
		frmBattleGroundPage.getContentPane().add(panel_3_1_1);
		
		lblNames_1 = new JLabel("Names");
		lblNames_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNames_1.setBounds(6, 6, 160, 26);
		panel_3_1_1.add(lblNames_1);
		
		JPanel panel_3_2 = new JPanel();
		panel_3_2.setLayout(null);
		panel_3_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3_2.setBounds(106, 17, 172, 38);
		frmBattleGroundPage.getContentPane().add(panel_3_2);
		
		lblNames_1_1 = new JLabel("Names");
		lblNames_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNames_1_1.setBounds(6, 6, 160, 26);
		panel_3_2.add(lblNames_1_1);
		
		JPanel panel_3_3 = new JPanel();
		panel_3_3.setLayout(null);
		panel_3_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3_3.setBounds(277, 17, 52, 38);
		frmBattleGroundPage.getContentPane().add(panel_3_3);
		
		lblScore = new JLabel("0");
		lblScore.setHorizontalAlignment(SwingConstants.CENTER);
		lblScore.setBounds(0, 6, 52, 26);
		panel_3_3.add(lblScore);
		
		JPanel panel_3_1_2 = new JPanel();
		panel_3_1_2.setLayout(null);
		panel_3_1_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3_1_2.setBounds(277, 55, 52, 38);
		frmBattleGroundPage.getContentPane().add(panel_3_1_2);
		
		lblScore_1 = new JLabel("0");
		lblScore_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblScore_1.setBounds(0, 6, 52, 26);
		panel_3_1_2.add(lblScore_1);
		
		JPanel panel_3_1_2_1 = new JPanel();
		panel_3_1_2_1.setLayout(null);
		panel_3_1_2_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3_1_2_1.setBounds(328, 55, 52, 38);
		frmBattleGroundPage.getContentPane().add(panel_3_1_2_1);
		
		lblScore_1_1 = new JLabel("0");
		lblScore_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblScore_1_1.setBounds(0, 6, 52, 26);
		panel_3_1_2_1.add(lblScore_1_1);
		
		JPanel panel_3_3_1 = new JPanel();
		panel_3_3_1.setLayout(null);
		panel_3_3_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3_3_1.setBounds(328, 17, 52, 38);
		frmBattleGroundPage.getContentPane().add(panel_3_3_1);
		
		lblScore_2 = new JLabel("0");
		lblScore_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblScore_2.setBounds(0, 6, 52, 26);
		panel_3_3_1.add(lblScore_2);
		
		panel_3_3_2 = new JPanel();
		panel_3_3_2.setLayout(null);
		panel_3_3_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3_3_2.setBounds(379, 17, 52, 38);
		frmBattleGroundPage.getContentPane().add(panel_3_3_2);
		
		JLabel lblScore_3 = new JLabel("0");
		lblScore_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblScore_3.setBounds(0, 6, 52, 26);
		panel_3_3_2.add(lblScore_3);
		
		panel_3_1_2_2 = new JPanel();
		panel_3_1_2_2.setLayout(null);
		panel_3_1_2_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3_1_2_2.setBounds(379, 55, 52, 38);
		frmBattleGroundPage.getContentPane().add(panel_3_1_2_2);
		JLabel lblScore_1_2 = new JLabel("0");
		lblScore_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblScore_1_2.setBounds(0, 6, 52, 26);
		panel_3_1_2_2.add(lblScore_1_2);
	}
	public void onAppear() {
		panel_3_3_2.setVisible(isExtended);
		panel_3_1_2_2.setVisible(isExtended);
		gamePointPlayer_1 = 0;
		gamePointPlayer_2 = 0;
		gamePointPlayer_3 = 0;
		gamePointBOT_1 = 0; 
		gamePointBOT_2 = 0;
		gamePointBOT_3 = 0; 
		round = 1;
		turn = 1;
		lblJpn.setText(gameHandler.getPlayerTeam().getNationality());
		String athleteName_1 = gameHandler.getPlayerTeam().getMembers().get(0).getName();
		String athleteName_2 = gameHandler.getPlayerTeam().getMembers().get(1).getName();
		lblNames_1_1.setText(athleteName_1 +" / "+ athleteName_2);
		
	}
	public void doThis(){
		if(sliderVal >= 100 || sliderVal <= 0) {
			isMax = !isMax;
		}
		if(isMax) {
			sliderVal++;
		}else if(!isMax) {
			sliderVal--;
		}
		slider.setValue(sliderVal);
	}
	public void randomizeHitBox(float percent, int ranPos){
		float maxRange = slider.getWidth() * 0.25f;
		int tempHitBoxWidth = (int) Math.max((percent * maxRange),50);
		int tempHitBoxRightBound = ranPos + tempHitBoxWidth;
		tempHitBoxRightBound = Math.min(tempHitBoxRightBound, 650);
		int tempHitBoxLeftBound = tempHitBoxRightBound - tempHitBoxWidth;
		tempHitBoxLeftBound = Math.max(tempHitBoxLeftBound,32);
		btnNewButton_1.setBounds(tempHitBoxLeftBound,btnNewButton_1.getY(),tempHitBoxWidth,btnNewButton_1.getHeight());
	}
	public void recalculateHitBoxBound() {
		hitBoxLeftBound = btnNewButton_1.getX();
		hitBoxWidth = btnNewButton_1.getWidth();
		hitBoxRightBound = hitBoxLeftBound + hitBoxWidth;
	}
	public boolean isDeuce() {
		if(round == 1) {
			return gamePointBOT_1 >= 20 && gamePointPlayer_1 >= 20;
		}else if (round == 2) {
			return gamePointBOT_2 >= 20 && gamePointPlayer_2 >= 20;
		}else {
			return gamePointBOT_3 >= 20 && gamePointPlayer_3 >= 20;
		}
	}
	
	public void updatePointPlayer() {
		if(round == 1) {
			gamePointPlayer_1 += 1;
			if(gamePointBOT_1 <= 19 && gamePointPlayer_1 == 21){
				round += 1;
			}else if (isDeuce()) {
				if(gamePointPlayer_1 - gamePointBOT_1 == 2) {
					round += 1;
				}
			}
		}else if(round == 2) {
			gamePointPlayer_2 += 1;
			if(gamePointBOT_2 <= 19 && gamePointPlayer_2 == 21){
				round += 1;
			}
		}else if(round == 3) {
			gamePointPlayer_3 += 1;
			if(gamePointBOT_3 <= 19 && gamePointPlayer_3 == 21){
				round += 1;
			}
		}
	}
	
	public void updatePointBOT() {
		if(round == 1) {
			gamePointBOT_1 += 1;
		}else if(round == 2) {
			gamePointBOT_2 += 1;
		}else if(round == 3) {
			gamePointBOT_3 += 1;
		}
	}
	
	public void BOTMove() {
		//get all info of hitbox
		recalculateHitBoxBound();
		//translate slider value to coordinate
		float hitValue = (float) sliderVal;
		float resolution = (float) slider.getMaximum();
		float sliderWidth = (float) slider.getWidth();
		float sliderOffset = (float) slider.getX();
		float transValue = hitValue/resolution * sliderWidth + sliderOffset;
		//BOT makes a guess
		Random random = new Random();
		//use the hit box bound as reference
		gameHandler.getDifficulty();
		//compare slider value to left bound and right bound
		
		
		
	}
	
}
