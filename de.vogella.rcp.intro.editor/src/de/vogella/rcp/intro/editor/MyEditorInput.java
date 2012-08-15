package de.vogella.rcp.intro.editor;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IPersistableElement;

public class MyEditorInput implements IEditorInput{


	public Object getAdapter(Class adapter) {

		return null;
	}


	public boolean exists() {
		
		return false;
	}


	public ImageDescriptor getImageDescriptor() {
	
		return null;
	}


	public String getName() {

		return "TEST";
	}

	
	public IPersistableElement getPersistable() {
		
		return null;
	}

	
	public String getToolTipText() {
	
		return "";
	}

}
