package ui;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class ManagerPage extends Composite {
	private Text txtAddCustomer;
	private Text txtHello;

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public ManagerPage(Composite parent, int style) {
		super(parent, style);
		setLayout(new GridLayout(4, false));
		
		txtHello = new Text(this, SWT.BORDER);
		txtHello.setText("Hello, ");
		GridData gd_txtHello = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
		gd_txtHello.widthHint = 95;
		txtHello.setLayoutData(gd_txtHello);
		
		Label employeeName = new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		
		Label lblEmployeeId = new Label(this, SWT.NONE);
		lblEmployeeId.setText("Employee ID:");
		
		Label idNumber = new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		
		Label lblHoursWorked = new Label(this, SWT.NONE);
		lblHoursWorked.setText("Hours Worked:");
		
		Label hrsWorked = new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		
		Label lblCustomer = new Label(this, SWT.NONE);
		lblCustomer.setText("Customer");
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		
		Label lblInventory = new Label(this, SWT.NONE);
		lblInventory.setText("Inventory");
		
		Button btnAddCustomer = new Button(this, SWT.NONE);
		btnAddCustomer.setText("Add Customer");
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		
		Button btnSearchForDvds = new Button(this, SWT.NONE);
		btnSearchForDvds.setText("Search for DVDs");
		
		Button btnUpdateCustomer = new Button(this, SWT.NONE);
		btnUpdateCustomer.setText("Update Customer");
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		
		Button btnUpdateInventory = new Button(this, SWT.NONE);
		btnUpdateInventory.setText("Update Inventory");
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		
		Button btnReturnDvd = new Button(this, SWT.NONE);
		btnReturnDvd.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnReturnDvd.setText("Return DVD");
		
		txtAddCustomer = new Text(this, SWT.BORDER);
		txtAddCustomer.setText("Employee");
		txtAddCustomer.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		
		Button btnAddEmployee = new Button(this, SWT.NONE);
		btnAddEmployee.setText("Add Employee");
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		
		Button btnUpdateEmployee = new Button(this, SWT.NONE);
		btnUpdateEmployee.setText("Update Employee");
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}

}
