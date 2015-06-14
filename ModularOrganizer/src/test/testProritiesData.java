//Author: Marcin Czaja

package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import model.PrioritiesData;
import model.Priority;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class testProritiesData {

	PrioritiesData prioritiesData;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Test class: PrioritiesData.java");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("End of Test: PrioritiesData.java");
	}

	@Before
	public void setUp() throws Exception
	{	
		ArrayList<Priority> data = new ArrayList<Priority>();
		prioritiesData = new PrioritiesData();
		
		data.add(new Priority(1, "Priority1"));
		data.add(new Priority(2, "Priority2"));
		data.add(new Priority(3, "Priority3"));
		prioritiesData.setData(data);
		data=null;
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("End test");
		prioritiesData = null;
	}

	@Test
	public void testPrioritiesDataFirst()
	{
		System.out.println("testPrioritiesDataFirst()");
		
		ArrayList<Priority> data = new ArrayList<Priority>();
		ArrayList<Priority> data2 = new ArrayList<Priority>();
		
		data.add(new Priority(1, "Priority1"));
		data.add(new Priority(2, "Priority2"));
		data.add(new Priority(3, "Priority3"));
		data2=prioritiesData.getData();
		
		for(int i=0; i<data2.size(); i++)
		{
			assertEquals("Fail: variable level, index: " + i, data.get(i).getLevel(),
					data.get(i).getLevel());
			assertEquals("Fail: variable name, index: " + i, data.get(i).getName(),
					data.get(i).getName());
		}
	}
	
	@Test
	public void testPrioritiesDataSecond()
	{	
		System.out.println("testPrioritiesDataSecond()");
		
		ArrayList<Priority> data = new ArrayList<Priority>();
		data=prioritiesData.getData();
		
		for(int i=0; i<data.size(); i++)
		{
			assertEquals("Fail: variable level, index: " + i, data.get(i).getLevel(),
					data.get(i).getLevel());
			assertEquals("Fail: variable name, index: " + i, data.get(i).getName(),
					data.get(i).getName());
		}
	
	}
	
	@Test
	public void testPrioritiesDataThird()
	{
		System.out.println("testPrioritiesDataThird()");
		
		ArrayList<Priority> data = new ArrayList<Priority>();
		data=prioritiesData.getData();
		
		assertEquals("Fail: variable level, index: " + 0, 1, data.get(0).getLevel());
		assertEquals("Fail: variable name, index: " + 0, "Priority1", data.get(0).getName());
		
		assertEquals("Fail: variable level, index: " + 1, 2, data.get(1).getLevel());
		assertEquals("Fail: variable name, index: " + 1, "Priority2", data.get(1).getName());
		
		assertEquals("Fail: variable level, index: " + 2, 3, data.get(2).getLevel());
		assertEquals("Fail: variable name, index: " + 2, "Priority3", data.get(2).getName());
	
	}
	
	@Test
	public void testGetData()
	{
		System.out.println("testGetData()");
		
		ArrayList<Priority> data = new ArrayList<Priority>();
		data=prioritiesData.getData();
		
		assertEquals("Fail: object data, index: " + 0, data, prioritiesData.getData());
	}
	
	@Test
	public void testSetData()
	{
		System.out.println("testSetData()");
		
		ArrayList<Priority> data = new ArrayList<Priority>();
		data=prioritiesData.getData();
		int i;
		
		data.add(new Priority(4, "Priority4"));
		i = data.size()-1;
		assertEquals("Fail: variable level, index: " + 2, 4, data.get(i).getLevel());
		assertEquals("Fail: variable name, index: " + 2, "Priority4", data.get(i).getName());
	}
}
