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
	private GameHandler gameHandler;
	private boolean isWithinFormat;
	private int selectedAthlete;
	private int selectedFrame;

	private JTextField textField;

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
	
	/**
     * Hides the Club Page.
     */
	public void hidePage() {
		frmGameSetup.setVisible(false);
	}
	
	/**
     * Shows the Club Page.
     */
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
		frmGameSetup.setBounds(100, 100, 886, 537);
		frmGameSetup.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGameSetup.setLocationRelativeTo(null);
		frmGameSetup.getContentPane().setLayout(null);
		frmGameSetup.setResizable(false);
		
		JLabel lblNewLabel_1 = new JLabel("Team Name:");
		lblNewLabel_1.setFont(new Font("Futura", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(26, 75, 111, 22);
		frmGameSetup.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("Difficulty:");
		lblNewLabel_3.setFont(new Font("Futura", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(26, 257, 142, 20);
		frmGameSetup.getContentPane().add(lblNewLabel_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Futura", Font.PLAIN, 14));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Easy", "Medium", "Hard"}));
		comboBox.setMaximumRowCount(3);
		comboBox.setBounds(26, 289, 142, 22);
		frmGameSetup.getContentPane().add(comboBox);
		
		JLabel lblNewLabel_4 = new JLabel("Season Duration:");
		lblNewLabel_4.setFont(new Font("Futura", Font.PLAIN, 16));
		lblNewLabel_4.setBounds(26, 342, 174, 28);
		frmGameSetup.getContentPane().add(lblNewLabel_4);
		
		JButton btnNewButton_5 = new JButton("CONTINUE");
		btnNewButton_5.setBackground(new Color(102, 102, 204));
		btnNewButton_5.setFont(new Font("Futura", Font.PLAIN, 13));
		btnNewButton_5.setBounds(687, 460, 178, 32);
		frmGameSetup.getContentPane().add(btnNewButton_5);
		/**
		 * ActionListener for the button btnNewButton_5.
		 * Validates input, updates game settings, and generates the team.
		 * Shows the selected page if input is valid.
		 */
		btnNewButton_5.addActionListener(new ActionListener() {
			 @Override
			 public void actionPerformed(ActionEvent e) {
			        isWithinFormat = textField.getText().length() > 13 || textField.getText().length() < 3 ? false : true;
			        lblNewLabel_2.setVisible(!isWithinFormat);
			        boolean isMemberSelected = false;
			        for (Athlete athlete : gameHandler.getSelectedAthletes()) {
			            if (!athlete.getName().equals("")) {
			                isMemberSelected = true;
			            } else {
			                isMemberSelected = false;
			            }
			        }
			        if (isWithinFormat && isMemberSelected) {
			            gameHandler.setPage(2);
			            gameHandler.setDifficulty(comboBox.getSelectedIndex() + 1);
			            if (gameHandler.getDifficulty() == 1) {
			                gameHandler.setMinBotLevel(1);
			                gameHandler.setMaxBotLevel(3);
			            } else if (gameHandler.getDifficulty() == 2) {
			                gameHandler.setMinBotLevel(4);
			                gameHandler.setMaxBotLevel(6);
			            } else if (gameHandler.getDifficulty() == 3) {
			                gameHandler.setMinBotLevel(7);
			                gameHandler.setMaxBotLevel(9);
			            }
			            gameHandler.setRemainingWeek(slider.getValue() - 1);
			            gameHandler.setCurrentWeek(1);
			            gameHandler.setNationality(comboBox_1.getSelectedItem().toString());
			            gameHandler.setTeamName(textField.getText());
			            gameHandler.setGameLoss(0);
			            gameHandler.setGameWon(0);
			            gameHandler.generateTeam(new Team(gameHandler.getTeamName(), gameHandler.getNationality(), gameHandler.getSelectedAthletes()));

			            // Get the remaining players that are not chosen to be sold at the market.
			            int count = 0;
			            while (count < gameHandler.getAthletes().size() - 1) {
			                if (gameHandler.getAthletes().get(count).equals(gameHandler.getSelectedAthlete(0))) {
			                } else if (gameHandler.getAthletes().get(count).equals(gameHandler.getSelectedAthlete(1))) {
			                } else if (gameHandler.getAthletes().get(count).equals(gameHandler.getSelectedAthlete(2))) {
			                } else if (gameHandler.getAthletes().get(count).equals(gameHandler.getSelectedAthlete(3))) {
			                } else {
			                    // Put them in the market if they are not equal to the 4 selected athletes.
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
		
		JLabel lblNewLabel_14 = new JLabel("Nationality:");
		lblNewLabel_14.setFont(new Font("Futura", Font.PLAIN, 16));
		lblNewLabel_14.setBounds(26, 171, 186, 24);
		frmGameSetup.getContentPane().add(lblNewLabel_14);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Futura", Font.PLAIN, 12));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"INA", "JPN", "NZL", "USA", "MYS", "DNK", "IND", "KOR", "SGP", "CHN"}));
		comboBox_1.setBounds(26, 204, 208, 27);
		frmGameSetup.getContentPane().add(comboBox_1);
		
		JButton btnNewButton_4 = new JButton("<<");
		btnNewButton_4.setBounds(6, 7, 60, 29);
		frmGameSetup.getContentPane().add(btnNewButton_4);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(176, 196, 222));
		panel.setBounds(26, 94, 254, 52);
		frmGameSetup.getContentPane().add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(0, 6, 218, 29);
		panel.add(textField);
		textField.setFont(new Font("Futura", Font.PLAIN, 12));
		textField.setHorizontalAlignment(SwingConstants.LEFT);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("*Length must be 3 - 15 letters & no symbols.*");
		lblNewLabel_2.setBounds(0, 30, 255, 16);
		panel.add(lblNewLabel_2);
		lblNewLabel_2.setForeground(new Color(255, 29, 0));
		lblNewLabel_2.setVisible(isWithinFormat);
		lblNewLabel_2.setFont(new Font("Futura", Font.PLAIN, 12));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(250, 250, 210));
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(26, 382, 208, 61);
		frmGameSetup.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JSlider slider = new JSlider();
		slider.setBounds(6, 6, 190, 38);
		panel_1.add(slider);
		slider.setFont(new Font("SF Pro Rounded", Font.PLAIN, 16));
		slider.setForeground(new Color(255, 112, 0));
		slider.setValue(5);
		slider.setSnapToTicks(true);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		slider.setMinimum(5);
		slider.setMinorTickSpacing(5);
		slider.setMaximum(15);
		
		JLabel lblNewLabel = new JLabel("5");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(6, 39, 30, 16);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_7 = new JLabel("10");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setBounds(87, 39, 30, 16);
		panel_1.add(lblNewLabel_7);
		
		JLabel lblNewLabel_7_2 = new JLabel("15");
		lblNewLabel_7_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7_2.setBounds(166, 39, 30, 16);
		panel_1.add(lblNewLabel_7_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBackground(new Color(240, 230, 140));
		panel_2.setBounds(292, 75, 573, 367);
		frmGameSetup.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBounds(6, 6, 561, 355);
		panel_2.add(panel_2_1);
		panel_2_1.setBackground(new Color(250, 250, 210));
		panel_2_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2_1.setLayout(null);
		
		JInternalFrame internalFrame = new JInternalFrame("P R O F I L E");
		internalFrame.setBounds(306, 6, 249, 352);
		panel_2_1.add(internalFrame);
		internalFrame.setBackground(new Color(192, 192, 192));
		internalFrame.setForeground(new Color(255, 255, 255));
		internalFrame.getContentPane().setFont(new Font("Dialog", Font.PLAIN, 13));
		internalFrame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_7_1 = new JLabel("Name: ");
		lblNewLabel_7_1.setFont(new Font("Futura", Font.PLAIN, 13));
		lblNewLabel_7_1.setBounds(20, 21, 55, 20);
		internalFrame.getContentPane().add(lblNewLabel_7_1);
		
		JLabel lblNewLabel_8_1 = new JLabel("Age:");
		lblNewLabel_8_1.setFont(new Font("Futura", Font.PLAIN, 13));
		lblNewLabel_8_1.setBounds(20, 47, 68, 20);
		internalFrame.getContentPane().add(lblNewLabel_8_1);
		
		JLabel lblNewLabel_9_1 = new JLabel("Height:");
		lblNewLabel_9_1.setFont(new Font("Futura", Font.PLAIN, 13));
		lblNewLabel_9_1.setBounds(20, 73, 61, 20);
		internalFrame.getContentPane().add(lblNewLabel_9_1);
		
		JLabel lblNewLabel_10_1 = new JLabel("Durability:");
		lblNewLabel_10_1.setFont(new Font("Futura", Font.PLAIN, 13));
		lblNewLabel_10_1.setBounds(20, 115, 94, 20);
		internalFrame.getContentPane().add(lblNewLabel_10_1);
		
		progressBar_3 = new JProgressBar();
		progressBar_3.setBounds(18, 137, 175, 20);
		internalFrame.getContentPane().add(progressBar_3);
		
		JLabel lblNewLabel_11_1 = new JLabel("Attack:");
		lblNewLabel_11_1.setFont(new Font("Futura", Font.PLAIN, 13));
		lblNewLabel_11_1.setBounds(20, 157, 61, 20);
		internalFrame.getContentPane().add(lblNewLabel_11_1);
		
		progressBar_1_1 = new JProgressBar();
		progressBar_1_1.setBounds(18, 177, 175, 20);
		internalFrame.getContentPane().add(progressBar_1_1);
		
		JLabel lblNewLabel_12_1 = new JLabel("Defense:");
		lblNewLabel_12_1.setFont(new Font("Futura", Font.PLAIN, 13));
		lblNewLabel_12_1.setBounds(20, 201, 100, 20);
		internalFrame.getContentPane().add(lblNewLabel_12_1);
		
		progressBar_2_1 = new JProgressBar();
		progressBar_2_1.setBounds(20, 220, 173, 20);
		internalFrame.getContentPane().add(progressBar_2_1);
		
		JButton btnNewButton_4_1 = new JButton("Select");
		btnNewButton_4_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnNewButton_4_1.setBounds(18, 255, 190, 29);
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
		
		JLabel lblNewLabel_5 = new JLabel("Recruit athletes for your new team!");
		lblNewLabel_5.setBounds(33, 33, 261, 16);
		panel_2_1.add(lblNewLabel_5);
		lblNewLabel_5.setFont(new Font("Futura", Font.ITALIC, 16));
		
		JButton btnNewButton = new JButton(gameHandler.getAthletes().get(0).getName());
		btnNewButton.setBounds(28, 75, 68, 68);
		panel_2_1.add(btnNewButton);
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("SF Pro Rounded", Font.PLAIN, 11));
		
		JButton btnAthlete_1 = new JButton(gameHandler.getAthletes().get(2).getName());
		btnAthlete_1.setBounds(94, 75, 68, 68);
		panel_2_1.add(btnAthlete_1);
		btnAthlete_1.setFont(new Font("SF Pro Rounded", Font.PLAIN, 11));
		
		JButton btnAthlete = new JButton(gameHandler.getAthletes().get(1).getName());
		btnAthlete.setBounds(160, 75, 68, 68);
		panel_2_1.add(btnAthlete);
		btnAthlete.setFont(new Font("SF Pro Rounded", Font.PLAIN, 11));
		
		JButton btnNewButton_1 = new JButton(gameHandler.getAthletes().get(3).getName());
		btnNewButton_1.setBounds(226, 75, 68, 68);
		panel_2_1.add(btnNewButton_1);
		btnNewButton_1.setFont(new Font("SF Pro Rounded", Font.PLAIN, 11));
		
		JButton btnAthlete_2 = new JButton(gameHandler.getAthletes().get(4).getName());
		btnAthlete_2.setBounds(28, 140, 68, 68);
		panel_2_1.add(btnAthlete_2);
		btnAthlete_2.setFont(new Font("SF Pro Rounded", Font.PLAIN, 11));
		
		JButton btnAthlete_1_1 = new JButton(gameHandler.getAthletes().get(5).getName());
		btnAthlete_1_1.setBounds(94, 140, 68, 68);
		panel_2_1.add(btnAthlete_1_1);
		btnAthlete_1_1.setFont(new Font("SF Pro Rounded", Font.PLAIN, 11));
		
		JButton btnNewButton_2 = new JButton(gameHandler.getAthletes().get(6).getName());
		btnNewButton_2.setBounds(160, 140, 68, 68);
		panel_2_1.add(btnNewButton_2);
		btnNewButton_2.setFont(new Font("SF Pro Rounded", Font.PLAIN, 11));
		
		JButton btnAthlete_3 = new JButton(gameHandler.getAthletes().get(7).getName());
		btnAthlete_3.setBounds(226, 140, 68, 68);
		panel_2_1.add(btnAthlete_3);
		btnAthlete_3.setFont(new Font("SF Pro Rounded", Font.PLAIN, 11));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBackground(new Color(255, 255, 224));
		panel_3.setBounds(24, 220, 278, 117);
		panel_2_1.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_13 = new JLabel("SELECTED ATHLETES:");
		lblNewLabel_13.setBounds(11, 6, 183, 22);
		panel_3.add(lblNewLabel_13);
		lblNewLabel_13.setFont(new Font("Futura", Font.PLAIN, 16));
		
		btnNewButton_3 = new JButton(gameHandler.getSelectedAthlete(0).getName());
		btnNewButton_3.setBounds(6, 40, 68, 68);
		panel_3.add(btnNewButton_3);
		btnNewButton_3.setFont(new Font("SF Pro Rounded", Font.PLAIN, 11));
		
		btnAthlete_4 = new JButton(gameHandler.getSelectedAthlete(1).getName());
		btnAthlete_4.setBounds(72, 40, 68, 68);
		panel_3.add(btnAthlete_4);
		btnAthlete_4.setFont(new Font("SF Pro Rounded", Font.PLAIN, 11));
		
		btnAthlete_1_3 = new JButton(gameHandler.getSelectedAthlete(2).getName());
		btnAthlete_1_3.setBounds(138, 40, 68, 68);
		panel_3.add(btnAthlete_1_3);
		btnAthlete_1_3.setFont(new Font("SF Pro Rounded", Font.PLAIN, 11));
		btnAthlete_1_3.setBackground(new Color(240, 255, 240));
		
		btnNewButton_3_1 = new JButton(gameHandler.getSelectedAthlete(3).getName());
		btnNewButton_3_1.setBounds(204, 40, 68, 68);
		panel_3.add(btnNewButton_3_1);
		btnNewButton_3_1.setFont(new Font("SF Pro Rounded", Font.PLAIN, 11));
		
		JLabel lblNewLabel_8 = new JLabel("Available Athletes:");
		lblNewLabel_8.setFont(new Font("Futura", Font.PLAIN, 13));
		lblNewLabel_8.setBounds(33, 57, 155, 16);
		panel_2_1.add(lblNewLabel_8);
		btnNewButton_3_1.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				selectedFrame = 3;
				changeCard(gameHandler.getSelectedAthlete(selectedFrame));
			}
		});
		btnAthlete_1_3.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				selectedFrame = 2;
				changeCard(gameHandler.getSelectedAthlete(selectedFrame));
			}
		});
		btnAthlete_4.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				selectedFrame = 1;
				changeCard(gameHandler.getSelectedAthlete(selectedFrame));
			}
		});
		btnNewButton_3.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				selectedFrame = 0;
				changeCard(gameHandler.getSelectedAthlete(selectedFrame));
			}
		});
		btnAthlete_3.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				selectedAthlete = 7;
				changeCard(gameHandler.getAthletes().get(selectedAthlete));
			}
		});
		btnNewButton_2.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				selectedAthlete = 6;
				changeCard(gameHandler.getAthletes().get(selectedAthlete));
			}
		});
		btnAthlete_1_1.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				selectedAthlete = 5;
				changeCard(gameHandler.getAthletes().get(selectedAthlete));
			}
		});
		btnAthlete_2.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				selectedAthlete = 4;
				changeCard(gameHandler.getAthletes().get(selectedAthlete));
			}
		});
		btnNewButton_1.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				selectedAthlete = 3;
				changeCard(gameHandler.getAthletes().get(selectedAthlete));
			}
		});
		btnAthlete.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				selectedAthlete = 1;
				changeCard(gameHandler.getAthletes().get(selectedAthlete));
			}
		});
		btnAthlete_1.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				selectedAthlete = 2;
				changeCard(gameHandler.getAthletes().get(selectedAthlete));
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				selectedAthlete = 0;
				changeCard(gameHandler.getAthletes().get(selectedAthlete));
			}
		});
		internalFrame.setVisible(true);
		btnNewButton_4_1.addActionListener(new ActionListener() {
			   @Override 
			   public void actionPerformed(ActionEvent e) {
			    gameHandler.addSelectedAthlete(gameHandler.getAthletes().get(selectedAthlete),selectedFrame);
			    refreshSelected();
			   }
			  });
	}
	
	/**
	 * Updates the athlete card with the information of the specified athlete.
	 *
	 * @param athlete The athlete object containing the information to be displayed.
	 */
	public void changeCard(Athlete athlete) {
		lblNewLabel_6.setText(athlete.getName());
		lblNewLabel_6_1.setText(Integer.toString(athlete.getAge()));
		lblNewLabel_6_2.setText(Float.toString(athlete.getHeight())+" cm");
		progressBar_3.setValue((int) athlete.getOffense());
		progressBar_1_1.setValue((int) athlete.getDefense());
		progressBar_2_1.setValue((int) athlete.getStamina());
	}
	
	/**
	 * Refreshes the selected athletes' names on the buttons.
	 * Also updates the selectedFrame value based on the first empty selected athlete.
	 */
	public void refreshSelected() {
		btnNewButton_3.setText(gameHandler.getSelectedAthlete(0).getName());
		btnAthlete_4.setText(gameHandler.getSelectedAthlete(1).getName());
		btnAthlete_1_3.setText(gameHandler.getSelectedAthlete(2).getName());
		btnNewButton_3_1.setText(gameHandler.getSelectedAthlete(3).getName());
		for (int i = 0; i < 4; i++) {
		    if (gameHandler.getSelectedAthlete(i).getName().isEmpty()) {
		        selectedFrame = i;
		        break;
		    }
		}
	}
}
