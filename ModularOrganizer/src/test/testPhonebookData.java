//Autor: Marcin Czaja

package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import javax.swing.DefaultListModel;

import model.PhonebookData;
import model.PhonebookEntry;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class testPhonebookData {

	PhonebookData phonebookData;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Test class: PhonebookData.java");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("End of Test: PhonebookData.java");
	}

	@Before
	public void setUp() throws Exception {
		phonebookData = new PhonebookData();
		ArrayList<PhonebookEntry> phonebookEntry = new ArrayList<PhonebookEntry>();
		phonebookEntry.add(new PhonebookEntry("987654321", "Martin"));
		phonebookEntry.add(new PhonebookEntry("123456789", "Jon"));
		
		phonebookData.setDat(phonebookEntry);
	}

	@After
	public void tearDown() throws Exception {
		phonebookData = null;
	}


	@Test
	public void testMake()
	{
		System.out.println("testMake()");

		PhonebookEntry phonebookEntry = new PhonebookEntry("987654321", "Martin");
		
		assertEquals("Fail: variable phonebookEntry", null, phonebookData.Make(phonebookEntry));
		
	}

	@Test
	public void testGetDat()
	{
		System.out.println("testGetDat()");
		
		assertEquals("Fail: variable number, index: " + 0, "987654321", phonebookData.getDat().get(0).getNumber());
		assertEquals("Fail: variable name, index: " + 0, "Martin", phonebookData.getDat().get(0).getName());
		
		assertEquals("Fail: variable number, index: " + 1, "123456789", phonebookData.getDat().get(1).getNumber());
		assertEquals("Fail: variable name, index: " + 1, "Jon", phonebookData.getDat().get(1).getName());
	}

	@Test
	public void testSetDat()
	{
		System.out.println("testSetDat()");
		ArrayList<PhonebookEntry> phonebookEntry = new ArrayList<PhonebookEntry>();
		phonebookEntry=phonebookData.getDat();
		phonebookEntry.add(new PhonebookEntry("147258369", "Aga"));
		
		phonebookData.setDat(phonebookEntry);
		
		int i=phonebookData.getDat().size()-1;
		
		assertEquals("Fail: variable number, index: " + i, "147258369", phonebookData.getDat().get(i).getNumber());
		assertEquals("Fail: variable name, index: " + i, "Aga", phonebookData.getDat().get(i).getName());
		
		
	}

	@Test
	public void testGetData()
	{
		System.out.println("testGetData()");
		DefaultListModel listModel;
		
		listModel = phonebookData.getData();
		
		assertNotNull("Fail: listModel", listModel);
	}

	@Test
	public void testSetData()
	{
		System.out.println("testSetData()");
		DefaultListModel listModel;
		
		listModel = phonebookData.getData();
		phonebookData.setData(listModel);
		
		assertNotNull("Fail: listModel", phonebookData.getData());
	}

}
