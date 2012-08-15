package de.vogella.rcp.intro.editor;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.EditorPart;


public class MyEditor extends EditorPart {

	public void init(IEditorSite site, IEditorInput input)
			throws PartInitException {
		this.setSite(site);
		this.setInput(input);
		this.setPartName(input.getName());

	}

	public void createPartControl(Composite parent) {
		Text text = new Text(parent, SWT.BORDER);
		text.setText("Imagine a fantastic user interface here");
	}

	public void doSave(IProgressMonitor monitor) {

		
	}

	public void doSaveAs() {
		
	}

	
	public boolean isDirty() {
		
		return false;
	}


	public boolean isSaveAsAllowed() {
		
		return false;
	}

	public void setFocus() {
		
		
	}

}
