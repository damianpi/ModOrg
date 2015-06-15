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
		
		assertEquals("Fail: variable number", "987654321", phonebookEntry.getNumber());
		assertEquals("Fail: variable name", "Martin", phonebookEntry.getName());
	}
	
	@Test
	public void testPhonebookEntrySecond() {
	    PhonebookEntry phonebookEntry2 = new PhonebookEntry("987654321", "Martin");
	    
	    assertEquals("Fail: variable number", phonebookEntry2.getNumber(), phonebookEntry.getNumber());
		assertEquals("Fail: variable name", phonebookEntry2.getName(), phonebookEntry.getName());
	}
	
	@Test
	public void testPhonebookEntryThird() {
		assertEquals("Fail: variable number", phonebookEntry.getNumber(), phonebookEntry.getNumber());
		assertEquals("Fail: variable name", phonebookEntry.getName(), phonebookEntry.getName());
	}
	
	@Test
	public void testGetName() {
		assertEquals("Fail: variable name", "Martin", phonebookEntry.getName());
	}
	
	@Test
	public void testGetNumber() {
		assertEquals("Fail: variable number", "987654321", phonebookEntry.getNumber());
	}
	
	@Test
	public void testSetName() {
		assertEquals("Fail: variable name", "Martin", phonebookEntry.getName());
		phonebookEntry.setName("Jon");
		assertEquals("Fail: variable name", "Jon", phonebookEntry.getName());
	}
	
	@Test
	public void testSetNumber() {
		assertEquals("Fail: variable number", "987654321", phonebookEntry.getNumber());
		phonebookEntry.setNumber("123456789");
		assertEquals("Fail: variable number", "123456789", phonebookEntry.getNumber());
	}
}
