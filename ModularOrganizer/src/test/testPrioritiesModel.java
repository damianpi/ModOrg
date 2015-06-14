package test;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.util.ArrayList;

import model.PrioritiesData;
import model.PrioritiesModel;
import model.Priority;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class testPrioritiesModel {

	PrioritiesModel prioritiesModel;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Test class: PrioritiesModel.java");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("End of Test: PrioritiesModel.java");
	}

	@Before
	public void setUp() throws Exception
	{	
		prioritiesModel = new PrioritiesModel();
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("End test");
		prioritiesModel = null;
	}

	@Test
	public void testPrioritiesModelFirst()
	{
		System.out.println("testPrioritiesModelFirst()");
		
		PrioritiesData data = new PrioritiesData();
		
		try{
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:/ModularOrganizer/Priorities/priorities.pd"));
			data = (PrioritiesData)in.readObject();
			in.close();
		}catch(Exception e){}
		
		for(int i=0; i<data.getData().size(); i++)
		{
			assertEquals("Fail: variable level", data.getData().get(i).getLevel(), 
					prioritiesModel.getData().getData().get(i).getLevel());
			assertEquals("Fail: variable name", data.getData().get(i).getName(), 
					prioritiesModel.getData().getData().get(i).getName());
		}
	}

	@Test
	public void testAddPriority()
	{
		System.out.println("testAddPriority()");
		
		int size;
		
		prioritiesModel.addPriority(8, "Name");
		size = prioritiesModel.getData().getData().size()-1;
		assertEquals("Fail: variable level", 3, prioritiesModel.getData().getData().get(size).getLevel());
		assertEquals("Fail: variable name", "Name", prioritiesModel.getData().getData().get(size).getName());
		
		prioritiesModel.addPriority(2, "Fast");
		size = prioritiesModel.getData().getData().size()-1;
		assertEquals("Fail: variable level", 2, prioritiesModel.getData().getData().get(size).getLevel());
		assertEquals("Fail: variable name", "Fast", prioritiesModel.getData().getData().get(size).getName());
		
		prioritiesModel.addPriority(0, "Snow");
		size = prioritiesModel.getData().getData().size()-1;
		assertEquals("Fail: variable level", 1, prioritiesModel.getData().getData().get(size).getLevel());
		assertEquals("Fail: variable name", "Snow", prioritiesModel.getData().getData().get(size).getName());
	}

	@Test
	public void testSavePriorities()
	{
		System.out.println("testSavePriorities()");
		
		int size;
		
		prioritiesModel.addPriority(2, "Fast");
		prioritiesModel.savePriorities();
		prioritiesModel=new PrioritiesModel();
	
		size = prioritiesModel.getData().getData().size()-1;
		assertEquals("Fail: variable level", 2, prioritiesModel.getData().getData().get(size).getLevel());
		assertEquals("Fail: variable name", "Fast", prioritiesModel.getData().getData().get(size).getName());
	}

	@Test
	public void testGetData()
	{
		System.out.println("testGetData()");
		
		PrioritiesData prioritiesData = prioritiesModel.getData();
		
		for(int i=0; i<prioritiesData.getData().size(); i++)
		{
			assertEquals("Fail: variable level", prioritiesData.getData().get(i).getLevel(), 
					prioritiesModel.getData().getData().get(i).getLevel());
			assertEquals("Fail: variable name", prioritiesData.getData().get(i).getName(), 
					prioritiesModel.getData().getData().get(i).getName());
		}
	}

	@Test
	public void testSetData()
	{
		System.out.println("testSavePriorities()");
		
		PrioritiesModel prioritiesModel2 = new PrioritiesModel();
		int size;
		prioritiesModel2.addPriority(2, "Fast");
		prioritiesModel.setData(prioritiesModel2.getData());
	
		size = prioritiesModel.getData().getData().size()-1;
		assertEquals("Fail: variable level", 2, prioritiesModel.getData().getData().get(size).getLevel());
		assertEquals("Fail: variable name", "Fast", prioritiesModel.getData().getData().get(size).getName());
	}

}
