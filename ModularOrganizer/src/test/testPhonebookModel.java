//Autor: Marcin Czaja

package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import model.PhonebookData;
import model.PhonebookEntry;
import model.PhonebookModel;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class testPhonebookModel {

	PhonebookModel phonebookModel;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Test class: PhonebookModel.java");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("End of Test: PhonebookModel.java");
	}

	@Before
	public void setUp() throws Exception {
		phonebookModel = new PhonebookModel();
		PhonebookData phonebookData = new PhonebookData();
		ArrayList<PhonebookEntry> phonebookEntry = new ArrayList<PhonebookEntry>();
		
		phonebookEntry.add(new PhonebookEntry("987654321", "Martin"));
		phonebookEntry.add(new PhonebookEntry("123456789", "Jon"));
		
		phonebookData.setDat(phonebookEntry);
		phonebookModel.setData(phonebookData);
	}

	@After
	public void tearDown() throws Exception {
		phonebookModel = null;
	}

	@Test
	public void testGetData()
	{
		System.out.println("testGetDat()");
		
		assertEquals("Fail: variable number, index: " + 0, "987654321", 
				phonebookModel.getData().getDat().get(0).getNumber());
		assertEquals("Fail: variable name, index: " + 0, "Martin", 
				phonebookModel.getData().getDat().get(0).getName());
		
		assertEquals("Fail: variable number, index: " + 1, "123456789", 
				phonebookModel.getData().getDat().get(1).getNumber());
		assertEquals("Fail: variable name, index: " + 1, "Jon", 
				phonebookModel.getData().getDat().get(1).getName());
	}

	@Test
	public void testSetData()
	{
		System.out.println("testSetData()");
		
		ArrayList<PhonebookEntry> phonebookEntry = new ArrayList<PhonebookEntry>();
		PhonebookData phonebookData = new PhonebookData();
		phonebookEntry=phonebookModel.getData().getDat();
		phonebookEntry.add(new PhonebookEntry("147258369", "Aga"));
		phonebookData.setDat(phonebookEntry);
		
		phonebookModel.setData(phonebookData);
		
		int i=phonebookModel.getData().getDat().size()-1;
		
		assertEquals("Fail: variable number, index: " + i, "147258369",
				phonebookModel.getData().getDat().get(i).getNumber());
		assertEquals("Fail: variable name, index: " + i, "Aga",
				phonebookModel.getData().getDat().get(i).getName());
	}

	@Test
	public void testAddEntry()
	{
		System.out.println("testAddEntry()");
		
		phonebookModel.addEntry("147258369", "Aga");
		
		int i=phonebookModel.getData().getDat().size()-1;
		
		assertEquals("Fail: variable number, index: " + i, "147258369",
				phonebookModel.getData().getDat().get(i).getNumber());
		assertEquals("Fail: variable name, index: " + i, "Aga",
				phonebookModel.getData().getDat().get(i).getName());
	}

	@Test
	public void testUniqueName()
	{
		System.out.println("testUniqueName()");
		
		assertEquals("Fail: variable name", "Martin'",
				phonebookModel.uniqueName("Martin"));
	}

	@Test
	public void testSavePhonebook()
	{
		System.out.println("testSavePhonebook()");
		
		phonebookModel.addEntry("147258369", "Aga");
		phonebookModel.savePhonebook();
		phonebookModel=null;
		
		phonebookModel = new PhonebookModel();
		
		int i=phonebookModel.getData().getDat().size()-1;
		
		assertEquals("Fail: variable number, index: " + i, "147258369",
				phonebookModel.getData().getDat().get(i).getNumber());
		assertEquals("Fail: variable name, index: " + i, "Aga",
				phonebookModel.getData().getDat().get(i).getName());
	}

}
