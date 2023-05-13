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

public class GameSetupPage {

	private JFrame frmGameSetup;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameSetupPage window = new GameSetupPage();
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
	public GameSetupPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGameSetup = new JFrame();
		frmGameSetup.setBackground(new Color(238, 238, 238));
		frmGameSetup.setTitle("Game Setup");
		frmGameSetup.setBounds(100, 100, 512, 368);
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
	}
}
