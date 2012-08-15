package de.vogella.rcp.intro.dialogs.custom;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.window.Window;
import org.eclipse.ui.handlers.HandlerUtil;


public class OpenMyDialog extends AbstractHandler  {

	public Object execute(ExecutionEvent event) throws ExecutionException {
		MyDialog dialog = new MyDialog(HandlerUtil.getActiveWorkbenchWindow(
				event).getShell());
				dialog.create();
				if (dialog.open() == Window.OK) {
				System.out.println(dialog.getFirstName());
				System.out.println(dialog.getLastName());
				}
		return null;
	}
}
