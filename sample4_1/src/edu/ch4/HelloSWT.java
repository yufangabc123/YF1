package edu.ch4;


import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.graphics.*;

public class HelloSWT {
	public static void main(String[] args){
		Display display=new Display();//����һ��display����
		Shell shell=new Shell();//shell�ǳ����������
		shell.setLayout(null); //����shell�Ĳ��ַ�ʽ
		Text hello=new Text(shell,SWT.MULTI); //����һ��������ʾ������Ϣ���ı���
		shell.setText("JavaӦ�ó���"); //����������ı���
		shell.setSize(200,100); //����������Ĵ�С
		Color color=new Color(Display.getCurrent(),255,255,255);//������ɫ����
		shell.setBackground(color); //���ô���ı�����ɫ
		hello.setText("Hello, SWT World!\n\n��ã�SWT���磡");//�����ı�����Ϣ
		hello.pack(); //�Զ������ı���Ĵ�С
		//shell.pack(); //�Զ�����������Ĵ�С
		shell.open(); //��������
		while(!shell.isDisposed()){ //���������û�йر���һֱѭ��
		if(!display.readAndDispatch()){ //���display��æ
		display.sleep(); //����
		}
		}
		display.dispose(); //����display
	}
	
}
