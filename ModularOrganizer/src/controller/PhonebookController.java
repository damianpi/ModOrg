package controller;

import model.PhonebookModel;
import view.PhonebookView;

public class PhonebookController {
	PhonebookModel model;
	public PhonebookView view;
	
	public PhonebookController(PhonebookModel model, PhonebookView view){
		this.model = model;
		this.view = view;
	}
}
