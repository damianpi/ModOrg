//Author: Damian Piela
package model;

import java.io.Serializable;
import java.util.ArrayList;

import javax.swing.DefaultListModel;

public class ContactsData implements Serializable{
	
	public ArrayList<Contact> data;
	public DefaultListModel listModel;
	
	
	public ContactsData(){
		this.data = new ArrayList<Contact>();
		this.listModel = new DefaultListModel();	
	}	
}
