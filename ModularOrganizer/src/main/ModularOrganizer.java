package main;

import view.*;
import model.*;
import controller.*;


public class ModularOrganizer {
	public static void main(String[] args) {
		PrioritiesModel prioritiesModel = new PrioritiesModel();
		PrioritiesView prioritiesView = new PrioritiesView();
		PrioritiesController prioritiesController = new PrioritiesController(prioritiesModel, prioritiesView);
		
		
		
		
		
		
		
		MainWindow mainWindow = new MainWindow(prioritiesController);
		
		
		
	}
}
