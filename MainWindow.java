package view;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import controller.*;


public class MainWindow {
	JFrame frame;
	JLabel instructions;
	JButton priorities, phonebook, contacts, cipheringTool;
	PrioritiesController prioritiesController;
	
	public MainWindow(PrioritiesController prioritiesController){
		
		this.prioritiesController = prioritiesController;
		
		
		
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
				prioritiesController.view.frame.setVisible(true);
			}
		});
		frame.add(priorities);
		
		phonebook = new JButton("<html><center><b><u>Phonebook</u></b></center>\n\n<center>Keep your contacts in one place");
		phonebook.setBounds(200, 70, 150, 60);
		frame.add(phonebook);
		
		contacts = new JButton("<html><center><b><u>Contacts</u></b></center>\n\n<center>All the things you never want to forget");
		contacts.setBounds(30, 150, 150, 60);
		frame.add(contacts);
		
		cipheringTool = new JButton("<html><center><b><u>CipheringTool</u></b></center>\n\n<center>Cuz fuck the NSA :)");
		cipheringTool.setBounds(200, 150, 150, 60);
		frame.add(cipheringTool);
		
		
		
		
		frame.setVisible(true);
	}//end of constructor
	
	
	
	
	
	
	
	
	
	
}//end of class
