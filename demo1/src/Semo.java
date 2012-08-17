import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Button;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Label;


public class Semo {
	private static Table table;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Display display= new Display();
		Shell shlAbc=new Shell(display);
		shlAbc.setText("abc");
		shlAbc.setMinimumSize(new Point(123, 30));
		shlAbc.setSize(688, 398);
		shlAbc.setLayout(new FillLayout(SWT.HORIZONTAL));
		
		Menu menu = new Menu(shlAbc, SWT.BAR);
		shlAbc.setMenuBar(menu);
		
		MenuItem mntmFile = new MenuItem(menu, SWT.CASCADE);
		mntmFile.setText("File");
		Menu fileMenu=new Menu(shlAbc,SWT.DROP_DOWN);
		mntmFile.setMenu(fileMenu);
		{
			MenuItem a=new MenuItem(fileMenu,SWT.CASCADE);
			a.setText("New");
			Menu fileMenu2=new Menu(shlAbc,SWT.DROP_DOWN);
			a.setMenu(fileMenu2);
			{
				MenuItem newProjectItem=new MenuItem(fileMenu2,SWT.PUSH);
				newProjectItem.setText("Plug-in Project");
			}
		}
		
		Menu menu_1 = new Menu(mntmFile);
		mntmFile.setMenu(menu_1);
		
		MenuItem mntmEditor = new MenuItem(menu, SWT.CASCADE);
		mntmEditor.setText("Editor");
		
		Menu menu_2 = new Menu(mntmEditor);
		mntmEditor.setMenu(menu_2);
		
		MenuItem mntmSource = new MenuItem(menu, SWT.CASCADE);
		mntmSource.setText("Source");
		
		Menu menu_3 = new Menu(mntmSource);
		mntmSource.setMenu(menu_3);
		
		MenuItem mntmRefactor = new MenuItem(menu, SWT.CASCADE);
		mntmRefactor.setText("Refactor");
		
		Menu menu_4 = new Menu(mntmRefactor);
		mntmRefactor.setMenu(menu_4);
		
		MenuItem mntmSearch = new MenuItem(menu, SWT.CASCADE);
		mntmSearch.setText("Search");
		
		Menu menu_5 = new Menu(mntmSearch);
		mntmSearch.setMenu(menu_5);
		
		MenuItem mntmRun = new MenuItem(menu, SWT.CASCADE);
		mntmRun.setText("Run");
		
		Menu menu_6 = new Menu(mntmRun);
		mntmRun.setMenu(menu_6);
		
		MenuItem mntmHelp = new MenuItem(menu, SWT.CASCADE);
		mntmHelp.setText("Help");
		
		Menu menu_7 = new Menu(mntmHelp);
		mntmHelp.setMenu(menu_7);
		
		SashForm sashForm = new SashForm(shlAbc, SWT.NONE);
		
		TabFolder tabFolder = new TabFolder(sashForm, SWT.NONE);
		
		TabItem tabItem = new TabItem(tabFolder, SWT.NONE);
		tabItem.setText("\u5BFC\u822A\u5668");
		
		Tree tree = new Tree(tabFolder, SWT.BORDER);
		tabItem.setControl(tree);
		
		TreeItem trtmAa = new TreeItem(tree, SWT.NONE);
		trtmAa.setText("aa");
		
		TreeItem trtmA = new TreeItem(trtmAa, SWT.NONE);
		trtmA.setText("a");
		
		TreeItem trtmA_1 = new TreeItem(trtmAa, SWT.NONE);
		trtmA_1.setText("a2");
		trtmAa.setExpanded(true);
		
		TreeItem trtmBb = new TreeItem(tree, SWT.NONE);
		trtmBb.setText("bb");
		
		TreeItem trtmB = new TreeItem(trtmBb, SWT.NONE);
		trtmB.setText("b");
		
		TreeItem trtmB_1 = new TreeItem(trtmBb, SWT.NONE);
		trtmB_1.setText("b2");
		trtmBb.setExpanded(true);
		
		TreeItem trtmCc = new TreeItem(tree, SWT.NONE);
		trtmCc.setText("cc");
		
		TreeItem trtmC = new TreeItem(trtmCc, SWT.NONE);
		trtmC.setText("c");
		
		TreeItem trtmC_1 = new TreeItem(trtmCc, SWT.NONE);
		trtmC_1.setText("c2");
		trtmCc.setExpanded(true);
		
		TabItem tabItem_1 = new TabItem(tabFolder, SWT.NONE);
		tabItem_1.setText("\u5BF9\u8C61");
		
		TabItem tbtmNewItem = new TabItem(tabFolder, SWT.NONE);
		tbtmNewItem.setText("Group");
		
		SashForm sashForm_1 = new SashForm(sashForm, SWT.VERTICAL);
		
		TabFolder tabFolder_1 = new TabFolder(sashForm_1, SWT.NONE);
		
		TabItem tabItem_2 = new TabItem(tabFolder_1, SWT.NONE);
		tabItem_2.setText("\u53D8\u66F4");
		
		table = new Table(tabFolder_1, SWT.BORDER | SWT.FULL_SELECTION);
		tabItem_2.setControl(table);
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		
		TableColumn tableColumn = new TableColumn(table, SWT.NONE);
		tableColumn.setWidth(60);
		tableColumn.setText("\u72B6\u6001");
		
		TableColumn tableColumn_1 = new TableColumn(table, SWT.NONE);
		tableColumn_1.setWidth(63);
		tableColumn_1.setText("\u540D\u79F0");
		
		TableColumn tableColumn_2 = new TableColumn(table, SWT.NONE);
		tableColumn_2.setWidth(100);
		tableColumn_2.setText("\u63CF\u8FF0");
		
		TableItem tableItem = new TableItem(table, SWT.NONE);
		tableItem.setText(new String[] {"8", "4", "5"});
		
		TableItem tableItem_1 = new TableItem(table, SWT.NONE);
		tableItem_1.setText(new String[] {"1", "2", "3"});
		
		TabItem tabItem_3 = new TabItem(tabFolder_1, SWT.NONE);
		tabItem_3.setText("\u7F16\u8F91\u533A");
		
		TabFolder tabFolder_2 = new TabFolder(sashForm_1, SWT.NONE);
		
		TabItem tbtmNewItem_1 = new TabItem(tabFolder_2, SWT.NONE);
		tbtmNewItem_1.setText("\u6982\u8981");
		
		SashForm sashForm_2 = new SashForm(tabFolder_2, SWT.NONE);
		tbtmNewItem_1.setControl(sashForm_2);
		
		Composite composite = new Composite(sashForm_2, SWT.NONE);
		composite.setFont(SWTResourceManager.getFont("ËÎÌו", 8, SWT.NORMAL));
		
		Group group = new Group(sashForm_2, SWT.NONE);
		group.setForeground(SWTResourceManager.getColor(SWT.COLOR_MAGENTA));
		group.setText("\u6570\u636E\u8BB0\u5F55");
		
		Button btnNewButton = new Button(group, SWT.NONE);
		btnNewButton.setBounds(0, 21, 72, 22);
		btnNewButton.setText("\u8BE6\u7EC6\u4FE1\u606F");
		
		Button btnNewButton_1 = new Button(group, SWT.NONE);
		btnNewButton_1.setBounds(71, 20, 72, 22);
		btnNewButton_1.setText("\u7F16\u8F91");
		
		Label lblNewLabel = new Label(group, SWT.NONE);
		lblNewLabel.setBounds(10, 51, 54, 12);
		lblNewLabel.setText("\u9519\u8BEF\uFF1A0\u6761");
		
		Label label = new Label(group, SWT.NONE);
		label.setBounds(10, 65, 54, 12);
		label.setText("\u7981\u6B62\uFF1A0\u6761");
		
		Label label_1 = new Label(group, SWT.NONE);
		label_1.setBounds(10, 79, 54, 12);
		label_1.setText("\u5371\u9669\uFF1A0\u6761");
		
		Label label_2 = new Label(group, SWT.NONE);
		label_2.setBounds(10, 93, 54, 12);
		label_2.setText("\u6B63\u5E38\uFF1A7\u6761");
		sashForm_2.setWeights(new int[] {1, 1});
		
		TabItem tabItem_4 = new TabItem(tabFolder_2, SWT.NONE);
		tabItem_4.setText("\u76F8\u5173\u76D1\u6D4B\u5668");
		
		TabItem tabItem_5 = new TabItem(tabFolder_2, SWT.NONE);
		tabItem_5.setText("\u65E5\u5FD7\u6570\u636E");
		sashForm_1.setWeights(new int[] {1, 1});
		sashForm.setWeights(new int[] {205, 472});
        
		shlAbc.open();
		while(!shlAbc.isDisposed()){
        	if(!display.readAndDispatch()){
        		display.sleep();
        	}
        }
		display.dispose();
	}
}
