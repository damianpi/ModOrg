//Author: Marcin Czaja

package test;

import static org.junit.Assert.*;
import model.Priority;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class testPriority {

	Priority priority;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception
	{
		System.out.println("Test class: Priority.java");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception
	{
		System.out.println("End of Test: Priority.java");
	}

	@Before
	public void setUp() throws Exception
	{
		priority = new Priority(2, "Martin");
	}
		
	@After
	public void tearDown() throws Exception
	{
		priority = null;
	}

	@Test
	public void testPriorityFirst() {
			
		assertEquals("Fail: variable level", 2, priority.getLevel());
		assertEquals("Fail: variable name", "Martin", priority.getName());
	}
		
	@Test
	public void testPrioritySecond() 
	{
	    Priority priority2 = new Priority(2, "Martin");
	    
	    assertEquals("Fail: variable level", priority2.getLevel(), priority.getLevel());
		assertEquals("Fail: variable name", priority2.getName(), priority.getName());
	}
		
	@Test
	public void testPriorityThird()
	{
		assertEquals("Fail: variable level", priority.getLevel(), priority.getLevel());
		assertEquals("Fail: variable name", priority.getName(), priority.getName());
	}


	@Test
	public void testGetLevel()
	{
		assertEquals("Fail: variable level", priority.getLevel(), 2);
	}

	@Test
	public void testSetLevelFirst()
	{
		assertEquals("Fail: variable level", priority.getLevel(), 2);
		priority.setLevel(3);
		assertEquals("Fail: variable level", priority.getLevel(), 3);
	}
	
	@Test
	public void testSetLevelSecond()
	{
		int level=3;
		priority.setLevel(3);
		assertEquals("Fail: variable level", priority.getLevel(), level);
	}

	@Test
	public void testGetName()
	{
		assertEquals("Fail: variable name", priority.getName(), "Martin");
	}

	@Test
	public void testSetNamFirst()
	{
		assertEquals("Fail: variable name", priority.getName(), "Martin");
		priority.setName("Jon");
		assertEquals("Fail: variable name", priority.getName(), "Jon");
	}

	@Test
	public void testSetNamSecond()
	{
		String name="Jon";
		priority.setName("Jon");
		assertEquals("Fail: variable name", priority.getName(), name);
	}
}
