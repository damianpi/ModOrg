// Autor: Marcin Czaja

package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.ListSelectionModel;

import model.Contact;
import model.ContactsData;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class testContactsData {
	
	ContactsData contactsData;
	ArrayList <Contact> contact = new ArrayList<Contact>();
	public DefaultListModel listModel;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception
	{
		System.out.println("Test class: ContactsData.java");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception
	{
		System.out.println("End of Test: ContactsData.java");
	}

	@Before
	public void setUp() throws Exception
	{
		contactsData = new ContactsData();
		DefaultListModel listModel = new DefaultListModel();
		
		contact.add(new Contact("Harry", "Potter", "688333111",
				"Hogward", "02.02.1989", "Fruits", "Vegetables",
				"Game", "University education", "Computer crash"));
		
		contact.add(new Contact("Hermiona", "Potter", "123456789",
				"Hogward", "02.02.1995", "Fruits", "Vegetables",
				"Game", "University education", "Computer crash"));
		
		contactsData.setData(contact);
	}

	@After
	public void tearDown() throws Exception
	{
		System.out.println("End test");
		contactsData = null;
	}

	@Test
	public void testGetData()
	{
		System.out.println("testGetData()");
		
		ArrayList <Contact> contact2 = new ArrayList<Contact>();
		contact2.add(new Contact("Harry", "Potter", "688333111",
				"Hogward", "02.02.1989", "Fruits", "Vegetables",
				"Game", "University education", "Computer crash"));
		
		contact2.add(new Contact("Hermiona", "Potter", "123456789",
				"Hogward", "02.02.1995", "Fruits", "Vegetables",
				"Game", "University education", "Computer crash"));
		
		for(int i=0; i<contactsData.getData().size(); i++)
		{
			assertEquals("Fail: variable name", contact2.get(i).getName(),
					contactsData.getData().get(i).getName());
			assertEquals("Fail: variable surname", contact2.get(i).getSurname(),
					contactsData.getData().get(i).getSurname());
			assertEquals("Fail: variable phoneNumber", contact2.get(i).getPhoneNumber(),
					contactsData.getData().get(i).getPhoneNumber());
			assertEquals("Fail: variable address", contact2.get(i).getAddress(),
					contactsData.getData().get(i).getAddress());
			assertEquals("Fail: variable birthdate", contact2.get(i).getBirthdate(),
					contactsData.getData().get(i).getBirthdate());
			assertEquals("Fail: variable likes", contact2.get(i).getLikes(),
					contactsData.getData().get(i).getLikes());
			assertEquals("Fail: variable dislikes", contact2.get(i).getDislikes(),
					contactsData.getData().get(i).getDislikes());
			assertEquals("Fail: variable wantsOnBirthday", contact2.get(i).getWantsOnBirthday(),
					contactsData.getData().get(i).getWantsOnBirthday());
			assertEquals("Fail: variable education", contact2.get(i).getEducation(),
					contactsData.getData().get(i).getEducation());
			assertEquals("Fail: variable canHelpWith", contact2.get(i).getCanHelpWith(),
					contactsData.getData().get(i).getCanHelpWith());
		}
		
	}

	@Test
	public void testSetData()
	{
		contact.add(new Contact("Jon", "Smith", "121216789",
				"London", "02.02.1975", "Fruits", "Vegetables",
				"Game", "University education", "Computer crash"));
		contactsData.setData(contact);
		
		int i=contactsData.getData().size()-1;
		
		assertEquals("Fail: variable name", "Jon",
				contactsData.getData().get(i).getName());
		assertEquals("Fail: variable surname", "Smith",
				contactsData.getData().get(i).getSurname());
		assertEquals("Fail: variable phoneNumber", "121216789",
				contactsData.getData().get(i).getPhoneNumber());
		assertEquals("Fail: variable address", "London",
				contactsData.getData().get(i).getAddress());
		assertEquals("Fail: variable birthdate", "02.02.1975",
				contactsData.getData().get(i).getBirthdate());
		assertEquals("Fail: variable likes", "Fruits",
				contactsData.getData().get(i).getLikes());
		assertEquals("Fail: variable dislikes", "Vegetables",
				contactsData.getData().get(i).getDislikes());
		assertEquals("Fail: variable wantsOnBirthday", "Game",
				contactsData.getData().get(i).getWantsOnBirthday());
		assertEquals("Fail: variable education", "University education",
				contactsData.getData().get(i).getEducation());
		assertEquals("Fail: variable canHelpWith", "Computer crash",
				contactsData.getData().get(i).getCanHelpWith());
	}

	@Test
	public void testGetListModel()
	{
		System.out.println("testGetListModel()");
		
		listModel = contactsData.getListModel();
		
		assertNotNull("Fail: listModel", listModel);
	}	

	@Test
	public void testSetListModel()
	{
		System.out.println("testSetListModel()");
		
		listModel = contactsData.getListModel();
		contactsData.setListModel(listModel);
		
		assertNotNull("Fail: listModel", contactsData.getListModel());
	}

}
