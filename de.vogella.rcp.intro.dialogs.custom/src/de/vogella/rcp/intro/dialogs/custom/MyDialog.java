package de.vogella.rcp.intro.dialogs.custom;

import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
public class MyDialog extends TitleAreaDialog {
private Text firstNameText;
private Text lastNameText;
private String firstName;
private String lastName;
public MyDialog(Shell parentShell) {
super(parentShell);
}
public void create() {
super.create();

setTitle("This is my first own dialog");
	
setMessage("This is a TitleAreaDialog", IMessageProvider.INFORMATION);
}

protected Control createDialogArea(Composite parent) {
GridLayout layout = new GridLayout();
layout.numColumns = 2;

parent.setLayout(layout);

GridData gridData = new GridData();
gridData.grabExcessHorizontalSpace = true;
gridData.horizontalAlignment = GridData.FILL;
Label label1 = new Label(parent, SWT.NONE);
label1.setText("First Name");
firstNameText = new Text(parent, SWT.BORDER);
firstNameText.setLayoutData(gridData);
Label label2 = new Label(parent, SWT.NONE);
label2.setText("Last Name");
lastNameText = new Text(parent, SWT.BORDER);
lastNameText.setLayoutData(gridData);
return parent;
}

protected void createButtonsForButtonBar(Composite parent) {
GridData gridData = new GridData();
gridData.verticalAlignment = GridData.FILL;
gridData.horizontalSpan = 3;
gridData.grabExcessHorizontalSpace = true;
gridData.grabExcessVerticalSpace = true;
gridData.horizontalAlignment = SWT.CENTER;
parent.setLayoutData(gridData);

createOkButton(parent, OK, "Add", true);

Button cancelButton = createButton(parent, CANCEL, "Cancel", false);

cancelButton.addSelectionListener(new SelectionAdapter() {
public void widgetSelected(SelectionEvent e) {
setReturnCode(CANCEL);
close();
}	
});
}
protected Button createOkButton(Composite parent, int id, String label,
boolean defaultButton) {

((GridLayout) parent.getLayout()).numColumns++;
Button button = new Button(parent, SWT.PUSH);
button.setText(label);
button.setFont(JFaceResources.getDialogFont());
button.setData(new Integer(id));
button.addSelectionListener(new SelectionAdapter() {
public void widgetSelected(SelectionEvent event) {
if (isValidInput()) {
okPressed();
}
}
});
if (defaultButton) {
Shell shell = parent.getShell();
if (shell != null) {
shell.setDefaultButton(button);
}
}
setButtonLayoutData(button);
return button;
}
private boolean isValidInput() {
boolean valid = true;
if (firstNameText.getText().length() == 0) {
setErrorMessage("Please maintain the first name");
valid = false;
}
if (lastNameText.getText().length() == 0) {
setErrorMessage("Please maintain the last name");
valid = false;
}
return valid;
}

protected boolean isResizable() {
return true;
}

private void saveInput() {
firstName = firstNameText.getText();
lastName = lastNameText.getText();
}

protected void okPressed() {
saveInput();
super.okPressed();
}
public String getFirstName() {
return firstName;
}
public String getLastName() {
return lastName;
}
}
