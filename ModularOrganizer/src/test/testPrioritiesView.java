//Autor: Marcin Czaja

package test;

import static org.junit.Assert.*;

import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.border.TitledBorder;

import model.PrioritiesModel;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import view.PrioritiesView;

public class testPrioritiesView {
	
	PrioritiesView prioritiesView;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Test class: PrioritiesView.java");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("End of Test: PrioritiesView.java");
	}

	@Before
	public void setUp() throws Exception
	{	
		prioritiesView = new PrioritiesView();
	}

	@After
	public void tearDown() throws Exception {
		prioritiesView = null;
	}

	@Test
	public void testGetFrame() {
		JFrame frame = new JFrame("Priorities");
		frame.setSize(800, 600);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		assertEquals("Fail: frame", frame.getSize(), prioritiesView.getFrame().getSize());
	}

	@Test
	public void testSetFrame() {
		JFrame frame = prioritiesView.getFrame();
		assertEquals("Fail: frame", frame.getSize(), prioritiesView.getFrame().getSize());
		frame.setSize(300,400);
		prioritiesView.setFrame(frame);
		assertEquals("Fail: frame", 300, prioritiesView.getFrame().getWidth());
		assertEquals("Fail: frame", 400, prioritiesView.getFrame().getHeight());
	}

	@Test
	public void testGetInstructions() {
		JLabel instructions = new JLabel("<html><center>This is your priorities list</center>\nFeel free to add new tasks or remove outdated ones");
		instructions.setBounds(250, 4, 600, 30);
		
		assertEquals("Fail: instructions", "<html><center>This is your priorities list</center>\nFeel free to add new tasks or remove outdated ones",
				prioritiesView.getInstructions().getText());
		assertEquals("Fail: instructions", instructions.getBounds(), prioritiesView.getInstructions().getBounds());
	}

	@Test
	public void testSetInstructions() {
		JLabel instructions = prioritiesView.getInstructions();
		instructions.setBounds(20, 2, 300, 400);
		instructions.setText("New text");
		prioritiesView.setInstructions(instructions);
		
		assertEquals("Fail: instructions", "New text",prioritiesView.getInstructions().getText());
		assertEquals("Fail: instructions", 20, prioritiesView.getInstructions().getX());
		assertEquals("Fail: instructions", 2, prioritiesView.getInstructions().getY());
		assertEquals("Fail: instructions", 300, prioritiesView.getInstructions().getWidth());
		assertEquals("Fail: instructions", 400, prioritiesView.getInstructions().getHeight());
	}

	@Test
	public void testGetMainPane() {
		JTextPane mainPane = new JTextPane();
		mainPane.setEditable(false);
		mainPane.setBounds(50, 50, 700, 350);
		
		assertEquals("Fail: mainPane", mainPane.getBounds(), prioritiesView.getMainPane().getBounds());
	}

	@Test
	public void testSetMainPane() {
		JTextPane mainPane = prioritiesView.getMainPane();
		mainPane.setBounds(20, 2, 300, 400);
		prioritiesView.setMainPane(mainPane);
		
		assertEquals("Fail: instructions", 20, prioritiesView.getMainPane().getX());
		assertEquals("Fail: instructions", 2, prioritiesView.getMainPane().getY());
		assertEquals("Fail: instructions", 300, prioritiesView.getMainPane().getWidth());
		assertEquals("Fail: instructions", 400, prioritiesView.getMainPane().getHeight());
	}

	@Test
	public void testGetAddTask() {
		JPanel addTask = new JPanel();
		addTask.setBounds(50, 400, 400, 150);

		assertEquals("Fail: addTask", addTask.getBounds(), prioritiesView.getAddTask().getBounds());
	}

	@Test
	public void testSetAddTask() {
		JPanel addTask = prioritiesView.getAddTask();
		addTask.setBounds(20, 2, 300, 400);
		prioritiesView.setAddTask(addTask);
		
		assertEquals("Fail: addTask", 20, prioritiesView.getAddTask().getX());
		assertEquals("Fail: addTask", 2, prioritiesView.getAddTask().getY());
		assertEquals("Fail: addTask", 300, prioritiesView.getAddTask().getWidth());
		assertEquals("Fail: addTask", 400, prioritiesView.getAddTask().getHeight());
	}

	@Test
	public void testGetRemoveTask() {
		JPanel removeTask = new JPanel();
		removeTask.setBounds(450, 400, 300, 150);
		
		assertEquals("Fail: removeTask", removeTask.getBounds(), prioritiesView.getRemoveTask().getBounds());
	}

	@Test
	public void testSetRemoveTask() {
		JPanel removeTask = new JPanel();
		removeTask.setBounds(20, 2, 300, 400);
		prioritiesView.setRemoveTask(removeTask);
		
		assertEquals("Fail: addTask", 20, prioritiesView.getRemoveTask().getX());
		assertEquals("Fail: addTask", 2, prioritiesView.getRemoveTask().getY());
		assertEquals("Fail: addTask", 300, prioritiesView.getRemoveTask().getWidth());
		assertEquals("Fail: addTask", 400, prioritiesView.getRemoveTask().getHeight());
	}

	@Test
	public void testGetAddTaskName() {
		JTextArea addTaskName = new JTextArea("Task name", 1, 30);
		assertEquals("Fail: addTaskName", addTaskName.getSize(), prioritiesView.getAddTaskName().getSize());
		assertEquals("Fail: addTaskName", addTaskName.getName(), prioritiesView.getAddTaskName().getName());
	}

	@Test
	public void testSetAddTaskName() {
		JTextArea addTaskName = new JTextArea("Test text", 20, 30);
		prioritiesView.setAddTaskName(addTaskName);
		assertEquals("Fail: addTaskName", addTaskName.getSize(), prioritiesView.getAddTaskName().getSize());
		assertEquals("Fail: addTaskName", addTaskName.getName(), prioritiesView.getAddTaskName().getName());
	}

	@Test
	public void testGetAddTaskPriority() {
		JTextArea addTaskPriority = new JTextArea("Task priority (1-3)", 1, 30);
		
		assertEquals("Fail: addTaskPriority", addTaskPriority.getSize(), prioritiesView.getAddTaskPriority().getSize());
		assertEquals("Fail: addTaskPriority", addTaskPriority.getName(), prioritiesView.getAddTaskPriority().getName());
	}

	@Test
	public void testSetAddTaskPriority() {
		JTextArea addTaskPriority = new JTextArea("Task priority (1-3)", 2, 2);
		prioritiesView.setAddTaskName(addTaskPriority);

		assertEquals("Fail: addTaskPriority", addTaskPriority.getSize(), prioritiesView.getAddTaskPriority().getSize());
		assertEquals("Fail: addTaskPriority", addTaskPriority.getName(), prioritiesView.getAddTaskPriority().getName());
	}

	@Test
	public void testGetRemoveTaskId() {
		JTextArea removeTaskId = new JTextArea("Give ID of a task you want to remove", 1, 25);
		
		assertEquals("Fail: removeTaskId", removeTaskId.getSize(), prioritiesView.getRemoveTaskId().getSize());
		assertEquals("Fail: removeTaskId", removeTaskId.getName(), prioritiesView.getRemoveTaskId().getName());
	}

	@Test
	public void testSetRemoveTaskId() {
		JTextArea removeTaskId = new JTextArea("Give ID of a task you want to remove", 1, 2);
		prioritiesView.setRemoveTaskId(removeTaskId);
		
		assertEquals("Fail: removeTaskId", removeTaskId.getSize(), prioritiesView.getRemoveTaskId().getSize());
		assertEquals("Fail: removeTaskId", removeTaskId.getName(), prioritiesView.getRemoveTaskId().getName());
	}

	@Test
	public void testGetAddTaskButton() {
		JButton addTaskButton = new JButton("Add Task");
		addTaskButton.setPreferredSize(new Dimension(300, 50));
		assertEquals("Fail: addTaskButton", addTaskButton.getPreferredSize(), prioritiesView.getAddTaskButton().getPreferredSize());
		assertEquals("Fail: addTaskButton", addTaskButton.getName(), prioritiesView.getAddTaskButton().getName());
	}

	@Test
	public void testSetAddTaskButton() {
		JButton addTaskButton = new JButton("Test text");
		addTaskButton.setPreferredSize(new Dimension(200, 70));
		prioritiesView.setAddTaskButton(addTaskButton);
		
		assertEquals("Fail: addTaskButton", addTaskButton.getPreferredSize(), prioritiesView.getAddTaskButton().getPreferredSize());
		assertEquals("Fail: addTaskButton", addTaskButton.getName(), prioritiesView.getAddTaskButton().getName());
	}

	@Test
	public void testGetRemoveTaskButton() {
		JButton removeTaskButton = new JButton("Remove Task");
		removeTaskButton.setPreferredSize(new Dimension(250, 50));
		assertEquals("Fail: removeTaskButton", removeTaskButton.getPreferredSize(), prioritiesView.getRemoveTaskButton().getPreferredSize());
		assertEquals("Fail: removeTaskButton", removeTaskButton.getName(), prioritiesView.getRemoveTaskButton().getName());
	}

	@Test
	public void testSetRemoveTaskButton() {
		JButton removeTaskButton = new JButton("Test text");
		removeTaskButton.setPreferredSize(new Dimension(20, 50));
		prioritiesView.setRemoveTaskButton(removeTaskButton);
		
		assertEquals("Fail: removeTaskButton", removeTaskButton.getPreferredSize(), prioritiesView.getRemoveTaskButton().getPreferredSize());
		assertEquals("Fail: removeTaskButton", removeTaskButton.getName(), prioritiesView.getRemoveTaskButton().getName());
	}

}
