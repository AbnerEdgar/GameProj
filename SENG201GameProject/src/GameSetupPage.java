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
import java.awt.event.ActionEvent;
import javax.swing.LayoutStyle.ComponentPlacement;

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
		frmGameSetup.setBackground(new Color(238, 238, 238));
		frmGameSetup.setTitle((gameHandler.getAppName()+"(Setup Page)"));
		frmGameSetup.setBounds(100, 100, 633, 566);
		frmGameSetup.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGameSetup.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Hi Player! Welcome to badminton tournament.");
		lblNewLabel.setBounds(27, 22, 338, 16);
		frmGameSetup.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Choose your team name:");
		lblNewLabel_1.setBounds(27, 50, 168, 16);
		frmGameSetup.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(187, 45, 253, 26);
		frmGameSetup.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("*Length must be 3 - 15 characters.*");
		lblNewLabel_2.setVisible(isWithinFormat);
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		lblNewLabel_2.setBounds(197, 75, 240, 16);
		frmGameSetup.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Difficulties:");
		lblNewLabel_3.setBounds(27, 105, 82, 16);
		frmGameSetup.getContentPane().add(lblNewLabel_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Easy", "Medium", "Hard"}));
		comboBox.setMaximumRowCount(3);
		comboBox.setBounds(100, 103, 115, 22);
		frmGameSetup.getContentPane().add(comboBox);
		
		JLabel lblNewLabel_4 = new JLabel("Season Duration:");
		lblNewLabel_4.setBounds(227, 105, 115, 16);
		frmGameSetup.getContentPane().add(lblNewLabel_4);
		
		JSlider slider = new JSlider();
		slider.setValue(5);
		slider.setSnapToTicks(true);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		slider.setMinimum(5);
		slider.setMinorTickSpacing(5);
		slider.setMaximum(15);
		slider.setBounds(336, 100, 136, 29);
		frmGameSetup.getContentPane().add(slider);
		
		JLabel lblNewLabel_5 = new JLabel("Purchase Athletes:");
		lblNewLabel_5.setBounds(27, 169, 148, 16);
		frmGameSetup.getContentPane().add(lblNewLabel_5);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(367, 169, 240, 334);
		frmGameSetup.getContentPane().add(panel);
		
		JLabel lblNewLabel_6 = new JLabel("P R O F I L E");
		
		JLabel lblNewLabel_7 = new JLabel("Name: ");
		
		JLabel lblNewLabel_8 = new JLabel("Position:");
		
		JLabel lblNewLabel_9 = new JLabel("Nationality:");
		
		progressBar = new JProgressBar();
		
		JLabel lblNewLabel_10 = new JLabel("Durability");
		
		JLabel lblNewLabel_11 = new JLabel("Attack");
		
		JLabel lblNewLabel_12 = new JLabel("Defense");
		
		progressBar_1 = new JProgressBar();
		
		progressBar_2 = new JProgressBar();
		
		btnNewButton_4 = new JButton("Select");
		btnNewButton_4.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				gameHandler.addSelectedAthlete(gameHandler.getAthletes().get(selectedAthlete),selectedFrame);
				refreshSelected();
			}
		});
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(17)
					.addComponent(lblNewLabel_6, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
					.addGap(51)
					.addComponent(btnNewButton_4))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(17)
					.addComponent(lblNewLabel_7))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(17)
					.addComponent(lblNewLabel_8, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(17)
					.addComponent(lblNewLabel_9, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(17)
					.addComponent(lblNewLabel_10, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(15)
					.addComponent(progressBar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(17)
					.addComponent(lblNewLabel_11, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(15)
					.addComponent(progressBar_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(17)
					.addComponent(lblNewLabel_12, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(17)
					.addComponent(progressBar_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(8)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(13)
							.addComponent(lblNewLabel_6))
						.addComponent(btnNewButton_4))
					.addGap(9)
					.addComponent(lblNewLabel_7)
					.addGap(7)
					.addComponent(lblNewLabel_8)
					.addGap(6)
					.addComponent(lblNewLabel_9)
					.addGap(25)
					.addComponent(lblNewLabel_10)
					.addGap(7)
					.addComponent(progressBar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(12)
					.addComponent(lblNewLabel_11)
					.addGap(12)
					.addComponent(progressBar_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblNewLabel_12)
					.addGap(12)
					.addComponent(progressBar_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
		);
		panel.setLayout(gl_panel);
		
		JLabel lblNewLabel_13 = new JLabel("Selected:");
		lblNewLabel_13.setBounds(27, 424, 61, 16);
		frmGameSetup.getContentPane().add(lblNewLabel_13);
		
		JButton btnNewButton = new JButton(gameHandler.getAthletes().get(0).getName());
		btnNewButton.setBounds(17, 197, 68, 68);
		frmGameSetup.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				selectedAthlete = 0;
				changeCard(gameHandler.getAthletes().get(selectedAthlete));
			}
		});
		
		JButton btnAthlete = new JButton(gameHandler.getAthletes().get(1).getName());
		btnAthlete.setBounds(85, 197, 68, 68);
		frmGameSetup.getContentPane().add(btnAthlete);
		btnAthlete.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				selectedAthlete = 1;
				changeCard(gameHandler.getAthletes().get(selectedAthlete));
			}
		});
		
		JButton btnAthlete_1 = new JButton(gameHandler.getAthletes().get(2).getName());
		btnAthlete_1.setBounds(153, 197, 68, 68);
		frmGameSetup.getContentPane().add(btnAthlete_1);
		btnAthlete_1.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				selectedAthlete = 2;
				changeCard(gameHandler.getAthletes().get(selectedAthlete));
			}
		});
		
		JButton btnNewButton_1 = new JButton(gameHandler.getAthletes().get(3).getName());
		btnNewButton_1.setBounds(17, 264, 68, 68);
		frmGameSetup.getContentPane().add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				selectedAthlete = 3;
				changeCard(gameHandler.getAthletes().get(selectedAthlete));
			}
		});
		
		JButton btnAthlete_2 = new JButton(gameHandler.getAthletes().get(4).getName());
		btnAthlete_2.setBounds(85, 264, 68, 68);
		frmGameSetup.getContentPane().add(btnAthlete_2);
		btnAthlete_2.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				selectedAthlete = 4;
				changeCard(gameHandler.getAthletes().get(selectedAthlete));
			}
		});
		
		JButton btnAthlete_1_1 = new JButton(gameHandler.getAthletes().get(5).getName());
		btnAthlete_1_1.setBounds(153, 264, 68, 68);
		frmGameSetup.getContentPane().add(btnAthlete_1_1);
		btnAthlete_1_1.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				selectedAthlete = 5;
				changeCard(gameHandler.getAthletes().get(selectedAthlete));
			}
		});
		
		JButton btnNewButton_2 = new JButton(gameHandler.getAthletes().get(6).getName());
		btnNewButton_2.setBounds(17, 333, 68, 68);
		frmGameSetup.getContentPane().add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				selectedAthlete = 6;
				changeCard(gameHandler.getAthletes().get(selectedAthlete));
			}
		});
		
		JButton btnAthlete_3 = new JButton(gameHandler.getAthletes().get(7).getName());
		btnAthlete_3.setBounds(85, 333, 68, 68);
		frmGameSetup.getContentPane().add(btnAthlete_3);
		btnAthlete_3.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				selectedAthlete = 7;
				changeCard(gameHandler.getAthletes().get(selectedAthlete));
			}
		});
		
		JButton btnAthlete_1_2 = new JButton(gameHandler.getAthletes().get(8).getName());
		btnAthlete_1_2.setBounds(153, 333, 68, 68);
		frmGameSetup.getContentPane().add(btnAthlete_1_2);
		btnAthlete_1_2.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				selectedAthlete = 8;
				changeCard(gameHandler.getAthletes().get(selectedAthlete));
			}
		});
		
		btnNewButton_3 = new JButton(gameHandler.getSelectedAthlete(0).getName());
		btnNewButton_3.setBounds(17, 445, 68, 68);
		frmGameSetup.getContentPane().add(btnNewButton_3);
		btnNewButton_3.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				selectedFrame = 0;
				changeCard(gameHandler.getSelectedAthlete(selectedFrame));
			}
		});
		
		btnAthlete_4 = new JButton(gameHandler.getSelectedAthlete(1).getName());
		btnAthlete_4.setBounds(85, 445, 68, 68);
		frmGameSetup.getContentPane().add(btnAthlete_4);
		btnAthlete_4.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				selectedFrame = 1;
				changeCard(gameHandler.getSelectedAthlete(selectedFrame));
			}
		});
		
		btnAthlete_1_3 = new JButton(gameHandler.getSelectedAthlete(2).getName());
		btnAthlete_1_3.setBounds(153, 445, 68, 68);
		frmGameSetup.getContentPane().add(btnAthlete_1_3);
		btnAthlete_1_3.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				selectedFrame = 2;
				changeCard(gameHandler.getSelectedAthlete(selectedFrame));
			}
		});
		
		btnNewButton_3_1 = new JButton(gameHandler.getSelectedAthlete(3).getName());
		btnNewButton_3_1.setBounds(221, 445, 68, 68);
		frmGameSetup.getContentPane().add(btnNewButton_3_1);
		btnNewButton_3_1.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				selectedFrame = 3;
				changeCard(gameHandler.getSelectedAthlete(selectedFrame));
			}
		});
		
		JButton btnNewButton_5 = new JButton("Start Game");
		btnNewButton_5.setBounds(489, 45, 117, 29);
		frmGameSetup.getContentPane().add(btnNewButton_5);
		btnNewButton_5.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				isWithinFormat = textField.getText().length() > 13 || textField.getText().length() < 3 ? false : true;
				lblNewLabel_2.setVisible(!isWithinFormat);
				if(isWithinFormat) {
					gameHandler.setPage(2);
					gameHandler.setDifficulty(comboBox.getSelectedIndex()+1);
					gameHandler.setSeasonDur(slider.getValue());
					GameMaster.hideAllPage();
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
