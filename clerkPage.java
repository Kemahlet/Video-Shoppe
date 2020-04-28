import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Label;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.BoxLayout;
import javax.swing.Box;
import java.awt.Component;
import javax.swing.JMenu;
import java.awt.Canvas;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JInternalFrame;
import java.awt.Button;

public class clerkPage {

	private JFrame frmClerkPage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					clerkPage window = new clerkPage();
					window.frmClerkPage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public clerkPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		/**
		 * initialize fields for specified employee 
		 */
		String employeeName = null;
		int employeeID = 0;
		int hrsWorked = 0;
		
		frmClerkPage = new JFrame();
		frmClerkPage.setTitle("Clerk Page");
		frmClerkPage.setBounds(100, 100, 450, 300);
		frmClerkPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmClerkPage.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Hello,");
		lblNewLabel.setBounds(0, 9, 434, 14);
		frmClerkPage.getContentPane().add(lblNewLabel);
		
		Box verticalBox_1 = Box.createVerticalBox();
		verticalBox_1.setBounds(164, 71, 128, 108);
		frmClerkPage.getContentPane().add(verticalBox_1);		
	
		
		JLabel lblNewLabel_3 = new JLabel("Inventory");
		lblNewLabel_3.setAlignmentX(Component.CENTER_ALIGNMENT);
		verticalBox_1.add(lblNewLabel_3);
		
		Component verticalStrut_4 = Box.createVerticalStrut(20);
		verticalBox_1.add(verticalStrut_4);
		
		Button button_1 = new Button("Search for DVDs");
		verticalBox_1.add(button_1);
		
		Component verticalStrut_3 = Box.createVerticalStrut(20);
		verticalBox_1.add(verticalStrut_3);
		
		Button button = new Button("Return DVD");
		verticalBox_1.add(button);
		
		Box verticalBox = Box.createVerticalBox();
		verticalBox.setBounds(0, 34, 161, 32);
		frmClerkPage.getContentPane().add(verticalBox);
		
		JLabel lblNewLabel_1 = new JLabel("Employee ID: ");
		verticalBox.add(lblNewLabel_1);
		

		JLabel lblHoursWorked = new JLabel("Hours Worked:");
		verticalBox.add(lblHoursWorked);
		
		Box verticalBox_2 = Box.createVerticalBox();
		verticalBox_2.setBounds(0, 71, 139, 108);
		frmClerkPage.getContentPane().add(verticalBox_2);
		
		
		JLabel lblNewLabel_2 = new JLabel("Customer");
		lblNewLabel_2.setAlignmentX(Component.CENTER_ALIGNMENT);
		verticalBox_2.add(lblNewLabel_2);
		
		Component verticalStrut_1 = Box.createVerticalStrut(20);
		verticalBox_2.add(verticalStrut_1);
		
		Button button_3 = new Button("Add Customer");
		verticalBox_2.add(button_3);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		verticalBox_2.add(verticalStrut);
		
		Button button_4 = new Button("Update Customer");
		verticalBox_2.add(button_4);
		
		Button button_2 = new Button("Log Out");
		button_2.setBounds(164, 228, 128, 23);
		frmClerkPage.getContentPane().add(button_2);
		
	}
}
