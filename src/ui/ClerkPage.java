package ui;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.layout.GridData;

public class ClerkPage {

	protected Shell shell;
	private String employeeID;
	private String employeeName;
	private int hoursWorked;

	/**
	 * Pass values to the window.
	 */
	public ClerkPage(String employeeID, String employeeName, int hoursWorked) {
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		this.hoursWorked = hoursWorked;
	}
	
	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(376, 276);
		shell.setText("Clerk Page");
		shell.setLayout(new GridLayout(9, false));
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		Label lblHello = new Label(shell, SWT.NONE);
		lblHello.setText("Hello, " + employeeName + "!");
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		Label lblEmployeeId = new Label(shell, SWT.NONE);
		lblEmployeeId.setText("Employee ID: " + employeeID);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		Label lblHoursWorked = new Label(shell, SWT.NONE);
		lblHoursWorked.setText("Hours Worked: " + Integer.toString(hoursWorked));
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		Label lblCustomer = new Label(shell, SWT.NONE);
		lblCustomer.setText("Customer");
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		Label lblInventory = new Label(shell, SWT.NONE);
		lblInventory.setText("Inventory");
		new Label(shell, SWT.NONE);
		
		Button btnAddCustomer = new Button(shell, SWT.NONE);
		btnAddCustomer.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		btnAddCustomer.setText("Add Customer");
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		Button btnSearchForDvds = new Button(shell, SWT.NONE);
		btnSearchForDvds.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 2, 1));
		btnSearchForDvds.setText("Search for DVDs");
		btnSearchForDvds.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {
				ViewInventory viewInventory = new ViewInventory();
				viewInventory.open();
			}
		});
		
		Button btnUpdateCustomer = new Button(shell, SWT.NONE);
		btnUpdateCustomer.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		btnUpdateCustomer.setText("Update Customer");
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		Button btnReturnDvd = new Button(shell, SWT.NONE);
		GridData gd_btnReturnDvd = new GridData(SWT.FILL, SWT.CENTER, false, false, 2, 1);
		gd_btnReturnDvd.widthHint = 98;
		btnReturnDvd.setLayoutData(gd_btnReturnDvd);
		btnReturnDvd.setText("Return DVD");
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		Button btnLogOut = new Button(shell, SWT.NONE);
		btnLogOut.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 2, 1));
		btnLogOut.setText("Log Out");
		btnLogOut.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {
				Login login = new Login();
				shell.close();
				login.open();
			}
		});
	}

}
