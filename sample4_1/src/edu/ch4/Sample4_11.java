package edu.ch4;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class Sample4_11 {
/*
 * ʾFillLayout��
 */
	
	public static void main(String[] args) {
		Display display=new Display();
		Shell shell=new Shell(display);
        shell.setText("ʾFillLayout��");
       // FillLayout fillLayout=new FillLayout();��ťˮƽ����
        FillLayout fillLayout=new FillLayout(SWT.VERTICAL);//��ť��������
        shell.setLayout(fillLayout);
        
        new Button(shell,SWT.PUSH).setText("����ť1");
        new Button(shell,SWT.PUSH).setText("��ť2");
        new Button(shell,SWT.PUSH).setText("��ť3");
        new Button(shell,SWT.PUSH).setText("��ť4");
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
