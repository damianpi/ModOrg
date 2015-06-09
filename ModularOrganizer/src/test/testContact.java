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
		contact = new Contact("Pawe�", "Pocieszny", "666333111",
				"Warszawa", "02.02.1989", "Lizaczki", "Warzywa",
				"Gre", "Wykszta�cenie �rednie", "Nie dzia�a komputer");
	}

	@After
	public void tearDown() throws Exception {
		contact = null;
	}

	@Test
	public void testContact1() {
		
		assertEquals("Nie dzia�a", "Pawe�", contact.name);
		assertEquals("Nie dzia�a", "Pocieszny", contact.surname);
		assertEquals("Nie dzia�a", "666333111", contact.phoneNumber);
		assertEquals("Nie dzia�a", "Warszawa", contact.address);
		assertEquals("Nie dzia�a", "02.02.1989", contact.birthdate);
		assertEquals("Nie dzia�a", "Lizaczki", contact.likes);
		assertEquals("Nie dzia�a", "Warzywa", contact.dislikes);
		assertEquals("Nie dzia�a", "Gre", contact.wantsOnBirthday);
		assertEquals("Nie dzia�a", "Wykszta�cenie �rednie", contact.education);
		assertEquals("Nie dzia�a", "Nie dzia�a komputer", contact.canHelpWith);
	}
}
