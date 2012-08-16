package edu.ch4;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class Sample4_12 {

	/**
	 * RowLayoutʾ��
	 */
	public static void main(String[] args) {
		Display display=new Display();//����һ��display����
		final Shell shell=new Shell(display);//shell�ǳ����������
		shell.setText("RowLayoutʾ��");
      // RowLayout rowLayout=new RowLayout();��ť������
		RowLayout rowLayout=new RowLayout(SWT.VERTICAL);//��ť������
       rowLayout.pack=false;//ǿ�������С��ͬ
       rowLayout.marginHeight=20;//�����������Ե�ĸ߶�Ϊ20����
       rowLayout.marginWidth=20;//�����������Ե�Ŀ��Ϊ20����
       rowLayout.spacing=10;//���֮��ļ��Ϊ10����
       shell.setLayout(rowLayout);//��������shell�Ĳ��ַ�ʽΪrowLayout
       Button bt1=new Button(shell,SWT.PUSH); //������ť
       bt1.setText("��ť1");
       RowData rowdata=new RowData(80,30);//��������������Ķ���
       bt1.setLayoutData(rowdata);//���ð�ť�Ĳ�������
       new Button(shell,SWT.PUSH).setText("��ť2");
       new Button(shell,SWT.PUSH).setText("��ť3");
       new Button(shell,SWT.PUSH).setText("��ť4");
       shell.pack(); //�Զ���������shell�Ĵ�С
       shell.open(); //��������
       while(!shell.isDisposed()){//���������û�йر���һֱѭ��
    	   if(!display.readAndDispatch()){//���display��æ
    		   display.sleep();//����
    	   }
       }
       display.dispose();//����display
	}

}
