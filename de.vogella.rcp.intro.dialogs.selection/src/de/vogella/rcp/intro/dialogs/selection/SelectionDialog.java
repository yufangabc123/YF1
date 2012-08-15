package de.vogella.rcp.intro.dialogs.selection;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.eclipse.ui.handlers.HandlerUtil;

public class SelectionDialog extends AbstractHandler  {



	public void dispose() {

	}

	public Object execute(ExecutionEvent event) throws ExecutionException {
		Shell shell = HandlerUtil.getActiveWorkbenchWindow(event).getShell();
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(
		shell, new LabelProvider());
		dialog.setElements(new String[] { "Linux", "Mac", "Windows" });
		dialog.setTitle("Which operating system are you using");
		if (dialog.open()!= Window.OK){
			return false;
			}
			Object[] result = dialog.getResult();
			for (Object s : result) {
			System.out.println(s.toString());
			}

		return true;
	}

	
	public boolean isEnabled() {
		
		return false;
	}

	
	public boolean isHandled() {
		
		return false;
	}



}
