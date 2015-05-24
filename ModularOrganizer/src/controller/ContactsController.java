// Author: Damian Piela
package controller;

import model.ContactsModel;
import view.ContactsView;

public class ContactsController {
	
	ContactsModel model;
	public ContactsView view;
	
	public ContactsController(ContactsModel model, ContactsView view){
		this.model = model;
		this.view = view;
	}//end of const
	
	
}//end of class
