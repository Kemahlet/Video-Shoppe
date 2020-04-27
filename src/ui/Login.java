package ui;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.layout.GridData;
import org.eclipse.wb.swt.SWTResourceManager;

public class Login {

	protected Shell shell;
	private Text entryUsername;
	private Text entryPassword;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Login window = new Login();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
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
		shell.setSize(451, 300);
		shell.setText("Video Shoppe");
		shell.setLayout(new GridLayout(5, false));
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		Label lblWelcomePleaseLog = new Label(shell, SWT.NONE);
		lblWelcomePleaseLog.setText("Welcome. Please log in using your employee ID.");
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		Label lblUsername = new Label(shell, SWT.NONE);
		lblUsername.setText("Username");
		new Label(shell, SWT.NONE);
		
		entryUsername = new Text(shell, SWT.BORDER);
		entryUsername.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		entryUsername.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		GridData gd_entryUsername = new GridData(SWT.LEFT, SWT.CENTER, true, false, 2, 1);
		gd_entryUsername.widthHint = 243;
		entryUsername.setLayoutData(gd_entryUsername);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		Label lblPassword = new Label(shell, SWT.NONE);
		lblPassword.setText("Password");
		new Label(shell, SWT.NONE);
		
		entryPassword = new Text(shell, SWT.BORDER);
		entryPassword.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		GridData gd_entryPassword = new GridData(SWT.LEFT, SWT.CENTER, true, false, 2, 1);
		gd_entryPassword.widthHint = 244;
		entryPassword.setLayoutData(gd_entryPassword);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		Button btnLogIn = new Button(shell, SWT.NONE);
		GridData gd_btnLogIn = new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1);
		gd_btnLogIn.heightHint = 25;
		gd_btnLogIn.widthHint = 92;
		btnLogIn.setLayoutData(gd_btnLogIn);
		btnLogIn.setText("Log In");
		new Label(shell, SWT.NONE);

	}

}
