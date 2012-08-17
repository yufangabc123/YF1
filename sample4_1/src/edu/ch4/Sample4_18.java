package edu.ch4;

import java.awt.event.MouseEvent;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class Sample4_18 {

	/**
	 * SWT�¼�����ʾ��
	 */
	static Text text;
	public static void main(String[] args) {
		Display display = new Display();
		final Shell shell = new Shell(display);
		RowLayout rowLayout=new RowLayout();
		rowLayout.marginWidth=20;
		rowLayout.marginHeight=30;
		shell.setLayout(rowLayout);
		shell.setText("SWT�¼�����ʾ��");
		text=new Text(shell,SWT.BORDER|SWT.WRAP);
		RowData rowData=new RowData();
		rowData.width=100;
		rowData.height=50;
		text.setLayoutData(rowData);
		//��������������text���
		text.addMouseListener(new MouseAdapter() { //����������������
		public void mouseDoubleClick(MouseEvent e) { //�������˫���¼��ķ���
		text.setText("�ı��������˫���¼�������"); //��text����ʾ��Ϣ
		//������Ϣ�Ի�����󣬲��ڶԻ�������ʾ��Ϣ
		MessageBox dialog=new MessageBox(shell,SWT.OK|SWT.ICON_INFORMATION);
		dialog.setText("Double click");
		dialog.setMessage("�ı��������˫���¼�������");
		dialog.open();
		}});
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
