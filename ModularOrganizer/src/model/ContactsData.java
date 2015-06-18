//Author: Damian Piela
package model;

import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

/**
 * Creates a serializable library consisting of Contact-type objects. Includes an array list of Contact objects  
 *  as well as list model of Strings to use with the view's main pane.
 * @author Damian Piela
 *
 */
public class ContactsData implements Serializable{
	
	private ArrayList<Contact> data;
	private DefaultListModel listModel;
	
	/**
	 * Constructor for the ContactsData class.
	 */
	public ContactsData(){
		this.data = new ArrayList<Contact>();
		this.listModel = new DefaultListModel();	
	}//end of constr

	//getters and setters
	public ArrayList<Contact> getData() {
		return data;
	}


	public void setData(ArrayList<Contact> data) {
		this.data = data;
	}


	public DefaultListModel getListModel() {
		return listModel;
	}


	public void setListModel(DefaultListModel listModel) {
		this.listModel = listModel;
	}
}//end of class
