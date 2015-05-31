// Author: Damian Piela
package controller;

import model.Contact;
import model.ContactsModel;
import view.ContactsView;
import view.ContactMakeView;

import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.ListSelectionModel;


public class ContactsController {
	
	ContactsModel model;
	public ContactsView view;
	public ContactMakeView contactMakeView;
	JList list;
	
	
	public ContactsController(ContactsModel model, ContactsView view, ContactMakeView contactMakeView){
		this.model = model;
		this.view = view;
		this.contactMakeView = contactMakeView;
//		view.listModel = new DefaultListModel();
		
		view.addContactButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				contactMakeView.frame.setVisible(true);
				view.listModel.addElement("jakis tekst");

			}//end of actionPerformed
		});//end of addAtionListener
		
		contactMakeView.save.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Contact contact;
				contact = new Contact((contactMakeView.name.getText().trim()),
						(contactMakeView.surname.getText().trim()),
						(contactMakeView.phoneNumber.getText().trim()),
						(contactMakeView.address.getText().trim()),
						(contactMakeView.birthdate.getText().trim()),
						(contactMakeView.likes.getText().trim()),
						(contactMakeView.dislikes.getText().trim()),
						(contactMakeView.wantsOnBirthday.getText().trim()),
						(contactMakeView.education.getText().trim()),
						(contactMakeView.canHelpWith.getText().trim())
						);
				
				String nameAndSurname = contact.name + " " + contact.surname; 
				model.data.data.add(contact);

//				model.saveContacts();
//				model.data.listModel.addElement("jakis element");
//				
//				view.list = new JList(model.data.listModel);
//				view.list.validate();
				
//				
				DefaultListModel modelList = new DefaultListModel();
				modelList.addElement("jakis tekst");
				
				
				

				
				
			}
		});//end of addActionListener
		
		
		
	}//end of const
	
	
}//end of class
