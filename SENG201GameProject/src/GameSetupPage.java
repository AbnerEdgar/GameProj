import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.JProgressBar;
import javax.swing.JSlider;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import javax.swing.JDesktopPane;
import javax.swing.JToolBar;
import javax.swing.JPanel;
import javax.swing.JFormattedTextField;
import javax.swing.border.LineBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JInternalFrame;

public class GameSetupPage {

	private JFrame frmGameSetup;
	private JTextField textField;
	private boolean isWithinFormat;
	private GameHandler gameHandler;
	private int selectedAthlete;
	private int selectedFrame;
	private JButton btnNewButton_3;
	private JButton btnAthlete_4;
	private JButton btnAthlete_1_3;
	private JButton btnNewButton_3_1;
	private JProgressBar progressBar_3;
	private JProgressBar progressBar_1_1;
	private JProgressBar progressBar_2_1;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_6_1;
	private JLabel lblNewLabel_6_2;
	private JComboBox comboBox_1;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameHandler gameHandler = new GameHandler();
					GameSetupPage window = new GameSetupPage(gameHandler);
					window.frmGameSetup.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GameSetupPage(GameHandler gameHandler) {
		this.gameHandler = gameHandler;
		initialize();
		isWithinFormat = false;
		
	}
	
	public void hidePage() {
		frmGameSetup.setVisible(false);
	}
	public void showPage() {
		frmGameSetup.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	private void initialize() {
		selectedFrame = 0;
		frmGameSetup = new JFrame();
		frmGameSetup.getContentPane().setFont(new Font("Dialog", Font.PLAIN, 16));
		frmGameSetup.getContentPane().setBackground(new Color(176, 196, 222));
		frmGameSetup.setBackground(new Color(238, 238, 238));
		frmGameSetup.setTitle((gameHandler.getAppName()+"(Setup Page)"));
		frmGameSetup.setBounds(100, 100, 664, 614);
		frmGameSetup.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGameSetup.setLocationRelativeTo(null);
		frmGameSetup.getContentPane().setLayout(null);
		frmGameSetup.setResizable(false);
		
		JLabel lblNewLabel = new JLabel("Welcome to badminton tournament!");
		lblNewLabel.setFont(new Font("Futura", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(6, 6, 627, 32);
		frmGameSetup.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter your team name:");
		lblNewLabel_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(34, 67, 186, 22);
		frmGameSetup.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Futura", Font.PLAIN, 12));
		textField.setHorizontalAlignment(SwingConstants.LEFT);
		textField.setBounds(223, 63, 218, 29);
		frmGameSetup.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("*Length must be 3 - 15 letters & no symbols.*");
		lblNewLabel_2.setForeground(new Color(255, 29, 0));
		lblNewLabel_2.setVisible(isWithinFormat);
		lblNewLabel_2.setFont(new Font("Futura", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(223, 50, 255, 16);
		frmGameSetup.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Difficulty:");
		lblNewLabel_3.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(34, 132, 142, 20);
		frmGameSetup.getContentPane().add(lblNewLabel_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Futura", Font.PLAIN, 14));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Easy", "Medium", "Hard"}));
		comboBox.setMaximumRowCount(3);
		comboBox.setBounds(223, 130, 142, 22);
		frmGameSetup.getContentPane().add(comboBox);
		
		JLabel lblNewLabel_4 = new JLabel("Season Duration:");
		lblNewLabel_4.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblNewLabel_4.setBounds(33, 103, 148, 16);
		frmGameSetup.getContentPane().add(lblNewLabel_4);
		
		JSlider slider = new JSlider();
		slider.setFont(new Font("SF Pro Rounded", Font.PLAIN, 16));
		slider.setForeground(new Color(255, 112, 0));
		slider.setValue(5);
		slider.setSnapToTicks(true);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		slider.setMinimum(5);
		slider.setMinorTickSpacing(5);
		slider.setMaximum(15);
		slider.setBounds(223, 97, 218, 22);
		frmGameSetup.getContentPane().add(slider);
		
		JLabel lblNewLabel_5 = new JLabel("Available Athletes:");
		lblNewLabel_5.setFont(new Font("SF Pro Rounded", Font.PLAIN, 16));
		lblNewLabel_5.setBounds(34, 376, 148, 16);
		frmGameSetup.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_13 = new JLabel("Starting Athletes:");
		lblNewLabel_13.setFont(new Font("SF Pro Rounded", Font.PLAIN, 16));
		lblNewLabel_13.setBounds(34, 237, 136, 22);
		frmGameSetup.getContentPane().add(lblNewLabel_13);
		
		JButton btnNewButton = new JButton(gameHandler.getAthletes().get(0).getName());
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("SF Pro Rounded", Font.PLAIN, 11));
		btnNewButton.setBounds(29, 404, 68, 68);
		frmGameSetup.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				selectedAthlete = 0;
				changeCard(gameHandler.getAthletes().get(selectedAthlete));
			}
		});
		
		JButton btnAthlete = new JButton(gameHandler.getAthletes().get(1).getName());
		btnAthlete.setFont(new Font("SF Pro Rounded", Font.PLAIN, 11));
		btnAthlete.setBounds(184, 404, 68, 68);
		frmGameSetup.getContentPane().add(btnAthlete);
		btnAthlete.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				selectedAthlete = 1;
				changeCard(gameHandler.getAthletes().get(selectedAthlete));
			}
		});
		
		JButton btnAthlete_1 = new JButton(gameHandler.getAthletes().get(2).getName());
		btnAthlete_1.setFont(new Font("SF Pro Rounded", Font.PLAIN, 11));
		btnAthlete_1.setBounds(106, 404, 68, 68);
		frmGameSetup.getContentPane().add(btnAthlete_1);
		btnAthlete_1.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				selectedAthlete = 2;
				changeCard(gameHandler.getAthletes().get(selectedAthlete));
			}
		});
		
		JButton btnNewButton_1 = new JButton(gameHandler.getAthletes().get(3).getName());
		btnNewButton_1.setFont(new Font("SF Pro Rounded", Font.PLAIN, 11));
		btnNewButton_1.setBounds(264, 404, 68, 68);
		frmGameSetup.getContentPane().add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				selectedAthlete = 3;
				changeCard(gameHandler.getAthletes().get(selectedAthlete));
			}
		});
		
		JButton btnAthlete_2 = new JButton(gameHandler.getAthletes().get(4).getName());
		btnAthlete_2.setFont(new Font("SF Pro Rounded", Font.PLAIN, 11));
		btnAthlete_2.setBounds(28, 479, 68, 68);
		frmGameSetup.getContentPane().add(btnAthlete_2);
		btnAthlete_2.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				selectedAthlete = 4;
				changeCard(gameHandler.getAthletes().get(selectedAthlete));
			}
		});
		
		JButton btnAthlete_1_1 = new JButton(gameHandler.getAthletes().get(5).getName());
		btnAthlete_1_1.setFont(new Font("SF Pro Rounded", Font.PLAIN, 11));
		btnAthlete_1_1.setBounds(106, 479, 68, 68);
		frmGameSetup.getContentPane().add(btnAthlete_1_1);
		btnAthlete_1_1.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				selectedAthlete = 5;
				changeCard(gameHandler.getAthletes().get(selectedAthlete));
			}
		});
		
		JButton btnNewButton_2 = new JButton(gameHandler.getAthletes().get(6).getName());
		btnNewButton_2.setFont(new Font("SF Pro Rounded", Font.PLAIN, 11));
		btnNewButton_2.setBounds(184, 479, 68, 68);
		frmGameSetup.getContentPane().add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				selectedAthlete = 6;
				changeCard(gameHandler.getAthletes().get(selectedAthlete));
			}
		});
		
		JButton btnAthlete_3 = new JButton(gameHandler.getAthletes().get(7).getName());
		btnAthlete_3.setFont(new Font("SF Pro Rounded", Font.PLAIN, 11));
		btnAthlete_3.setBounds(264, 479, 68, 68);
		frmGameSetup.getContentPane().add(btnAthlete_3);
		btnAthlete_3.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				selectedAthlete = 7;
				changeCard(gameHandler.getAthletes().get(selectedAthlete));
			}
		});
		
		btnNewButton_3 = new JButton(gameHandler.getSelectedAthlete(0).getName());
		btnNewButton_3.setFont(new Font("SF Pro Rounded", Font.PLAIN, 11));
		btnNewButton_3.setBounds(29, 266, 75, 75);
		frmGameSetup.getContentPane().add(btnNewButton_3);
		btnNewButton_3.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				selectedFrame = 0;
				changeCard(gameHandler.getSelectedAthlete(selectedFrame));
			}
		});
		
		btnAthlete_4 = new JButton(gameHandler.getSelectedAthlete(1).getName());
		btnAthlete_4.setFont(new Font("SF Pro Rounded", Font.PLAIN, 11));
		btnAthlete_4.setBounds(105, 266, 75, 75);
		frmGameSetup.getContentPane().add(btnAthlete_4);
		btnAthlete_4.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				selectedFrame = 1;
				changeCard(gameHandler.getSelectedAthlete(selectedFrame));
			}
		});
		
		btnAthlete_1_3 = new JButton(gameHandler.getSelectedAthlete(2).getName());
		btnAthlete_1_3.setFont(new Font("SF Pro Rounded", Font.PLAIN, 11));
		btnAthlete_1_3.setBackground(new Color(240, 255, 240));
		btnAthlete_1_3.setBounds(182, 266, 75, 75);
		frmGameSetup.getContentPane().add(btnAthlete_1_3);
		btnAthlete_1_3.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				selectedFrame = 2;
				changeCard(gameHandler.getSelectedAthlete(selectedFrame));
			}
		});
		
		btnNewButton_3_1 = new JButton(gameHandler.getSelectedAthlete(3).getName());
		btnNewButton_3_1.setFont(new Font("SF Pro Rounded", Font.PLAIN, 11));
		btnNewButton_3_1.setBounds(257, 266, 75, 75);
		frmGameSetup.getContentPane().add(btnNewButton_3_1);
		btnNewButton_3_1.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				selectedFrame = 3;
				changeCard(gameHandler.getSelectedAthlete(selectedFrame));
			}
		});
		
		JButton btnNewButton_5 = new JButton("Start Game");
		btnNewButton_5.setBackground(new Color(102, 102, 204));
		btnNewButton_5.setFont(new Font("Futura", Font.PLAIN, 14));
		btnNewButton_5.setBounds(444, 63, 178, 32);
		frmGameSetup.getContentPane().add(btnNewButton_5);
		btnNewButton_5.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				isWithinFormat = textField.getText().length() > 13 || textField.getText().length() < 3 ? false : true;
				lblNewLabel_2.setVisible(!isWithinFormat);
				boolean isMemberSelected = false;
				for(Athlete athlete: gameHandler.getSelectedAthletes()) {
					if(!athlete.getName().equals("")){
						isMemberSelected = true;
					}else {
						isMemberSelected = false;
					}
				}
				if(isWithinFormat && isMemberSelected) {
					gameHandler.setPage(2);
					gameHandler.setDifficulty(comboBox.getSelectedIndex()+1);
					if(gameHandler.getDifficulty() == 1) {
						gameHandler.setMinBotLevel(1);
						gameHandler.setMaxBotLevel(3);
					}else if(gameHandler.getDifficulty() == 2) {
						gameHandler.setMinBotLevel(4);
						gameHandler.setMaxBotLevel(6);
					}else if(gameHandler.getDifficulty() == 3) {
						gameHandler.setMinBotLevel(7);
						gameHandler.setMaxBotLevel(9);
					}
					gameHandler.setRemainingWeek(slider.getValue()-1);
					gameHandler.setCurrentWeek(1);
					gameHandler.setNationality(comboBox_1.getSelectedItem().toString());
					gameHandler.setTeamName(textField.getText());
					gameHandler.setGameLoss(0);
					gameHandler.setGameWon(0);
					gameHandler.generateTeam(new Team(gameHandler.getTeamName(),gameHandler.getNationality(),gameHandler.getSelectedAthletes()));
					//Get the remaining player that are not chosen to be sold at the market.
					int count = 0;
					while(count < gameHandler.getAthletes().size()-1) {
						if(gameHandler.getAthletes().get(count).equals(gameHandler.getSelectedAthlete(0))) {
						}else if (gameHandler.getAthletes().get(count).equals(gameHandler.getSelectedAthlete(1))) {
						}else if (gameHandler.getAthletes().get(count).equals(gameHandler.getSelectedAthlete(2))) {
						}else if (gameHandler.getAthletes().get(count).equals(gameHandler.getSelectedAthlete(3))) {
						}else {
							//whilst they are not equal to the 4 selected athlete at the start, then put them to market
							gameHandler.getMarketAthletes().add(gameHandler.getAthletes().get(count));
						}
						count++;
					}
					GameMaster.showSelectedPage(gameHandler.getPage());
				}
			}
		});
		
		JSeparator separator = new JSeparator();
		separator.setBounds(68, 319, 247, -22);
		frmGameSetup.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(28, 353, 304, 12);
		frmGameSetup.getContentPane().add(separator_1);
		
		JLabel lblNewLabel_14 = new JLabel("Nationality:");
		lblNewLabel_14.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblNewLabel_14.setBounds(34, 166, 186, 24);
		frmGameSetup.getContentPane().add(lblNewLabel_14);
		
		JInternalFrame internalFrame = new JInternalFrame("Profile");
		internalFrame.setBackground(new Color(192, 192, 192));
		internalFrame.setForeground(new Color(255, 255, 255));
		internalFrame.getContentPane().setFont(new Font("Dialog", Font.PLAIN, 13));
		internalFrame.setBounds(364, 216, 279, 352);
		frmGameSetup.getContentPane().add(internalFrame);
		internalFrame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_7_1 = new JLabel("Name: ");
		lblNewLabel_7_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblNewLabel_7_1.setBounds(31, 18, 55, 20);
		internalFrame.getContentPane().add(lblNewLabel_7_1);
		
		JLabel lblNewLabel_8_1 = new JLabel("Age:");
		lblNewLabel_8_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblNewLabel_8_1.setBounds(31, 44, 68, 20);
		internalFrame.getContentPane().add(lblNewLabel_8_1);
		
		JLabel lblNewLabel_9_1 = new JLabel("Height:");
		lblNewLabel_9_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblNewLabel_9_1.setBounds(31, 70, 61, 20);
		internalFrame.getContentPane().add(lblNewLabel_9_1);
		
		JLabel lblNewLabel_10_1 = new JLabel("Durability:");
		lblNewLabel_10_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblNewLabel_10_1.setBounds(31, 112, 94, 20);
		internalFrame.getContentPane().add(lblNewLabel_10_1);
		
		progressBar_3 = new JProgressBar();
		progressBar_3.setBounds(29, 134, 197, 20);
		internalFrame.getContentPane().add(progressBar_3);
		
		JLabel lblNewLabel_11_1 = new JLabel("Attack:");
		lblNewLabel_11_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblNewLabel_11_1.setBounds(31, 154, 61, 20);
		internalFrame.getContentPane().add(lblNewLabel_11_1);
		
		progressBar_1_1 = new JProgressBar();
		progressBar_1_1.setBounds(29, 174, 197, 20);
		internalFrame.getContentPane().add(progressBar_1_1);
		
		JLabel lblNewLabel_12_1 = new JLabel("Defense:");
		lblNewLabel_12_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblNewLabel_12_1.setBounds(31, 198, 100, 20);
		internalFrame.getContentPane().add(lblNewLabel_12_1);
		
		progressBar_2_1 = new JProgressBar();
		progressBar_2_1.setBounds(31, 217, 191, 20);
		internalFrame.getContentPane().add(progressBar_2_1);
		
		JButton btnNewButton_4_1 = new JButton("Select");
		btnNewButton_4_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnNewButton_4_1.setBounds(29, 252, 205, 29);
		internalFrame.getContentPane().add(btnNewButton_4_1);
		
		lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setBounds(101, 21, 83, 16);
		internalFrame.getContentPane().add(lblNewLabel_6);
		
		lblNewLabel_6_1 = new JLabel("");
		lblNewLabel_6_1.setBounds(101, 47, 83, 16);
		internalFrame.getContentPane().add(lblNewLabel_6_1);
		
		lblNewLabel_6_2 = new JLabel("");
		lblNewLabel_6_2.setBounds(101, 73, 83, 16);
		internalFrame.getContentPane().add(lblNewLabel_6_2);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Futura", Font.PLAIN, 12));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"INA", "JPN", "NZL", "USA", "MYS", "DNK", "IND", "KOR", "SGP", "CHN"}));
		comboBox_1.setBounds(223, 167, 208, 27);
		frmGameSetup.getContentPane().add(comboBox_1);
		internalFrame.setVisible(true);
		btnNewButton_4_1.addActionListener(new ActionListener() {
			   @Override 
			   public void actionPerformed(ActionEvent e) {
			    gameHandler.addSelectedAthlete(gameHandler.getAthletes().get(selectedAthlete),selectedFrame);
			    refreshSelected();
			   }
			  });
	}
	
	public void changeCard(Athlete athlete) {
		lblNewLabel_6.setText(athlete.getName());
		lblNewLabel_6_1.setText(Integer.toString(athlete.getage()));
		lblNewLabel_6_2.setText(Float.toString(athlete.getheight())+" cm");
		progressBar_3.setValue((int) athlete.getOffense());
		progressBar_1_1.setValue((int) athlete.getDefense());
		progressBar_2_1.setValue((int) athlete.getStamina());
	}
	
	public void refreshSelected() {
		btnNewButton_3.setText(gameHandler.getSelectedAthlete(0).getName());
		btnAthlete_4.setText(gameHandler.getSelectedAthlete(1).getName());
		btnAthlete_1_3.setText(gameHandler.getSelectedAthlete(2).getName());
		btnNewButton_3_1.setText(gameHandler.getSelectedAthlete(3).getName());
		int i = 0;
		while(i < 4) {
			if(gameHandler.getSelectedAthlete(i).getName().equals("")) {
				selectedFrame = i;
				break;
			}
			i++;
		}
	}
}
