package edu.ch4;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class Sample4_17 {

	/**
	 * FormLayoutʾ��
	 */
	public static void main(String[] args) {
		Display display = new Display();
		Shell shell = new Shell(display);
		shell.setText("FormLayoutʾ��");
		FormLayout formlayout = new FormLayout(); //������񲼾ֶ���
		shell.setLayout(formlayout);
		
		Label label=new Label(shell,SWT.BORDER); //��shell�д���Label����
		label.setText("Label One");
		FormData data = new FormData();
		data.top = new FormAttachment(0, 5); //Label��shell�ϱ߿����5����
		data.left = new FormAttachment(0, 5); // Label��shell��߿����5����
		data.bottom = new FormAttachment(50, -5);//Label��shellˮƽ�����Ϸ�5����
		data.right = new FormAttachment(50, -5); // Label��shell��ֱ�������5����
		label.setLayoutData(data);
		
		Composite composite = new Composite(shell, SWT.NONE);//�������
		GridLayout gridLayout = new GridLayout(); //�������񲼾ֶ���
		gridLayout.marginHeight = 0;
		gridLayout.marginWidth = 0;
		composite.setLayout(gridLayout); //������岼�ַ�ʽΪ���񲼾�
		
		Button b1 = new Button(composite, SWT.PUSH); //��composite�ϴ���button B1
		b1.setText("B1");
		GridData gridData = new GridData(GridData.FILL_BOTH); //���ò��ַ�ʽΪ˫�����
		b1.setLayoutData(gridData);
		
		Button b2 = new Button(composite, SWT.PUSH); //B2����ͬB1
		b2.setText("B2");
		gridData = new GridData(GridData.FILL_BOTH);
		b2.setLayoutData(gridData);
		
		Button b3 = new Button(composite, SWT.PUSH); //B2����ͬB1
		b3.setText("B3");
		gridData = new GridData(GridData.FILL_BOTH);
		b3.setLayoutData(gridData);
		
		data = new FormData(); //����FormData����
		data.top = new FormAttachment(0, 5); //����composite��shell�ϱ߿�5����
		data.left = new FormAttachment(label, 5);//����composite��label 5����
		data.bottom = new FormAttachment(50, -5);//����composite��shellˮƽ�����Ϸ�5����
		data.right = new FormAttachment(100, -5);//����composite��shell�ұ߿�����5����
		composite.setLayoutData(data); //����composite�Ĳ�������
		
		Text text=new Text(shell,SWT.BORDER); //����Text����
		text.setText("Text");
		data = new FormData(); //������񲼾�����
		data.top = new FormAttachment(label, 5); //text�Ϸ���label 5����
		data.left = new FormAttachment(0, 5); // text�����shell��߿�5����
		data.bottom = new FormAttachment(100, -5); // text�±߿���shell�±߿�5����
		data.right = new FormAttachment(100, -5); // text�ұ߿���shell�ұ߿�5����
		text.setLayoutData(data);//����text�Ĳ�������
		
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
