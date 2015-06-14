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
		System.out.println("End test");
		priority = null;
	}

	@Test
	public void testPriorityFirst()
	{
		System.out.println("testPriorityFirst()");
		
		assertEquals("Fail: variable level", 2, priority.getLevel());
		assertEquals("Fail: variable name", "Martin", priority.getName());
	}
		
	@Test
	public void testPrioritySecond() 
	{
		System.out.println("testPrioritySecond() ");
		
	    Priority priority2 = new Priority(2, "Martin");
	    
	    assertEquals("Fail: variable level", priority2.getLevel(), priority.getLevel());
		assertEquals("Fail: variable name", priority2.getName(), priority.getName());
	}
		
	@Test
	public void testPriorityThird()
	{
		System.out.println("testPriorityThird()");
		
		assertEquals("Fail: variable level", priority.getLevel(), priority.getLevel());
		assertEquals("Fail: variable name", priority.getName(), priority.getName());
	}


	@Test
	public void testGetLevel()
	{
		System.out.println("testGetLevel()");
		
		int level = 2;
		assertEquals("Fail: variable level", priority.getLevel(), level);
	}

	@Test
	public void testSetLevelFirst()
	{
		System.out.println("testSetLevelFirst()");
		
		assertEquals("Fail: variable level", priority.getLevel(), 2);
		priority.setLevel(3);
		assertEquals("Fail: variable level", priority.getLevel(), 3);
	}
	
	@Test
	public void testSetLevelSecond()
	{
		System.out.println("testSetLevelSecond()");
		
		int level=3;
		priority.setLevel(3);
		assertEquals("Fail: variable level", priority.getLevel(), level);
	}

	@Test
	public void testGetName()
	{
		System.out.println("testGetName()");
		
		String name="Martin";
		assertEquals("Fail: variable name", priority.getName(), name);
	}

	@Test
	public void testSetNamFirst()
	{
		System.out.println("testSetNamFirst()");
		
		assertEquals("Fail: variable name", priority.getName(), "Martin");
		priority.setName("Jon");
		assertEquals("Fail: variable name", priority.getName(), "Jon");
	}

	@Test
	public void testSetNamSecond()
	{
		System.out.println("testSetNamSecond()");
		
		String name="Jon";
		priority.setName("Jon");
		assertEquals("Fail: variable name", priority.getName(), name);
	}
}
