//Author: Damian Piela
package controller;

import model.PrioritiesModel;
import model.Priority;
import view.PrioritiesView;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class PrioritiesController {

	PrioritiesModel model;
	public PrioritiesView view;
	
	public PrioritiesController(PrioritiesModel model, PrioritiesView view){
		this.model = model;
		this.view = view;
		
		this.view.addTaskButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String name = view.addTaskName.getText().trim();
				int priority = 0;
				try{	
					priority = Integer.parseInt(view.addTaskPriority.getText().trim());
				}catch(Exception ee){
					priority = 3;
				}
				model.addPriority(priority, name);
				model.savePriorities();
				refreshPriorities();
			}//end of actionPerformed()
		});//end of addActionListener()
		
		refreshPriorities();
	}

	public void refreshPriorities(){
		String s = "";
		for(Priority p : model.data.data){
			int index = model.data.data.indexOf(p);
			s = s + "ID: " + Integer.toString(index) + " -- Priority Level: " + Integer.toString(p.level)
					+ "\n" + p.name + "\n---------------------------------------------\n";
		}	
		view.mainPane.setText(s);
	}
	
	public void refreshPriorities(ArrayList<Priority> pr){
		String s = "";
		for(Priority p : pr){
			int index = pr.indexOf(p);
			s = s + "\n\nID: " + Integer.toString(index) + " -- Priority Level: " + Integer.toString(p.level)
					+ "\n" + p.name;				
		}
		view.mainPane.setText(s);
	}
	
}//end of class
