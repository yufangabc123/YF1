package edu.ch4;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class Sample4_14 {

	/**
	 * GridDataʾ��
	 */
	public static void main(String[] args) {
		Display display=new Display();
		Shell shell=new Shell(display);
		shell.setText("GridDataʾ��");
        GridLayout gridlayout=new GridLayout();//�������񲼾ֶ���
        gridlayout.numColumns=3;//�������񲼾�����Ϊ3
        gridlayout.makeColumnsEqualWidth=true;//ǿ���п����
        shell.setLayout(gridlayout);//��shell����Ϊָ�������񲼾�ʽ��
        GridData gridData=new GridData();//�������񲼾����ݶ���
	}

}
