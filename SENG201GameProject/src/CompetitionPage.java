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
	
	private JLabel lblScore_1_2;
	private JLabel lblScore_3;
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
	private int playerWon = 0;
	
	private JLabel lblScore;
	private JLabel lblScore_2;
	private JLabel lblScore_1;
	private JLabel lblScore_1_1;
	
	private Timer timer2 = new Timer(200, e -> {
		if(turn == 2) {
			System.out.println("giliran bot oi!");
			btnNewButton.setVisible(false);
			BOTMove();
		}else if(turn == 1) {
			btnNewButton.setVisible(true);
		}
		if(playerWon == 2) {
			// player won
		}else if(playerWon == 1 && round == 2){
			isExtended = true;
		}
		System.out.println(playerWon == 1 && round == 2);
		panel_3_3_2.setVisible(isExtended);
		panel_3_1_2_2.setVisible(isExtended);
	});;
	private int counter  = 0; 
	
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
	
	/**
     * Hides the Competition Page.
     */
	public void hidePage() {
		frmBattleGroundPage.setVisible(false);
	}
	
	/**
     * Shows the Competition Page.
     */
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
		btnNewButton_1.setBounds(24, 19, 51, 29);
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
				lblScore_3.setText(Integer.toString(gamePointPlayer_3));
				lblScore_1_2.setText(Integer.toString(gamePointBOT_3));
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
		
		lblScore_3 = new JLabel("0");
		lblScore_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblScore_3.setBounds(0, 6, 52, 26);
		panel_3_3_2.add(lblScore_3);
		
		panel_3_1_2_2 = new JPanel();
		panel_3_1_2_2.setLayout(null);
		panel_3_1_2_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3_1_2_2.setBounds(379, 55, 52, 38);
		frmBattleGroundPage.getContentPane().add(panel_3_1_2_2);
		lblScore_1_2 = new JLabel("0");
		lblScore_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblScore_1_2.setBounds(0, 6, 52, 26);
		panel_3_1_2_2.add(lblScore_1_2);
	}
	/**
	 * This method is called when the game screen appears. It initializes the game variables and updates the UI components accordingly.
	 */
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
	
	/**
	 * Performs a specific action based on the current state of the slider value.
	 * The slider value is incremented or decremented based on the current state,
	 * and the slider UI component is updated accordingly.
	 */
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
	
	/**
	 * Randomizes the hit box position and width based on the provided percentage and a random position.
	 * The hit box width is calculated based on the percentage and a maximum range.
	 * The hit box position is adjusted to fit within the boundaries of the slider.
	 *
	 * @param percent The percentage value determining the width of the hit box.
	 * @param ranPos  The random position to set the hit box.
	 */
	public void randomizeHitBox(float percent, int ranPos){
		float maxRange = slider.getWidth() * 0.25f;
		int tempHitBoxWidth = (int) Math.max((percent * maxRange),50);
		int tempHitBoxRightBound = ranPos + tempHitBoxWidth;
		tempHitBoxRightBound = Math.min(tempHitBoxRightBound, 650);
		int tempHitBoxLeftBound = tempHitBoxRightBound - tempHitBoxWidth;
		tempHitBoxLeftBound = Math.max(tempHitBoxLeftBound,32);
		btnNewButton_1.setBounds(tempHitBoxLeftBound,btnNewButton_1.getY(),tempHitBoxWidth,btnNewButton_1.getHeight());
	}
	
	/**
	 * Recalculates the boundaries of the hit box based on the current position and width of the hit box button.
	 * The hit box boundaries are used to determine if the player's hit was successful.
	 */
	public void recalculateHitBoxBound() {
		hitBoxLeftBound = btnNewButton_1.getX();
		hitBoxWidth = btnNewButton_1.getWidth();
		hitBoxRightBound = hitBoxLeftBound + hitBoxWidth;
	}
	
	/**
	 * Checks if the game is in a deuce situation.
	 * Deuce occurs when both players reach a score of 20 or more in the current round.
	 *
	 * @return true if the game is in a deuce situation, false otherwise.
	 */
	public boolean isDeuce() {
		if(round == 1) {
			return gamePointBOT_1 >= 20 && gamePointPlayer_1 >= 20;
		}else if (round == 2) {
			return gamePointBOT_2 >= 20 && gamePointPlayer_2 >= 20;
		}else {
			return gamePointBOT_3 >= 20 && gamePointPlayer_3 >= 20;
		}
	}
	
	/**
	 * Updates the player's points based on the current round and score.
	 * If the player wins the round, the round count is incremented and the player's win count is updated.
	 */
	public void updatePointPlayer() {
		if(round == 1) {
			gamePointPlayer_1 += 1;
			if (gamePointBOT_1 <= 19 && gamePointPlayer_1 == 21) {
				round += 1;
				playerWon += 1;
			}
			else if (isDeuce() && (gamePointPlayer_1 - gamePointBOT_1 == 2)) {
				round += 1;
				playerWon += 1;
			}
		}else if(round == 2) {
			gamePointPlayer_2 += 1;
			if (gamePointBOT_2 <= 19 && gamePointPlayer_2 == 21) {
				round += 1;
				playerWon += 1;
			}
			else if (isDeuce() && (gamePointPlayer_2 - gamePointBOT_2 == 2)) {
				round += 1;
				playerWon += 1;
			}
		}else if(round == 3) {
			gamePointPlayer_3 += 1;
			if (gamePointBOT_3 <= 19 && gamePointPlayer_3 == 21) {
				round += 1;
				playerWon += 1;
			}
			else if (isDeuce() && (gamePointPlayer_3 - gamePointBOT_3 == 2)) {
				round += 1;
				playerWon += 1;
			}
		}

	}
	
	/**
	 * Updates the BOT's points based on the current round and score.
	 * If the BOT wins the round, the round count is incremented.
	 */
	public void updatePointBOT() {
		if(round == 1) {
			gamePointBOT_1 += 1;
			if (gamePointPlayer_1 <= 19 && gamePointBOT_1 == 21) {
				round += 1;
			}
		}else if(round == 2) {
			gamePointBOT_2 += 1;
			if (gamePointPlayer_2 <= 19 && gamePointBOT_2 == 21) {
				round += 1;
			}
		}else if(round == 3) {
			gamePointBOT_3 += 1;
			if (gamePointPlayer_3 <= 19 && gamePointBOT_3 == 21) {
				round += 1;
			}
		}
	}
	
	/**
	 * Simulates the BOT's move in the game.
	 * This method is called when it's the BOT's turn to hit the ball.
	 */
	public void BOTMove() {
		Match tempMatch = gameHandler.getMatchHistory().get(gameHandler.getMatchHistory().size()-1);
		float diff = tempMatch.getDifficulty();
		
		float defendP1 = gameHandler.getPlayerTeam().getMembers().get(0).getDefense();
		float defendP2 = gameHandler.getPlayerTeam().getMembers().get(1).getDefense();
		float totalDef = defendP1 + defendP2;
		
		float offset = 50 * (totalDef/200f);
		//get all info of hit box
		int hitBoxLeftBoundBOT = btnNewButton_1.getX() - (int) offset;
		int hitBoxRightBoundBOT = hitBoxLeftBoundBOT + (int) offset;
		
		//BOT makes a guess
		Random random = new Random();
		//use the hit box bound as reference
		float randInt = random.nextInt(hitBoxRightBoundBOT - hitBoxLeftBoundBOT + 1) + hitBoxLeftBoundBOT;
		
		if(randInt >= hitBoxLeftBound && randInt <= hitBoxRightBound && counter <= 5) {
			updatePointBOT();
			counter++;
			System.out.println("BOT dapet point!");
		}else {
			turn = 1;
			counter = 0;
			updatePointPlayer(); 
			System.out.println("giliran player oi!");
		}
		//updateScore
		lblScore.setText(Integer.toString(gamePointPlayer_1));
		lblScore_2.setText(Integer.toString(gamePointPlayer_2));
		lblScore_1.setText(Integer.toString(gamePointBOT_1));
		lblScore_1_1.setText(Integer.toString(gamePointBOT_2));
		lblScore_3.setText(Integer.toString(gamePointPlayer_3));
		lblScore_1_2.setText(Integer.toString(gamePointBOT_3));
	}
}
