// Author: Damian Piela
package view;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import controller.*;


/**
 * Main window of the program. Allows to choose a module.
 * 
 * @author Damian Piela
 *
 */
public class MainWindow {
	private JFrame frame;
	private JLabel instructions;
	private JButton priorities, phonebook, contacts, cipheringTool;
	private PrioritiesController prioritiesController;
	private PhonebookController phonebookController;
	private ContactsController contactsController;

	
	/**
	 * Constructor for the MainWindow class.
	 * 
	 * @param prioritiesController
	 * @param phonebookController
	 * @param contactsController
	 */
	public MainWindow(PrioritiesController prioritiesController, PhonebookController phonebookController, 
								ContactsController contactsController){
		
		this.prioritiesController = prioritiesController;
		this.phonebookController = phonebookController;
		this.contactsController = contactsController;
		
		frame = new JFrame();
		frame.setSize(400, 300);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Modular Organizer");
		instructions = new JLabel("<html><center>Welcome to ModularOrganizer\n"
				+ "<html><center>Choose appropriate tool and start working now!");
		instructions.setBounds(50, 1, 350, 50);
		frame.add(instructions);
		
		priorities = new JButton("<html><center><b><u>Priorities</u></b></center>\n\n<center>Effectively manage your tasks");
		priorities.setBounds(30, 70, 150, 60);
		priorities.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				prioritiesController.getView().getFrame().setVisible(true);
			}
		});
		frame.add(priorities);
		
		phonebook = new JButton("<html><center><b><u>Phonebook</u></b></center>\n\n<center>Keep your contacts in one place");
		phonebook.setBounds(200, 70, 150, 60);
		phonebook.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				phonebookController.getView().getFrame().setVisible(true);
			}
		});
		frame.add(phonebook);
		
		contacts = new JButton("<html><center><b><u>Contacts</u></b></center>\n\n<center>All the things you never want to forget");
		contacts.setBounds(30, 150, 150, 60);
		contacts.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				contactsController.getView().getFrame().setVisible(true);
			}
		});
		frame.add(contacts);
		
		cipheringTool = new JButton("<html><center><b><u>CipheringTool</u></b></center>\n\n<center>Let them wonder");
		cipheringTool.setBounds(200, 150, 150, 60);
		cipheringTool.setEnabled(false);
		frame.add(cipheringTool);
		frame.setVisible(true);
	}//end of constructor
}//end of class
