//Autor: Marcin Czaja

package test;

import static org.junit.Assert.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import view.ContactsView;
import view.PrioritiesView;

public class testContactsView {

	ContactsView contactsView;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Test class: ContactsView.java");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("End of Test: ContactsView.java");
	}

	@Before
	public void setUp() throws Exception
	{	
		contactsView = new ContactsView();
	}

	@After
	public void tearDown() throws Exception {
		contactsView = null;
	}

	@Test
	public void testGetFrame() {
		JFrame frame = new JFrame("Priorities");
		frame.setSize(800, 600);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		assertEquals("Fail: frame", frame.getSize(), contactsView.getFrame().getSize());
	}

	@Test
	public void testSetFrame() {
		JFrame frame = contactsView.getFrame();
		assertEquals("Fail: frame", frame.getSize(), contactsView.getFrame().getSize());
		frame.setSize(300,400);
		contactsView.setFrame(frame);
		assertEquals("Fail: frame", 300, contactsView.getFrame().getWidth());
		assertEquals("Fail: frame", 400, contactsView.getFrame().getHeight());
	}


	@Test
	public void testGetInstructions() {
		JLabel instructions = new JLabel("<html><center>This is your contacts list</center>\nChoose one to see more details, or add a new one");
		instructions.setBounds(250, 4, 600, 30);
		
		assertEquals("Fail: instructions", "<html><center>This is your contacts list</center>\nChoose one to see more details, or add a new one",
				contactsView.getInstructions().getText());
		assertEquals("Fail: instructions", instructions.getBounds(), contactsView.getInstructions().getBounds());
	}

	@Test
	public void testSetInstructions() {
		JLabel instructions = contactsView.getInstructions();
		instructions.setBounds(20, 2, 300, 400);
		instructions.setText("New text");
		contactsView.setInstructions(instructions);
		
		assertEquals("Fail: instructions", "New text",contactsView.getInstructions().getText());
		assertEquals("Fail: instructions", 20, contactsView.getInstructions().getX());
		assertEquals("Fail: instructions", 2, contactsView.getInstructions().getY());
		assertEquals("Fail: instructions", 300, contactsView.getInstructions().getWidth());
		assertEquals("Fail: instructions", 400, contactsView.getInstructions().getHeight());
	}

	@Test
	public void testGetSelectButton() {
		JButton selectButton = new JButton("<html><center><font size=7> Select");
		selectButton.setBounds(580, 415, 150, 130);
		
		assertEquals("Fail: selectButton", selectButton.getName(), contactsView.getSelectButton().getName());
		assertEquals("Fail: selectButton", selectButton.getBounds(), contactsView.getSelectButton().getBounds());
	}

	@Test
	public void testSetSelectButton() {
		JButton selectButton = new JButton("Test text");
		selectButton.setBounds(20, 2, 300, 400);
		contactsView.setSelectButton(selectButton);
		
		assertEquals("Fail: selectButton", "Test text",contactsView.getSelectButton().getText());
		assertEquals("Fail: selectButton", 20, contactsView.getSelectButton().getX());
		assertEquals("Fail: selectButton", 2, contactsView.getSelectButton().getY());
		assertEquals("Fail: selectButton", 300, contactsView.getSelectButton().getWidth());
		assertEquals("Fail: selectButton", 400, contactsView.getSelectButton().getHeight());
	}

	@Test
	public void testGetAddContactButton() {
		JButton addContactButton = new JButton("New contact");
		addContactButton.setBounds(80, 430, 150, 80);
		
		assertEquals("Fail: addContactButton", addContactButton.getName(), contactsView.getAddContactButton().getName());
		assertEquals("Fail: addContactButton", addContactButton.getBounds(), contactsView.getAddContactButton().getBounds());	
	}

	@Test
	public void testSetAddContactButton() {
		JButton addContactButton = new JButton("New text");
		addContactButton.setBounds(20, 2, 300, 400);
		contactsView.setAddContactButton(addContactButton);
		
		assertEquals("Fail: addContactButton", "New text",contactsView.getAddContactButton().getText());
		assertEquals("Fail: addContactButton", 20, contactsView.getAddContactButton().getX());
		assertEquals("Fail: addContactButton", 2, contactsView.getAddContactButton().getY());
		assertEquals("Fail: addContactButton", 300, contactsView.getAddContactButton().getWidth());
		assertEquals("Fail: addContactButton", 400, contactsView.getAddContactButton().getHeight());
	}

	@Test
	public void testGetRemoveContactButton() {
		JButton removeContactButton = new JButton("Remove contact");
		removeContactButton.setBounds(231, 430, 150, 80);
		
		assertEquals("Fail: removeContactButton", removeContactButton.getName(), contactsView.getRemoveContactButton().getName());
		assertEquals("Fail: removeContactButton", removeContactButton.getBounds(), contactsView.getRemoveContactButton().getBounds());
	}

	@Test
	public void testSetRemoveContactButton() {
		JButton removeContactButton = new JButton("New text");
		removeContactButton.setBounds(20, 2, 300, 400);
		contactsView.setRemoveContactButton(removeContactButton);
		
		assertEquals("Fail: removeContactButton", "New text",contactsView.getRemoveContactButton().getText());
		assertEquals("Fail: removeContactButton", 20, contactsView.getRemoveContactButton().getX());
		assertEquals("Fail: removeContactButton", 2, contactsView.getRemoveContactButton().getY());
		assertEquals("Fail: removeContactButton", 300, contactsView.getRemoveContactButton().getWidth());
		assertEquals("Fail: removeContactButton", 400, contactsView.getRemoveContactButton().getHeight());
	}

}
