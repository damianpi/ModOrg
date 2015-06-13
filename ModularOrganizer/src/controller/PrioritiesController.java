//Author: Damian Piela
package controller;

import model.PrioritiesModel;
import model.Priority;
import view.PrioritiesView;
import java.awt.event.*;

public class PrioritiesController {

	private PrioritiesModel model;
	private PrioritiesView view;
	
	//constructor
	public PrioritiesController(PrioritiesModel model, PrioritiesView view){
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
	}//end of constructor

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
