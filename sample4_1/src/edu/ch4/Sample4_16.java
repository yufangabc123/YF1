package edu.ch4;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class Sample4_16 {

	/**
	 * FormLayout示例
	 */
	public static void main(String[] args) {
		Display display=new Display();
		Shell shell=new Shell(display);
		shell.setText("FormLayout示例");

		FormLayout formlayout= new FormLayout();
		formlayout.marginHeight=10; //设置shell的上、下边缘和组件的距离为10像素
		
		Button b1=new Button(shell,SWT.PUSH);
		b1.setText("B1");
		FormData formData1=new FormData(); //创建布局数据对象formData1
		formData1.top=new FormAttachment(0,50); //设置组件B1的顶部离父容器
		//shell上边缘的距离为50像素
		formData1.bottom=new FormAttachment(100,-50);//设置组件B1的底部离shell的下
		//边缘的距离为50像素
		formData1.left=new FormAttachment(0,50); //设置组件B1的左边离shell的左
		//边距离为50像素
		formData1.right=new FormAttachment(100,-50); //设置组件B1的右边离shell的右
		//边距离为50像素
		formData1.width=100; //按钮b1的宽度为100像素
		formData1.height=50; //按钮b1的高度为50像素
		b1.setLayoutData(formData1); //设置b1的布局数据为formData1
		
		Button b2=new Button(shell,SWT.PUSH);
		b2.setText("B2");
		FormAttachment formAttachment=new FormAttachment();//创建FormAttachment对象
		FormData formData2=new FormData(50,30); //创建FormData对象，宽度50，高度30
		formData2.left=formAttachment; //B2的左边与shell左边缘的距离为0
		formData2.top=formAttachment; //B2的上边与shell上边缘的距离为
		//marginHeight设定的值（10像素）
		b2.setLayoutData(formData2); //设置b2的布局数据为formData2
		shell.setLayout(formlayout);
		
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
