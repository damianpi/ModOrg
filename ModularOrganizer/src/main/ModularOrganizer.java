// Author: Damian Piela
package main;

import view.*;
import model.*;
import controller.*;


public class ModularOrganizer {
	public static void main(String[] args) {
		PrioritiesModel prioritiesModel = new PrioritiesModel();
		PrioritiesView prioritiesView = new PrioritiesView();
		PrioritiesController prioritiesController = new PrioritiesController(prioritiesModel, prioritiesView);
		
		PhonebookModel phonebookModel = new PhonebookModel();
		PhonebookView phonebookView = new PhonebookView();
		PhonebookController phonebookController = new PhonebookController(phonebookModel, phonebookView); 
		
		ContactsModel contactsModel = new ContactsModel();
		ContactsView contactsView = new ContactsView();
		ContactsController contactsController = new ContactsController(contactsModel, contactsView); 
		
		MainWindow mainWindow = new MainWindow(prioritiesController, phonebookController, contactsController);
		
		
//		PrioritiesData pd = new PrioritiesData();
//		pd.data.add(new Priority(1, "a"));
//		pd.data.add(new Priority(2, "ag"));
//		pd.data.add(new Priority(3, "af"));
//		pd.data.add(new Priority(1, "agh"));
//		pd.data.add(new Priority(2, "aa"));
//		
//		prioritiesController.refreshPriorities(pd.data);
		
		
		
	}//end of main
}//end of class
