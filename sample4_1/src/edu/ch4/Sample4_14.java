package edu.ch4;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

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
        gridData.horizontalSpan=2;//ˮƽ�����2��
        gridData.verticalSpan=2;//��ֱ�����2��
        gridData.horizontalAlignment=gridData.CENTER;//ˮƽ�������
        gridData.verticalAlignment=gridData.FILL;//��ֱ�������
        Button b1=new Button(shell, SWT.PUSH); //������ť����b1
        b1.setText("B1");
        b1.setLayoutData(gridData);//���趨�����񲼾��������ڰ�ť����b1
        new Button(shell, SWT.PUSH).setText("����ť 2");
        new Button(shell, SWT.PUSH).setText("��ť 3");
        Button b4=new Button(shell, SWT.PUSH);
        b4.setText("B4");
      //�ô������Ĺ��췽������gridData����
        gridData = new GridData(GridData.FILL_HORIZONTAL);
        b4.setLayoutData(gridData); //��gridData����b4��ˮƽ�������
        Button b5=new Button(shell, SWT.PUSH);
        b5.setText("��ť 5");
        gridData = new GridData();
        gridData.horizontalAlignment = GridData.FILL;//����b5Ϊˮƽ�������
        b5.setLayoutData(gridData);
        new Button(shell, SWT.PUSH).setText("��ť 6");
        Text t1=new Text(shell,SWT.BORDER);
        t1.setText("�ı��� 1");
        gridData = new GridData();
        gridData.verticalSpan = 2; //������
        gridData.horizontalSpan=2; //������
        gridData.verticalAlignment = GridData.FILL; //��ֱ�������
        gridData.grabExcessVerticalSpace = true; //��ռ��ֱ�������ռ�
        gridData.horizontalAlignment = GridData.FILL;//ˮƽ�������
        gridData.grabExcessHorizontalSpace = true;//��ռˮƽ�������ռ�
        t1.setLayoutData(gridData); //gridData�����ı���t1
        new Button(shell, SWT.PUSH).setText("��ť 7");
        new Button(shell, SWT.PUSH).setText("��ť 8");
        shell.pack();
        shell.open();
        while (!shell.isDisposed()) {
        	if (!display.readAndDispatch()) display.sleep();
        	}
        display.dispose();
	}

}
