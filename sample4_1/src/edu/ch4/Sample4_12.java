package edu.ch4;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class Sample4_12 {

	/**
	 * RowLayout示例
	 */
	public static void main(String[] args) {
		Display display=new Display();//创建一个display对象。
		final Shell shell=new Shell(display);//shell是程序的主窗体
		shell.setText("RowLayout示例");
      // RowLayout rowLayout=new RowLayout();按钮行排列
		RowLayout rowLayout=new RowLayout(SWT.VERTICAL);//按钮列排列
       rowLayout.pack=false;//强制组件大小相同
       rowLayout.marginHeight=20;//组件距容器边缘的高度为20像素
       rowLayout.marginWidth=20;//组件距容器边缘的宽度为20像素
       rowLayout.spacing=10;//组件之间的间距为10像素
       shell.setLayout(rowLayout);//设置容器shell的布局方式为rowLayout
       Button bt1=new Button(shell,SWT.PUSH); //创建按钮
       bt1.setText("按钮1");
       RowData rowdata=new RowData(80,30);//创建布局数据类的对象
       bt1.setLayoutData(rowdata);//设置按钮的布局数据
       new Button(shell,SWT.PUSH).setText("按钮2");
       new Button(shell,SWT.PUSH).setText("按钮3");
       new Button(shell,SWT.PUSH).setText("按钮4");
       shell.pack(); //自动调整容器shell的大小
       shell.open(); //打开主窗体
       while(!shell.isDisposed()){//如果主窗体没有关闭则一直循环
    	   if(!display.readAndDispatch()){//如果display不忙
    		   display.sleep();//休眠
    	   }
       }
       display.dispose();//销毁display
	}

}
