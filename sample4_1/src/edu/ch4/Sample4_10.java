package edu.ch4;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Text;

public class Sample4_10 {

	public static void main(String[] args) {
			Display display=new Display();//����һ��display����
			final Shell shell=new Shell(display);//shell�ǳ����������
			shell.setText("ѡ�ʾ��");
			TabFolder tabFolder=new TabFolder(shell,SWT.NONE);//����һ��ѡ�����
			tabFolder.setBounds(5, 5, 180, 130);//����ѡ���С��λ��
			TabItem tabItem1=new TabItem(tabFolder,SWT.NONE);//������һ��ѡ��ҳ
			tabItem1.setText("ѡ��1");
			{
				Group group1=new Group(tabFolder,SWT.NONE);//������һ������򣬽�����tabFolder��
				group1.setText("¼����Ϣ");//���÷����˵����Ϣ
				tabItem1.setControl(group1);//��tabItem1����group1
				
				Label b1=new Label(group1,SWT.NONE);
				b1.setText("����:");
				b1.setBounds(10, 20, 70, 20);
				
				Text text1=new Text(group1,SWT.BORDER);
				text1.setBounds(90, 20, 70, 20);
				
				Label b2=new Label(group1,SWT.NONE);
				b2.setText("��ַ:");
				b2.setBounds(10, 50, 70, 20);
				
				Text text2=new Text(group1,SWT.BORDER);
				text2.setBounds(90, 50, 70, 20);
			}
			TabItem tabItem2=new TabItem(tabFolder,SWT.NONE);//�����ڶ���ѡ��ҳ
			tabItem2.setText("ѡ��2");
			{
				Group group2=new Group(tabFolder,SWT.NONE);//�����ڶ�������򣬽�����tabFolder��
				group2.setText("��Ȥ����");//���÷����˵����Ϣ
				tabItem2.setControl(group2);//��tabItem2����group2
				
				Button b1=new Button(group2,SWT.CHECK);
				b1.setBounds(20, 20, 70, 20);
				b1.setText("����");
				
				Button b2=new Button(group2,SWT.CHECK);
				b2.setBounds(20, 50, 70, 20);
				b2.setText("����");
				
				Button b3=new Button(group2,SWT.CHECK);
				b3.setBounds(20, 80, 70, 20);
				b3.setText("����");
			}
			shell.pack();
			shell.open();
			while(!shell.isDisposed()){//���������û�йر���һֱѭ��
				if(!display.readAndDispatch()){//���display��æ
					display.sleep();//����
				}
			}
			display.dispose();//���� display
	}

}
