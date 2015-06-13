package test;

import static org.junit.Assert.*;
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
	public void setUp() throws Exception {
		prioritiesData = new PrioritiesData();
		
		prioritiesData.data.add(new Priority(1, "Priority1"));
		prioritiesData.data.add(new Priority(2, "Priority2"));
		prioritiesData.data.add(new Priority(3, "Priority3"));
	}

	@After
	public void tearDown() throws Exception {
		prioritiesData = null;
	}

	@Test
	public void testPrioritiesDataFirst() {
		
		PrioritiesData prioritiesData2 = new PrioritiesData();
		
		prioritiesData2.data.add(new Priority(1, "Priority1"));
		prioritiesData2.data.add(new Priority(2, "Priority2"));
		prioritiesData2.data.add(new Priority(3, "Priority3"));
		
		for(int i=0; i<prioritiesData.data.size(); i++)
		{
			assertEquals("Fail: variable level, index: " + i, prioritiesData2.data.get(i).level,
					prioritiesData.data.get(i).level);
			assertEquals("Fail: variable name, index: " + i, prioritiesData2.data.get(i).name,
					prioritiesData.data.get(i).name);
		}
	}
	
	@Test
	public void testPrioritiesDataSecond() {
		
		for(int i=0; i<prioritiesData.data.size(); i++)
		{
			assertEquals("Fail: variable level, index: " + i, prioritiesData.data.get(i).level,
					prioritiesData.data.get(i).level);
			assertEquals("Fail: variable name, index: " + i, prioritiesData.data.get(i).name,
					prioritiesData.data.get(i).name);
		}
	
	}
	
	@Test
	public void testPrioritiesDataThird() {
		
		PrioritiesData prioritiesData2 = new PrioritiesData();
		
		prioritiesData2.data.add(new Priority(1, "Priority1"));
		prioritiesData2.data.add(new Priority(2, "Priority2"));
		prioritiesData2.data.add(new Priority(3, "Priority3"));
		
		assertEquals("Fail: variable level, index: " + 0, 1, prioritiesData.data.get(0).level);
		assertEquals("Fail: variable name, index: " + 0, "Priority1", prioritiesData.data.get(0).name);
		
		assertEquals("Fail: variable level, index: " + 1, 2, prioritiesData.data.get(1).level);
		assertEquals("Fail: variable name, index: " + 1, "Priority2", prioritiesData.data.get(1).name);
		
		assertEquals("Fail: variable level, index: " + 2, 3, prioritiesData.data.get(2).level);
		assertEquals("Fail: variable name, index: " + 2, "Priority3", prioritiesData.data.get(2).name);
	
	}
}
