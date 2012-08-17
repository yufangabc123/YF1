package edu.ch4;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class Sample4_14 {

	/**
	 * GridData示例
	 */
	public static void main(String[] args) {
		Display display=new Display();
		Shell shell=new Shell(display);
		shell.setText("GridData示例");
        GridLayout gridlayout=new GridLayout();//创建网格布局对象
        gridlayout.numColumns=3;//设置网格布局列数为3
        gridlayout.makeColumnsEqualWidth=true;//强制列宽相等
        shell.setLayout(gridlayout);//将shell设置为指定的网格布局式样
        GridData gridData=new GridData();//创建网格布局数据对象
	}

}
