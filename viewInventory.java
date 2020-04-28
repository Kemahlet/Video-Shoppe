import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.List;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.jface.layout.TableColumnLayout;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.custom.ScrolledComposite;

public class viewInventory {
	private static class ContentProvider implements IStructuredContentProvider {
		public Object[] getElements(Object inputElement) {
			return new Object[0];
		}
		public void dispose() {
		}
		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		}
	}

	protected Shell shell;
	private Text text;
	private final FormToolkit formToolkit = new FormToolkit(Display.getDefault());

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			viewInventory window = new viewInventory();
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
		shell.setMinimumSize(new Point(640, 480));
		shell.setSize(450, 300);
		shell.setText("SWT Application");
		
		Label lblNewLabel = new Label(shell, SWT.NONE);
		lblNewLabel.setBounds(10, 20, 75, 15);
		lblNewLabel.setText("Search By...");
		
		text = new Text(shell, SWT.BORDER);
		text.setBounds(10, 41, 268, 21);
		
		Button searchButton = new Button(shell, SWT.NONE);
		searchButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		searchButton.setBounds(284, 39, 75, 25);
		searchButton.setText("Search");
		
		Label lblSearchBy = new Label(shell, SWT.NONE);
		lblSearchBy.setBounds(175, 73, 69, 15);
		lblSearchBy.setText("Search By...");
		
		Combo combo = new Combo(shell, SWT.NONE);
		combo.setItems(new String[] {"Select All", "Title", "Actor", "Director", "Genre", "Rating"});
		combo.setBounds(268, 70, 91, 18);
		combo.setText("Search By");

		
		ScrolledComposite scrolledComposite = new ScrolledComposite(shell, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
		scrolledComposite.setBounds(20, 111, 419, 320);
		formToolkit.adapt(scrolledComposite);
		formToolkit.paintBordersFor(scrolledComposite);
		scrolledComposite.setExpandHorizontal(true);
		scrolledComposite.setExpandVertical(true);
			
			Composite composite = formToolkit.createComposite(scrolledComposite, SWT.NONE);
			formToolkit.paintBordersFor(composite);
			
			Label lblTitle = new Label(composite, SWT.NONE);
			lblTitle.setText("Title: ");
			lblTitle.setBounds(10, 10, 55, 15);
			formToolkit.adapt(lblTitle, true, true);
			
			Label lblRating = new Label(composite, SWT.NONE);
			lblRating.setBounds(10, 30, 55, 15);
			formToolkit.adapt(lblRating, true, true);
			lblRating.setText("Rating: ");
			
			Label lblGenre = new Label(composite, SWT.NONE);
			lblGenre.setText("Genre:");
			lblGenre.setBounds(10, 51, 55, 15);
			formToolkit.adapt(lblGenre, true, true);
			
			Label lblActor = new Label(composite, SWT.NONE);
			lblActor.setText("Actor:");
			lblActor.setBounds(10, 93, 55, 15);
			formToolkit.adapt(lblActor, true, true);
			
			Label lblDirector = new Label(composite, SWT.NONE);
			lblDirector.setText("Director:");
			lblDirector.setBounds(10, 72, 55, 15);
			formToolkit.adapt(lblDirector, true, true);
			
			Button btnNewButton = new Button(composite, SWT.NONE);
			btnNewButton.setBounds(264, 46, 75, 25);
			formToolkit.adapt(btnNewButton, true, true);
			btnNewButton.setText("Transaction");
			scrolledComposite.setContent(composite);
			scrolledComposite.setMinSize(composite.computeSize(SWT.DEFAULT, SWT.DEFAULT));		  
			
			Button btnHome = new Button(shell, SWT.NONE);
			btnHome.setBounds(497, 406, 75, 25);
			formToolkit.adapt(btnHome, true, true);
			btnHome.setText("Home");

	}
}
