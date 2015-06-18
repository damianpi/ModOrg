//Author: Damian Piela
package view;

import javax.swing.*;

/**
 * Class creating the main view for the Contacts module.
 * 
 * @author Damian Piela
 *
 */
public class ContactsView {

	private JFrame frame;
	private JPanel mainPane;
	private JList list = null;
	private JLabel instructions;
	private JPanel tools;
	private JButton selectButton, addContactButton, removeContactButton;

	/**
	 * Constructor for the ContactsView class.
	 */
	public ContactsView(){
		
		frame = new JFrame("Contacts");
		frame.setSize(800, 600);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		
		instructions = new JLabel("<html><center>This is your contacts list</center>\nChoose one to see more details, or add a new one");
		instructions.setBounds(250, 4, 600, 30);
		frame.add(instructions);

		addContactButton = new JButton("New contact");
		addContactButton.setBounds(80, 430, 150, 80);
		frame.add(addContactButton);
		
		removeContactButton = new JButton("Remove contact");
		removeContactButton.setBounds(231, 430, 150, 80);
		frame.add(removeContactButton);
		
		selectButton = new JButton("<html><center><font size=7> Select");
		selectButton.setBounds(580, 415, 150, 130);
		frame.add(selectButton);
	
		frame.setVisible(false);
		
	}//end of constructor

	//getters and setters
	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JPanel getMainPane() {
		return mainPane;
	}

	public void setMainPane(JPanel mainPane) {
		this.mainPane = mainPane;
	}

	public JList getList() {
		return list;
	}

	public void setList(JList list) {
		this.list = list;
	}

	public JLabel getInstructions() {
		return instructions;
	}

	public void setInstructions(JLabel instructions) {
		this.instructions = instructions;
	}

	public JPanel getTools() {
		return tools;
	}

	public void setTools(JPanel tools) {
		this.tools = tools;
	}

	public JButton getSelectButton() {
		return selectButton;
	}

	public void setSelectButton(JButton selectButton) {
		this.selectButton = selectButton;
	}

	public JButton getAddContactButton() {
		return addContactButton;
	}

	public void setAddContactButton(JButton addContactButton) {
		this.addContactButton = addContactButton;
	}

	public JButton getRemoveContactButton() {
		return removeContactButton;
	}

	public void setRemoveContactButton(JButton removeContactButton) {
		this.removeContactButton = removeContactButton;
	}
}//end of class
