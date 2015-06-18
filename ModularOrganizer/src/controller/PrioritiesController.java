//Author: Damian Piela
package controller;

import model.PrioritiesModel;
import model.Priority;
import view.PrioritiesView;
import java.awt.event.*;

/**
 * Controller for the Priorities module
 * @author Damian Piela
 *
 */
public class PrioritiesController {

	private PrioritiesModel model;
	private PrioritiesView view;
	private static boolean isCreated = false;
	
	//constructor
	/**
	 * Constructor for the PrioritiesController class. In order to make sure that only one class of this kind exists, 
	 * the isCreated boolean type variable is set to "true" during the first launch and prevents the program 
	 * from creating another controller of this type.
	 * @param model Working PrioritiesModel type object.
	 * @param view Working PrioritiesView type object.
	 */
	public PrioritiesController(PrioritiesModel model, PrioritiesView view){
		if(isCreated == false){
			this.isCreated = true;
			this.model = model;
			this.view = view;

			this.view.getAddTaskButton().addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					String name = view.getAddTaskName().getText().trim();
					int priority = 0;
					try{	
						priority = Integer.parseInt(view.getAddTaskPriority().getText().trim());
					}catch(Exception ee){
						priority = 3;
					}
					model.addPriority(priority, name);
					model.savePriorities();
					refreshPriorities();
				}//end of actionPerformed()
			});//end of addActionListener()

			this.view.getRemoveTaskButton().addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){

					try{	
						int index = Integer.parseInt(view.getRemoveTaskId().getText().trim());
						model.getData().getData().remove(index);
					}catch(NumberFormatException nfe){
						view.getRemoveTaskId().setText("Enter a correct ID number");
					}catch(Exception ex){
						view.getRemoveTaskId().setText("Wrong ID number");
					}

					model.savePriorities();
					refreshPriorities();
				}
			});//end of addActionListener()

			refreshPriorities();
		}//end of if
	}//end of constructor

	/**
	 * Refreshes data in the main pane in the PrioritiesView object using data stored in the serialized PrioritiesData library.
	 */
	public void refreshPriorities(){
		String s = "";
		for(Priority p : model.getData().getData()){
			int index = model.getData().getData().indexOf(p);
			s = s + "ID: " + Integer.toString(index) + " -- Priority Level: " + Integer.toString(p.getLevel())
					+ "\n" + p.getName() + "\n---------------------------------------------\n";
		}	
		view.getMainPane().setText(s);
	}//end of refreshPriorities
	

	//getters and setters
	public PrioritiesModel getModel() {
		return model;
	}

	public void setModel(PrioritiesModel model) {
		this.model = model;
	}

	public PrioritiesView getView() {
		return view;
	}

	public void setView(PrioritiesView view) {
		this.view = view;
	}
}//end of class
