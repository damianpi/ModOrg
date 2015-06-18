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


/**
 * Controller for the Contacts module.
 * @author Damian Piela
 * 
 */
public class ContactsController {
	
	private ContactsModel model;
	private ContactsView view;
	private ContactMakeView contactMakeView;
	private JList list;
	private static boolean isCreated = false;
	
	//constructor
	/**
	 * Constructor for the Contacts module. In order to make sure that only one class of this kind exists, 
	 * the isCreated boolean type variable is set to "true" during the first launch and prevents the program 
	 * from creating another controller of this type.
	 * @param model ContactsModel
	 * @param view ContactsView
	 * @param contactMakeView ContactMakeView, which is an additional window for creating or browsing contacts.
	 * 
	 */
	public ContactsController(ContactsModel model, ContactsView view, ContactMakeView contactMakeView){

		if(this.isCreated == false){
			this.isCreated = true;
			this.model = model;
			this.view = view;
			this.contactMakeView = contactMakeView;
			
			this.list = this.view.getList();
			this.list = new JList(model.getData().getListModel());
			this.view.setList(this.list);
			this.view.getList().setLayoutOrientation(JList.VERTICAL);
			this.view.getList().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			this.view.getList().setBounds(50, 50, 700, 300);
			JScrollPane jsp = new JScrollPane(this.view.getList());
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
						int index = view.getList().getSelectedIndex();
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
						int index = view.getList().getSelectedIndex();
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
		}//end of if
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

//	public JList getList() {
//		return list;
//	}
//
//	public void setList(JList list) {
//		this.list = list;
//	}	
	
}//end of class
