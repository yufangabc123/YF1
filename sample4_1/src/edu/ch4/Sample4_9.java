package edu.ch4;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class Sample4_9 {

	public static void main(String[] args) {
		Display display=new Display();//����һ��display����
		final Shell shell=new Shell(display);//shell�ǳ����������
		shell.setText("�����ʾ��");
		Group group1=new Group(shell,SWT.NONE); //���������
		group1.setText("¼����Ϣ"); //���÷����˵����Ϣ
		group1.setBounds(10,20,200,100);
		Label lb1=new Label(group1,SWT.NONE); //�ڷ�����м������
		lb1.setText("������");
		lb1.setBounds(10,20,70,20);
		Text text1=new Text(group1,SWT.BORDER);
		text1.setBounds(90,20,70,20);
		Label lb2=new Label(group1,SWT.NONE);
		lb2.setText("��ַ��");
		lb2.setBounds(10,50,70,20);
		Text text2=new Text(group1,SWT.BORDER);
		text2.setBounds(90,50,70,20);
		shell.pack();
		shell.open();
		while(!shell.isDisposed()){ //���������û�йر���һֱѭ��
		if(!display.readAndDispatch()){ //���display��æ
		display.sleep(); //����
		}
		}
		display.dispose(); //����display
	}

}
