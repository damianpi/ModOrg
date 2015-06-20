// Autor: Marcin Czaja

package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import javax.swing.DefaultListModel;

import model.Contact;
import model.ContactsData;
import model.ContactsModel;
import model.PrioritiesModel;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class testContactsModel {
	
	ContactsModel contactsModel;
	ArrayList <Contact> contact = new ArrayList<Contact>();
	ContactsData contactsData;

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
		contactsModel = new ContactsModel();
		contactsData = new ContactsData();
		
		contact.add(new Contact("Harry", "Potter", "688333111",
				"Hogward", "02.02.1989", "Fruits", "Vegetables",
				"Game", "University education", "Computer crash"));
		
		contact.add(new Contact("Hermiona", "Potter", "123456789",
				"Hogward", "02.02.1995", "Fruits", "Vegetables",
				"Game", "University education", "Computer crash"));
		
		contactsData.setData(contact);
		contactsModel.setData(contactsData);
	}

	@After
	public void tearDown() throws Exception
	{
		System.out.println("End test");
		contactsModel = null;
	}

	@Test
	public void testSaveContacts()
	{
		System.out.println("testSaveContacts()");
		
		contact.add(new Contact("Jon", "Smith", "121216789",
				"London", "02.02.1975", "Fruits", "Vegetables",
				"Game", "University education", "Computer crash"));
		contactsData.setData(contact);
		contactsModel.setData(contactsData);
		contactsModel.saveContacts();
		contactsModel = null;
		contactsData=null;
		contactsModel = new ContactsModel();
		contactsData = contactsModel.getData();
	
		int i=contactsModel.getData().getData().size()-1;
		
		assertEquals("Fail: variable name", "Jon",
				contactsModel.getData().getData().get(i).getName());
		assertEquals("Fail: variable surname", "Smith",
				contactsModel.getData().getData().get(i).getSurname());
		assertEquals("Fail: variable phoneNumber", "121216789",
				contactsModel.getData().getData().get(i).getPhoneNumber());
		assertEquals("Fail: variable address", "London",
				contactsModel.getData().getData().get(i).getAddress());
		assertEquals("Fail: variable birthdate", "02.02.1975",
				contactsModel.getData().getData().get(i).getBirthdate());
		assertEquals("Fail: variable likes", "Fruits",
				contactsModel.getData().getData().get(i).getLikes());
		assertEquals("Fail: variable dislikes", "Vegetables",
				contactsModel.getData().getData().get(i).getDislikes());
		assertEquals("Fail: variable wantsOnBirthday", "Game",
				contactsModel.getData().getData().get(i).getWantsOnBirthday());
		assertEquals("Fail: variable education", "University education",
				contactsModel.getData().getData().get(i).getEducation());
		assertEquals("Fail: variable canHelpWith", "Computer crash",
				contactsModel.getData().getData().get(i).getCanHelpWith());
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
		
		for(int i=0; i<contactsModel.getData().getData().size(); i++)
		{
			assertEquals("Fail: variable name", contact2.get(i).getName(),
					contactsModel.getData().getData().get(i).getName());
			assertEquals("Fail: variable surname", contact2.get(i).getSurname(),
					contactsModel.getData().getData().get(i).getSurname());
			assertEquals("Fail: variable phoneNumber", contact2.get(i).getPhoneNumber(),
					contactsModel.getData().getData().get(i).getPhoneNumber());
			assertEquals("Fail: variable address", contact2.get(i).getAddress(),
					contactsModel.getData().getData().get(i).getAddress());
			assertEquals("Fail: variable birthdate", contact2.get(i).getBirthdate(),
					contactsModel.getData().getData().get(i).getBirthdate());
			assertEquals("Fail: variable likes", contact2.get(i).getLikes(),
					contactsModel.getData().getData().get(i).getLikes());
			assertEquals("Fail: variable dislikes", contact2.get(i).getDislikes(),
					contactsModel.getData().getData().get(i).getDislikes());
			assertEquals("Fail: variable wantsOnBirthday", contact2.get(i).getWantsOnBirthday(),
					contactsModel.getData().getData().get(i).getWantsOnBirthday());
			assertEquals("Fail: variable education", contact2.get(i).getEducation(),
					contactsModel.getData().getData().get(i).getEducation());
			assertEquals("Fail: variable canHelpWith", contact2.get(i).getCanHelpWith(),
					contactsModel.getData().getData().get(i).getCanHelpWith());
		}
	}

	@Test
	public void testSetData()
	{
		contact.add(new Contact("Jon", "Smith", "121216789",
				"London", "02.02.1975", "Fruits", "Vegetables",
				"Game", "University education", "Computer crash"));
		contactsData.setData(contact);
		contactsModel.setData(contactsData);
		
		int i=contactsModel.getData().getData().size()-1;
		
		assertEquals("Fail: variable name", "Jon",
				contactsModel.getData().getData().get(i).getName());
		assertEquals("Fail: variable surname", "Smith",
				contactsModel.getData().getData().get(i).getSurname());
		assertEquals("Fail: variable phoneNumber", "121216789",
				contactsModel.getData().getData().get(i).getPhoneNumber());
		assertEquals("Fail: variable address", "London",
				contactsModel.getData().getData().get(i).getAddress());
		assertEquals("Fail: variable birthdate", "02.02.1975",
				contactsModel.getData().getData().get(i).getBirthdate());
		assertEquals("Fail: variable likes", "Fruits",
				contactsModel.getData().getData().get(i).getLikes());
		assertEquals("Fail: variable dislikes", "Vegetables",
				contactsModel.getData().getData().get(i).getDislikes());
		assertEquals("Fail: variable wantsOnBirthday", "Game",
				contactsModel.getData().getData().get(i).getWantsOnBirthday());
		assertEquals("Fail: variable education", "University education",
				contactsModel.getData().getData().get(i).getEducation());
		assertEquals("Fail: variable canHelpWith", "Computer crash",
				contactsModel.getData().getData().get(i).getCanHelpWith());
	}

}
