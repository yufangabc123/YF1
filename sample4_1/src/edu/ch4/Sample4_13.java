package edu.ch4;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class Sample4_13 {

	/**
	 * GridLayout示例
	 */
	public static void main(String[] args) {
		Display display=new Display();//创建一个display
		Shell shell=new Shell(display);//设置程序主窗体
		shell.setText("GridLayout示例");
		GridLayout gridLayout = new GridLayout();
		gridLayout.numColumns = 3;
		gridLayout.horizontalSpacing=30;
		gridLayout.makeColumnsEqualWidth=true;
		shell.setLayout(gridLayout);
		new Button(shell, SWT.PUSH).setText("B1");
		new Button(shell, SWT.PUSH).setText("超宽按钮 2");
		new Button(shell, SWT.PUSH).setText("按钮 3");
		new Button(shell, SWT.PUSH).setText("B4");
		new Button(shell, SWT.PUSH).setText("按钮 5");
		shell.pack();
		shell.open();
		while (!shell.isDisposed()) {
		if (!display.readAndDispatch()) display.sleep();
		}
		display.dispose();
	}

}
