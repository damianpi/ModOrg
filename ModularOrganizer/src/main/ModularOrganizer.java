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
		ContactMakeView contactMakeView = new ContactMakeView();
		ContactsController contactsController = new ContactsController(contactsModel, contactsView, contactMakeView); 
		
		MainWindow mainWindow = new MainWindow(prioritiesController, phonebookController, contactsController);
	}//end of main
}//end of class
