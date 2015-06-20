package view;

import javax.swing.*;
import javax.swing.border.TitledBorder;

import model.PhonebookData;

import java.awt.*;

/**Class for creating the view for the Phonebook module.
 * @author Cinek
 *
 */

public class PhonebookView {

	private JFrame frame;
	
	private JLabel instructions;
	private JScrollPane mainPane,sPane;
	private JPanel addContact, editContact;
	private JTextArea addPhoneNumber, addContactName;
	private JButton addTaskButton, removeContactButton,EditNButton,EditButton;
	private JScrollPane textField;
	private JList list;
	
	


	/**Constructor for the PhonebookView class.
	 *
	 */
	public PhonebookView(){


		frame = new JFrame("Phonebook");
		frame.setSize(800, 600);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		
		instructions = new JLabel("<html><center>This is your phonebook</center>\n Edit using 'Contact name' and 'Phone number' fields");
		instructions.setBounds(250, 4, 600, 30);
		frame.add(instructions);
		
	    setList(new JList(PhonebookData.getData()));
	    getList().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		mainPane = new JScrollPane(getList());
		mainPane.setFocusable(false);
		mainPane.setBounds(50, 50, 700, 350);
		
		setTextField(new JScrollPane(mainPane));
		
		getTextField().setBounds(50, 50, 700, 350);
		frame.add(getTextField());
		
		sPane = new JScrollPane(getList());
		sPane.setFocusable(false);
		
		addContact = new JPanel();
		addContact.setBounds(50, 400, 400, 150);
		TitledBorder addTaskTitle = BorderFactory.createTitledBorder("Add new contact");
		addContact.setBorder(addTaskTitle);
		setAddContactName(new JTextArea("Contact name", 1, 30));
		addContact.add(getAddContactName());
		setAddPhoneNumber(new JTextArea("Phone number (123...)", 1, 30));
		addContact.add(getAddPhoneNumber());
		setAddTaskButton(new JButton("Add Contact"));
		getAddTaskButton().setPreferredSize(new Dimension(300, 50));
		addContact.add(getAddTaskButton());
		frame.add(addContact);
		
		editContact = new JPanel();
		editContact.setBounds(450, 400, 300, 150);
		TitledBorder removeTaskTitle = BorderFactory.createTitledBorder("Edit phonebook");
		editContact.setBorder(removeTaskTitle);
		frame.add(editContact);
		setEditButton(new JButton("Edit Name"));
		getEditButton().setPreferredSize(new Dimension(125, 50));
		editContact.add(getEditButton());
		setEditNButton(new JButton("Edit Number"));
		getEditNButton().setPreferredSize(new Dimension(125, 50));
		editContact.add(getEditNButton());
		setRemoveContactButton(new JButton("Remove Contact"));
		getRemoveContactButton().setPreferredSize(new Dimension(250, 50));
		editContact.add(getRemoveContactButton());
		
		frame.setVisible(false);
	}//end of constr
	public JFrame getFrame() {
		return frame;
	}
	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
	public JButton getAddTaskButton() {
		return addTaskButton;
	}
	public void setAddTaskButton(JButton addTaskButton) {
		this.addTaskButton = addTaskButton;
	}
	public JList getList() {
		return list;
	}
	public void setList(JList list) {
		this.list = list;
	}
	public JTextArea getAddContactName() {
		return addContactName;
	}
	public void setAddContactName(JTextArea addContactName) {
		this.addContactName = addContactName;
	}
	public JTextArea getAddPhoneNumber() {
		return addPhoneNumber;
	}
	public void setAddPhoneNumber(JTextArea addPhoneNumber) {
		this.addPhoneNumber = addPhoneNumber;
	}
	public JButton getRemoveContactButton() {
		return removeContactButton;
	}
	public void setRemoveContactButton(JButton removeContactButton) {
		this.removeContactButton = removeContactButton;
	}
	public JButton getEditButton() {
		return EditButton;
	}
	public void setEditButton(JButton editButton) {
		EditButton = editButton;
	}
	public JButton getEditNButton() {
		return EditNButton;
	}
	public void setEditNButton(JButton editNButton) {
		EditNButton = editNButton;
	}
	public JScrollPane getTextField() {
		return textField;
	}
	public void setTextField(JScrollPane textField) {
		this.textField = textField;
	}
}//end of class
