package edu.ch4;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Shell;

public class Sample4_6 {
	private static Label lb;
	public static void main(String[] args) {
		Display display=new Display();//����һ��display����
		final Shell shell=new Shell(display);//shell�ǳ����������
		shell.setText("�б��ʾ��");
		final List list=new List(shell,SWT.MULTI|SWT.V_SCROLL|SWT.BORDER);
		//����һ���ɸ�ѡ������ֱ���������б߿���б��
		list.setBounds(10,10,100,50);
		lb=new Label(shell,SWT.WRAP);
		lb.setBounds(120,10,90,50);
		Button bt1=new Button(shell,SWT.NONE);
		bt1.setBounds(20,60,100,25);
		bt1.setText("��ֵ");
		bt1.addSelectionListener(new SelectionAdapter(){
		public void widgetSelected(SelectionEvent e){
		list.removeAll();
		for(int i=1;i<=8;i++){
			list.add("��"+i+"��"); //��ѡ��ѭ�����뵽�б����
			}
			list.select(0);
			}
			});
			Button bt2=new Button(shell,SWT.NONE);
			bt2.setBounds(130,60,100,25);
			bt2.setText("ȡֵ");
			bt2.addSelectionListener(new SelectionAdapter(){
			public void widgetSelected(SelectionEvent e){
			String[] selected=list.getSelection(); //�����ַ������鱣��ѡ��
			String outStr=" ";
			for(int j=0;j<selected.length;j++){
			outStr=outStr+" "+selected[j]; //�������е�ѡ����뵽����ַ���
			}
			lb.setText("��ѡ����ǣ�"+outStr);
			}
			});
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
