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
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Test class: Priority.java");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("End of Test: Priority.java");
	}

	@Before
	public void setUp() throws Exception {
		priority = new Priority(2, "Test");
	}

	@After
	public void tearDown() throws Exception {
		priority = null;
	}

	@Test
	public void testPriorityFirst() {
		
		assertEquals("Fail: variable level", 2, priority.level);
		assertEquals("Fail: variable name", "Test", priority.name);
	}
	
	@Test
	public void testPrioritySecond() {
	    Priority priority2 = new Priority(2, "Test");
	    
	    assertEquals("Fail: variable level", priority2.level, priority.level);
		assertEquals("Fail: variable name", priority2.name, priority.name);
	}
	
	@Test
	public void testPriorityThird() {
		assertEquals("Fail: variable level", priority.level, priority.level);
		assertEquals("Fail: variable name", priority.name, priority.name);
	}
}
