import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.JButton;

public class YouLosePage {

	private JFrame frame;
	private GameHandler gameHandler;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameHandler gameHandler = new GameHandler();
					YouLosePage window = new YouLosePage(gameHandler);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void hidePage() {
		frame.setVisible(false);
	}
	
	public void showPage() {
		frame.setVisible(true);
	}

	/**
	 * Create the application.
	 */
	public YouLosePage(GameHandler gameHandler) {
		this.gameHandler = gameHandler;
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
		
		JLabel lblNewLabel_2 = new JLabel("You lose!");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(new Color(220, 20, 60));
		lblNewLabel_2.setFont(new Font("Futura", Font.PLAIN, 80));
		lblNewLabel_2.setBackground(new Color(176, 224, 230));
		lblNewLabel_2.setBounds(147, 85, 363, 114);
		frame.getContentPane().add(lblNewLabel_2);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBackground(new Color(255, 250, 205));
		panel.setBounds(172, 211, 323, 133);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("Accumulated Points:");
		lblNewLabel.setFont(new Font("Futura", Font.PLAIN, 16));
		lblNewLabel.setBounds(44, 81, 160, 16);
		panel.add(lblNewLabel);
		
		JLabel lblMoneyEarned = new JLabel("Amount Earned: ");
		lblMoneyEarned.setFont(new Font("Futura", Font.PLAIN, 20));
		lblMoneyEarned.setBounds(44, 38, 160, 27);
		panel.add(lblMoneyEarned);
		
		JLabel lblNewLabel_1 = new JLabel("0");
		lblNewLabel_1.setBounds(216, 82, 61, 16);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("0");
		lblNewLabel_1_1.setBounds(216, 46, 61, 16);
		panel.add(lblNewLabel_1_1);
		
		JButton btnNewButton = new JButton("Exit");
		btnNewButton.setBounds(282, 366, 117, 29);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				gameHandler.setPage(2);
				GameMaster.showSelectedPage(gameHandler.getPage());
			}
		});
	}
}
