import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;

/**
 * The EndingGamePage class represents the GUI window for the ending page of the game.
 */
public class EndingGamePage {

	private JFrame frame;

	/**
	 * Launch the application.
	 * 
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EndingGamePage window = new EndingGamePage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public EndingGamePage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(176, 196, 222));
		frame.setBounds(100, 100, 639, 483);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		// Team Name Label
		JLabel teamNameLabel = new JLabel("Team Name");
		teamNameLabel.setBackground(new Color(238, 232, 170));
		teamNameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		teamNameLabel.setFont(new Font("Futura", Font.PLAIN, 50));
		teamNameLabel.setBounds(179, 124, 313, 114);
		frame.getContentPane().add(teamNameLabel);
		// Seasons Duration Label
		JLabel seasonsDurationLabel = new JLabel("Seasons duration:");
		seasonsDurationLabel.setFont(new Font("Futura", Font.PLAIN, 13));
		seasonsDurationLabel.setBounds(216, 239, 123, 16);
		frame.getContentPane().add(seasonsDurationLabel);
		// Accumulated Balance Label
		JLabel accumulatedBalanceLabel = new JLabel("Accumulated Balance:");
		accumulatedBalanceLabel.setFont(new Font("Futura", Font.PLAIN, 13));
		accumulatedBalanceLabel.setBounds(216, 277, 149, 16);
		frame.getContentPane().add(accumulatedBalanceLabel);
		// Accumulated Points Label
		JLabel accumulatedPointsLabel = new JLabel("Accumulated Points:");
		accumulatedPointsLabel.setFont(new Font("Futura", Font.PLAIN, 13));
		accumulatedPointsLabel.setBounds(216, 316, 149, 16);
		frame.getContentPane().add(accumulatedPointsLabel);
		// Seasons Duration Value Label
		JLabel seasonsDurationValueLabel = new JLabel("New label");
		seasonsDurationValueLabel.setFont(new Font("Futura", Font.PLAIN, 13));
		seasonsDurationValueLabel.setBounds(377, 239, 61, 16);
		frame.getContentPane().add(seasonsDurationValueLabel);
		// Accumulated Balance Value Label
		JLabel accumulatedBalanceValueLabel = new JLabel("New label");
		accumulatedBalanceValueLabel.setFont(new Font("Futura", Font.PLAIN, 13));
		accumulatedBalanceValueLabel.setBounds(377, 277, 61, 16);
		frame.getContentPane().add(accumulatedBalanceValueLabel);
		// Accumulated Points Value Label
		JLabel accumulatedPointsValueLabel = new JLabel("New label");
		accumulatedPointsValueLabel.setFont(new Font("Futura", Font.PLAIN, 13));
		accumulatedPointsValueLabel.setBounds(377, 316, 61, 16);
		frame.getContentPane().add(accumulatedPointsValueLabel);
		// Goodbye Label
		JLabel goodbyeLabel = new JLabel("See you again next season!");
		goodbyeLabel.setFont(new Font("Futura", Font.PLAIN, 30));
		goodbyeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		goodbyeLabel.setBounds(153, 100, 386, 39);
		frame.getContentPane().add(goodbyeLabel);
		// Close Button
		JButton closeButton = new JButton("Close");
		closeButton.setFont(new Font("Futura", Font.PLAIN, 13));
		closeButton.setBounds(288, 367, 117, 29);
		frame.getContentPane().add(closeButton);
		}


}