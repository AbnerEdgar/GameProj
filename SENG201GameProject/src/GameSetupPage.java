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

public class GameSetupPage {

	private JFrame frmGameSetup;
	private JTextField textField;
	private boolean isWithinFormat;
	private GameHandler gameHandler;
	private int selectedAthlete;
	private int selectedFrame;
	
	private JProgressBar progressBar;
	private JProgressBar progressBar_1;
	private JProgressBar progressBar_2;
	private JButton btnNewButton_3;
	private JButton btnAthlete_4;
	private JButton btnAthlete_1_3;
	private JButton btnNewButton_3_1;
	private JButton btnNewButton_4;
	
	
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
		frmGameSetup.getContentPane().setBackground(new Color(228, 228, 228));
		frmGameSetup.setBackground(new Color(238, 238, 238));
		frmGameSetup.setTitle((gameHandler.getAppName()+"(Setup Page)"));
		frmGameSetup.setBounds(100, 100, 635, 614);
		frmGameSetup.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGameSetup.setLocationRelativeTo(null);
		frmGameSetup.getContentPane().setLayout(null);
		frmGameSetup.setResizable(false);
		
		JLabel lblNewLabel = new JLabel("Welcome to badminton tournament!");
		lblNewLabel.setFont(new Font("SF Pro Rounded", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(6, 6, 627, 32);
		frmGameSetup.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter your team name:");
		lblNewLabel_1.setFont(new Font("SF Pro Rounded", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(34, 67, 160, 22);
		frmGameSetup.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("SF Pro Rounded", Font.PLAIN, 16));
		textField.setHorizontalAlignment(SwingConstants.LEFT);
		textField.setBounds(200, 65, 218, 29);
		frmGameSetup.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("*Length must be 3 - 15 characters.*");
		lblNewLabel_2.setForeground(new Color(255, 29, 0));
		lblNewLabel_2.setVisible(isWithinFormat);
		lblNewLabel_2.setFont(new Font("SF Pro Rounded", Font.PLAIN, 10));
		lblNewLabel_2.setBounds(206, 53, 154, 16);
		frmGameSetup.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Difficulties:");
		lblNewLabel_3.setFont(new Font("SF Pro Rounded", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(34, 132, 142, 16);
		frmGameSetup.getContentPane().add(lblNewLabel_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("SF Pro Rounded", Font.PLAIN, 14));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Easy", "Medium", "Hard"}));
		comboBox.setMaximumRowCount(3);
		comboBox.setBounds(200, 131, 218, 22);
		frmGameSetup.getContentPane().add(comboBox);
		
		JLabel lblNewLabel_4 = new JLabel("Season Duration:");
		lblNewLabel_4.setFont(new Font("SF Pro Rounded", Font.PLAIN, 16));
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
		slider.setBounds(200, 97, 218, 22);
		frmGameSetup.getContentPane().add(slider);
		
		JLabel lblNewLabel_5 = new JLabel("Available Athletes:");
		lblNewLabel_5.setFont(new Font("SF Pro Rounded", Font.PLAIN, 16));
		lblNewLabel_5.setBounds(33, 319, 148, 16);
		frmGameSetup.getContentPane().add(lblNewLabel_5);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel.setBounds(382, 180, 219, 310);
		frmGameSetup.getContentPane().add(panel);
		
		JLabel lblNewLabel_7 = new JLabel("Name: ");
		lblNewLabel_7.setFont(new Font("SF Pro Rounded", Font.PLAIN, 16));
		
		JLabel lblNewLabel_8 = new JLabel("Position:");
		lblNewLabel_8.setFont(new Font("SF Pro Rounded", Font.PLAIN, 16));
		
		JLabel lblNewLabel_9 = new JLabel("Nationality:");
		lblNewLabel_9.setFont(new Font("SF Pro Rounded", Font.PLAIN, 16));
		
		progressBar = new JProgressBar();
		
		JLabel lblNewLabel_10 = new JLabel("Durability:");
		lblNewLabel_10.setFont(new Font("SF Pro Rounded", Font.PLAIN, 16));
		
		JLabel lblNewLabel_11 = new JLabel("Attack:");
		lblNewLabel_11.setFont(new Font("SF Pro Rounded", Font.PLAIN, 16));
		
		JLabel lblNewLabel_12 = new JLabel("Defense:");
		lblNewLabel_12.setFont(new Font("SF Pro Rounded", Font.PLAIN, 16));
		
		progressBar_1 = new JProgressBar();
		
		progressBar_2 = new JProgressBar();
		
		btnNewButton_4 = new JButton("Select");
		btnNewButton_4.setFont(new Font("SF Pro Rounded", Font.PLAIN, 16));
		btnNewButton_4.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				gameHandler.addSelectedAthlete(gameHandler.getAthletes().get(selectedAthlete),selectedFrame);
				refreshSelected();
			}
		});
		
		JLabel lblNewLabel_6 = new JLabel("Athlete's Profile");
		lblNewLabel_6.setFont(new Font("SF Pro Rounded", Font.PLAIN, 16));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
							.addGroup(gl_panel.createSequentialGroup()
								.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
									.addComponent(progressBar_1, GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
									.addGroup(gl_panel.createSequentialGroup()
										.addGap(2)
										.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
											.addComponent(lblNewLabel_10, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
											.addComponent(lblNewLabel_9, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
											.addComponent(lblNewLabel_7, GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
											.addComponent(lblNewLabel_8))
										.addGap(89))
									.addGroup(gl_panel.createSequentialGroup()
										.addGap(6)
										.addComponent(lblNewLabel_11, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED, 130, GroupLayout.PREFERRED_SIZE))
									.addComponent(progressBar, GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
									.addGroup(gl_panel.createSequentialGroup()
										.addGap(6)
										.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
											.addComponent(progressBar_2, GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
											.addComponent(lblNewLabel_12, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE))))
								.addGap(14))
							.addGroup(gl_panel.createSequentialGroup()
								.addComponent(btnNewButton_4, GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
								.addContainerGap()))
						.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
							.addComponent(lblNewLabel_6)
							.addGap(54))))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_6)
					.addPreferredGap(ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
					.addComponent(lblNewLabel_7)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_8)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_9)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_10)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(progressBar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_11)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(progressBar_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_12)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(progressBar_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnNewButton_4)
					.addContainerGap())
		);
		panel.setLayout(gl_panel);
		
		JLabel lblNewLabel_13 = new JLabel("Starting Athletes:");
		lblNewLabel_13.setFont(new Font("SF Pro Rounded", Font.PLAIN, 16));
		lblNewLabel_13.setBounds(33, 180, 136, 22);
		frmGameSetup.getContentPane().add(lblNewLabel_13);
		
		JButton btnNewButton = new JButton(gameHandler.getAthletes().get(0).getName());
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("SF Pro Rounded", Font.PLAIN, 11));
		btnNewButton.setBounds(28, 347, 68, 68);
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
		btnAthlete.setBounds(183, 347, 68, 68);
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
		btnAthlete_1.setBounds(105, 347, 68, 68);
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
		btnNewButton_1.setBounds(263, 347, 68, 68);
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
		btnAthlete_2.setBounds(27, 422, 68, 68);
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
		btnAthlete_1_1.setBounds(105, 422, 68, 68);
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
		btnNewButton_2.setBounds(183, 422, 68, 68);
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
		btnAthlete_3.setBounds(263, 422, 68, 68);
		frmGameSetup.getContentPane().add(btnAthlete_3);
		btnAthlete_3.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				selectedAthlete = 7;
				changeCard(gameHandler.getAthletes().get(selectedAthlete));
			}
		});
		
		JButton btnAthlete_1_2 = new JButton(gameHandler.getAthletes().get(8).getName());
		btnAthlete_1_2.setFont(new Font("SF Pro Rounded", Font.PLAIN, 11));
		btnAthlete_1_2.setBounds(27, 499, 68, 68);
		frmGameSetup.getContentPane().add(btnAthlete_1_2);
		btnAthlete_1_2.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				selectedAthlete = 8;
				changeCard(gameHandler.getAthletes().get(selectedAthlete));
			}
		});
		
		btnNewButton_3 = new JButton(gameHandler.getSelectedAthlete(0).getName());
		btnNewButton_3.setFont(new Font("SF Pro Rounded", Font.PLAIN, 11));
		btnNewButton_3.setBounds(28, 209, 75, 75);
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
		btnAthlete_4.setBounds(104, 209, 75, 75);
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
		btnAthlete_1_3.setBounds(181, 209, 75, 75);
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
		btnNewButton_3_1.setBounds(256, 209, 75, 75);
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
		btnNewButton_5.setFont(new Font("SF Pro Rounded", Font.PLAIN, 16));
		btnNewButton_5.setBounds(430, 63, 178, 32);
		frmGameSetup.getContentPane().add(btnNewButton_5);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(68, 319, 247, -22);
		frmGameSetup.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(27, 296, 304, 12);
		frmGameSetup.getContentPane().add(separator_1);
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
					gameHandler.setRemainingWeek(slider.getValue());
					gameHandler.setTeamName(textField.getText());
					GameMaster.showSelectedPage(gameHandler.getPage());
				}
			}
		});
	}
	
	public void changeCard(Athlete athlete) {
		progressBar.setValue((int) athlete.getOffense());
		progressBar_1.setValue((int) athlete.getDefence());
		progressBar_2.setValue((int) athlete.getStamina());
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
