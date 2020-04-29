package ui;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class ManagerPage {

	protected Shell shlManagerPage;
	private String managerID;
	private String managerName;
	private int managerHoursWorked;

	public ManagerPage(String managerID, String managerName, int managerHoursWorked) {
		this.managerID = managerID;
		this.managerName = managerName;
		this.managerHoursWorked = managerHoursWorked;
	}
	/**
	 * Open the window.
	 * @wbp.parser.entryPoint
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shlManagerPage.open();
		shlManagerPage.layout();
		while (!shlManagerPage.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlManagerPage = new Shell();
		shlManagerPage.setSize(450, 300);
		shlManagerPage.setText("Manager Page");
		shlManagerPage.setLayout(new GridLayout(9, false));
		
		Label lblHello = new Label(shlManagerPage, SWT.NONE);
		lblHello.setText("Hello, " + managerName + "!");
		new Label(shlManagerPage, SWT.NONE);
		new Label(shlManagerPage, SWT.NONE);
		new Label(shlManagerPage, SWT.NONE);
		new Label(shlManagerPage, SWT.NONE);
		new Label(shlManagerPage, SWT.NONE);
		new Label(shlManagerPage, SWT.NONE);
		new Label(shlManagerPage, SWT.NONE);
		new Label(shlManagerPage, SWT.NONE);
		
		Label lblEmployeeId = new Label(shlManagerPage, SWT.NONE);
		lblEmployeeId.setText("Employee ID: " + managerID);
		new Label(shlManagerPage, SWT.NONE);
		new Label(shlManagerPage, SWT.NONE);
		new Label(shlManagerPage, SWT.NONE);
		new Label(shlManagerPage, SWT.NONE);
		new Label(shlManagerPage, SWT.NONE);
		new Label(shlManagerPage, SWT.NONE);
		new Label(shlManagerPage, SWT.NONE);
		new Label(shlManagerPage, SWT.NONE);
		
		Label lblHoursWorked = new Label(shlManagerPage, SWT.NONE);
		lblHoursWorked.setText("Hours Worked: " + Integer.toString(managerHoursWorked));
		new Label(shlManagerPage, SWT.NONE);
		new Label(shlManagerPage, SWT.NONE);
		new Label(shlManagerPage, SWT.NONE);
		new Label(shlManagerPage, SWT.NONE);
		new Label(shlManagerPage, SWT.NONE);
		new Label(shlManagerPage, SWT.NONE);
		new Label(shlManagerPage, SWT.NONE);
		new Label(shlManagerPage, SWT.NONE);
		
		Label lblCustomer = new Label(shlManagerPage, SWT.NONE);
		lblCustomer.setText("Customer");
		new Label(shlManagerPage, SWT.NONE);
		new Label(shlManagerPage, SWT.NONE);
		new Label(shlManagerPage, SWT.NONE);
		new Label(shlManagerPage, SWT.NONE);
		new Label(shlManagerPage, SWT.NONE);
		new Label(shlManagerPage, SWT.NONE);
		new Label(shlManagerPage, SWT.NONE);
		
		Label lblInventory = new Label(shlManagerPage, SWT.NONE);
		lblInventory.setText("Inventory");
		
		Button btnAddCustomer = new Button(shlManagerPage, SWT.NONE);
		GridData gd_btnAddCustomer = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_btnAddCustomer.widthHint = 105;
		btnAddCustomer.setLayoutData(gd_btnAddCustomer);
		btnAddCustomer.setText("Add Customer");
		new Label(shlManagerPage, SWT.NONE);
		new Label(shlManagerPage, SWT.NONE);
		new Label(shlManagerPage, SWT.NONE);
		new Label(shlManagerPage, SWT.NONE);
		new Label(shlManagerPage, SWT.NONE);
		new Label(shlManagerPage, SWT.NONE);
		new Label(shlManagerPage, SWT.NONE);
		
		Button btnSearchForDvds = new Button(shlManagerPage, SWT.NONE);
		GridData gd_btnSearchForDvds = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_btnSearchForDvds.widthHint = 153;
		btnSearchForDvds.setLayoutData(gd_btnSearchForDvds);
		btnSearchForDvds.setText("Search for DVDs");
		btnSearchForDvds.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {
				ViewInventory viewInventory = new ViewInventory();
				viewInventory.open();
			}
		});
		
		Button btnUpdateCustomer = new Button(shlManagerPage, SWT.NONE);
		btnUpdateCustomer.setText("Update Customer");
		new Label(shlManagerPage, SWT.NONE);
		new Label(shlManagerPage, SWT.NONE);
		new Label(shlManagerPage, SWT.NONE);
		new Label(shlManagerPage, SWT.NONE);
		new Label(shlManagerPage, SWT.NONE);
		new Label(shlManagerPage, SWT.NONE);
		new Label(shlManagerPage, SWT.NONE);
		
		Button btnUpdateInventory = new Button(shlManagerPage, SWT.NONE);
		GridData gd_btnUpdateInventory = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_btnUpdateInventory.widthHint = 154;
		btnUpdateInventory.setLayoutData(gd_btnUpdateInventory);
		btnUpdateInventory.setText("Update Inventory");
		new Label(shlManagerPage, SWT.NONE);
		new Label(shlManagerPage, SWT.NONE);
		new Label(shlManagerPage, SWT.NONE);
		new Label(shlManagerPage, SWT.NONE);
		new Label(shlManagerPage, SWT.NONE);
		new Label(shlManagerPage, SWT.NONE);
		new Label(shlManagerPage, SWT.NONE);
		new Label(shlManagerPage, SWT.NONE);
		
		Button btnReturnDvd = new Button(shlManagerPage, SWT.NONE);
		GridData gd_btnReturnDvd = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_btnReturnDvd.widthHint = 154;
		btnReturnDvd.setLayoutData(gd_btnReturnDvd);
		btnReturnDvd.setText("Return DVD");
		btnReturnDvd.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {
				ReturnDVD returnDvd = new ReturnDVD();
				returnDvd.open();
			}
		});
		
		Label lblEmployee = new Label(shlManagerPage, SWT.NONE);
		lblEmployee.setText("Employee");
		new Label(shlManagerPage, SWT.NONE);
		new Label(shlManagerPage, SWT.NONE);
		new Label(shlManagerPage, SWT.NONE);
		new Label(shlManagerPage, SWT.NONE);
		new Label(shlManagerPage, SWT.NONE);
		new Label(shlManagerPage, SWT.NONE);
		new Label(shlManagerPage, SWT.NONE);
		new Label(shlManagerPage, SWT.NONE);
		
		Button btnAddEmployee = new Button(shlManagerPage, SWT.NONE);
		GridData gd_btnAddEmployee = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_btnAddEmployee.widthHint = 105;
		btnAddEmployee.setLayoutData(gd_btnAddEmployee);
		btnAddEmployee.setText("Add Employee");
		btnAddEmployee.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {
				
			}
		});
		new Label(shlManagerPage, SWT.NONE);
		new Label(shlManagerPage, SWT.NONE);
		new Label(shlManagerPage, SWT.NONE);
		new Label(shlManagerPage, SWT.NONE);
		new Label(shlManagerPage, SWT.NONE);
		new Label(shlManagerPage, SWT.NONE);
		new Label(shlManagerPage, SWT.NONE);
		new Label(shlManagerPage, SWT.NONE);
		
		Button btnUpdateEmployee = new Button(shlManagerPage, SWT.NONE);
		btnUpdateEmployee.setText("Update Employee");
		new Label(shlManagerPage, SWT.NONE);
		new Label(shlManagerPage, SWT.NONE);
		new Label(shlManagerPage, SWT.NONE);
		new Label(shlManagerPage, SWT.NONE);
		new Label(shlManagerPage, SWT.NONE);
		new Label(shlManagerPage, SWT.NONE);
		new Label(shlManagerPage, SWT.NONE);
		
		Button btnLogOut = new Button(shlManagerPage, SWT.NONE);
		btnLogOut.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		btnLogOut.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnLogOut.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {
				Login login = new Login();
				shlManagerPage.close();
				login.open();
			}
		});
		btnLogOut.setText("Log Out");

	}

}
