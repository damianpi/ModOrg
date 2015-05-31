//Author: Damian Piela
package view;

import javax.swing.*;
import javax.swing.border.TitledBorder;

import java.awt.*;

public class ContactsView {

	public JFrame frame;
	JPanel mainPane;
	public JList list;
	JLabel instructions;
	JPanel tools;
	public JButton selectButton, addContactButton, removeContactButton;
	public DefaultListModel listModel;
	
	
	
	public ContactsView(){
		
		frame = new JFrame("Contacts");
		frame.setSize(800, 600);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		
		instructions = new JLabel("<html><center>This is your contacts list</center>\nChoose one to see more details, or add a new one");
		instructions.setBounds(250, 4, 600, 30);
		frame.add(instructions);
		
		
//		//testowe
//		DefaultListModel modelList = new DefaultListModel();
//		modelList.addElement("jakis tekst");
//		modelList.addElement("jakis tekst");
//		modelList.addElement("jakis tekst");
//		modelList.addElement("jakis tekst");
//		//koniec testowe
		
//		mainPane = new JPanel(new BorderLayout());
//		mainPane.setBounds(50, 50, 700, 350);
		
		this.listModel = new DefaultListModel();
		
		list = new JList(listModel);
		list.setLayoutOrientation(JList.VERTICAL);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setBounds(50, 50, 700, 300);
		frame.add(list);
		
		
//		mainPane.add(list);
//		JScrollPane scrollField = new JScrollPane(mainPane);
//		scrollField.setBounds(50, 50, 700, 350);
//		frame.add(mainPane);
//		frame.add(mainPane);
		

		addContactButton = new JButton("New contact");
		addContactButton.setBounds(80, 430, 150, 80);
		frame.add(addContactButton);
		
		removeContactButton = new JButton("Remove contact");
		removeContactButton.setBounds(231, 430, 150, 80);
		frame.add(removeContactButton);
		
		selectButton = new JButton("<html><center><font size=7> Select");
		selectButton.setBounds(580, 415, 150, 130);
		frame.add(selectButton);
		

		
		frame.setVisible(false);
		
	}//end of constr
	
	
	
}//end of class
