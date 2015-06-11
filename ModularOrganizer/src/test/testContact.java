//Autor: Marcin Czaja

package test;

import static org.junit.Assert.*;
import model.Contact;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class testContact {
	Contact contact;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Test class: Contact.java");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("End of Test: Contact.java");
	}

	@Before
	public void setUp() throws Exception {
		contact = new Contact("Harry", "Potter", "688333111",
				"Warsaw", "02.02.1989", "Fruits", "Vegetables",
				"Game", "University education", "Computer crash");
	}

	@After
	public void tearDown() throws Exception {
		contact = null;
	}

	@Test
	public void testContactFirst() {
		
		assertEquals("Fail: variable name", "Harry", contact.name);
		assertEquals("Fail: variable surname", "Potter", contact.surname);
		assertEquals("Fail: variable phoneNumber", "688333111", contact.phoneNumber);
		assertEquals("Fail: variable address", "Warsaw", contact.address);
		assertEquals("Fail: variable birthdate", "02.02.1989", contact.birthdate);
		assertEquals("Fail: variable likes", "Fruits", contact.likes);
		assertEquals("Fail: variable dislikes", "Vegetables", contact.dislikes);
		assertEquals("Fail: variable wantsOnBirthday", "Game", contact.wantsOnBirthday);
		assertEquals("Fail: variable education", "University education", contact.education);
		assertEquals("Fail: variable canHelpWith", "Computer crash", contact.canHelpWith);
	}
	
	@Test
	public void testContactSecond() {
		
	    Contact contact2 = new Contact("Harry", "Potter", "688333111",
				"Warsaw", "02.02.1989", "Fruits", "Vegetables",
				"Game", "University education", "Computer crash");
	    
	    assertEquals("Fail: variable name", contact2.name, contact.name);
		assertEquals("Fail: variable surname", contact2.surname, contact.surname);
		assertEquals("Fail: variable phoneNumber", contact2.phoneNumber, contact.phoneNumber);
		assertEquals("Fail: variable address", contact2.address, contact.address);
		assertEquals("Fail: variable birthdate", contact2.birthdate, contact.birthdate);
		assertEquals("Fail: variable likes", contact2.likes, contact.likes);
		assertEquals("Fail: variable dislikes", contact2.dislikes, contact.dislikes);
		assertEquals("Fail: variable wantsOnBirthday", contact2.wantsOnBirthday, contact.wantsOnBirthday);
		assertEquals("Fail: variable education", contact2.education, contact.education);
		assertEquals("Fail: variable canHelpWith", contact2.canHelpWith, contact.canHelpWith);
	}
	
	@Test
	public void testContactThird() {
	    assertEquals("Fail: variable name", contact.name, contact.name);
		assertEquals("Fail: variable surname", contact.surname, contact.surname);
		assertEquals("Fail: variable phoneNumber", contact.phoneNumber, contact.phoneNumber);
		assertEquals("Fail: variable address", contact.address, contact.address);
		assertEquals("Fail: variable birthdate", contact.birthdate, contact.birthdate);
		assertEquals("Fail: variable likes", contact.likes, contact.likes);
		assertEquals("Fail: variable dislikes", contact.dislikes, contact.dislikes);
		assertEquals("Fail: variable wantsOnBirthday", contact.wantsOnBirthday, contact.wantsOnBirthday);
		assertEquals("Fail: variable education", contact.education, contact.education);
		assertEquals("Fail: variable canHelpWith", contact.canHelpWith, contact.canHelpWith);
	}
}
