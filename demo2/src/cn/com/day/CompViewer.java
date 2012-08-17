package cn.com.day;

import org.eclipse.jface.window.ApplicationWindow;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;


public class CompViewer extends ApplicationWindow{

	public CompViewer() {
		super(null);
	
	}
	protected Control createContents(Composite parent) {
		//Ch3_Group cc1 = new Ch3_Group(parent);
		
		//Ch3_SashForm cc3=new Ch3_SashForm(parent);
		
		Ch3_Composite a=new Ch3_Composite(parent);
		return parent;
	}
	public static void main(String[] args) {
		CompViewer cv = new CompViewer();
		cv.setBlockOnOpen(true);
		cv.open();
		Display.getCurrent().dispose();
	}
}
