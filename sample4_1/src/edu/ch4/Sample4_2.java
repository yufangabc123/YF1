package edu.ch4;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class Sample4_2 {
	public static void main(String[] args) {
		Display display=new Display();//����һ��display����
		Shell shell=new Shell(display);//shell�ǳ����������
		//shell.setLayout(null); //����shell�Ĳ��ַ�ʽ
		shell.setText("��ťʾ��"); //����������ı���
		Button bt1=new Button(shell,SWT.NULL); //����Ĭ�ϰ�ť
		bt1.setText("SWT.NULL"); //���ð�ť�ϵ�����
		bt1.setBounds(10,10,75,30); //���ð�ť��ʾλ�ü���ȡ��߶�
		Button bt2=new Button(shell,SWT.PUSH|SWT.BORDER); //���������Ͱ�ť
		bt2.setText("SWT.PUSH");
		bt2.setBounds(90,10,75,30);
		Button check1=new Button(shell,SWT.CHECK);//������ѡ��ť
		check1.setText("SWT.CHECK");
		check1.setBounds(10,50,75,30);
		Button check2=new Button(shell,SWT.CHECK|SWT.BORDER);//���������͸�ѡ��ť
		check2.setText("SWT.CHECK");
		check2.setBounds(90,50,75,30);
		Button radio1=new Button(shell,SWT.RADIO);//������ѡ��ť
		radio1.setText("SWT.RADIO");
		radio1.setBounds(10,90,75,30);
		Button radio2=new Button(shell,SWT.RADIO|SWT.BORDER);//���������͵�ѡ��ť
		radio2.setText("SWT.RADIO");
		radio2.setBounds(90,90,75,30);
		Button arrowLeft=new Button(shell,SWT.ARROW|SWT.LEFT);//������ͷ��ť������
		arrowLeft.setBounds(10,130,75,20);
		Button arrowRight=new Button(shell,SWT.ARROW|SWT.RIGHT|SWT.BORDER);
		arrowRight.setBounds(90,130,75,20);
		shell.pack(); //�Զ�����������Ĵ�С
		shell.open(); //��������
		while(!shell.isDisposed()){ //���������û�йر�
		if(!display.readAndDispatch()){ //���display��æ
		display.sleep(); //����
		}
		}
		display.dispose(); //����display
	}
}
