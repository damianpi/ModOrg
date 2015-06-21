//Autor: Marcin Czaja

package test;

import static org.junit.Assert.*;

import javax.swing.JPanel;

import model.Contact;
import model.PrioritiesModel;
import model.Priority;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import view.PrioritiesView;
import controller.PrioritiesController;

public class testPrioritiesController {

	PrioritiesController prioritiesController;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception
	{
		System.out.println("Test class: PrioritiesController.java");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception
	{
		System.out.println("End of Test: PrioritiesController.java");
	}

	@Before
	public void setUp() throws Exception
	{
		prioritiesController = new PrioritiesController(new PrioritiesModel(), new PrioritiesView());
	}

	@After
	public void tearDown() throws Exception
	{
		System.out.println("End test");
	}

	@Test
	public void testGetModel() {
		PrioritiesModel prioritiesModel = prioritiesController.getModel();
		
		for(int i=0; i<prioritiesController.getModel().getData().getData().size(); i++)
		{
			assertEquals(prioritiesModel.getData().getData().get(i), prioritiesController.getModel().getData().getData().get(i));
		}
	}

	@Test
	public void testSetModel() {
		PrioritiesModel prioritiesModel = prioritiesController.getModel();
		prioritiesModel.getData().getData().add(2, new Priority(2, "test"));
		prioritiesController.setModel(prioritiesModel);
		int i = prioritiesController.getModel().getData().getData().size()-1;
		
		assertEquals(prioritiesModel.getData().getData().get(i), prioritiesController.getModel().getData().getData().get(i));
	}

	@Test
	public void testGetView() {
		PrioritiesView prioritiesView = prioritiesController.getView();
		
		assertEquals(prioritiesView.getAddTask(), prioritiesController.getView().getAddTask());
		assertEquals(prioritiesView.getAddTaskButton(), prioritiesController.getView().getAddTaskButton());
		assertEquals(prioritiesView.getAddTaskName(), prioritiesController.getView().getAddTaskName());
		assertEquals(prioritiesView.getAddTaskPriority(), prioritiesController.getView().getAddTaskPriority());
		assertEquals(prioritiesView.getInstructions(), prioritiesController.getView().getInstructions());
		assertEquals(prioritiesView.getMainPane(), prioritiesController.getView().getMainPane());
		assertEquals(prioritiesView.getRemoveTask(), prioritiesController.getView().getRemoveTask());
		assertEquals(prioritiesView.getRemoveTaskButton(), prioritiesController.getView().getRemoveTaskButton());
		assertEquals(prioritiesView.getRemoveTaskId(), prioritiesController.getView().getRemoveTaskId());		
	}

	@Test
	public void testSetView() {
		PrioritiesView prioritiesView = prioritiesController.getView();
		JPanel removeTask = new JPanel();
		removeTask.setBounds(20, 400, 300, 150);
		prioritiesView.setAddTask(removeTask);
		prioritiesController.setView(prioritiesView);
		
		assertEquals(prioritiesView.getAddTask(), prioritiesController.getView().getAddTask());
	}

}
