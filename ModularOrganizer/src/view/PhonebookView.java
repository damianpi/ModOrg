package view;

import javax.swing.*;
import javax.swing.border.TitledBorder;

import model.PhonebookData;

import java.awt.*;

public class PhonebookView {

	public JFrame frame;
	public JLabel instructions;
	public JScrollPane mainPane,sPane;
	public JPanel addContact, editContact;
	public JTextArea addFirstName, addPhoneNumber, removeTaskId, addContactName;
	public JButton addTaskButton, removeContactButton,EditNButton,EditButton;
	public JScrollPane textField;
	public JList list;
	public PhonebookView(){
		
		frame = new JFrame("Phonebook");
		frame.setSize(800, 600);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		
		instructions = new JLabel("<html><center>This is your phonebook</center>\n Edit using 'Contact name' and 'Phone number' fields");
		instructions.setBounds(250, 4, 600, 30);
		frame.add(instructions);
		
	    list = new JList(PhonebookData.data);
	    
		mainPane = new JScrollPane(list);
		mainPane.setFocusable(false);
		mainPane.setBounds(50, 50, 350, 350);
		
		textField = new JScrollPane(mainPane);
		
		textField.setBounds(50, 50, 350, 350);
		frame.add(textField);
		
		sPane = new JScrollPane(list);
		sPane.setFocusable(false);
		
		addContact = new JPanel();
		addContact.setBounds(50, 400, 400, 150);
		TitledBorder addTaskTitle = BorderFactory.createTitledBorder("Add new contact");
		addContact.setBorder(addTaskTitle);
		addContactName= new JTextArea("Contact name", 1, 30);
		addContact.add(addContactName);
		addPhoneNumber= new JTextArea("Phone number", 1, 30);
		addContact.add(addPhoneNumber);
		addTaskButton = new JButton("Add Contact");
		addTaskButton.setPreferredSize(new Dimension(300, 50));
		addContact.add(addTaskButton);
		frame.add(addContact);
		
		editContact = new JPanel();
		editContact.setBounds(450, 400, 300, 150);
		TitledBorder removeTaskTitle = BorderFactory.createTitledBorder("Edit phonebook");
		editContact.setBorder(removeTaskTitle);
		frame.add(editContact);
		EditButton = new JButton("Edit Name");
		EditButton.setPreferredSize(new Dimension(125, 50));
		editContact.add(EditButton);
		EditNButton = new JButton("Edit Number");
		EditNButton.setPreferredSize(new Dimension(125, 50));
		editContact.add(EditNButton);
		removeContactButton = new JButton("Remove Contact");
		removeContactButton.setPreferredSize(new Dimension(250, 50));
		editContact.add(removeContactButton);
		
		frame.setVisible(false);
	}//end of constr
}//end of class
