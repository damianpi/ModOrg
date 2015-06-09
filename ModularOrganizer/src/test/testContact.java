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
		contact = new Contact("Pawe³", "Pocieszny", "666333111",
				"Warszawa", "02.02.1989", "Lizaczki", "Warzywa",
				"Gre", "Wykszta³cenie œrednie", "Nie dzia³a komputer");
	}

	@After
	public void tearDown() throws Exception {
		contact = null;
	}

	@Test
	public void testContact1() {
		
		assertEquals("Nie dzia³a", "Pawe³", contact.name);
		assertEquals("Nie dzia³a", "Pocieszny", contact.surname);
		assertEquals("Nie dzia³a", "666333111", contact.phoneNumber);
		assertEquals("Nie dzia³a", "Warszawa", contact.address);
		assertEquals("Nie dzia³a", "02.02.1989", contact.birthdate);
		assertEquals("Nie dzia³a", "Lizaczki", contact.likes);
		assertEquals("Nie dzia³a", "Warzywa", contact.dislikes);
		assertEquals("Nie dzia³a", "Gre", contact.wantsOnBirthday);
		assertEquals("Nie dzia³a", "Wykszta³cenie œrednie", contact.education);
		assertEquals("Nie dzia³a", "Nie dzia³a komputer", contact.canHelpWith);
	}
}
