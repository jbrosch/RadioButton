package mainPackage;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class RadioButton extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RadioButton frame = new RadioButton();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public RadioButton() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		
		JRadioButton rdbtnSmall = new JRadioButton("small");
		buttonGroup.add(rdbtnSmall);
		rdbtnSmall.setSelected(true);
		panel.add(rdbtnSmall);
		
		JRadioButton rdbtnMedium = new JRadioButton("medium");
		buttonGroup.add(rdbtnMedium);
		panel.add(rdbtnMedium);
		
		JRadioButton rdbtnLarge = new JRadioButton("large");
		buttonGroup.add(rdbtnLarge);
		panel.add(rdbtnLarge);
	}

}
