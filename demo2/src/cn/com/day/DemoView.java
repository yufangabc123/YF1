package cn.com.day;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;

public class DemoView {
	private static Text text;
	private static Text text_1;

	
	public static void main(String[] args) {
		Display display=new Display();
		Shell shell=new Shell(display);
		
		Label label = new Label(shell, SWT.NONE);
		label.setFont(SWTResourceManager.getFont("ËÎÌו", 12, SWT.NORMAL));
		label.setBounds(38, 60, 123, 25);
		label.setText("\u8BF7\u8F93\u5165\u7528\u6237\u540D\uFF1A");
		
		Label label_1 = new Label(shell, SWT.NONE);
		label_1.setFont(SWTResourceManager.getFont("ËÎÌו", 12, SWT.NORMAL));
		label_1.setBounds(40, 105, 96, 28);
		label_1.setText("\u8BF7\u8F93\u5165\u5BC6\u7801\uFF1A");
		
		text = new Text(shell, SWT.BORDER);
		text.setBounds(172, 60, 144, 18);
		
		text_1 = new Text(shell, SWT.BORDER);
		text_1.setBounds(171, 103, 145, 18);
		
		Button btnNewButton = new Button(shell, SWT.NONE);
		btnNewButton.setBounds(93, 165, 72, 22);
		btnNewButton.setText("\u63D0\u4EA4");
		
		Button btnNewButton_1 = new Button(shell, SWT.NONE);
		btnNewButton_1.setBounds(188, 165, 72, 22);
		btnNewButton_1.setText("\u91CD\u7F6E");
		shell.open();
        shell.pack();
		while(!shell.isDisposed()){
			if(!display.readAndDispatch()){
				display.sleep();
			}
			
		}
		display.dispose();
	}
}
