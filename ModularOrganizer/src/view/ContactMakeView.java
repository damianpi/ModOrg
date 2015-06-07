package view;

import javax.swing.*;
import java.awt.*;

public class ContactMakeView {
	
	public JFrame frame;
	JLabel instructions;
	public JTextArea name, surname, phoneNumber, address, birthdate, likes, dislikes, wantsOnBirthday, education, canHelpWith;
	public JButton save;
	
	public ContactMakeView(){
		frame = new JFrame("Contacts");
		frame.setSize(400, 650);
		frame.setLayout(new FlowLayout());
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		
		instructions = new JLabel("<html><center>Here you can create or modify a new contact</center>");
		instructions.setBounds(250, 4, 600, 30);
		frame.add(instructions);
		
		name = new JTextArea("Name", 1, 30);
			frame.add(name);
		surname = new JTextArea("Surname", 1, 30);
			frame.add(surname);
		phoneNumber = new JTextArea("Phone number", 1, 30);
			frame.add(phoneNumber);
		address = new JTextArea("Address", 3, 30);
			frame.add(address);
		birthdate = new JTextArea("Birthdate", 1, 30);
			frame.add(birthdate);
		likes = new JTextArea("What likes", 6, 30);
			frame.add(likes);
		dislikes = new JTextArea("What dislikes", 6, 30);
			frame.add(dislikes);
		wantsOnBirthday = new JTextArea("Wants on birthday", 2, 30);
			frame.add(wantsOnBirthday);
		education = new JTextArea("Education", 3, 30);
			frame.add(education);
		canHelpWith = new JTextArea("Can help with", 5, 30);
			frame.add(canHelpWith);
		
		save = new JButton("Save");
		save.setPreferredSize(new Dimension(150, 50));
			frame.add(save);	
		
		frame.setVisible(false);
	}
	
	
	
}//end of class
