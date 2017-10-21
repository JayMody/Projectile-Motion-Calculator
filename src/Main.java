import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main{

	private JFrame frmProjectileMotionCalculator;
	private JTextField xMagnitudeField;
	private JTextField yMagnitudeField;
	private JTextField timeField;
	private JTextField xDirectionField;
	private JTextField yDirectionField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frmProjectileMotionCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmProjectileMotionCalculator = new JFrame();
		frmProjectileMotionCalculator.setTitle("Projectile Motion Calculator");
		frmProjectileMotionCalculator.setBackground(Color.LIGHT_GRAY);
		frmProjectileMotionCalculator.getContentPane().setBackground(Color.LIGHT_GRAY);
		frmProjectileMotionCalculator.setBounds(100, 100, 1200, 675);
		frmProjectileMotionCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmProjectileMotionCalculator.getContentPane().setLayout(null);
		
		JTextPane title = new JTextPane();
		title.setForeground(Color.RED);
		title.setBackground(Color.LIGHT_GRAY);
		title.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 18));
		title.setText("Projectile Motion Calculator");
		title.setBounds(29, 30, 286, 43);
		frmProjectileMotionCalculator.getContentPane().add(title);
		
		JTextPane author = new JTextPane();
		author.setBackground(Color.LIGHT_GRAY);
		author.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 13));
		author.setText("By: Jay Mody");
		author.setBounds(1032, 30, 90, 30);
		frmProjectileMotionCalculator.getContentPane().add(author);
		
		xMagnitudeField = new JTextField();
		xMagnitudeField.setBackground(Color.WHITE);
		xMagnitudeField.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 12));
		xMagnitudeField.setBounds(29, 117, 153, 22);
		frmProjectileMotionCalculator.getContentPane().add(xMagnitudeField);
		xMagnitudeField.setColumns(10);
		
		yMagnitudeField = new JTextField();
		yMagnitudeField.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 12));
		yMagnitudeField.setColumns(10);
		yMagnitudeField.setBackground(Color.WHITE);
		yMagnitudeField.setBounds(29, 167, 153, 22);
		frmProjectileMotionCalculator.getContentPane().add(yMagnitudeField);
		
		timeField = new JTextField();
		timeField.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 12));
		timeField.setColumns(10);
		timeField.setBackground(Color.WHITE);
		timeField.setBounds(29, 217, 153, 22);
		frmProjectileMotionCalculator.getContentPane().add(timeField);
		
		xDirectionField = new JTextField();
		xDirectionField.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 12));
		xDirectionField.setColumns(10);
		xDirectionField.setBackground(Color.WHITE);
		xDirectionField.setBounds(229, 117, 153, 22);
		frmProjectileMotionCalculator.getContentPane().add(xDirectionField);
		
		yDirectionField = new JTextField();
		yDirectionField.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 12));
		yDirectionField.setColumns(10);
		yDirectionField.setBackground(Color.WHITE);
		yDirectionField.setBounds(229, 167, 153, 22);
		frmProjectileMotionCalculator.getContentPane().add(yDirectionField);
		
		JTextPane txtpnTime = new JTextPane();
		txtpnTime.setText("Time");
		txtpnTime.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 13));
		txtpnTime.setBackground(Color.LIGHT_GRAY);
		txtpnTime.setBounds(29, 194, 78, 22);
		frmProjectileMotionCalculator.getContentPane().add(txtpnTime);
		
		JTextPane txtpnXDirectionn = new JTextPane();
		txtpnXDirectionn.setText("X Direction (E or W)");
		txtpnXDirectionn.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 13));
		txtpnXDirectionn.setBackground(Color.LIGHT_GRAY);
		txtpnXDirectionn.setBounds(229, 96, 137, 22);
		frmProjectileMotionCalculator.getContentPane().add(txtpnXDirectionn);
		
		JTextPane txtpnYDirectionn = new JTextPane();
		txtpnYDirectionn.setText("Y Direction (N or S)");
		txtpnYDirectionn.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 13));
		txtpnYDirectionn.setBackground(Color.LIGHT_GRAY);
		txtpnYDirectionn.setBounds(229, 146, 153, 22);
		frmProjectileMotionCalculator.getContentPane().add(txtpnYDirectionn);
		
		JTextPane txtpnXMagnitude = new JTextPane();
		txtpnXMagnitude.setText("X Magnitude");
		txtpnXMagnitude.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 13));
		txtpnXMagnitude.setBackground(Color.LIGHT_GRAY);
		txtpnXMagnitude.setBounds(29, 96, 78, 22);
		frmProjectileMotionCalculator.getContentPane().add(txtpnXMagnitude);
		
		JTextPane txtpnYMagnitude = new JTextPane();
		txtpnYMagnitude.setText("Y Magnitude");
		txtpnYMagnitude.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 13));
		txtpnYMagnitude.setBackground(Color.LIGHT_GRAY);
		txtpnYMagnitude.setBounds(29, 146, 78, 22);
		frmProjectileMotionCalculator.getContentPane().add(txtpnYMagnitude);
		
		JTextArea outputArea = new JTextArea();
		outputArea.setBackground(Color.WHITE);
		outputArea.setBounds(576, 180, 560, 409);
		frmProjectileMotionCalculator.getContentPane().add(outputArea);
		
		JButton calculateButton = new JButton("Calculate");
		calculateButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				double x;
				double y;
				double time;
				
				Vector initialVelocity;
				Projectile arrow = new Projectile();
				
				try
				{
					x = Unit.correctMagnitude(xDirectionField.getText(), Double.parseDouble(xMagnitudeField.getText()));
					y = Unit.correctMagnitude(yDirectionField.getText(), Double.parseDouble(yMagnitudeField.getText()));
					
					time = Double.parseDouble(timeField.getText());
					
					initialVelocity = new Vector(x, y);
					arrow.calculateProjectile(initialVelocity, time);
					
					outputArea.setText(arrow.getMotion());
				}
				catch (Exception e)
				{
					JOptionPane.showMessageDialog(null, "Invalid Input");
				}
		
			}
		});
		calculateButton.setBackground(Color.RED);
		calculateButton.setBounds(262, 218, 89, 23);
		frmProjectileMotionCalculator.getContentPane().add(calculateButton);
	}
}
