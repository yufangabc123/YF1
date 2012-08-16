package edu.ch4;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

public class Sample4_3 {
public static void main(String[]args){
	Display display=new Display();//����һ��display����
	Shell shell=new Shell(display);//shell�ǳ����������
	//shell.setLayout(null); //����shell�Ĳ��ַ�ʽ
	shell.setText("��ǩʾ��"); //����������ı���
	Label lb1=new Label(shell,SWT.BORDER|SWT.RIGHT);//�����͡������Ҷ���
	lb1.setBounds(10,10,70,30);
	lb1.setText("��ǩ1");
	lb1.setFont(new Font(display,"����",14,SWT.BOLD));//�������ֵ������ֺ�
	lb1.setForeground(Display.getCurrent().getSystemColor(SWT.COLOR_BLUE));
	Label lb2=new Label(shell,SWT.CENTER);//���־��еı�ǩ
	lb2.setBounds(90,10,70,30);
	lb2.setText("��ǩ2");
	lb2.setFont(new Font(display,"����",14,SWT.NORMAL));//�������ֵ������ֺ�
	Label lb3=new Label(shell,SWT.SEPARATOR|SWT.BORDER);//��ֱ������
	lb3.setBounds(10,50,70,30);
	Label lb4=new Label(shell,SWT.SEPARATOR|SWT.HORIZONTAL|SWT.BORDER);
	//ˮƽ������
	lb4.setBounds(90,50,70,30);
	shell.pack(); //�Զ�����������Ĵ�С
	shell.open(); //��������
	while(!shell.isDisposed()){ //���������û�йر���һֱѭ��
	if(!display.readAndDispatch()){ //���display��æ
	display.sleep(); //����
	}
	}
	display.dispose();
}
}
