//Autor: Marcin Czaja

package test;

import static org.junit.Assert.*;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import view.PhonebookView;
import model.*;

public class testPhonebookView {

	PhonebookView phonebookView;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Test class: PhonebookView.java");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("End of Test: PhonebookView.java");
	}

	@Before
	public void setUp() throws Exception
	{	
		phonebookView = new PhonebookView();
	}

	@After
	public void tearDown() throws Exception {
		phonebookView = null;
	}

	@Test
	public void testGetFrame() {
		JFrame frame = new JFrame("Phonebook");
		frame.setSize(800, 600);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		assertEquals("Fail: frame", frame.getSize(), phonebookView.getFrame().getSize());
	}

	@Test
	public void testSetFrame() {
		JFrame frame = phonebookView.getFrame();
		assertEquals("Fail: frame", frame.getSize(), phonebookView.getFrame().getSize());
		frame.setSize(300,400);
		phonebookView.setFrame(frame);
		assertEquals("Fail: frame", 300, phonebookView.getFrame().getWidth());
		assertEquals("Fail: frame", 400, phonebookView.getFrame().getHeight());
	}

	@Test
	public void testGetAddTaskButton() {
		JButton addTaskButton = new JButton("Add Task");
		addTaskButton.setPreferredSize(new Dimension(300, 50));
		assertEquals("Fail: addTaskButton", addTaskButton.getPreferredSize(), phonebookView.getAddTaskButton().getPreferredSize());
		assertEquals("Fail: addTaskButton", addTaskButton.getName(), phonebookView.getAddTaskButton().getName());
	}

	@Test
	public void testSetAddTaskButton() {
		JButton addTaskButton = new JButton("Test text");
		addTaskButton.setPreferredSize(new Dimension(200, 70));
		phonebookView.setAddTaskButton(addTaskButton);
		
		assertEquals("Fail: addTaskButton", addTaskButton.getPreferredSize(), phonebookView.getAddTaskButton().getPreferredSize());
		assertEquals("Fail: addTaskButton", addTaskButton.getName(), phonebookView.getAddTaskButton().getName());
	}

	@Test
	public void testGetAddContactName() {
		JTextArea addContactName = new JTextArea("Contact name", 1, 30);
		
		assertEquals("Fail: addContactName", addContactName.getPreferredSize(), phonebookView.getAddContactName().getPreferredSize());
		assertEquals("Fail: addContactName", addContactName.getName(), phonebookView.getAddContactName().getName());
	}

	@Test
	public void testSetAddContactName() {
		JTextArea addContactName = new JTextArea("Test text", 5, 20);
		phonebookView.setAddContactName(addContactName);
		
		assertEquals("Fail: addContactName", addContactName.getPreferredSize(), phonebookView.getAddContactName().getPreferredSize());
		assertEquals("Fail: addContactName", addContactName.getName(), phonebookView.getAddContactName().getName());
	}

	@Test
	public void testGetAddPhoneNumber() {
		JTextArea addPhoneNumber = new JTextArea("Phone number (123...)", 1, 30);
		
		assertEquals("Fail: addPhoneNumber", addPhoneNumber.getPreferredSize(), phonebookView.getAddPhoneNumber().getPreferredSize());
		assertEquals("Fail: addPhoneNumber", addPhoneNumber.getName(), phonebookView.getAddPhoneNumber().getName());
	}

	@Test
	public void testSetAddPhoneNumber() {
		JTextArea addPhoneNumber = new JTextArea("Test text", 2, 50);
		phonebookView.setAddPhoneNumber(addPhoneNumber);
		
		assertEquals("Fail: addPhoneNumber", addPhoneNumber.getPreferredSize(), phonebookView.getAddPhoneNumber().getPreferredSize());
		assertEquals("Fail: addPhoneNumber", addPhoneNumber.getName(), phonebookView.getAddPhoneNumber().getName());
	}

	@Test
	public void testGetRemoveContactButton() {
		JButton removeContactButton = new JButton("Remove Contact");
	
		assertEquals("Fail: removeContactButton", removeContactButton.getName(), phonebookView.getRemoveContactButton().getName());
	}

	@Test
	public void testSetRemoveContactButton() {
		JButton removeContactButton = new JButton("New text");
		phonebookView.setRemoveContactButton(removeContactButton);
		
		assertEquals("Fail: removeContactButton", removeContactButton.getName(), phonebookView.getRemoveContactButton().getName());
	}

	@Test
	public void testGetEditButton() {
		JButton editButton = new JButton("Edit Name");
		
		assertEquals("Fail: editButton", editButton.getName(), phonebookView.getEditButton().getName());
	}

	@Test
	public void testSetEditButton() {
		JButton editButton = new JButton("Test text");
		phonebookView.setEditButton(editButton);
		
		assertEquals("Fail: editButton", editButton.getName(), phonebookView.getEditButton().getName());
	}

	@Test
	public void testGetEditNButton() {
		JButton editNButton = new JButton("Edit Number");
		
		assertEquals("Fail: editNButton", editNButton.getName(), phonebookView.getEditNButton().getName());
	}

	@Test
	public void testSetEditNButton() {
		JButton editNButton = new JButton("Edit Number");
		phonebookView.setEditNButton(editNButton);
		assertEquals("Fail: editNButton", editNButton.getName(), phonebookView.getEditNButton().getName());
	}
}
