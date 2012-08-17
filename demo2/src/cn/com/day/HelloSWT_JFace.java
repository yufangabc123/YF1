package cn.com.day;

import org.eclipse.jface.window.*;
import org.eclipse.swt.*;
import org.eclipse.swt.widgets.*;
public class HelloSWT_JFace extends ApplicationWindow {
public HelloSWT_JFace() {
super(null);
}
protected Control createContents(Composite parent) {
Text helloText = new Text(parent, SWT.CENTER);
helloText.setText("Hello SWT and JFace!");
parent.pack();
return parent;
}
public static void main(String[] args) {
HelloSWT_JFace awin = new HelloSWT_JFace();
awin.setBlockOnOpen(true);//以一个真值被调用时关闭
awin.open();//open()方法之后的代码仅当窗口关闭时才发生作用
Display.getCurrent().dispose();
}
}
