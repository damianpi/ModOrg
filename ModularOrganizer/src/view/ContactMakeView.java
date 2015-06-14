package view;

import javax.swing.*;
import java.awt.*;

public class ContactMakeView {
	
	private JFrame frame;
	private JLabel instructions;
	private JTextArea name, surname, phoneNumber, address, birthdate, likes, dislikes, wantsOnBirthday, education, canHelpWith;
	private JButton save;
	
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
	}//end of constructor
	
	//getters and setters
	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JLabel getInstructions() {
		return instructions;
	}

	public void setInstructions(JLabel instructions) {
		this.instructions = instructions;
	}

	public JTextArea getName() {
		return name;
	}

	public void setName(JTextArea name) {
		this.name = name;
	}

	public JTextArea getSurname() {
		return surname;
	}

	public void setSurname(JTextArea surname) {
		this.surname = surname;
	}

	public JTextArea getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(JTextArea phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public JTextArea getAddress() {
		return address;
	}

	public void setAddress(JTextArea address) {
		this.address = address;
	}

	public JTextArea getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(JTextArea birthdate) {
		this.birthdate = birthdate;
	}

	public JTextArea getLikes() {
		return likes;
	}

	public void setLikes(JTextArea likes) {
		this.likes = likes;
	}

	public JTextArea getDislikes() {
		return dislikes;
	}

	public void setDislikes(JTextArea dislikes) {
		this.dislikes = dislikes;
	}

	public JTextArea getWantsOnBirthday() {
		return wantsOnBirthday;
	}

	public void setWantsOnBirthday(JTextArea wantsOnBirthday) {
		this.wantsOnBirthday = wantsOnBirthday;
	}

	public JTextArea getEducation() {
		return education;
	}

	public void setEducation(JTextArea education) {
		this.education = education;
	}

	public JTextArea getCanHelpWith() {
		return canHelpWith;
	}

	public void setCanHelpWith(JTextArea canHelpWith) {
		this.canHelpWith = canHelpWith;
	}

	public JButton getSave() {
		return save;
	}

	public void setSave(JButton save) {
		this.save = save;
	}
}//end of class
