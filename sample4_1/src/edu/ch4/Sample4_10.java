package edu.ch4;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Text;

public class Sample4_10 {

	public static void main(String[] args) {
			Display display=new Display();//创建一个display对象
			final Shell shell=new Shell(display);//shell是程序的主窗体
			shell.setText("选项卡示例");
			TabFolder tabFolder=new TabFolder(shell,SWT.NONE);//声明一个选项卡容器
			tabFolder.setBounds(5, 5, 180, 130);//设置选项卡大小和位置
			TabItem tabItem1=new TabItem(tabFolder,SWT.NONE);//声明第一个选项页
			tabItem1.setText("选项1");
			{
				Group group1=new Group(tabFolder,SWT.NONE);//创建第一个分组框，建立在tabFolder上
				group1.setText("录入信息");//设置分组框说明信息
				tabItem1.setControl(group1);//让tabItem1控制group1
				
				Label b1=new Label(group1,SWT.NONE);
				b1.setText("姓名:");
				b1.setBounds(10, 20, 70, 20);
				
				Text text1=new Text(group1,SWT.BORDER);
				text1.setBounds(90, 20, 70, 20);
				
				Label b2=new Label(group1,SWT.NONE);
				b2.setText("地址:");
				b2.setBounds(10, 50, 70, 20);
				
				Text text2=new Text(group1,SWT.BORDER);
				text2.setBounds(90, 50, 70, 20);
			}
			TabItem tabItem2=new TabItem(tabFolder,SWT.NONE);//声明第二个选项页
			tabItem2.setText("选项2");
			{
				Group group2=new Group(tabFolder,SWT.NONE);//创建第二个分组框，建立在tabFolder上
				group2.setText("兴趣爱好");//设置分组框说明信息
				tabItem2.setControl(group2);//让tabItem2控制group2
				
				Button b1=new Button(group2,SWT.CHECK);
				b1.setBounds(20, 20, 70, 20);
				b1.setText("音乐");
				
				Button b2=new Button(group2,SWT.CHECK);
				b2.setBounds(20, 50, 70, 20);
				b2.setText("美术");
				
				Button b3=new Button(group2,SWT.CHECK);
				b3.setBounds(20, 80, 70, 20);
				b3.setText("体育");
			}
			shell.pack();
			shell.open();
			while(!shell.isDisposed()){//如果主窗体没有关闭则一直循环
				if(!display.readAndDispatch()){//如果display不忙
					display.sleep();//休眠
				}
			}
			display.dispose();//销毁 display
	}

}
