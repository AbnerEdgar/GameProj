import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JProgressBar;

public class MarketPage2 {

	private JFrame frame;
	private GameHandler gameHandler;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_2_1;
	private JProgressBar progressBar_1;
	private JProgressBar progressBar;
	private JLabel lblNewLabel;
	private JButton btnNewButton_1_2;
	private JButton btnNewButton_1_2_1;
	private JButton btnNewButton_1_2_2;
	private JButton btnNewButton_1_2_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameHandler gameHandler = new GameHandler();
					MarketPage2 window = new MarketPage2(gameHandler);
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
	public MarketPage2(GameHandler gameHandler) {
		// TODO Auto-generated constructor stub
		this.gameHandler = gameHandler;
		initialize();
	}
	public void hidePage() {
		frame.setVisible(false);
	}
	public void showPage() {
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(176, 196, 222));
		frame.setBounds(100, 100, 639, 479);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(250, 250, 210));
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_1.setBounds(14, 88, 86, 339);
		frame.getContentPane().add(panel_1);
		
		JLabel lblCategory = new JLabel("Catalog:");
		lblCategory.setHorizontalAlignment(SwingConstants.CENTER);
		lblCategory.setBounds(17, 22, 52, 16);
		panel_1.add(lblCategory);
		
		JButton btnNewButton_1 = new JButton("Rackets");
		btnNewButton_1.setBounds(-15, 71, 119, 41);
		btnNewButton_1.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				gameHandler.setPage(5);
				GameMaster.showSelectedPage(gameHandler.getPage());
			}
		});
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Shoes");
		btnNewButton_1_1.setForeground(new Color(210, 180, 140));
		btnNewButton_1_1.setBackground(new Color(152, 251, 152));
		btnNewButton_1_1.setBounds(-15, 124, 119, 41);
		btnNewButton_1_1.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				gameHandler.setPage(6);
				GameMaster.showSelectedPage(gameHandler.getPage());
			}
		});
		panel_1.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_3 = new JButton("Athletes");
		btnNewButton_1_3.setBounds(-15, 176, 119, 41);
		btnNewButton_1_3.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				gameHandler.setPage(7);
				GameMaster.showSelectedPage(gameHandler.getPage());
			}
		});
		panel_1.add(btnNewButton_1_3);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_1_1.setBackground(new Color(250, 250, 210));
		panel_1_1.setBounds(115, 91, 307, 339);
		frame.getContentPane().add(panel_1_1);
		
		JLabel lblNewLabel_6 = new JLabel("S  H  O  E  S");
		lblNewLabel_6.setForeground(new Color(100, 149, 237));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_6.setFont(new Font("Futura", Font.ITALIC, 30));
		lblNewLabel_6.setBounds(6, 22, 276, 52);
		panel_1_1.add(lblNewLabel_6);
		
		btnNewButton_1_2 = new JButton("65Z");
		btnNewButton_1_2.setFont(new Font("Futura", Font.PLAIN, 12));
		btnNewButton_1_2.setBounds(17, 86, 129, 103);
		panel_1_1.add(btnNewButton_1_2);
		
		btnNewButton_1_2_1 = new JButton("100ZZ");
		btnNewButton_1_2_1.setFont(new Font("Futura", Font.PLAIN, 12));
		btnNewButton_1_2_1.setBounds(153, 86, 129, 103);
		panel_1_1.add(btnNewButton_1_2_1);
		
		btnNewButton_1_2_2 = new JButton("100ZZ");
		btnNewButton_1_2_2.setFont(new Font("Futura", Font.PLAIN, 12));
		btnNewButton_1_2_2.setBounds(153, 207, 129, 103);
		panel_1_1.add(btnNewButton_1_2_2);
		
		btnNewButton_1_2_3 = new JButton("100ZZ");
		btnNewButton_1_2_3.setFont(new Font("Futura", Font.PLAIN, 12));
		btnNewButton_1_2_3.setBounds(17, 207, 129, 103);
		panel_1_1.add(btnNewButton_1_2_3);
		
		JButton btnNewButton = new JButton("Home");
		btnNewButton.setFont(new Font("Futura", Font.PLAIN, 12));
		btnNewButton.setBounds(6, 6, 86, 28);
		frame.getContentPane().add(btnNewButton);
		
		JInternalFrame internalFrame = new JInternalFrame("D E T A I L S");
		internalFrame.getContentPane().setBackground(new Color(240, 230, 140));
		internalFrame.setBounds(430, 57, 200, 388);
		frame.getContentPane().add(internalFrame);
		internalFrame.getContentPane().setLayout(null);
		
		JButton btnNewButton_2 = new JButton("Equip");
		btnNewButton_2.setBounds(100, 6, 72, 29);
		internalFrame.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel_5_1 = new JLabel("Y O N E X");
		lblNewLabel_5_1.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_5_1.setBounds(16, 16, 82, 34);
		internalFrame.getContentPane().add(lblNewLabel_5_1);
		
		lblNewLabel = new JLabel("1000Z");
		lblNewLabel.setBounds(16, 48, 61, 16);
		internalFrame.getContentPane().add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(16, 72, 145, 129);
		internalFrame.getContentPane().add(panel_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("Specification:");
		lblNewLabel_1_1.setBounds(16, 213, 92, 16);
		internalFrame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("Weight:");
		lblNewLabel_1.setBounds(16, 241, 54, 16);
		internalFrame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_3 = new JLabel("Price:");
		lblNewLabel_1_3.setBounds(16, 264, 61, 16);
		internalFrame.getContentPane().add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_2 = new JLabel("Defense: ");
		lblNewLabel_1_2.setBounds(16, 292, 73, 16);
		internalFrame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_4 = new JLabel("Offense:");
		lblNewLabel_4.setBounds(16, 313, 61, 16);
		internalFrame.getContentPane().add(lblNewLabel_4);
		
		progressBar_1 = new JProgressBar();
		progressBar_1.setMaximum(10);
		progressBar_1.setBounds(79, 313, 82, 20);
		internalFrame.getContentPane().add(progressBar_1);
		
		progressBar = new JProgressBar();
		progressBar.setMaximum(10);
		progressBar.setBackground(new Color(169, 169, 169));
		progressBar.setBounds(79, 292, 82, 20);
		internalFrame.getContentPane().add(progressBar);
		
		lblNewLabel_2_1 = new JLabel("$ 123");
		lblNewLabel_2_1.setBounds(91, 264, 61, 16);
		internalFrame.getContentPane().add(lblNewLabel_2_1);
		
		lblNewLabel_2 = new JLabel("83 gram");
		lblNewLabel_2.setBounds(91, 241, 61, 16);
		internalFrame.getContentPane().add(lblNewLabel_2);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setLayout(null);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel.setBounds(518, 6, 112, 28);
		frame.getContentPane().add(panel);
		
		lblNewLabel_3 = new JLabel("$....123");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Futura", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(6, 6, 100, 16);
		panel.add(lblNewLabel_3);
		internalFrame.setVisible(true);
	}
	
	public void onAppear() {
		btnNewButton_1_2.setText(gameHandler.getMarketRackets().get(0).getName());
		btnNewButton_1_2_1.setText(gameHandler.getMarketRackets().get(1).getName());
		btnNewButton_1_2_2.setText(gameHandler.getMarketRackets().get(2).getName());
		btnNewButton_1_2_3.setText(gameHandler.getMarketRackets().get(3).getName());
		refreshCard();
	}
	
	public void refreshCard() {
		lblNewLabel.setText(gameHandler.getMarketRackets().get(gameHandler.getSelectedIRacket()).getName());
		lblNewLabel_2.setText(Integer.toString(gameHandler.getMarketRackets().get(gameHandler.getSelectedIRacket()).getWeight()));
		progressBar_1.setValue((int) gameHandler.getMarketRackets().get(gameHandler.getSelectedIRacket()).getOffense());
		progressBar.setValue((int) gameHandler.getMarketRackets().get(gameHandler.getSelectedIRacket()).getDefense());
		lblNewLabel_2_1.setText(Float.toString(gameHandler.getMarketRackets().get(gameHandler.getSelectedIRacket()).getPrice()));
	}
}
