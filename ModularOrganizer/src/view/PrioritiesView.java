//Author: Damian Piela
package view;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class PrioritiesView {

	private JFrame frame;
	private JLabel instructions;
	private JTextPane mainPane;
	private JPanel addTask, removeTask;
	private JTextArea addTaskName, addTaskPriority, removeTaskId;
	private JButton addTaskButton, removeTaskButton;
	
	
	public PrioritiesView(){
		frame = new JFrame("Priorities");
		frame.setSize(800, 600);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		
		instructions = new JLabel("<html><center>This is your priorities list</center>\nFeel free to add new tasks or remove outdated ones");
		instructions.setBounds(250, 4, 600, 30);
		frame.add(instructions);
		
		mainPane = new JTextPane();
		mainPane.setEditable(false);
		mainPane.setBounds(50, 50, 700, 350);
		JScrollPane textField = new JScrollPane(mainPane);
		textField.setBounds(50, 50, 700, 350);
		frame.add(textField);
		
		addTask = new JPanel();
		addTask.setBounds(50, 400, 400, 150);
		TitledBorder addTaskTitle = BorderFactory.createTitledBorder("Add a new task");
		addTask.setBorder(addTaskTitle);
		addTaskName = new JTextArea("Task name", 1, 30);
		addTask.add(addTaskName);
		addTaskPriority = new JTextArea("Task priority (1-3)", 1, 30);
		addTask.add(addTaskPriority);
		addTaskButton = new JButton("Add Task");
		addTask.add(new JLabel("__________________________"));
		addTaskButton.setPreferredSize(new Dimension(300, 50));
		addTask.add(addTaskButton);
		frame.add(addTask);
		
		removeTask = new JPanel();
		removeTask.setBounds(450, 400, 300, 150);
		TitledBorder removeTaskTitle = BorderFactory.createTitledBorder("Remove an outdated task");
		removeTask.setBorder(removeTaskTitle);
		removeTaskId = new JTextArea("Give ID of a task you want to remove", 1, 25);
		removeTask.add(removeTaskId);
		frame.add(removeTask);
		removeTaskButton = new JButton("Remove Task");
		removeTask.add(new JLabel("__________________________"));
		removeTask.add(new JLabel("__________________________"));
		removeTaskButton.setPreferredSize(new Dimension(250, 50));
		removeTask.add(removeTaskButton);
		frame.setVisible(false);
	}//end of constructor
	
	//getters and setters
	public JFrame getFrame() {
		return frame;
	}


	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JLabel getInstructions() {
		return instructions;
	}

	public void setInstructions(JLabel instructions) {
		this.instructions = instructions;
	}

	public JTextPane getMainPane() {
		return mainPane;
	}

	public void setMainPane(JTextPane mainPane) {
		this.mainPane = mainPane;
	}

	public JPanel getAddTask() {
		return addTask;
	}

	public void setAddTask(JPanel addTask) {
		this.addTask = addTask;
	}

	public JPanel getRemoveTask() {
		return removeTask;
	}

	public void setRemoveTask(JPanel removeTask) {
		this.removeTask = removeTask;
	}

	public JTextArea getAddTaskName() {
		return addTaskName;
	}

	public void setAddTaskName(JTextArea addTaskName) {
		this.addTaskName = addTaskName;
	}

	public JTextArea getAddTaskPriority() {
		return addTaskPriority;
	}

	public void setAddTaskPriority(JTextArea addTaskPriority) {
		this.addTaskPriority = addTaskPriority;
	}

	public JTextArea getRemoveTaskId() {
		return removeTaskId;
	}

	public void setRemoveTaskId(JTextArea removeTaskId) {
		this.removeTaskId = removeTaskId;
	}

	public JButton getAddTaskButton() {
		return addTaskButton;
	}

	public void setAddTaskButton(JButton addTaskButton) {
		this.addTaskButton = addTaskButton;
	}

	public JButton getRemoveTaskButton() {
		return removeTaskButton;
	}

	public void setRemoveTaskButton(JButton removeTaskButton) {
		this.removeTaskButton = removeTaskButton;
	}
}//end of class
