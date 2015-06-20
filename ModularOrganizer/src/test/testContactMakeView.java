//Autor: Marcin Czaja

package test;

import static org.junit.Assert.*;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import view.ContactMakeView;
import view.ContactsView;

public class testContactMakeView {
	
	ContactMakeView contactMakeView;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Test class: ContactMakeView.java");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("End of Test: ContactMakeView.java");
	}

	@Before
	public void setUp() throws Exception
	{	
		contactMakeView = new ContactMakeView();
	}

	@After
	public void tearDown() throws Exception {
		contactMakeView = null;
	}

	@Test
	public void testGetFrame() {
		JFrame frame = new JFrame("Contacts");
		frame.setSize(400, 650);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		assertEquals("Fail: frame", frame.getSize(), contactMakeView.getFrame().getSize());
	}

	@Test
	public void testSetFrame() {
		JFrame frame = contactMakeView.getFrame();
		assertEquals("Fail: frame", frame.getSize(), contactMakeView.getFrame().getSize());
		frame.setSize(300,400);
		contactMakeView.setFrame(frame);
		assertEquals("Fail: frame", 300, contactMakeView.getFrame().getWidth());
		assertEquals("Fail: frame", 400, contactMakeView.getFrame().getHeight());
	}

	@Test
	public void testGetInstructions() {
		JLabel instructions = new JLabel("<html><center>Here you can create or modify a new contact</center>");
		instructions.setBounds(250, 4, 600, 30);
		
		assertEquals("Fail: instructions", "<html><center>Here you can create or modify a new contact</center>",
				contactMakeView.getInstructions().getText());
		assertEquals("Fail: instructions", instructions.getBounds(), contactMakeView.getInstructions().getBounds());
	}

	@Test
	public void testSetInstructions() {
		JLabel instructions = contactMakeView.getInstructions();
		instructions.setBounds(20, 2, 300, 400);
		instructions.setText("New text");
		contactMakeView.setInstructions(instructions);
		
		assertEquals("Fail: instructions", "New text",contactMakeView.getInstructions().getText());
		assertEquals("Fail: instructions", 20, contactMakeView.getInstructions().getX());
		assertEquals("Fail: instructions", 2, contactMakeView.getInstructions().getY());
		assertEquals("Fail: instructions", 300, contactMakeView.getInstructions().getWidth());
		assertEquals("Fail: instructions", 400, contactMakeView.getInstructions().getHeight());
	}

	@Test
	public void testGetName() {
		JTextArea name = new JTextArea("Name", 1, 30);
		
		assertEquals("Fail: name", name.getText(), contactMakeView.getName().getText()); 
		assertEquals("Fail: name", name.getRows(), contactMakeView.getName().getRows()); 
		assertEquals("Fail: name", name.getColumns(), contactMakeView.getName().getColumns()); 
	}

	@Test
	public void testSetName() {
	    contactMakeView.setName(new JTextArea("Test", 2, 20));
		
		assertEquals("Fail: name", "Test", contactMakeView.getName().getText()); 
		assertEquals("Fail: name", 2, contactMakeView.getName().getRows()); 
		assertEquals("Fail: name", 20, contactMakeView.getName().getColumns()); 
	}

	@Test
	public void testGetSurname() {
		JTextArea surname = new JTextArea("Surname", 1, 30);
		
		assertEquals("Fail: surname", surname.getText(), contactMakeView.getSurname().getText()); 
		assertEquals("Fail: surname", surname.getRows(), contactMakeView.getSurname().getRows()); 
		assertEquals("Fail: surname", surname.getColumns(), contactMakeView.getSurname().getColumns());
	}

	@Test
	public void testSetSurname() {
		contactMakeView.setSurname(new JTextArea("Test", 2, 20));
		
		assertEquals("Fail: surname", "Test", contactMakeView.getSurname().getText()); 
		assertEquals("Fail: surname", 2, contactMakeView.getSurname().getRows()); 
		assertEquals("Fail: surname", 20, contactMakeView.getSurname().getColumns()); 
	}

	@Test
	public void testGetPhoneNumber() {
		JTextArea phoneNumber = new JTextArea("Phone number", 1, 30);
		
		assertEquals("Fail: phoneNumber", phoneNumber.getText(), contactMakeView.getPhoneNumber().getText()); 
		assertEquals("Fail: phoneNumber", phoneNumber.getRows(), contactMakeView.getPhoneNumber().getRows()); 
		assertEquals("Fail: phoneNumber", phoneNumber.getColumns(), contactMakeView.getPhoneNumber().getColumns());
	}

	@Test
	public void testSetPhoneNumber() {
		contactMakeView.setPhoneNumber(new JTextArea("Test", 2, 20));
		
		assertEquals("Fail: phoneNumber", "Test", contactMakeView.getPhoneNumber().getText()); 
		assertEquals("Fail: phoneNumber", 2, contactMakeView.getPhoneNumber().getRows()); 
		assertEquals("Fail: phoneNumber", 20, contactMakeView.getPhoneNumber().getColumns()); 
	}

	@Test
	public void testGetAddress() {
		JTextArea getAddress = new JTextArea("Address", 3, 30);
		
		assertEquals("Fail: getAddress", getAddress.getText(), contactMakeView.getAddress().getText()); 
		assertEquals("Fail: getAddress", getAddress.getRows(), contactMakeView.getAddress().getRows()); 
		assertEquals("Fail: getAddress", getAddress.getColumns(), contactMakeView.getAddress().getColumns());
	}

	@Test
	public void testSetAddress() {
		contactMakeView.setAddress(new JTextArea("Test", 2, 20));
		
		assertEquals("Fail: getAddress", "Test", contactMakeView.getAddress().getText()); 
		assertEquals("Fail: getAddress", 2, contactMakeView.getAddress().getRows()); 
		assertEquals("Fail: getAddress", 20, contactMakeView.getAddress().getColumns()); 
	}

	@Test
	public void testGetBirthdate() {
		JTextArea birthdate = new JTextArea("Birthdate", 1, 30);
		
		assertEquals("Fail: birthdate", birthdate.getText(), contactMakeView.getBirthdate().getText()); 
		assertEquals("Fail: birthdate", birthdate.getRows(), contactMakeView.getBirthdate().getRows()); 
		assertEquals("Fail: birthdate", birthdate.getColumns(), contactMakeView.getBirthdate().getColumns());
	}

	@Test
	public void testSetBirthdate() {
		contactMakeView.setBirthdate(new JTextArea("Test", 2, 20));
		
		assertEquals("Fail: birthdate", "Test", contactMakeView.getBirthdate().getText()); 
		assertEquals("Fail: birthdate", 2, contactMakeView.getBirthdate().getRows()); 
		assertEquals("Fail: birthdate", 20, contactMakeView.getBirthdate().getColumns());
	}

	@Test
	public void testGetLikes() {
		JTextArea likes = new JTextArea("What likes", 6, 30);
		
		assertEquals("Fail: likes", likes.getText(), contactMakeView.getLikes().getText()); 
		assertEquals("Fail: likes", likes.getRows(), contactMakeView.getLikes().getRows()); 
		assertEquals("Fail: likes", likes.getColumns(), contactMakeView.getLikes().getColumns());
	}

	@Test
	public void testSetLikes() {
		contactMakeView.setLikes(new JTextArea("Test", 2, 20));
		
		assertEquals("Fail: likes", "Test", contactMakeView.getLikes().getText()); 
		assertEquals("Fail: likes", 2, contactMakeView.getLikes().getRows()); 
		assertEquals("Fail: likes", 20, contactMakeView.getLikes().getColumns());
	}

	@Test
	public void testGetDislikes() {
		JTextArea dislikes = new JTextArea("What dislikes", 6, 30);
		
		assertEquals("Fail: dislikes", dislikes.getText(), contactMakeView.getDislikes().getText()); 
		assertEquals("Fail: dislikes", dislikes.getRows(), contactMakeView.getDislikes().getRows()); 
		assertEquals("Fail: dislikes", dislikes.getColumns(), contactMakeView.getDislikes().getColumns());
	}

	@Test
	public void testSetDislikes() {
		contactMakeView.setDislikes(new JTextArea("Test", 2, 20));
		
		assertEquals("Fail: dislikes", "Test", contactMakeView.getDislikes().getText()); 
		assertEquals("Fail: dislikes", 2, contactMakeView.getDislikes().getRows()); 
		assertEquals("Fail: dislikes", 20, contactMakeView.getDislikes().getColumns());
	}

	@Test
	public void testGetWantsOnBirthday() {
		JTextArea wantsOnBirthday = new JTextArea("Wants on birthday", 2, 30);
		
		assertEquals("Fail: wantsOnBirthday", wantsOnBirthday.getText(), contactMakeView.getWantsOnBirthday().getText()); 
		assertEquals("Fail: wantsOnBirthday", wantsOnBirthday.getRows(), contactMakeView.getWantsOnBirthday().getRows()); 
		assertEquals("Fail: wantsOnBirthday", wantsOnBirthday.getColumns(), contactMakeView.getWantsOnBirthday().getColumns());
	}

	@Test
	public void testSetWantsOnBirthday() {
		contactMakeView.setWantsOnBirthday(new JTextArea("Test", 2, 20));
		
		assertEquals("Fail: wantsOnBirthday", "Test", contactMakeView.getWantsOnBirthday().getText()); 
		assertEquals("Fail: wantsOnBirthday", 2, contactMakeView.getWantsOnBirthday().getRows()); 
		assertEquals("Fail: wantsOnBirthday", 20, contactMakeView.getWantsOnBirthday().getColumns());
	}

	@Test
	public void testGetEducation() {
		JTextArea education = new JTextArea("Education", 3, 30);
		
		assertEquals("Fail: education", education.getText(), contactMakeView.getEducation().getText()); 
		assertEquals("Fail: education", education.getRows(), contactMakeView.getEducation().getRows()); 
		assertEquals("Fail: education", education.getColumns(), contactMakeView.getEducation().getColumns());
	}

	@Test
	public void testSetEducation() {
		contactMakeView.setEducation(new JTextArea("Test", 2, 20));
		
		assertEquals("Fail: education", "Test", contactMakeView.getEducation().getText()); 
		assertEquals("Fail: education", 2, contactMakeView.getEducation().getRows()); 
		assertEquals("Fail: education", 20, contactMakeView.getEducation().getColumns());
	}

	@Test
	public void testGetCanHelpWith() {
		JTextArea canHelpWith = new JTextArea("Can help with", 5, 30);
		
		assertEquals("Fail: canHelpWith", canHelpWith.getText(), contactMakeView.getCanHelpWith().getText()); 
		assertEquals("Fail: canHelpWith", canHelpWith.getRows(), contactMakeView.getCanHelpWith().getRows()); 
		assertEquals("Fail: canHelpWith", canHelpWith.getColumns(), contactMakeView.getCanHelpWith().getColumns());
	}

	@Test
	public void testSetCanHelpWith() {
		contactMakeView.setCanHelpWith(new JTextArea("Test", 2, 20));
		
		assertEquals("Fail: canHelpWith", "Test", contactMakeView.getCanHelpWith().getText()); 
		assertEquals("Fail: canHelpWith", 2, contactMakeView.getCanHelpWith().getRows()); 
		assertEquals("Fail: canHelpWith", 20, contactMakeView.getCanHelpWith().getColumns());
	}

	@Test
	public void testGetSave() {
		JButton save = new JButton("Save");
		save.setPreferredSize(new Dimension(150, 50));
		
		assertEquals("Fail: save", save.getPreferredSize(), contactMakeView.getSave().getPreferredSize());
		assertEquals("Fail: save", save.getText(), contactMakeView.getSave().getText());
	}

	@Test
	public void testSetSave() {
		JButton save = new JButton("Test");
		save.setPreferredSize(new Dimension(20, 50));
		contactMakeView.setSave(save);
		
		assertEquals("Fail: save", save.getPreferredSize(), contactMakeView.getSave().getPreferredSize());
		assertEquals("Fail: save", save.getText(), contactMakeView.getSave().getText());
	}

}
