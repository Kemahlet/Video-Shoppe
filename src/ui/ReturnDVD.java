package ui;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;

import business.Database;

import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.widgets.Button;

public class ReturnDVD {

	protected Shell shlReturnDvd;
	private Text barcodeEntry;
	private Database database = new Database();

	public ReturnDVD () {
		
	}

	/**
	 * Open the window.
	 * @wbp.parser.entryPoint
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shlReturnDvd.open();
		shlReturnDvd.layout();
		while (!shlReturnDvd.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlReturnDvd = new Shell();
		shlReturnDvd.setSize(450, 300);
		shlReturnDvd.setText("Return DVD");
		shlReturnDvd.setLayout(new FormLayout());
		
		Label lblEnterOrScan = new Label(shlReturnDvd, SWT.NONE);
		FormData fd_lblEnterOrScan = new FormData();
		fd_lblEnterOrScan.top = new FormAttachment(0, 85);
		fd_lblEnterOrScan.left = new FormAttachment(0, 166);
		lblEnterOrScan.setLayoutData(fd_lblEnterOrScan);
		lblEnterOrScan.setText("Enter or Scan Barcode:");
		
		barcodeEntry = new Text(shlReturnDvd, SWT.BORDER);
		FormData fd_barcodeEntry = new FormData();
		fd_barcodeEntry.top = new FormAttachment(lblEnterOrScan, 6);
		fd_barcodeEntry.right = new FormAttachment(100, -61);
		fd_barcodeEntry.left = new FormAttachment(0, 82);
		barcodeEntry.setLayoutData(fd_barcodeEntry);
		
		Button btnReturnDvd = new Button(shlReturnDvd, SWT.NONE);
		FormData fd_btnReturnDvd = new FormData();
		fd_btnReturnDvd.top = new FormAttachment(barcodeEntry, 6);
		fd_btnReturnDvd.left = new FormAttachment(barcodeEntry, 0, SWT.LEFT);
		btnReturnDvd.setLayoutData(fd_btnReturnDvd);
		btnReturnDvd.setText("Return DVD");
		btnReturnDvd.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {
				try {
					database.returnDVD(barcodeEntry.getText());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		Button btnCancel = new Button(shlReturnDvd, SWT.NONE);
		fd_btnReturnDvd.right = new FormAttachment(btnCancel, -38);
		FormData fd_btnCancel = new FormData();
		fd_btnCancel.left = new FormAttachment(100, -179);
		fd_btnCancel.top = new FormAttachment(barcodeEntry, 6);
		fd_btnCancel.right = new FormAttachment(100, -61);
		btnCancel.setLayoutData(fd_btnCancel);
		btnCancel.setText("Cancel");
		btnCancel.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {
				shlReturnDvd.close();
			}
		});

	}
}
