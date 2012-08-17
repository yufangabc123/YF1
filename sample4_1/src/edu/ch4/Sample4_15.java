package edu.ch4;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class Sample4_15 {

	/**
	 * FormLayoutʾ��
	 */
	public static void main(String[] args) {
		Display display=new Display();
		Shell shell=new Shell(display);
        shell.setText("FormLayoutʾ��");
        
        FormLayout formLayout=new FormLayout();//������񲼾ֶ���formLayout
        shell.setLayout(formLayout);//����shell�Ĳ��ַ�ʽΪ��񲼾�
        formLayout.marginHeight=10;//����shell�����±߾�Ϊ10����
        formLayout.marginWidth=20;//����shell�����ұ߾�Ϊ10����
        
        Button b1=new Button(shell,SWT.PUSH);
        b1.setText("B1");
        FormData formData1=new FormData(); //�����������ݶ���formData1
        formData1.width=100;//��ťb1�Ŀ��Ϊ100����
        formData1.height=50;//��ťb1�ĸ߶�Ϊ50����
        b1.setLayoutData(formData1); //����b1�Ĳ�������ΪformData1
        
        Button b2=new Button(shell,SWT.PUSH);
        b2.setText("B2");
        FormData formData2=new FormData(50,30); //����FormData���󣬿��50���߶�30
        b2.setLayoutData(formData2);//����b2�Ĳ�������ΪformData2
      //����FormAttachment����formAttachment,��b1Ϊ������
        FormAttachment formAttachment=new FormAttachment(b1); //ָ��B1Ϊ������
        formData2.left=formAttachment;//b2����߽�����b1���ұ�
        
        Button b3=new Button(shell,SWT.PUSH);
        b3.setText("B3");
        FormData formData3=new FormData();//�����������ݶ���formData3
        formData3.top=new FormAttachment(b2,10,SWT.BOTTOM);//b2�ĵױ���b3�Ķ�������Ϊ10
        formData3.left=new FormAttachment(b2,0,SWT.LEFT);//b2�������b3���λ��Ϊ0������߶���
        formData3.right=new FormAttachment(b2,0,SWT.RIGHT); //b2���ұ���b3�ұ߶���
        b3.setLayoutData(formData3); //����b3�Ĳ�������ΪformData3
        
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
