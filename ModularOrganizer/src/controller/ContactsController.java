// Author: Damian Piela
package controller;

import model.Contact;
import model.ContactsModel;
import view.ContactsView;
import view.ContactMakeView;

import java.awt.event.*;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;


public class ContactsController {
	
	ContactsModel model;
	public ContactsView view;
	public ContactMakeView contactMakeView;
	JList list;
	public DefaultListModel listModel;
	
	public ContactsController(ContactsModel model, ContactsView view, ContactMakeView contactMakeView){
		this.model = model;
		this.view = view;
		this.contactMakeView = contactMakeView;
		
		view.list = new JList(model.data.listModel);
		view.list.setLayoutOrientation(JList.VERTICAL);
		view.list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		view.list.setBounds(50, 50, 700, 300);
		JScrollPane jsp = new JScrollPane(view.list);
		jsp.setBounds(50, 50, 700, 300);
		view.frame.add(jsp);
		
		
		
		
		
		
		view.addContactButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
				contactMakeView.name.setText("Name");
				contactMakeView.surname.setText("Surname");
				contactMakeView.phoneNumber.setText("Phone number");
				contactMakeView.address.setText("Address");
				contactMakeView.birthdate.setText("Birthdate");
				contactMakeView.likes.setText("What likes");
				contactMakeView.dislikes.setText("What dislikes");
				contactMakeView.wantsOnBirthday.setText("What wants on birthday");
				contactMakeView.education.setText("Education");
				contactMakeView.canHelpWith.setText("Can help with");
				
				contactMakeView.frame.setVisible(true);
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
				model.data.listModel.addElement(nameAndSurname);
				model.saveContacts();
		
			}
		});//end of addActionListener
		
		this.view.removeContactButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				try{
					int index = view.list.getSelectedIndex();
					model.data.data.remove(index);
					model.data.listModel.remove(index);
					model.saveContacts();
				}catch(Exception errr){}
					
			}
		});//end of addActionListener
		
		
		this.view.selectButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try{
					int index = view.list.getSelectedIndex();
					Contact contact = model.data.data.get(index);
					
					contactMakeView.name.setText(contact.name);
					contactMakeView.surname.setText(contact.surname);
					contactMakeView.phoneNumber.setText(contact.phoneNumber);
					contactMakeView.address.setText(contact.address);
					contactMakeView.birthdate.setText(contact.birthdate);
					contactMakeView.likes.setText(contact.likes);
					contactMakeView.dislikes.setText(contact.dislikes);
					contactMakeView.wantsOnBirthday.setText(contact.wantsOnBirthday);
					contactMakeView.education.setText(contact.education);
					contactMakeView.canHelpWith.setText(contact.canHelpWith);
					
					contactMakeView.frame.setVisible(true);
					
				}catch(Exception eerr){}
				
			}
		});//end of addActionListener
		
		
		
		
		
		
		
	}//end of const
}//end of class
