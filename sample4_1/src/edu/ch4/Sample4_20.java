package edu.ch4;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;

public class Sample4_20 {

	/**
	 * ���ѡ���¼�ʾ��
	 */
	public static void main(String[] args) {
		Display display = new Display();
		final Shell shell = new Shell(display,SWT.SHELL_TRIM);
		shell.setText("���ѡ���¼�ʾ��");
		Button button=new Button(shell,SWT.PUSH);
		button.setText("������");
		RowLayout layout=new RowLayout();
		layout.marginHeight=10;
		layout.marginWidth=20;
		shell.setLayout(layout);
		RowData data=new RowData(80,40);
		button.setLayoutData(data);
		button.addSelectionListener(new SelectionAdapter(){
		public void widgetSelected(SelectionEvent e){
		MessageBox dialog=new MessageBox(shell,SWT.OK|SWT.ICON_INFORMATION);
		dialog.setText("���ѡ���¼�");
		dialog.setMessage("��ã�SWT���磡");
		dialog.open();
		}
		});
		shell.pack();
		shell.open();
		while (!shell.isDisposed()) {
		if (!display.readAndDispatch()) {
		display.sleep();
		}
		}
		display.dispose();

	}

}
