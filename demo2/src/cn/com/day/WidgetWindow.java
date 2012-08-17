package cn.com.day;

import org.eclipse.jface.window.ApplicationWindow;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.*;


public class WidgetWindow extends ApplicationWindow{
	public WidgetWindow() {
		super(null);
		}
protected Control createContents(Composite parent){
//	getShell().setText("Widget Window");
//	parent.setSize(400,250);
//	Label shadow_sep = new Label(parent, SWT.SEPARATOR | SWT.SHADOW_OUT);
//	shadow_sep.setBounds(30,85,110,5);
	TabFolder tf = new TabFolder(parent, SWT.NONE);
	TabItem chap3 = new TabItem(tf,SWT.NONE);
	chap3.setText("Chapter 3");
	chap3.setControl(new Ch3_Composite(tf));
	getShell().setText("Widget Window");
	return parent;
}
public static void main(String[] args) {
	WidgetWindow ww=new WidgetWindow();
	ww.setBlockOnOpen(true);
	ww.open();
	Display.getCurrent().dispose();

}

}
