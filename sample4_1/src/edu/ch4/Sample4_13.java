package edu.ch4;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class Sample4_13 {

	/**
	 * GridLayoutʾ��
	 */
	public static void main(String[] args) {
		Display display=new Display();//����һ��display
		Shell shell=new Shell(display);//���ó���������
		shell.setText("GridLayoutʾ��");
		GridLayout gridLayout = new GridLayout();
		gridLayout.numColumns = 3;
		gridLayout.horizontalSpacing=30;
		gridLayout.makeColumnsEqualWidth=true;
		shell.setLayout(gridLayout);
		new Button(shell, SWT.PUSH).setText("B1");
		new Button(shell, SWT.PUSH).setText("����ť 2");
		new Button(shell, SWT.PUSH).setText("��ť 3");
		new Button(shell, SWT.PUSH).setText("B4");
		new Button(shell, SWT.PUSH).setText("��ť 5");
		shell.pack();
		shell.open();
		while (!shell.isDisposed()) {
		if (!display.readAndDispatch()) display.sleep();
		}
		display.dispose();
	}

}
