import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class LoadScreen {

	private JFrame f;
    private ImageIcon icon;
    private JButton button;
	private GameHandler gameHandler;
	
    public void hidePage() {
		f.setVisible(false);
	}
	
	public void showPage() {
		f.setVisible(true);
	}
    
    /**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameHandler gameHandler = new GameHandler();
					LoadScreen window = new LoadScreen(gameHandler);
					window.f.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoadScreen(GameHandler gameHandler) {
		this.gameHandler = gameHandler;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
	    icon = new ImageIcon("./Video/BADminton.gif");
	    button = new JButton(icon);
	    f = new JFrame("Animation");
		f.getContentPane().add(button);
	    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    f.pack();
	    f.setLocationRelativeTo(null);
	    f.setVisible(true);
	    button.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				gameHandler.setPage(13);
				GameMaster.showSelectedPage(gameHandler.getPage());
			}
		});
	}
	
}
