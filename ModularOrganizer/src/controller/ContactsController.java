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
	
	private ContactsModel model;
	private ContactsView view;
	private ContactMakeView contactMakeView;
	private JList list;
	
	//constructor
	public ContactsController(ContactsModel model, ContactsView view, ContactMakeView contactMakeView){
		this.model = model;
		this.view = view;
		this.contactMakeView = contactMakeView;
		
		view.list = new JList(model.getData().getListModel());
		view.list.setLayoutOrientation(JList.VERTICAL);
		view.list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		view.list.setBounds(50, 50, 700, 300);
		JScrollPane jsp = new JScrollPane(view.list);
		jsp.setBounds(50, 50, 700, 300);
		view.getFrame().add(jsp);

		view.getAddContactButton().addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
				contactMakeView.getName().setText("Name");
				contactMakeView.getSurname().setText("Surname");
				contactMakeView.getPhoneNumber().setText("Phone number");
				contactMakeView.getAddress().setText("Address");
				contactMakeView.getBirthdate().setText("Birthdate");
				contactMakeView.getLikes().setText("What likes");
				contactMakeView.getDislikes().setText("What dislikes");
				contactMakeView.getWantsOnBirthday().setText("What wants on birthday");
				contactMakeView.getEducation().setText("Education");
				contactMakeView.getCanHelpWith().setText("Can help with");
				
				contactMakeView.getFrame().setVisible(true);
			}//end of actionPerformed
		});//end of addAtionListener
		
		contactMakeView.getSave().addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Contact contact;
				contact = new Contact((contactMakeView.getName().getText().trim()),
						(contactMakeView.getSurname().getText().trim()),
						(contactMakeView.getPhoneNumber().getText().trim()),
						(contactMakeView.getAddress().getText().trim()),
						(contactMakeView.getBirthdate().getText().trim()),
						(contactMakeView.getLikes().getText().trim()),
						(contactMakeView.getDislikes().getText().trim()),
						(contactMakeView.getWantsOnBirthday().getText().trim()),
						(contactMakeView.getEducation().getText().trim()),
						(contactMakeView.getCanHelpWith().getText().trim())
						);
				
				String nameAndSurname = contact.getName() + " " + contact.getSurname(); 
				model.getData().getData().add(contact);
				model.getData().getListModel().addElement(nameAndSurname);
				model.saveContacts();
			}
		});//end of addActionListener
		
		this.view.getRemoveContactButton().addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				try{
					int index = view.list.getSelectedIndex();
					model.getData().getData().remove(index);
					model.getData().getListModel().remove(index);
					model.saveContacts();
				}catch(Exception errr){}	
			}
		});//end of addActionListener
		
		
		this.view.getSelectButton().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try{
					int index = view.list.getSelectedIndex();
					Contact contact = model.getData().getData().get(index);
					
					contactMakeView.getName().setText(contact.getName());
					contactMakeView.getSurname().setText(contact.getSurname());
					contactMakeView.getPhoneNumber().setText(contact.getPhoneNumber());
					contactMakeView.getAddress().setText(contact.getAddress());
					contactMakeView.getBirthdate().setText(contact.getBirthdate());
					contactMakeView.getLikes().setText(contact.getLikes());
					contactMakeView.getDislikes().setText(contact.getDislikes());
					contactMakeView.getWantsOnBirthday().setText(contact.getWantsOnBirthday());
					contactMakeView.getEducation().setText(contact.getEducation());
					contactMakeView.getCanHelpWith().setText(contact.getCanHelpWith());
					
					contactMakeView.getFrame().setVisible(true);
				}catch(Exception eerr){}
			}
		});//end of addActionListener	
	}//end of constructor
	
	
	//getters and setters
	public ContactsModel getModel() {
		return model;
	}

	public void setModel(ContactsModel model) {
		this.model = model;
	}

	public ContactsView getView() {
		return view;
	}

	public void setView(ContactsView view) {
		this.view = view;
	}

	public ContactMakeView getContactMakeView() {
		return contactMakeView;
	}

	public void setContactMakeView(ContactMakeView contactMakeView) {
		this.contactMakeView = contactMakeView;
	}

	public JList getList() {
		return list;
	}

	public void setList(JList list) {
		this.list = list;
	}	
	
}//end of class
