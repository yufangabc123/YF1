package edu.ch4;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class Sample4_11 {
/*
 * 示FillLayout例
 */
	
	public static void main(String[] args) {
		Display display=new Display();
		Shell shell=new Shell(display);
        shell.setText("示FillLayout例");
       // FillLayout fillLayout=new FillLayout();按钮水平排列
        FillLayout fillLayout=new FillLayout(SWT.VERTICAL);//按钮纵向排列
        shell.setLayout(fillLayout);
        
        new Button(shell,SWT.PUSH).setText("超宽按钮1");
        new Button(shell,SWT.PUSH).setText("按钮2");
        new Button(shell,SWT.PUSH).setText("按钮3");
        new Button(shell,SWT.PUSH).setText("按钮4");
        shell.pack();
        shell.open();
        while(!shell.isDisposed()){
        	if(!display.readAndDispatch()){
        		display.sleep();
        	}
        }
        display.dispose();
	}

}
