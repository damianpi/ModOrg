//Author: Marcin Czaja

package test;

import static org.junit.Assert.*;
import model.PhonebookEntry;
import model.Priority;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class testPhonebookEntry {

	PhonebookEntry phonebookEntry;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Test class: PhonebookEntry.java");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("End of Test: PhonebookEntry.java");
	}

	@Before
	public void setUp() throws Exception {
		phonebookEntry = new PhonebookEntry("987654321", "Martin");
	}

	@After
	public void tearDown() throws Exception {
		phonebookEntry = null;
	}

	@Test
	public void testPhonebookEntryFirst() {
		
		assertEquals("Fail: variable number", "987654321", phonebookEntry.number);
		assertEquals("Fail: variable name", "Martin", phonebookEntry.name);
	}
	
	@Test
	public void testPhonebookEntrySecond() {
	    PhonebookEntry phonebookEntry2 = new PhonebookEntry("987654321", "Martin");
	    
	    assertEquals("Fail: variable number", phonebookEntry2.number, phonebookEntry.number);
		assertEquals("Fail: variable name", phonebookEntry2.name, phonebookEntry.name);
	}
	
	@Test
	public void testPhonebookEntryThird() {
		assertEquals("Fail: variable number", phonebookEntry.number, phonebookEntry.number);
		assertEquals("Fail: variable name", phonebookEntry.name, phonebookEntry.name);
	}
}
