package edu.ch4;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class Sample4_16 {

	/**
	 * FormLayoutʾ��
	 */
	public static void main(String[] args) {
		Display display=new Display();
		Shell shell=new Shell(display);
		shell.setText("FormLayoutʾ��");

		FormLayout formlayout= new FormLayout();
		formlayout.marginHeight=10; //����shell���ϡ��±�Ե������ľ���Ϊ10����
		
		Button b1=new Button(shell,SWT.PUSH);
		b1.setText("B1");
		FormData formData1=new FormData(); //�����������ݶ���formData1
		formData1.top=new FormAttachment(0,50); //�������B1�Ķ����븸����
		//shell�ϱ�Ե�ľ���Ϊ50����
		formData1.bottom=new FormAttachment(100,-50);//�������B1�ĵײ���shell����
		//��Ե�ľ���Ϊ50����
		formData1.left=new FormAttachment(0,50); //�������B1�������shell����
		//�߾���Ϊ50����
		formData1.right=new FormAttachment(100,-50); //�������B1���ұ���shell����
		//�߾���Ϊ50����
		formData1.width=100; //��ťb1�Ŀ��Ϊ100����
		formData1.height=50; //��ťb1�ĸ߶�Ϊ50����
		b1.setLayoutData(formData1); //����b1�Ĳ�������ΪformData1
		
		Button b2=new Button(shell,SWT.PUSH);
		b2.setText("B2");
		FormAttachment formAttachment=new FormAttachment();//����FormAttachment����
		FormData formData2=new FormData(50,30); //����FormData���󣬿��50���߶�30
		formData2.left=formAttachment; //B2�������shell���Ե�ľ���Ϊ0
		formData2.top=formAttachment; //B2���ϱ���shell�ϱ�Ե�ľ���Ϊ
		//marginHeight�趨��ֵ��10���أ�
		b2.setLayoutData(formData2); //����b2�Ĳ�������ΪformData2
		shell.setLayout(formlayout);
		
		shell.pack();
		shell.open();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
			display.sleep();
			}
			}
		display.dispose();
	}

}
