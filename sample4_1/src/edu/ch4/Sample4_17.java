package edu.ch4;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class Sample4_17 {

	/**
	 * FormLayout示例
	 */
	public static void main(String[] args) {
		Display display = new Display();
		Shell shell = new Shell(display);
		shell.setText("FormLayout示例");
		FormLayout formlayout = new FormLayout(); //创建表格布局对象
		shell.setLayout(formlayout);
		
		Label label=new Label(shell,SWT.BORDER); //在shell中创建Label对象
		label.setText("Label One");
		FormData data = new FormData();
		data.top = new FormAttachment(0, 5); //Label与shell上边框相距5象素
		data.left = new FormAttachment(0, 5); // Label与shell左边框相距5象素
		data.bottom = new FormAttachment(50, -5);//Label在shell水平中线上方5象素
		data.right = new FormAttachment(50, -5); // Label在shell垂直中线左边5象素
		label.setLayoutData(data);
		
		Composite composite = new Composite(shell, SWT.NONE);//创建面板
		GridLayout gridLayout = new GridLayout(); //创建网格布局对象
		gridLayout.marginHeight = 0;
		gridLayout.marginWidth = 0;
		composite.setLayout(gridLayout); //设置面板布局方式为网格布局
		
		Button b1 = new Button(composite, SWT.PUSH); //在composite上创建button B1
		b1.setText("B1");
		GridData gridData = new GridData(GridData.FILL_BOTH); //设置布局方式为双向填充
		b1.setLayoutData(gridData);
		
		Button b2 = new Button(composite, SWT.PUSH); //B2设置同B1
		b2.setText("B2");
		gridData = new GridData(GridData.FILL_BOTH);
		b2.setLayoutData(gridData);
		
		Button b3 = new Button(composite, SWT.PUSH); //B2设置同B1
		b3.setText("B3");
		gridData = new GridData(GridData.FILL_BOTH);
		b3.setLayoutData(gridData);
		
		data = new FormData(); //创建FormData对象
		data.top = new FormAttachment(0, 5); //设置composite距shell上边框5象素
		data.left = new FormAttachment(label, 5);//设置composite距label 5象素
		data.bottom = new FormAttachment(50, -5);//设置composite在shell水平中线上方5象素
		data.right = new FormAttachment(100, -5);//设置composite在shell右边框的左侧5象素
		composite.setLayoutData(data); //设置composite的布局数据
		
		Text text=new Text(shell,SWT.BORDER); //创建Text对象
		text.setText("Text");
		data = new FormData(); //创建表格布局数据
		data.top = new FormAttachment(label, 5); //text上方离label 5象素
		data.left = new FormAttachment(0, 5); // text左边离shell左边框5象素
		data.bottom = new FormAttachment(100, -5); // text下边框离shell下边框5象素
		data.right = new FormAttachment(100, -5); // text右边框离shell右边框5象素
		text.setLayoutData(data);//设置text的布局数据
		
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
